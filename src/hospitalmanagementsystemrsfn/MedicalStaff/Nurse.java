/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemrsfn.MedicalStaff;

import RSFN.Authorization;
import static RSFN.MainRSFN.doctors;
import static RSFN.MainRSFN.nurses;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Randa
 */
public class Nurse extends MedicalStaff{

    public Nurse()
    {
        super();
    }

    
    @Override
    public void Add() {
        System.out.println("Nurses===>");
        nurses.add(this);
    }

    @Override
    public void Remove(int index) {
        nurses.remove(index);
    }

    @Override
    public void Edit(int index) throws FileNotFoundException {
                /*nurses.get(index).setID(this.ID);
                nurses.get(index).setFirstName(this.FirstName);
                nurses.get(index).setMiddleName(this.MiddleName);
                nurses.get(index).setLastName(this.LastName);
                nurses.get(index).setEmail(this.Email);
                nurses.get(index).setBirthDate(this.BirthDate);
                nurses.get(index).setCity(this.City);
                nurses.get(index).setAddress(this.Address);
                nurses.get(index).setPhoneNumber(this.PhoneNumber);
                nurses.get(index).setTelephoneNumber(this.TelephoneNumber);
                nurses.get(index).setGender(this.Gender);
                nurses.get(index).setStatus(this.Status);*/
    }

    @Override
    public void Display() throws FileNotFoundException {
        for (Nurse nurse : nurses) {
            System.out.println(nurse);
        }
    }

    @Override
    public int Search(String ID) throws FileNotFoundException {
        for (int i = 0; i < nurses.size(); i++) {
            if (ID.equals(nurses.get(i).getID())) {
               
                this.ID = nurses.get(i).getID();
                this.FirstName = nurses.get(i).getFirstName();
                this.MiddleName = nurses.get(i).getMiddleName();
                this.LastName = nurses.get(i).getLastName();
                this.Email = nurses.get(i).getEmail();
                this.BirthDate = nurses.get(i).getBirthDate();
                this.City = nurses.get(i).getCity();
                this.Address = nurses.get(i).getAddress();
                this.PhoneNumber = nurses.get(i).getPhoneNumber();
                this.TelephoneNumber = nurses.get(i).getTelephoneNumber();
                this.Gender = nurses.get(i).getGender();
                this.Status = nurses.get(i).getStatus();
                JOptionPane.showMessageDialog(null, this.getID() + ", " + this.getFirstName() + ", "+ this.getMiddleName()
                    +", "+this.getLastName()+", "+ this.getEmail() +", "+ this.getBirthDate() +", " +this.getCity()
                    +  ", "+this.getAddress() +", " +this.getPhoneNumber()+", "+this.getTelephoneNumber()
                    +", "+this.getGender()+", "+this.getStatus());
               return i;
            }
        }
       
            JOptionPane.showMessageDialog(null, "Nurse Not Found !");
            return 0;

    }
    
}
