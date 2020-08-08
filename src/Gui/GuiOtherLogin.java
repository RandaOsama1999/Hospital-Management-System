/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import static RSFN.MainRSFN.date;
import static RSFN.MainRSFN.dateFormat;
import static RSFN.MainRSFN.doctors;
import static RSFN.MainRSFN.hrs;
import static RSFN.MainRSFN.nurses;
import static RSFN.MainRSFN.patients;
import static RSFN.MainRSFN.receptionists;
import RSFN.Patient;
import hospitalmanagementsystemrsfn.ManagerialStaff.HR;
import hospitalmanagementsystemrsfn.ManagerialStaff.Receptionist;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import hospitalmanagementsystemrsfn.MedicalStaff.Nurse;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Randa
 */
public class GuiOtherLogin extends JFrame{
    JTextField Nametxt;
    JPasswordField Idtxt;
    JButton LoginBtn;
    
    public GuiOtherLogin()
    {
       setSize(10000,10000);
        LoginBtn=new JButton("Log in");
        
        JLabel Name=new JLabel("UserName");
        JLabel ID=new JLabel("ID");
        
        Nametxt=new JTextField("");
        Idtxt=new JPasswordField("");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiOtherLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Container c=getContentPane();
        c.setLayout(null);
        
        LoginBtn.setBounds(600, 400, 120, 40);
       
        Name.setBounds(560, 250, 90, 100);
        Nametxt.setBounds(650, 280, 100, 40);
        
        ID.setBounds(560, 300, 90, 100);
        Idtxt.setBounds(650, 330, 100, 40);
        
        c.add(LoginBtn);
        c.add(Name);
        c.add(ID);
        c.add(Idtxt);
        c.add(Nametxt);
        
        LoginBtn.addActionListener(new handler());
        
    }
    private class handler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            
            for(Doctor doc:doctors)
                {
                    if(Nametxt.getText().equals(doc.getFirstName()) )
                    {
                        if(Idtxt.getText().equals(doc.getID()))
                        {
                            GuiDoctorPortal d=new GuiDoctorPortal();
                            d.setVisible(true);
                            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Wrong Username or Password");
                        }
                        break;
                    }
                }
                
                for(Nurse n:nurses)
                {
                    if(Nametxt.getText().equals(n.getFirstName()) )
                    {
                        if(Idtxt.getText().equals(n.getID()))
                        {
                            GuiNursePortal d=new GuiNursePortal();
                            d.setVisible(true);
                            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            
                            for(int i=0;i<patients.size();i++)
                            {
                                    if(dateFormat.format(date).equals(dateFormat.format(patients.get(i).getNextCheckupDate())))
                                    {
                                        JOptionPane.showMessageDialog(null, "Patient with ID ("+patients.get(i).getID()+") has an appointment today");
                                    }
                            }
                            dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Wrong Username or Password");
                        }
                        break;
                    }
                }
                for(Receptionist recep:receptionists)
                {
                    if(Nametxt.getText().equals(recep.getFirstName()) )
                    {
                        if(Idtxt.getText().equals(recep.getID()))
                        {
                            GuiRecepPortal d=new GuiRecepPortal();
                            d.setVisible(true);
                            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Wrong Username or Password");
                        }
                        break;
                    }
                }
                for(HR hr:hrs)
                {
                    if(Nametxt.getText().equals(hr.getFirstName()) )
                    {
                        if(Idtxt.getText().equals(hr.getID()))
                        {
                            GuiDoctorPortal d=new GuiDoctorPortal();
                            d.setVisible(true);
                            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Wrong Username or Password");
                        }
                        break;
                    }
                }
                
            }
            /*int i=0;
            if(Idtxt.getText().charAt(i)=='D')
            {
                GuiDoctorPortal d=new GuiDoctorPortal();
                d.setVisible(true);
                d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();   
            }
            else if(Idtxt.getText().charAt(i)=='R')
            {
                GuiRecepPortal r=new GuiRecepPortal();
                r.setVisible(true);
                r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
            else if(Idtxt.getText().charAt(i)=='H')
            {
                GuiHRPortal h=new GuiHRPortal();
                h.setVisible(true);
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
            else if(Idtxt.getText().charAt(i)=='F')
            {
                GuiFinancialPortal f=new GuiFinancialPortal();
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
            else if(Idtxt.getText().charAt(i)=='N')
            {
                GuiNursePortal n=new GuiNursePortal();
                n.setVisible(true);
                n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        }*/
        
        
    }
}
