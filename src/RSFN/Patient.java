/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

import static RSFN.MainRSFN.dateFormat;
import static RSFN.MainRSFN.doctors;
import static RSFN.MainRSFN.patients;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Randa
 */
public class Patient implements Serializable {
    
   
   //protected ArrayList<PatientHistory> patientCases;
   protected String ID;
   protected String FirstName;
   protected String MiddleName;
   protected String LastName;
   protected String MotherName;
   protected String Email;
   protected String BirthDate;
   protected String BloodType;
   protected String City;
   protected String Address;
   protected String PhoneNumber;
   protected String TelephoneNumber;
   protected String Gender;
   protected String Status;
   protected String patientCases;
   protected String doctorRecommend;
   protected Date nextCheckupDate;
   protected Date nextCheckupTime;
   protected String patientRoom;
   protected String neededMedication;
   protected String patientReport;
   protected boolean patientChecked;

   public Patient() throws ParseException
   {
    ID=" ";
    FirstName=" ";
    MiddleName=" ";
    LastName=" ";
    MotherName=" ";
    Email=" ";
    BirthDate=" ";
    BloodType=" ";
    City=" ";
    Address=" ";
    PhoneNumber=" ";
    TelephoneNumber=" ";
    Gender=" ";
    Status=" ";
    patientCases=" ";
    doctorRecommend=" ";
    nextCheckupDate=new Date();
    nextCheckupTime=new Date();
    patientRoom="";
    neededMedication="";
    patientReport="";
    patientChecked=false;
   }

    public boolean isPatientChecked() {
        return patientChecked;
    }

    public void setPatientChecked(boolean patientChecked) {
        this.patientChecked = patientChecked;
    }

    public String getPatientReport() {
        return patientReport;
    }

    public void setPatientReport(String patientReport) {
        this.patientReport = patientReport;
    }

    public String getNeededMedication() {
        return neededMedication;
    }

    public void setNeededMedication(String neededMedication) {
        this.neededMedication = neededMedication;
    }
   
   public String getPatientRoom() {
        return patientRoom;
    }

    public void setPatientRoom(String patientRoom) {
        this.patientRoom = patientRoom;
    }
    
   public String getDoctorRecommend() {
        return doctorRecommend;
    }

    public void setDoctorRecommend(String doctorRecommend) {
        this.doctorRecommend = doctorRecommend;
    }
   public void setID(String ID) {
        this.ID = ID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public void setLastName(String LastName) {  
        this.LastName = LastName;
    }

    public void setMotherName(String MotherName) {
        this.MotherName = MotherName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public String getEmail() {
        return Email;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public String getBloodType() {
        return BloodType;
    }

    public String getCity() {
        return City;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public String getStatus() {
        return Status;
    }

    public String getPatientCases() {
        return patientCases;
    }

    public void setPatientCases(String patientCases) {
        this.patientCases = patientCases;
    }

    public Date getNextCheckupDate() {
        return nextCheckupDate;
    }

    public void setNextCheckupDate(Date nextCheckupDate) {
        this.nextCheckupDate = nextCheckupDate;
    }

    public Date getNextCheckupTime() {
        return nextCheckupTime;
    }

    public void setNextCheckupTime(Date nextCheckupTime) {
        this.nextCheckupTime = nextCheckupTime;
    }

  
    
    
    public void Add() {
        System.out.println("Patients===>");
        patients.add(this);
    }

    public void Display() {

        for (Patient patient : patients) {
            System.out.println(patient);
        }

    }

    public int Search(String id) throws FileNotFoundException {

      for (int i = 0; i < patients.size(); i++) {
            if (id.equals(patients.get(i).getID())) {
                this.ID = patients.get(i).getID();
                this.FirstName = patients.get(i).getFirstName();
                this.MiddleName = patients.get(i).getMiddleName();
                this.LastName = patients.get(i).getLastName();
                this.MotherName=patients.get(i).getMotherName();
                this.Email = patients.get(i).getEmail();
                this.BirthDate = patients.get(i).getBirthDate();
                this.City = patients.get(i).getCity();
                this.Address = patients.get(i).getAddress();
                this.PhoneNumber = patients.get(i).getPhoneNumber();
                this.TelephoneNumber = patients.get(i).getTelephoneNumber();
                this.nextCheckupDate=patients.get(i).getNextCheckupDate();
                this.Gender = patients.get(i).getGender();
                this.Status = patients.get(i).getStatus();
                this.BloodType=patients.get(i).getBloodType();
                this.patientCases=patients.get(i).getPatientCases();
                this.doctorRecommend=patients.get(i).getDoctorRecommend();
                this.patientRoom=patients.get(i).getPatientRoom();
                this.nextCheckupTime=patients.get(i).getNextCheckupTime();
                JOptionPane.showMessageDialog(null, this.getID() + ", " + this.getFirstName() +", "+this.getLastName());
               return i;
            }
        }
       
            JOptionPane.showMessageDialog(null, "Patient Not Found !");
            
        
        return 0;
    }

    public void Remove(int index) {
        patients.remove(index);
        JOptionPane.showMessageDialog(null, "Patient Deleted!");
    }


    public void Edit(int index) throws FileNotFoundException {
                /*patients.get(index).setID(this.ID);
                patients.get(index).setFirstName(this.FirstName);
                patients.get(index).setMiddleName(this.MiddleName);
                patients.get(index).setLastName(this.LastName);
                patients.get(index).setMotherName(this.MotherName);
                patients.get(index).setEmail(this.Email);
                patients.get(index).setBirthDate(this.BirthDate);
                patients.get(index).setCity(this.City);
                patients.get(index).setAddress(this.Address);
                patients.get(index).setPhoneNumber(this.PhoneNumber);
                patients.get(index).setTelephoneNumber(this.TelephoneNumber);
                patients.get(index).setNextCheckupDate(this.nextCheckupDate);
                patients.get(index).setNextCheckupTime(this.nextCheckupTime);
                patients.get(index).setGender(this.Gender);
                patients.get(index).setStatus(this.Status);
                patients.get(index).setBloodType(this.BloodType);
                patients.get(index).setPatientCases(this.patientCases);
                patients.get(index).setDoctorRecommend(this.doctorRecommend);
                patients.get(index).setPatientRoom(this.patientRoom);*/
    }

}
