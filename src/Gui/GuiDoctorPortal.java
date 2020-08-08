/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.DataLoad;
import RSFN.Graph;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Randa
 */
public class GuiDoctorPortal extends JFrame{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    public GuiDoctorPortal()
    {
        setSize(10000,10000);
        JLabel string=new JLabel("Doctor Portal:");
        btn1=new JButton ("Display Patients");
        btn2=new JButton ("Search Patients");
        btn3=new JButton ("Appointments");
        btn4=new JButton ("Statistics Graph");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiDoctorPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        string.setBounds(550, 90, 300, 60);
        btn1.setBounds(550, 150, 200, 40);
        btn2.setBounds(550, 200, 200, 40);
        btn3.setBounds(550, 250, 200, 40);
        btn4.setBounds(550, 300, 200, 40);
     
        string.setFont(new Font("",Font.BOLD,20));
        
        cont.add(string);
        cont.add(btn1);
        cont.add(btn2);
        cont.add(btn3);
        cont.add(btn4);
        
        btn1.addActionListener(new action());
        btn2.addActionListener(new action());
        btn3.addActionListener(new action());
        btn4.addActionListener(new action());
    }

    private class action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if(ae.getSource().equals(btn1))
            {
                GuiDisplayPatient dp=new GuiDisplayPatient();
                dp.setVisible(true);
                dp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
                
            }
            else if(ae.getSource().equals(btn2))
            {
                try {
                    GuiSearchPatient dp=new GuiSearchPatient();
                    dp.setVisible(true);
                    dp.setDefaultCloseOperation(DataLoad.writePatient());   
                    dispose();
                } catch (ParseException ex) {
                    Logger.getLogger(GuiDoctorPortal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(GuiDoctorPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(ae.getSource().equals(btn3))
            {
                GuiDisplayAppointment dp=new GuiDisplayAppointment();
                dp.setVisible(true);
                dp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
            else if(ae.getSource().equals(btn4))
            {
                Graph mainPanel = new Graph();
                mainPanel.setPreferredSize(new Dimension(800, 600));
                JFrame frame = new JFrame("Patients' Medical Cases Graph");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.getContentPane().add(mainPanel);
                frame.pack(); //The pack method packs the components within the window based on the component’s preferred sizes
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        }
    }
}
