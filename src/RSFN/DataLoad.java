/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

import static RSFN.MainRSFN.doctors;
import static RSFN.MainRSFN.hrs;
import static RSFN.MainRSFN.nurses;
import static RSFN.MainRSFN.financials;
import static RSFN.MainRSFN.receptionists;
import static RSFN.MainRSFN.patients;
import hospitalmanagementsystemrsfn.ManagerialStaff.Financial;
import hospitalmanagementsystemrsfn.ManagerialStaff.HR;
import hospitalmanagementsystemrsfn.ManagerialStaff.Receptionist;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import hospitalmanagementsystemrsfn.MedicalStaff.Nurse;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Randa
 */
public class DataLoad implements Serializable{

    static String DoctorfileName = "C:\\Users\\rodyr\\Desktop\\Hospital Files\\doctor.bin";
    static String HRfileName = "C:\\Users\\rodyr\\Desktop\\Hospital Files\\HR.bin";
    static String FinancialfileName = "C:\\Users\\rodyr\\Desktop\\Hospital Files\\Financial.bin";
    static String RecepfileName = "C:\\Users\\rodyr\\Desktop\\Hospital Files\\Receptionist.bin";
    static String NursefileName = "C:\\Users\\rodyr\\Desktop\\Hospital Files\\Nurse.bin";
    static String PatientfileName = "C:\\Users\\rodyr\\Desktop\\Hospital Files\\Patient.bin";
            

    // Doctor File
    public static void readDoctors() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream read;
        try {
           read = new ObjectInputStream(new FileInputStream(DoctorfileName));
           
            doctors=(ArrayList<Doctor>) read.readObject();
            read.close(); 
            
        } catch (EOFException ex) {
            System.out.println("End of Doctors file has been reached.");
        } catch (IOException ex) {
            
        }
        
    }

    public static int writeDoctors() throws FileNotFoundException, IOException {

        ObjectOutputStream writefile=new ObjectOutputStream(new FileOutputStream(DoctorfileName));
        System.out.println("Doctors." + doctors.size());
        writefile.writeObject(doctors);
        writefile.close();
        return JFrame.EXIT_ON_CLOSE;
        
    }
     public static void readPatient() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream read;
        try {
           read = new ObjectInputStream(new FileInputStream(PatientfileName));
           
            patients=(ArrayList<Patient>) read.readObject();
            read.close(); 
            
        } catch (EOFException ex) {
            System.out.println("End of Patients file has been reached.");
        } catch (IOException ex) {
            
        }
        
    }

    public static int writePatient() throws FileNotFoundException, IOException {

        ObjectOutputStream writefile=new ObjectOutputStream(new FileOutputStream(PatientfileName));
        System.out.println("Patients." + patients.size());
        writefile.writeObject(patients);
        writefile.close();
        return JFrame.EXIT_ON_CLOSE;
        
    }
    public static void readHR() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream read;
        try {
           read = new ObjectInputStream(new FileInputStream(HRfileName));
           
            RSFN.MainRSFN.hrs=(ArrayList<HR>) read.readObject();
            read.close(); 
            
        } catch (EOFException ex) {
            System.out.println("End of Hrs file has been reached.");
        } catch (IOException ex) {
            
        }
        
    }

    public static int writeHR() throws FileNotFoundException, IOException {

        ObjectOutputStream writefile=new ObjectOutputStream(new FileOutputStream(HRfileName));
        System.out.println("HRs." + hrs.size());
        writefile.writeObject(hrs);
        writefile.close();
        return JFrame.EXIT_ON_CLOSE;
        
    }
    
    public static void readNurses() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream read;
        try {
           read = new ObjectInputStream(new FileInputStream(NursefileName));
           
            nurses=(ArrayList<Nurse>) read.readObject();
            read.close(); 
            
        } catch (EOFException ex) {
            System.out.println("End of Nurses file has been reached.");
        } catch (IOException ex) {
            
        }
        
    }

    public static int writeNurses() throws FileNotFoundException, IOException {

        ObjectOutputStream writefile=new ObjectOutputStream(new FileOutputStream(NursefileName));
        System.out.println("Nurses." + nurses.size());
        writefile.writeObject(nurses);
        writefile.close();
        return JFrame.EXIT_ON_CLOSE;
        
    }
    
    public static void readFinancials() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream read;
        try {
           read = new ObjectInputStream(new FileInputStream(FinancialfileName));
           
            financials=(ArrayList<Financial>) read.readObject();
            read.close(); 
            
        } catch (EOFException ex) {
            System.out.println("End of financials file has been reached.");
        } catch (IOException ex) {
            
        }
        
    }

    public static int writeFinancials() throws FileNotFoundException, IOException {

        ObjectOutputStream writefile=new ObjectOutputStream(new FileOutputStream(FinancialfileName));
        System.out.println("Financials." + financials.size());
        writefile.writeObject(financials);
        writefile.close();
        return JFrame.EXIT_ON_CLOSE;
        
    }
    
    
    public static void readReceps() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream read;
        try {
           read = new ObjectInputStream(new FileInputStream(RecepfileName));
           
            receptionists=(ArrayList<Receptionist>) read.readObject();
            read.close(); 
            
        } catch (EOFException ex) {
            System.out.println("End of receptionists file has been reached.");
        } catch (IOException ex) {
            
        }
        
    }

    public static int writeReceps() throws FileNotFoundException, IOException {

        ObjectOutputStream writefile=new ObjectOutputStream(new FileOutputStream(RecepfileName));
        System.out.println("Receptionists." + receptionists.size());
        writefile.writeObject(receptionists);
        writefile.close();
        return JFrame.EXIT_ON_CLOSE;
        
    }

}
