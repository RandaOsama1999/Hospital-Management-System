/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.DataLoad;
import static RSFN.MainRSFN.financials;
import RSFN.Staff;
import hospitalmanagementsystemrsfn.ManagerialStaff.Financial;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
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
public class GuiEditFinancial extends JFrame{
    
    Staff f= new Financial();
    
    String[] Genderlist = new String[] {"Female", "Male"};
    JComboBox<String> genders;
    String[] Statuslist = new String[] {"Married", "Single", "Divorced"};
    JComboBox<String> status;
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
    
    JButton edit;
    JButton delete;
    JButton back;
    int idx;
    GuiEditFinancial(int idx)
    {
        setSize(10000,10000);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiEditFinancial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        edit=new JButton("Edit");
        delete=new JButton("Delete");
        back=new JButton("Back to main menu");
        
        JLabel ID=new JLabel("ID");
        JLabel fName=new JLabel("First Name");
        JLabel mName=new JLabel("Middle Name");
        JLabel lName=new JLabel("Last Name");
        JLabel Email=new JLabel("Email");
        JLabel BDate=new JLabel("Birth Date");
        JLabel City=new JLabel("City");
        JLabel Address=new JLabel("Address");
        JLabel PNumber=new JLabel("Phone Number");
        JLabel HNumber=new JLabel("Home Number");
        JLabel Gender=new JLabel("Gender");
        JLabel Status=new JLabel("Status");
        
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
        
       genders = new JComboBox<>(Genderlist);
       status=new JComboBox<>(Statuslist);
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        edit.setBounds(550, 450, 120, 40);
        back.setBounds(530, 500, 160, 40);
       
        ID.setBounds(100, 50, 90, 100);
        IDtxt.setBounds(300, 70, 100, 50);
        
        fName.setBounds(100, 100, 90, 100);
        FNametxt.setBounds(300, 120, 100, 50);
        
        mName.setBounds(100, 150, 90, 100);
        MNametxt.setBounds(300, 170, 100, 50);
        
        lName.setBounds(100, 200, 90, 100);
        LNametxt.setBounds(300, 220, 100, 50);
        
        Email.setBounds(100, 250, 90, 100);
        Emailtxt.setBounds(300, 270, 100, 50);
        
        BDate.setBounds(100, 300, 90, 100);
        BDatetxt.setBounds(300, 320, 100, 50);
        
        City.setBounds(700, 50, 90, 100);
        Citytxt.setBounds(900, 70, 100, 50);
        
        Address.setBounds(700, 100, 90, 100);
        Addresstxt.setBounds(900, 120, 100, 50);
        
        PNumber.setBounds(700, 150, 90, 100);
        PNotxt.setBounds(900, 170, 100, 50);
        
        HNumber.setBounds(700, 200, 90, 100);
        HNotxt.setBounds(900, 220, 100, 50);
        
        Gender.setBounds(700, 250, 90, 100);
        genders.setBounds(900, 290, 100, 20);
        
        Status.setBounds(700, 300, 90, 100);
        status.setBounds(900, 340, 100, 20);
        
        IDtxt.setText(financials.get(idx).getID());
        FNametxt.setText(financials.get(idx).getFirstName());
        MNametxt.setText(financials.get(idx).getMiddleName());
        LNametxt.setText(financials.get(idx).getLastName());
        Emailtxt.setText(financials.get(idx).getEmail());
        BDatetxt.setText(financials.get(idx).getBirthDate());
        Citytxt.setText(financials.get(idx).getCity());
        Addresstxt.setText(financials.get(idx).getAddress());
        PNotxt.setText(financials.get(idx).getPhoneNumber());
        HNotxt.setText(financials.get(idx).getTelephoneNumber());
        genders.setSelectedItem(financials.get(idx).getGender());
        status.setSelectedItem(financials.get(idx).getStatus());
        
        cont.add(edit);
        cont.add(delete);
        cont.add(back);
        
        cont.add(ID);
        cont.add(fName);
        cont.add(mName);
        cont.add(lName);
        cont.add(Email);
        cont.add(BDate);
        cont.add(City);
        cont.add(Address);
        cont.add(PNumber);
        cont.add(HNumber);
        cont.add(Gender);
        cont.add(Status);
        
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
        cont.add(status);
        
        edit.addActionListener(new dosave());
        back.addActionListener(new dosave());
        
    }
     private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            if(ae.getSource().equals(edit))
            {
                financials.get(idx).setID(IDtxt.getText());
                financials.get(idx).setFirstName(FNametxt.getText());
                financials.get(idx).setMiddleName(MNametxt.getText());
                financials.get(idx).setLastName(LNametxt.getText());
                financials.get(idx).setEmail(Emailtxt.getText());
                financials.get(idx).setBirthDate(BDatetxt.getText());
                financials.get(idx).setCity(Citytxt.getText());
                financials.get(idx).setAddress(Addresstxt.getText());
                financials.get(idx).setPhoneNumber(PNotxt.getText());
                financials.get(idx).setTelephoneNumber(HNotxt.getText());
                financials.get(idx).setGender(genders.getSelectedItem().toString());
                financials.get(idx).setStatus(status.getSelectedItem().toString());
            }
            
            else if(ae.getSource().equals(back))
            {
                GuiFinancialChanges a=new GuiFinancialChanges();
                a.setVisible(true);
                try {
                    a.setDefaultCloseOperation(DataLoad.writeFinancials());
                } catch (IOException ex) {
                    Logger.getLogger(GuiAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        
        }
         
     }
}
