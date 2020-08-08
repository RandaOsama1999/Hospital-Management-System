/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;

/**
 *
 * @author Randa
 */
public class Clinics {

   private String ClinicName;
   private String ClinicID;
   private String ClinicsTypes;
   private Doctor d;
   Clinics()
   {
       
   }
   
    public String getClinicName() {
        return ClinicName;
    }

    public void setClinicName(String ClinicName) {
        this.ClinicName = ClinicName;
    }

    public String getClinicID() {
        return ClinicID;
    }

    public void setClinicID(String ClinicID) {
        this.ClinicID = ClinicID;
    }

    public String getClinicsTypes() {
        return ClinicsTypes;
    }

    public void setClinicsTypes(String ClinicsTypes) {
        this.ClinicsTypes = ClinicsTypes;
    }
  
}
