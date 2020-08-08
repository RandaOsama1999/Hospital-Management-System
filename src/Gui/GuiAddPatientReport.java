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
import RSFN.Room;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.System.exit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Randa
 */
public class GuiAddPatientReport extends JFrame{
    
    Patient p;
    
    String[] medications = new String[] {"Operation", "Nerve Pills", "Sedatives" ,"Eye drop","Mouth Wash"
                                   ,"Pills", "Vitamins","Heart Pills"};
    
    JComboBox<String> neededMedications;
    JTextArea report;
    JTextField patientid;
    JButton add;
    JButton back;
    
    public GuiAddPatientReport() throws ParseException {
        this.p = new Patient();
        setSize(10000,10000);
        
        neededMedications=new JComboBox<>(medications);
        
        add=new JButton("Add");
        back=new JButton("Back");
        
        JLabel medicationlbl=new JLabel("Needed Medication");
        JLabel reportlbl=new JLabel("Report");
        JLabel pid=new JLabel("Patient's ID");
        
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiAddPatientReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        report=new JTextArea("");
        patientid=new JTextField("");
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        add.setBounds(550, 450, 120, 40);
        back.setBounds(550, 500, 120, 40);
        
        medicationlbl.setBounds(500, 100, 120, 100);
        neededMedications.setBounds(630, 140, 120, 20);
        
        pid.setBounds(500, 50, 120, 100);
        patientid.setBounds(630, 90, 120, 20);
        
        reportlbl.setBounds(500, 150, 90, 100);
        report.setBounds(600, 195, 250, 200);
        
        cont.add(add);
        cont.add(back);
        
        cont.add(pid);
        cont.add(patientid);
        cont.add(reportlbl);
        cont.add(report);
        cont.add(medicationlbl);
        cont.add(neededMedications);
        
        add.addActionListener(new dosave());
        back.addActionListener(new dosave());
    }
    
    private class dosave implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            if (ae.getSource().equals(add)){
                
                    
                try {
                    int id=p.Search(patientid.getText());
                    if(dateFormat.format(date).equals(dateFormat.format(patients.get(id).getNextCheckupDate()))
                        && timeFormat.format(date).equals(timeFormat.format(patients.get(id).getNextCheckupTime())))
                    {
                        JOptionPane.showMessageDialog(null, "Report of Patient with ID ("+patients.get(id).getID()+") was added");
                        patients.get(id).setNeededMedication(neededMedications.getSelectedItem().toString());
                        patients.get(id).setPatientReport(report.getText());
                        patients.get(id).setPatientChecked(true);
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null, "He/She hasn't entered yet");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(GuiAddPatientReport.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
                  
            }
            else if (ae.getSource().equals(back)){
            GuiNursePortal a=new GuiNursePortal();
            a.setVisible(true);
                try {
                    a.setDefaultCloseOperation(DataLoad.writePatient());
                } catch (IOException ex) {
                    Logger.getLogger(GuiAddPatientReport.class.getName()).log(Level.SEVERE, null, ex);
                }
            dispose();
            }
        
        }
        
    }
        
    
}
