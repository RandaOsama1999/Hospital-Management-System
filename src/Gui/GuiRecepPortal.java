/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.DataLoad;
import java.awt.Container;
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
public class GuiRecepPortal extends JFrame{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    
    public GuiRecepPortal()
    {
        setSize(10000,10000);
        JLabel string=new JLabel("Receptionist Portal:");
        btn1=new JButton ("Add Patient");
        btn2=new JButton ("Search, Edit or delete Patient");
        btn3=new JButton ("Display Patient");
        btn4=new JButton ("Display Appointments");
        
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiRecepPortal.class.getName()).log(Level.SEVERE, null, ex);
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
        
        btn1.addActionListener(new dosave());
        btn2.addActionListener(new dosave());
        btn3.addActionListener(new dosave());
        btn4.addActionListener(new dosave());
        
    }

    private class dosave implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource().equals(btn1)){
                try {
                    GuiAddPatient a=new GuiAddPatient();
                    a.setVisible(true);
                    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                } catch (ParseException ex) {
                    Logger.getLogger(GuiRecepPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (ae.getSource().equals(btn2)){
                try {
                    GuiSearchPatient di=new GuiSearchPatient();
                    di.setVisible(true);
                    di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                } catch (ParseException ex) {
                    Logger.getLogger(GuiRecepPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
                
          }
          else if (ae.getSource().equals(btn3)){
                GuiDisplayPatient di=new GuiDisplayPatient();
                di.setVisible(true);
                di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
          }
            else if (ae.getSource().equals(btn4)){
                GuiDisplayAppointment ad=new GuiDisplayAppointment();
                ad.setVisible(true);
                ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
          }
            
            
        }
    }
}
