/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.BorderLayout;
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
public class GuiLoginAs extends JFrame{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    
    public GuiLoginAs()
    {
        setSize(10000,10000);
        
        JLabel title=new JLabel("Welcome to RSFN Hospital");
        JLabel Log=new JLabel("Login As:");
        btn1=new JButton("Manager");
        btn2=new JButton("Doctor");
        btn3=new JButton("Receptionist");
        btn4=new JButton ("HR");
        btn5=new JButton ("Financial Employee");
        btn6=new JButton ("Nurse");
        
        title.setBounds(520, 50, 300, 60);
        Log.setBounds(500, 100, 200, 60);
        btn1.setBounds(550, 150, 200, 40);
        btn2.setBounds(550, 200, 200, 40);
        btn3.setBounds(550, 250, 200, 40);
        btn4.setBounds(550, 300, 200, 40);
        btn5.setBounds(550, 350, 200, 40);
        btn6.setBounds(550, 400, 200, 40);
        
        Log.setFont(new Font("",Font.BOLD,15));
        title.setFont(new Font("",Font.BOLD,20));
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiLoginAs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Container cont =getContentPane();
        cont.setLayout(null);
        
        
        
        btn1.addActionListener(new dosave());
        btn2.addActionListener(new dosave());
        btn3.addActionListener(new dosave());
        btn4.addActionListener(new dosave());
        btn5.addActionListener(new dosave());
        btn6.addActionListener(new dosave());
        
        cont.add(btn1);
        cont.add(btn2);
        cont.add(btn3);
        cont.add(btn4);
        cont.add(btn5);
        cont.add(btn6);
        cont.add(Log);
        cont.add(title);
        
    }
    private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn1)){
            GuiManagerLogin g=new GuiManagerLogin();
            g.setVisible(true);
            g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
            }
        else if (ae.getSource().equals(btn2) || ae.getSource().equals(btn3)
                || ae.getSource().equals(btn4) || ae.getSource().equals(btn5)
                || ae.getSource().equals(btn6))
        {
            GuiOtherLogin g=new GuiOtherLogin();
            g.setVisible(true);
            g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
        }   
            
    }
        
    }
    
}
