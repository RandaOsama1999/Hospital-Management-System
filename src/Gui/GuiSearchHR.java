/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.DataLoad;
import RSFN.Staff;
import hospitalmanagementsystemrsfn.ManagerialStaff.HR;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Randa
 */
public class GuiSearchHR extends JFrame{
    
    Staff h=new HR();

    JTextField IDtxt;
    JButton search;
    JButton back;
    JButton edit;
    JButton delete;
    
    GuiSearchHR()
    {
        setSize(10000,10000);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiSearchHR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        search=new JButton("Search");
        back=new JButton("Back");
        edit=new JButton("Edit");
        delete=new JButton("Delete");
        JLabel Id=new JLabel("ID");
        
        IDtxt=new JTextField("");
        Container cont=getContentPane();
        cont.setLayout(null);
        
        search.setBounds(600, 400, 120, 40);
        edit.setBounds(600, 450, 120, 40);
        delete.setBounds(600, 500, 120, 40);
        back.setBounds(600, 550, 120, 40);
        
        Id.setBounds(560, 300, 90, 100);
        IDtxt.setBounds(650, 330, 100, 40);
        
        cont.add(edit);
        cont.add(delete);
        cont.add(back);
        cont.add(search);
        cont.add(Id);
        cont.add(IDtxt);
        
        
        search.addActionListener(new dosave());
        delete.addActionListener(new dosave());
        edit.addActionListener(new dosave());
        back.addActionListener(new dosave());
        
    }
    private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            if (ae.getSource().equals(search))
            {
                try {
                    h.Search(IDtxt.getText());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GuiSearchHR.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
                   
            }
            else if(ae.getSource().equals(delete))
            {      
                    try {
                    int idx=h.Search(IDtxt.getText());
                    h.Remove(idx);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GuiSearchHR.class.getName()).log(Level.SEVERE, null, ex);
                }           
            }
            else if (ae.getSource().equals(edit)){
                
                try {
                    int idx=h.Search(IDtxt.getText());
                    GuiEditHR a=new GuiEditHR(idx);
                    a.setVisible(true);
                    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GuiSearchHR.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else if (ae.getSource().equals(back)){
                
                GuiHRChanges a=new GuiHRChanges();
                a.setVisible(true);
                try {
                    a.setDefaultCloseOperation(DataLoad.writeHR());
                } catch (IOException ex) {
                    Logger.getLogger(GuiSearchHR.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        }
        
    }
}
