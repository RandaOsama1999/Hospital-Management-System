/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
public class GuiHRChanges extends JFrame{
    
    
    JButton btn1;
    JButton btn2;
    JButton btn3;
     
    public GuiHRChanges()
    {

        setSize(10000,10000);
        btn1=new JButton ("Add HR");
        btn2=new JButton ("Search, Edit or delete HR");
        btn3=new JButton ("Display HR");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiHRChanges.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
       
        btn1.setBounds(550, 150, 200, 40);
        btn2.setBounds(550, 200, 200, 40);
        btn3.setBounds(550, 250, 200, 40);
        
        btn1.addActionListener(new dosave());
        btn2.addActionListener(new dosave());
        btn3.addActionListener(new dosave());
        
        cont.add(btn1);
        cont.add(btn2);
        cont.add(btn3);
        
    
    }
    private class dosave implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if (ae.getSource().equals(btn1)){
                GuiAddHR a=new GuiAddHR();
                a.setVisible(true);
                a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
            else if (ae.getSource().equals(btn2)){
                GuiSearchHR s=new GuiSearchHR();
                s.setVisible(true);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
          }
          else if (ae.getSource().equals(btn3)){
                GuiDisplayHR di=new GuiDisplayHR();
                di.setVisible(true);
                di.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          }
      
        }
        
    }
}
