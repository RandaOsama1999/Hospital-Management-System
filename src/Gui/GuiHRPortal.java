/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.Container;
import java.awt.Font;
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
public class GuiHRPortal extends JFrame{
    public GuiHRPortal()
    {
        setSize(10000,10000);
        JLabel string=new JLabel("HR Portal:");
        JButton btn1=new JButton ("Add Any employee");
        JButton btn2=new JButton ("Edit Any employee");
        JButton btn3=new JButton ("Delete Any employee");
        JButton btn4=new JButton ("Search for employees");
        JButton btn5=new JButton ("Display employees");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiHRPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        string.setBounds(550, 90, 300, 60);
        btn1.setBounds(550, 150, 200, 40);
        btn2.setBounds(550, 200, 200, 40);
        btn3.setBounds(550, 250, 200, 40);
        btn4.setBounds(550, 300, 200, 40);
        btn5.setBounds(550, 350, 200, 40);
        
        string.setFont(new Font("",Font.BOLD,20));
        
        cont.add(string);
        cont.add(btn1);
        cont.add(btn2);
        cont.add(btn3);
        cont.add(btn4);
        cont.add(btn5);
    
    }
}
