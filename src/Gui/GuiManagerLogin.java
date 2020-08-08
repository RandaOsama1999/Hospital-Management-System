/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Randa
 */
public class GuiManagerLogin extends JFrame{

    static HashMap<String,String> Users=new HashMap<>();
    
    JTextField Nametxt;
    JPasswordField Passwordtxt;
    JButton LoginBtn;
    
    public GuiManagerLogin() {
     
        Users.put("R123", "Randa");
        Users.put("S123", "Salma");
        Users.put("F123", "Farida");
        Users.put("N123", "Noor");
        
        setSize(10000,10000);
        LoginBtn=new JButton("Log in");
        
        JLabel Name=new JLabel("UserName");
        JLabel Password=new JLabel("Password");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Name.setFont(new Font(" ",Font.BOLD,15));
        Password.setFont(new Font(" ",Font.BOLD,15));
        
        
        Nametxt=new JTextField("");
        Passwordtxt=new JPasswordField("");
        
        Container c=getContentPane();
        c.setLayout(null);
        
        LoginBtn.setBounds(600, 400, 120, 40);
       
        Name.setBounds(560, 250, 90, 100);
        Nametxt.setBounds(650, 280, 100, 40);
        
        Password.setBounds(560, 300, 90, 100);
        Passwordtxt.setBounds(650, 330, 100, 40);
        
        
        c.add(LoginBtn);
        c.add(Name);
        c.add(Password);
        c.add(Passwordtxt);
        c.add(Nametxt);
        
        LoginBtn.addActionListener(new dosave());
        
    }
    private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        for(String n:Users.keySet())
        {
            if(Users.containsValue(Nametxt.getText()))
            {
                
                if(Users.containsKey(Passwordtxt.getText())){
                GuiManagerFrame fe=new GuiManagerFrame();
                fe.setVisible(true);
                fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Password","alert", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
            else{
               JOptionPane.showMessageDialog(null,"Wrong Username","alert", JOptionPane.ERROR_MESSAGE);
               break;
            }
        }
            
        
     }
        
  }
    
}
