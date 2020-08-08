/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemrsfn.ManagerialStaff;

import RSFN.Authorization;
import static RSFN.MainRSFN.doctors;
import static RSFN.MainRSFN.nurses;
import static RSFN.MainRSFN.receptionists;
import RSFN.Staff;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Randa
 */
public class Receptionist extends MangementStaff{

    public Receptionist()
    {
    
    }
  /*  checkRoomsAvailabilty (){
        
    }*/

    @Override
    public void Add() {
         System.out.println("Receptionists===>");
        receptionists.add(this);
    }

    @Override
    public void Edit(int index) throws FileNotFoundException {
                /*receptionists.get(index).setID(this.ID);
                receptionists.get(index).setFirstName(this.FirstName);
                receptionists.get(index).setMiddleName(this.MiddleName);
                receptionists.get(index).setLastName(this.LastName);
                receptionists.get(index).setEmail(this.Email);
                receptionists.get(index).setBirthDate(this.BirthDate);
                receptionists.get(index).setCity(this.City);
                receptionists.get(index).setAddress(this.Address);
                receptionists.get(index).setPhoneNumber(this.PhoneNumber);
                receptionists.get(index).setTelephoneNumber(this.TelephoneNumber);
                receptionists.get(index).setGender(this.Gender);
                receptionists.get(index).setStatus(this.Status);*/
                
        
    }

    @Override
    public void Display() throws FileNotFoundException {
        for (Receptionist receptionist : receptionists) {
            System.out.println(receptionist);
        }

    }

    @Override
    public int Search(String ID) throws FileNotFoundException {
         for (int i = 0; i < receptionists.size(); i++) {
            if (ID.equals(receptionists.get(i).getID())) {
               
                this.ID = receptionists.get(i).getID();
                this.FirstName = receptionists.get(i).getFirstName();
                this.MiddleName = receptionists.get(i).getMiddleName();
                this.LastName = receptionists.get(i).getLastName();
                this.Email = receptionists.get(i).getEmail();
                this.BirthDate = receptionists.get(i).getBirthDate();
                this.City = receptionists.get(i).getCity();
                this.Address = receptionists.get(i).getAddress();
                this.PhoneNumber = receptionists.get(i).getPhoneNumber();
                this.TelephoneNumber = receptionists.get(i).getTelephoneNumber();
                this.Gender = receptionists.get(i).getGender();
                this.Status = receptionists.get(i).getStatus();
                JOptionPane.showMessageDialog(null, this.getID() + ", " + this.getFirstName() + ", "+ this.getMiddleName()
                    +", "+this.getLastName()+", "+ this.getEmail() +", "+ this.getBirthDate() +", " +this.getCity()
                    +  ", "+this.getAddress() +", " +this.getPhoneNumber()+", "+this.getTelephoneNumber()
                    +", "+this.getGender()+", "+this.getStatus());
               return i;
            }
        }
       
            JOptionPane.showMessageDialog(null, "Receptionist Not Found !");
            return 0;
    }

    @Override
    public void Remove(int index) {
        receptionists.remove(index);
    }

 


   
}
