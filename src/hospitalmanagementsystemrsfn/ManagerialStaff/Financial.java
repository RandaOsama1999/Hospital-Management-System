/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystemrsfn.ManagerialStaff;

import static RSFN.MainRSFN.financials;
import static RSFN.MainRSFN.hrs;
import RSFN.Staff;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Randa
 */
public class Financial extends MangementStaff{
    public Financial()
    {
        super();
    }

    @Override
    public void Add() {
        financials.add(this);
    }

    @Override
    public void Remove(int index) {
        financials.remove(index); 
    }

    @Override
    public void Edit(int index) throws FileNotFoundException {
              /*financials.get(index).setID(this.ID);
                financials.get(index).setFirstName(this.FirstName);
                financials.get(index).setMiddleName(this.MiddleName);
                financials.get(index).setLastName(this.LastName);
                financials.get(index).setEmail(this.Email);
                financials.get(index).setBirthDate(this.BirthDate);
                financials.get(index).setCity(this.City);
                financials.get(index).setAddress(this.Address);
                financials.get(index).setPhoneNumber(this.PhoneNumber);
                financials.get(index).setTelephoneNumber(this.TelephoneNumber);
                financials.get(index).setGender(this.Gender);
                financials.get(index).setStatus(this.Status);*/
    }

    @Override
    public void Display() throws FileNotFoundException {
        for (Financial financial : financials) {
            System.out.println(financial);
        }
    }

    @Override
    public int Search(String ID) throws FileNotFoundException {
            for (int i = 0; i < financials.size(); i++) {
            if (ID.equals(financials.get(i).getID())) {
               
                this.ID = financials.get(i).getID();
                this.FirstName = financials.get(i).getFirstName();
                this.MiddleName = financials.get(i).getMiddleName();
                this.LastName = financials.get(i).getLastName();
                this.Email = financials.get(i).getEmail();
                this.BirthDate = financials.get(i).getBirthDate();
                this.City = financials.get(i).getCity();
                this.Address = financials.get(i).getAddress();
                this.PhoneNumber = financials.get(i).getPhoneNumber();
                this.TelephoneNumber = financials.get(i).getTelephoneNumber();
                this.Gender = financials.get(i).getGender();
                this.Status = financials.get(i).getStatus();
                JOptionPane.showMessageDialog(null, this.getID() + ", " + this.getFirstName() + ", "+ this.getMiddleName()
                    +", "+this.getLastName()+", "+ this.getEmail() +", "+ this.getBirthDate() +", " +this.getCity()
                    +  ", "+this.getAddress() +", " +this.getPhoneNumber()+", "+this.getTelephoneNumber()
                    +", "+this.getGender()+", "+this.getStatus());
               return i;
            }
        }
       
            JOptionPane.showMessageDialog(null, "Financial Not Found !");
            
        
        return 0;
    }

}
