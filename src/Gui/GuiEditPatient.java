/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.DataLoad;
import static RSFN.MainRSFN.date;
import static RSFN.MainRSFN.dateFormat;
import static RSFN.MainRSFN.doctors;
import static RSFN.MainRSFN.patients;
import static RSFN.MainRSFN.timeFormat;
import RSFN.Patient;
import RSFN.Staff;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Randa
 */
public class GuiEditPatient extends JFrame{
    
    Patient p;
    int[] normalRoom = new int[100];
    int[] mediumRoom = new int[50];
    int[] vipRoom = new int[30];
    
    Staff d=new Doctor();
    String[] Genderlist = new String[] {"Female", "Male"};
    JComboBox<String> genders;
    String[] Statuslist = new String[] {"Married", "Single", "Divorced"};
    JComboBox<String> Status;
    String[] blood = new String[] {"O-", "O+", "A-" ,"A+","B-","B+", "AB-","AB+"};
    JComboBox<String> BloodType;
    String[] Cases = new String[] {"Surgery Needed", "Nervous Problem", "Psychological Disorder" ,"Eye Diseases","Dental Problems"
                                   ,"Ear/Nose/Throat Problems", "Obstetrics","Heart Problem"};
    JComboBox<String> Patientcase;
    String[] RoomType = new String[] {"Normal", "Medium", "VIP"};
    JComboBox<String> roomlist;
    
    JComboBox<String> drRecommend;
    JTextField IDtxt;
    JTextField FNametxt;
    JTextField MNametxt;
    JTextField LNametxt;
    JTextField MotherNametxt;
    JTextField Emailtxt;
    JTextField BDatetxt;
    JTextField Citytxt;
    JTextField Addresstxt;
    JTextField PNotxt;
    JTextField HNotxt;
    
    
    JComboBox checkuptimetxt;
    
    JComboBox checkupdatetxt;
    
    JButton edit;
    JButton back;
    
    
    int idx;
    GuiEditPatient(int idx) throws ParseException
    {
        this.p = new Patient();
        setSize(10000,10000);
        
        
        genders = new JComboBox<>(Genderlist);
        Status=new JComboBox<>(Statuslist);
        BloodType=new JComboBox<>(blood);
        Patientcase=new JComboBox<>(Cases);
        roomlist=new JComboBox<>(RoomType);
        
        
        String[] nameDr=new String[doctors.size()];
        for(int i=0;i<doctors.size();i++)
        {
            nameDr[i]=doctors.get(i).getFirstName().toString();
        }
        drRecommend= new JComboBox<>(nameDr);
       
        
        
        checkuptimetxt= new JComboBox<>();
        for(int i=0;i<5;i++)
        {
            date=new Date();
            date.setHours(date.getHours()+i);
            checkuptimetxt.addItem(timeFormat.format(date));
        }
        
        
        checkupdatetxt = new JComboBox();
        for(int i=0;i<10;i++)
        {
            date=new Date();
            date.setDate(date.getDate()+i);
            checkupdatetxt.addItem(dateFormat.format(date));
        }
          
        
        
        edit=new JButton("Edit");
        back=new JButton("Back");
        
        JLabel Id=new JLabel("ID");
        JLabel fName=new JLabel("First Name");
        JLabel mName=new JLabel("Middle Name");
        JLabel lName=new JLabel("Last Name");
        JLabel motherName=new JLabel("Mother's Name");
        JLabel email=new JLabel("Email");
        JLabel BDate=new JLabel("Birth Date");
        JLabel city=new JLabel("City");
        JLabel address=new JLabel("Address");
        JLabel PNumber=new JLabel("Phone Number");
        JLabel HNumber=new JLabel("Home Number");
        JLabel gender=new JLabel("Gender");
        JLabel status=new JLabel("Status");
        JLabel bloodtype=new JLabel("Blood Type");
        JLabel Checkup=new JLabel("CheckUp Date/Time");
        JLabel pCase=new JLabel("Health Case");
        JLabel dr=new JLabel("Dr Recommended");
        JLabel roomlbl=new JLabel("Room Type");
        
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiAddPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        IDtxt=new JTextField("");
        FNametxt=new JTextField("");
        MNametxt=new JTextField("");
        LNametxt=new JTextField("");
        MotherNametxt=new JTextField("");
        Emailtxt=new JTextField("");
        BDatetxt=new JTextField("");
        Citytxt=new JTextField("");
        Addresstxt=new JTextField("");
        PNotxt=new JTextField("");
        HNotxt=new JTextField("");
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        edit.setBounds(450, 600, 120, 40);
        back.setBounds(600, 600, 120, 40);
       
        Id.setBounds(100, 50, 90, 100);
        IDtxt.setBounds(300, 70, 100, 50);
        
        fName.setBounds(100, 100, 90, 100);
        FNametxt.setBounds(300, 120, 100, 50);
        
        mName.setBounds(100, 150, 90, 100);
        MNametxt.setBounds(300, 170, 100, 50);
        
        lName.setBounds(100, 200, 90, 100);
        LNametxt.setBounds(300, 220, 100, 50);
        
        motherName.setBounds(100, 250, 90, 100);
        MotherNametxt.setBounds(300, 270, 100, 50);
        
        email.setBounds(100, 300, 90, 100);
        Emailtxt.setBounds(300, 320, 100, 50);
        
        BDate.setBounds(100, 350, 90, 100);
        BDatetxt.setBounds(300, 370, 100, 50);
        
        pCase.setBounds(100, 400, 90, 100);
        Patientcase.setBounds(300, 440, 130, 20);
        
        bloodtype.setBounds(100, 450, 90, 100);
        BloodType.setBounds(300, 490, 100, 20);
        
        address.setBounds(700, 50, 90, 100);
        Addresstxt.setBounds(900, 70, 100, 50);
        
        PNumber.setBounds(700, 100, 90, 100);
        PNotxt.setBounds(900, 120, 100, 50);
        
        HNumber.setBounds(700, 150, 90, 100);
        HNotxt.setBounds(900, 170, 100, 50);
        
        city.setBounds(700, 200, 90, 100);
        Citytxt.setBounds(900, 220, 100, 50);
        
        gender.setBounds(700, 250, 90, 100);
        genders.setBounds(900, 290, 100, 20);
        
        status.setBounds(700, 300, 90, 100);
        Status.setBounds(900, 340, 100, 20);
        
        roomlbl.setBounds(700, 350, 90, 100);
        roomlist.setBounds(900, 390, 100, 20);
        
        dr.setBounds(700, 400, 120, 100);
        drRecommend.setBounds(900, 440, 100, 20);
        
        Checkup.setBounds(700, 450, 120, 100);
        checkupdatetxt.setBounds(900, 490, 100, 20);
        checkuptimetxt.setBounds(1020, 490, 100, 20);
        
        IDtxt.setText(patients.get(idx).getID());
        FNametxt.setText(patients.get(idx).getFirstName());
        MNametxt.setText(patients.get(idx).getMiddleName());
        LNametxt.setText(patients.get(idx).getLastName());
        MotherNametxt.setText(patients.get(idx).getMotherName());
        Emailtxt.setText(patients.get(idx).getEmail());
        BDatetxt.setText(patients.get(idx).getBirthDate());
        Patientcase.setSelectedItem(patients.get(idx).getPatientCases());
        BloodType.setSelectedItem(patients.get(idx).getBloodType());
        Citytxt.setText(patients.get(idx).getCity());
        Addresstxt.setText(patients.get(idx).getAddress());
        PNotxt.setText(patients.get(idx).getPhoneNumber());
        HNotxt.setText(patients.get(idx).getTelephoneNumber());
        genders.setSelectedItem(patients.get(idx).getGender());
        Status.setSelectedItem(patients.get(idx).getStatus());
        roomlist.setSelectedItem(patients.get(idx).getPatientRoom());
        drRecommend.setSelectedItem(patients.get(idx).getDoctorRecommend());
        checkupdatetxt.setSelectedItem(patients.get(idx).getNextCheckupDate());
        checkuptimetxt.setSelectedItem(patients.get(idx).getNextCheckupTime());
        
        cont.add(edit);
        cont.add(back);
        
        cont.add(roomlbl);
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
        cont.add(bloodtype);
        cont.add(motherName);
        cont.add(Checkup);
        cont.add(pCase);
        cont.add(dr);
        
        cont.add(roomlist);
        cont.add(IDtxt);
        cont.add(FNametxt);
        cont.add(MNametxt);
        cont.add(LNametxt);
        cont.add(MotherNametxt);
        cont.add(Emailtxt);
        cont.add(BDatetxt);
        cont.add(Citytxt);
        cont.add(Addresstxt);
        cont.add(PNotxt);
        cont.add(HNotxt);
        cont.add(genders);
        cont.add(Status);
        cont.add(BloodType);
        cont.add(checkupdatetxt);
        cont.add(checkuptimetxt);
        cont.add(Patientcase);
        cont.add(drRecommend);
        
        edit.addActionListener(new dosave());
        back.addActionListener(new dosave());
        
    }
     private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            if(ae.getSource().equals(edit))
            {
                try {
                    patients.get(idx).setID(IDtxt.getText());
                    patients.get(idx).setFirstName(FNametxt.getText());
                    patients.get(idx).setMiddleName(MNametxt.getText());
                    patients.get(idx).setLastName(LNametxt.getText());
                    patients.get(idx).setMotherName(MotherNametxt.getText());
                    patients.get(idx).setEmail(Emailtxt.getText());
                    patients.get(idx).setBirthDate(BDatetxt.getText());
                    patients.get(idx).setPatientCases(Patientcase.getSelectedItem().toString());
                    patients.get(idx).setBloodType(BloodType.getSelectedItem().toString());
                    patients.get(idx).setCity(Citytxt.getText());
                    patients.get(idx).setAddress(Addresstxt.getText());
                    patients.get(idx).setPhoneNumber(PNotxt.getText());
                    patients.get(idx).setTelephoneNumber(HNotxt.getText());
                    patients.get(idx).setGender(genders.getSelectedItem().toString());
                    patients.get(idx).setStatus(Status.getSelectedItem().toString());
                    patients.get(idx).setPatientRoom(roomlist.getSelectedItem().toString());
                    patients.get(idx).setDoctorRecommend(drRecommend.getSelectedItem().toString());
                    patients.get(idx).setNextCheckupDate(dateFormat.parse(checkupdatetxt.getSelectedItem().toString()));
                    patients.get(idx).setNextCheckupTime(timeFormat.parse(checkuptimetxt.getSelectedItem().toString()));
                } catch (ParseException ex) {
                    Logger.getLogger(GuiEditPatient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(ae.getSource().equals(back))
            {
                GuiRecepPortal a=new GuiRecepPortal();
                a.setVisible(true);
                try {
                    a.setDefaultCloseOperation(DataLoad.writePatient());
                } catch (IOException ex) {
                    Logger.getLogger(GuiSearchDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        
        }
         
     }
}
