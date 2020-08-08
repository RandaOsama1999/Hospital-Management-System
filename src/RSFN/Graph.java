/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

/**
 *
 * @author Randa
 */
import static RSFN.MainRSFN.patients;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

    public class Graph extends JPanel {
    private int width = 800;
    private int heigth = 400;
    private int padding = 25;
    private int labelPadding = 25;
    private Color lineColor = new Color(0, 230, 230, 230);
    private Color pointColor = new Color(100, 100, 100, 180);
    private Color gridColor = new Color(200, 200, 200, 200); //transparent color
    private static final Stroke GRAPH_STROKE = new BasicStroke(2f); //stroke->shape's outline,basic stroke->with defaults for all attributes.
    private int pointWidth = 5;
    private int numberYDivisions = 10; 
    private double[] results=new double[8];
    String[] Cases = new String[] {"Surgeon", "Neurologist", "Psychologist" ,"Ophthalmologist","Dentistry"
                                   ,"Otolaryngologist", "Obstetrician","Cardiologist", "Pediatrician"};

    /*public Graph(double[] results) {
        this.results = results;
    }*/

    public Graph() {
        int count=0;
        for(int i=0;i<8;i++)
        {
            for (int j=0;j<patients.size();j++)
            {
                if(patients.get(j).getPatientCases().equals(Cases[i]))
                {
                    count++;
                }
            }
            results[i]=(count/5)*100;
        }    }
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        calcResults();
        Graphics2D g2 = (Graphics2D) g; //2d graphics->more fancy styles
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        double xScale = ((double) getWidth() - (2 * padding) - labelPadding) / (results.length - 1);
        double yScale = ((double) getHeight() - 4 * padding - labelPadding) / (getMaxScore() - getMinScore());

        List<Point> graphPoints = new ArrayList<>();
        for (int i = 0; i < results.length; i++) {
            int x1 = (int) (i * xScale + padding + labelPadding);
            int y1 = (int) ((getMaxScore() - results[i]) * yScale + padding);
            graphPoints.add(new Point(x1, y1));
        }

        //white background
        g2.setColor(Color.WHITE);
        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
        g2.setColor(Color.BLACK);

        // create hatch marks and grid lines for y axis.
        for (int i = 0; i < numberYDivisions + 1; i++) {
            int x0 = padding + labelPadding;
            int x1 = pointWidth + padding + labelPadding;
            int y0 = getHeight() - ((i * (getHeight() - padding * 2 - labelPadding)) / numberYDivisions + padding + labelPadding);
            int y1 = y0;
            if (results.length > 0) {
                g2.setColor(gridColor);
                g2.drawLine(padding + labelPadding + 1 + pointWidth, y0, getWidth() - padding, y1);
                g2.setColor(Color.BLACK);
                String yLabel = ((int) ((getMinScore() + (getMaxScore() - getMinScore()) * (i / numberYDivisions)) * 100)) / 100.0 + "";
                FontMetrics metrics = g2.getFontMetrics();
                int labelWidth = metrics.stringWidth(yLabel);
               g2.drawString(yLabel, x0 - labelWidth - 5, y0 + (metrics.getHeight() / 2) - 3); //draw the y-values
            }
            g2.drawLine(x0, y0, x1, y1);
        }

        // and for x axis
        for (int i = 0; i < Cases.length; i++) {
            if (results.length> 1) {
                int x0 = i * (getWidth() - padding * 2 - labelPadding) / (results.length - 1) + padding + labelPadding;
                int x1 = x0;
                int y0 = getHeight() - padding - labelPadding;
                int y1 = y0 - pointWidth;
                if ((i % ((int) ((results.length / 20.0)) + 1)) == 0) {
                    g2.setColor(gridColor);
                    g2.drawLine(x0, getHeight() - padding - labelPadding - 1 - pointWidth, x1, padding); //transparent lines of x
                    g2.setColor(Color.BLACK);
                    String xLabel = Cases[i] ;
                    FontMetrics metrics = g2.getFontMetrics();
                    int labelWidth = metrics.stringWidth(xLabel);
                    g2.drawString(xLabel, x0 - labelWidth / 2, y0 + metrics.getHeight() + 3); //draw x-values
                }
                g2.drawLine(x0, y0, x1, y1);
            }
        }

        // create x and y axes 
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, padding + labelPadding, padding);
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);

        Stroke oldStroke = g2.getStroke();
        g2.setColor(lineColor);
        g2.setStroke(GRAPH_STROKE);
        for (int i = 0; i < graphPoints.size() - 1; i++) {
            int x1 = graphPoints.get(i).x;
            int y1 = graphPoints.get(i).y;
            int x2 = graphPoints.get(i + 1).x;
            int y2 = graphPoints.get(i + 1).y;
            g2.drawLine(x1, y1, x2, y2);
        }

        g2.setStroke(oldStroke);
        g2.setColor(pointColor);
        //draw points
        for (int i = 0; i < graphPoints.size(); i++) {
            int x = graphPoints.get(i).x - pointWidth / 2;
            int y = graphPoints.get(i).y - pointWidth / 2;
            int ovalW = pointWidth;
            int ovalH = pointWidth;
            g2.fillOval(x, y, ovalW, ovalH);
        }
    }

//    @Override
//    public Dimension getPreferredSize() {
//        return new Dimension(width, heigth);
//    }
    private double getMinScore() {
        double minScore=0;
        for (Double result : results) {
            minScore = Math.min(minScore, result); //gets the lowest value between them
        }
        return minScore;
    }

    private double getMaxScore() {
        double maxScore=0 ;
        for (Double result : results) {
            maxScore = Math.max(maxScore, result);//gets the greatest value between them
        }
        return maxScore;
    }

    public void setResults(double results[]) {
        this.results = results;
        invalidate(); 
        this.repaint();
    }

    public void calcResults(){
        int count=0;
        for(int i=0;i<8;i++)
        {
            for (int j=0;j<patients.size();j++)
            {
                if(patients.get(j).getPatientCases().equals(Cases[i]))
                {
                    count++;
                }
            }
            results[i]=(count/5)*100;
        }
    }
   /* public double[] getResults() {
        return results;
    }
*/
   public void createAndShowGui() 
   {
        double[] results=new double[8];

        int maxDataPoints = 9;
        int maxResult = 100;
        
//            scores.add((double) i);
        }
   }

   