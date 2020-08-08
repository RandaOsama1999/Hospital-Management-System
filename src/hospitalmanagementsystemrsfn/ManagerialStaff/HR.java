/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemrsfn.ManagerialStaff;

import RSFN.Authorization;
import static RSFN.MainRSFN.doctors;
import static RSFN.MainRSFN.hrs;
import static RSFN.MainRSFN.nurses;
import hospitalmanagementsystemrsfn.ManagerialStaff.MangementStaff;
import RSFN.Staff;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Randa
 */
public class HR extends MangementStaff
{
   //public static ArrayList<HR> hr = new ArrayList<>();

    public HR()
    {
        super();
    }

 
 @Override
    public void Add() {

         System.out.println("HRs===>");
        hrs.add(this);
    }

    @Override
     public void Display() {

        for (HR hr : hrs) {
            System.out.println(hr);
        }

    }
    @Override
    public int Search(String ID) throws FileNotFoundException {
        
        
        for (int i = 0; i < hrs.size(); i++) {
            if (ID.equals(hrs.get(i).getID())) {
               
                this.ID = hrs.get(i).getID();
                this.FirstName = hrs.get(i).getFirstName();
                this.MiddleName = hrs.get(i).getMiddleName();
                this.LastName = hrs.get(i).getLastName();
                this.Email = hrs.get(i).getEmail();
                this.BirthDate = hrs.get(i).getBirthDate();
                this.City = hrs.get(i).getCity();
                this.Address = hrs.get(i).getAddress();
                this.PhoneNumber = hrs.get(i).getPhoneNumber();
                this.TelephoneNumber = hrs.get(i).getTelephoneNumber();
                this.Gender = hrs.get(i).getGender();
                this.Status = hrs.get(i).getStatus();
                JOptionPane.showMessageDialog(null, this.getID() + ", " + this.getFirstName() + ", "+ this.getMiddleName()
                    +", "+this.getLastName()+", "+ this.getEmail() +", "+ this.getBirthDate() +", " +this.getCity()
                    +  ", "+this.getAddress() +", " +this.getPhoneNumber()+", "+this.getTelephoneNumber()
                    +", "+this.getGender()+", "+this.getStatus());
               return i;
            }
        }
       
            JOptionPane.showMessageDialog(null, "HR Not Found !");
            
        
        return 0;
   
    }

    @Override
    public void Remove(int index) {
        hrs.remove(index);
       
    }

    @Override
    public void Edit(int index) throws FileNotFoundException {
                /*hrs.get(index).setID(this.ID);
                hrs.get(index).setFirstName(this.FirstName);
                hrs.get(index).setMiddleName(this.MiddleName);
                hrs.get(index).setLastName(this.LastName);
                hrs.get(index).setEmail(this.Email);
                hrs.get(index).setBirthDate(this.BirthDate);
                hrs.get(index).setCity(this.City);
                hrs.get(index).setAddress(this.Address);
                hrs.get(index).setPhoneNumber(this.PhoneNumber);
                hrs.get(index).setTelephoneNumber(this.TelephoneNumber);
                hrs.get(index).setGender(this.Gender);
                hrs.get(index).setStatus(this.Status);*/
    }
}
