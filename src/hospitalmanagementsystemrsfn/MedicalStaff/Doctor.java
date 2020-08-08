/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemrsfn.MedicalStaff;

import RSFN.Authorization;
import static RSFN.MainRSFN.doctors;
import RSFN.Staff;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Randa
 */
public class Doctor extends MedicalStaff {

    protected String DSpeciality;

    public Doctor()
    {
        super();
        DSpeciality=" ";
    }
    
    public String getDSpeciality() {
        return DSpeciality;
    }

    public void setDSpeciality(String DSpeciality) {
        this.DSpeciality = DSpeciality;
    }
    
    @Override
    public void Add() {
        System.out.println("Doctors===>");
        doctors.add(this);
    }

    @Override
    public void Display() {

        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

    }

    @Override
    public int Search(String id) throws FileNotFoundException {

        for (int i = 0; i < doctors.size(); i++) {
            if (id.equals(doctors.get(i).getID())) {
                this.ID = doctors.get(i).getID();
                this.FirstName = doctors.get(i).getFirstName();
                this.MiddleName = doctors.get(i).getMiddleName();
                this.LastName = doctors.get(i).getLastName();
                this.Email = doctors.get(i).getEmail();
                this.BirthDate = doctors.get(i).getBirthDate();
                this.City = doctors.get(i).getCity();
                this.Address = doctors.get(i).getAddress();
                this.PhoneNumber = doctors.get(i).getPhoneNumber();
                this.TelephoneNumber = doctors.get(i).getTelephoneNumber();
                this.Gender = doctors.get(i).getGender();
                this.Status = doctors.get(i).getStatus();
                JOptionPane.showMessageDialog(null, this.getID() + ", " + this.getFirstName() + ", "+ this.getMiddleName()
                    +", "+this.getLastName()+", "+ this.getEmail() +", "+ this.getBirthDate() +", " +this.getCity()
                    +  ", "+this.getAddress() +", " +this.getPhoneNumber()+", "+this.getTelephoneNumber()
                    +", "+this.getGender()+", "+this.getStatus()+ ", "+this.getDSpeciality());
               return i;
            }
        }
       
            JOptionPane.showMessageDialog(null, "Doctor Not Found !");
        return 0;
    }

    @Override
    public void Remove(int index) {
        doctors.remove(index);
        JOptionPane.showMessageDialog(null, "Doctor Deleted!");
    }

    @Override
    public void Edit(int index) throws FileNotFoundException {
       
                /*doctors.get(index).setID(this.ID);
                doctors.get(index).setFirstName(this.FirstName);
                doctors.get(index).setMiddleName(this.MiddleName);
                doctors.get(index).setLastName(this.LastName);
                doctors.get(index).setEmail(this.Email);
                doctors.get(index).setBirthDate(this.BirthDate);
                doctors.get(index).setCity(this.City);
                doctors.get(index).setAddress(this.Address);
                doctors.get(index).setPhoneNumber(this.PhoneNumber);
                doctors.get(index).setTelephoneNumber(this.TelephoneNumber);
                doctors.get(index).setGender(this.Gender);
                doctors.get(index).setStatus(this.Status);
                doctors.get(index).setStatus(this.DSpeciality);*/
                
        
    }

}
