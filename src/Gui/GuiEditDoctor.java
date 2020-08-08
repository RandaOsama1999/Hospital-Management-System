/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.DataLoad;
import static RSFN.MainRSFN.doctors;
import RSFN.Staff;
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
public class GuiEditDoctor extends JFrame{
    
    Staff d= new Doctor();
    
    String[] Genderlist = new String[] {"Female", "Male"};
    JComboBox<String> genders;
    String[] Statuslist = new String[] {"Married", "Single", "Divorced"};
    JComboBox<String> status;
    String[] Specialitylist = new String[] {"Surgeon", "Neurologist", "Psychologist" ,"Ophthalmologist","Dentist"
                                            ,"Otolaryngologist", "Obstetrician","Cardiologist"};
    JComboBox<String> Specialities;
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
    GuiEditDoctor(int idx)
    {
        setSize(10000,10000);
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiEditDoctor.class.getName()).log(Level.SEVERE, null, ex);
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
        JLabel speciality=new JLabel("Speciality");
        
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
       Specialities=new JComboBox<>(Specialitylist);
        
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
        
        speciality.setBounds(100, 350, 90, 100);
        Specialities.setBounds(300, 390, 100, 20);
        
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
        
        IDtxt.setText(doctors.get(idx).getID());
        FNametxt.setText(doctors.get(idx).getFirstName());
        MNametxt.setText(doctors.get(idx).getMiddleName());
        LNametxt.setText(doctors.get(idx).getLastName());
        Emailtxt.setText(doctors.get(idx).getEmail());
        BDatetxt.setText(doctors.get(idx).getBirthDate());
        Citytxt.setText(doctors.get(idx).getCity());
        Addresstxt.setText(doctors.get(idx).getAddress());
        PNotxt.setText(doctors.get(idx).getPhoneNumber());
        HNotxt.setText(doctors.get(idx).getTelephoneNumber());
        genders.setSelectedItem(doctors.get(idx).getGender());
        status.setSelectedItem(doctors.get(idx).getStatus());
        Specialities.setSelectedItem(doctors.get(idx).getDSpeciality());
        
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
        cont.add(speciality);
        
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
        cont.add(Specialities);
        
        edit.addActionListener(new dosave());
        back.addActionListener(new dosave());
        
    }
     private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            if(ae.getSource().equals(edit))
            {
                doctors.get(idx).setID(IDtxt.getText());
                doctors.get(idx).setFirstName(FNametxt.getText());
                doctors.get(idx).setMiddleName(MNametxt.getText());
                doctors.get(idx).setLastName(LNametxt.getText());
                doctors.get(idx).setEmail(Emailtxt.getText());
                doctors.get(idx).setBirthDate(BDatetxt.getText());
                doctors.get(idx).setCity(Citytxt.getText());
                doctors.get(idx).setAddress(Addresstxt.getText());
                doctors.get(idx).setPhoneNumber(PNotxt.getText());
                doctors.get(idx).setTelephoneNumber(HNotxt.getText());
                doctors.get(idx).setGender(genders.getSelectedItem().toString());
                doctors.get(idx).setStatus(status.getSelectedItem().toString());
                doctors.get(idx).setDSpeciality(Specialities.getSelectedItem().toString());
            }
            
            else if(ae.getSource().equals(back))
            {
                GuiDoctorChanges a=new GuiDoctorChanges();
                a.setVisible(true);
                try {
                    a.setDefaultCloseOperation(DataLoad.writeDoctors());
                } catch (IOException ex) {
                    Logger.getLogger(GuiAddDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        
        }
         
     }
}
