/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

/**
 *
 * @author Randa
 */
public class Pharmacy extends UnitMedication {
   private String IDm;
   private String Name;
   private String ExpiryDate;
   private int MedicationPrice;

   Pharmacy()
   {
       
   }
    public String getIDm() {
        return IDm;
    }

    public void setIDm(String IDm) {
        this.IDm = IDm;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public int getMedicationPrice() {
        return MedicationPrice;
    }

    public void setMedicationPrice(int MedicationPrice) {
        this.MedicationPrice = MedicationPrice;
    }
    public void addMedication(){
        
    }
    
}
