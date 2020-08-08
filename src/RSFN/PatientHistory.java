/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
//import hospitalmanagementsystemrsfn.MedicalStaff.Nurse;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Randa
 */
public class PatientHistory implements Serializable{
    
    private int caseID;
    private Date caseDateOpen;
    private Date caseDateClosed;
    private String caseDescription;
    private Doctor responsibleDoctor;    

    /**
     * @return the caseID
     */
    public int getCaseID() {
        return caseID;
    }

    /**
     * @param caseID the caseID to set
     */
    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    /**
     * @return the caseDateOpen
     */
    public Date getCaseDateOpen() {
        return caseDateOpen;
    }

    /**
     * @param caseDateOpen the caseDateOpen to set
     */
    public void setCaseDateOpen(Date caseDateOpen) {
        this.caseDateOpen = caseDateOpen;
    }

    /**
     * @return the caseDateClosed
     */
    public Date getCaseDateClosed() {
        return caseDateClosed;
    }

    /**
     * @param caseDateClosed the caseDateClosed to set
     */
    public void setCaseDateClosed(Date caseDateClosed) {
        this.caseDateClosed = caseDateClosed;
    }

    /**
     * @return the caseDescription
     */
    public String getCaseDescription() {
        return caseDescription;
    }

    /**
     * @param caseDescription the caseDescription to set
     */
    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

    /**
     * @return the responsibleDoctor
     */
    public Doctor getResponsibleDoctor() {
        return responsibleDoctor;
    }

    /**
     * @param responsibleDoctor the responsibleDoctor to set
     */
    public void setResponsibleDoctor(Doctor responsibleDoctor) {
        this.responsibleDoctor = responsibleDoctor;
    }

    /**
     * @return the responsibleNurse
     
    public Nurse getResponsibleNurse() {
        return responsibleNurse;
    }

   
     * @param responsibleNurse the responsibleNurse to set
     
    public void setResponsibleNurse(Nurse responsibleNurse) {
        this.responsibleNurse = responsibleNurse;
    }
   */ 
    
    
}
