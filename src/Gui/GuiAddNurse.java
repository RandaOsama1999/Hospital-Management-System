/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.DataLoad;
import static RSFN.MainRSFN.doctors;
import RSFN.Staff;
import hospitalmanagementsystemrsfn.ManagerialStaff.HR;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import hospitalmanagementsystemrsfn.MedicalStaff.Nurse;
import java.awt.Color;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Randa
 */
public class GuiAddNurse extends JFrame{
    
    Staff n=new Nurse();
    String[] Genderlist = new String[] {"Female", "Male"};
    JComboBox<String> genders;
    String[] Statuslist = new String[] {"Married", "Single", "Divorced"};
    JComboBox<String> Status;
    
    JTextField IDtxt;
    JTextField FNametxt;
    JTextField MNametxt;
    JTextField LNametxt;
    JTextField Emailtxt;
    JTextField BDatetxt;
    JTextField Citytxt;
    JTextField Addresstxt;
    JTextField PNotxt;
    JTextField HNotxt;
    JButton add;
    JButton back;
    
    public GuiAddNurse() {
        setSize(10000,10000);
        
        genders = new JComboBox<>(Genderlist);
        Status=new JComboBox<>(Statuslist);
             
        add=new JButton("Add");
        back=new JButton("Back");
        
        JLabel Id=new JLabel("ID");
        JLabel fName=new JLabel("First Name");
        JLabel mName=new JLabel("Middle Name");
        JLabel lName=new JLabel("Last Name");
        JLabel email=new JLabel("Email");
        JLabel BDate=new JLabel("Birth Date");
        JLabel city=new JLabel("City");
        JLabel address=new JLabel("Address");
        JLabel PNumber=new JLabel("Phone Number");
        JLabel HNumber=new JLabel("Home Number");
        JLabel gender=new JLabel("Gender");
        JLabel status=new JLabel("Status");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiAddNurse.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        IDtxt=new JTextField("");
        FNametxt=new JTextField("");
        MNametxt=new JTextField("");
        LNametxt=new JTextField("");
        Emailtxt=new JTextField("");
        BDatetxt=new JTextField("");
        Citytxt=new JTextField("");
        Addresstxt=new JTextField("");
        PNotxt=new JTextField("");
        HNotxt=new JTextField("");
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        add.setBounds(550, 450, 120, 40);
        back.setBounds(550, 500, 120, 40);
       
        Id.setBounds(100, 50, 90, 100);
        IDtxt.setBounds(300, 70, 100, 50);
        
        fName.setBounds(100, 100, 90, 100);
        FNametxt.setBounds(300, 120, 100, 50);
        
        mName.setBounds(100, 150, 90, 100);
        MNametxt.setBounds(300, 170, 100, 50);
        
        lName.setBounds(100, 200, 90, 100);
        LNametxt.setBounds(300, 220, 100, 50);
        
        email.setBounds(100, 250, 90, 100);
        Emailtxt.setBounds(300, 270, 100, 50);
        
        BDate.setBounds(100, 300, 90, 100);
        BDatetxt.setBounds(300, 320, 100, 50);
        
        city.setBounds(700, 50, 90, 100);
        Citytxt.setBounds(900, 70, 100, 50);
        
        address.setBounds(700, 100, 90, 100);
        Addresstxt.setBounds(900, 120, 100, 50);
        
        PNumber.setBounds(700, 150, 90, 100);
        PNotxt.setBounds(900, 170, 100, 50);
        
        HNumber.setBounds(700, 200, 90, 100);
        HNotxt.setBounds(900, 220, 100, 50);
        
        gender.setBounds(700, 250, 90, 100);
        genders.setBounds(900, 290, 100, 20);
        
        status.setBounds(700, 300, 90, 100);
        Status.setBounds(900, 340, 100, 20);
        
        cont.add(add);
        cont.add(back);
        
        cont.add(Id);
        cont.add(fName);
        cont.add(mName);
        cont.add(lName);
        cont.add(email);
        cont.add(BDate);
        cont.add(city);
        cont.add(address);
        cont.add(PNumber);
        cont.add(HNumber);
        cont.add(gender);
        cont.add(status);
        
        cont.add(IDtxt);
        cont.add(FNametxt);
        cont.add(MNametxt);
        cont.add(LNametxt);
        cont.add(Emailtxt);
        cont.add(BDatetxt);
        cont.add(Citytxt);
        cont.add(Addresstxt);
        cont.add(PNotxt);
        cont.add(HNotxt);
        cont.add(genders);
        cont.add(Status);
        
        add.addActionListener(new dosave());
        back.addActionListener(new dosave());
    }
    private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            if (ae.getSource().equals(add)){
             
                n.setID(IDtxt.getText());
                n.setFirstName(FNametxt.getText());
                n.setMiddleName(MNametxt.getText());
                n.setLastName(LNametxt.getText());
                n.setEmail(Emailtxt.getText());
                n.setBirthDate(BDatetxt.getText());
                n.setCity(Citytxt.getText());
                n.setAddress(Addresstxt.getText());
                n.setPhoneNumber(PNotxt.getText());
                n.setTelephoneNumber(HNotxt.getText());
                n.setGender(genders.getSelectedItem().toString());
                n.setStatus(Status.getSelectedItem().toString());
                
                //doctors.add(d);
                n.Add();    
                JOptionPane.showMessageDialog(null, "Nurse has be added Successfully!");
               
                
            }
            else if (ae.getSource().equals(back)){
            GuiNurseChanges a=new GuiNurseChanges();
            a.setVisible(true);
                try {
                    a.setDefaultCloseOperation(DataLoad.writeNurses());
                } catch (IOException ex) {
                    Logger.getLogger(GuiAddNurse.class.getName()).log(Level.SEVERE, null, ex);
                }
            dispose();
            }
        
        }
        
    }
    
    
}
