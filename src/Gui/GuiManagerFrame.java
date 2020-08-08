/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
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
public class GuiManagerFrame extends JFrame{
    
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    public GuiManagerFrame(){
        setSize(10000,10000);
        JLabel title=new JLabel("Make change to:");
        btn1=new JButton ("Doctor");
        btn2=new JButton ("Nurse");
        btn3=new JButton ("Receptionist");
        btn4=new JButton ("HR");
        btn5=new JButton ("Financial");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiManagerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        title.setBounds(550, 90, 300, 60);
        btn1.setBounds(550, 150, 200, 40);
        btn2.setBounds(550, 200, 200, 40);
        btn3.setBounds(550, 250, 200, 40);
        btn4.setBounds(550, 300, 200, 40);
        btn5.setBounds(550, 350, 200, 40);
        
        title.setFont(new Font("",Font.BOLD,20));
        
        cont.add(title);
        cont.add(btn1);
        cont.add(btn2);
        cont.add(btn3);
        cont.add(btn4);
        cont.add(btn5);
        
        btn1.addActionListener(new handler());
        btn2.addActionListener(new handler());
        btn3.addActionListener(new handler());
        btn4.addActionListener(new handler());
        btn5.addActionListener(new handler());
    }

    private class handler implements ActionListener {

        @Override
        public void actionPerformed( ActionEvent event ){ 
          if (event.getSource().equals(btn1)){
            GuiDoctorChanges a=new GuiDoctorChanges();
            a.setVisible(true);
            a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
          }
          else if (event.getSource().equals(btn2)){
            GuiNurseChanges e=new GuiNurseChanges();
            e.setVisible(true);
            e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
          }
          else if (event.getSource().equals(btn3)){
            GuiRecepChanges s=new GuiRecepChanges();
            s.setVisible(true);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
          }
          else if (event.getSource().equals(btn4)){
            GuiHRChanges di=new GuiHRChanges();
            di.setVisible(true);
            di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
          }
          else if (event.getSource().equals(btn5)){
            GuiFinancialChanges di=new GuiFinancialChanges();
            di.setVisible(true);
            di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
          }
          
        }
    }
}
