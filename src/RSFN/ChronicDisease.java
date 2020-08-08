/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Randa
 */
public class ChronicDisease {
    
    private int diseaseID;
    private String diseaseName;
    private String diseaseDiscription;
    private ArrayList<Patient> patients = new ArrayList();

    /**
     * @return the diseaseID
     */
    public int getDiseaseID() {
        return diseaseID;
    }

    /**
     * @param diseaseID the diseaseID to set
     */
    public void setDiseaseID(int diseaseID) {
        this.diseaseID = diseaseID;
    }

    /**
     * @return the diseaseName
     */
    public String getDiseaseName() {
        return diseaseName;
    }

    /**
     * @param diseaseName the diseaseName to set
     */
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    /**
     * @return the diseaseDiscription
     */
    public String getDiseaseDiscription() {
        return diseaseDiscription;
    }

    /**
     * @param diseaseDiscription the diseaseDiscription to set
     */
    public void setDiseaseDiscription(String diseaseDiscription) {
        this.diseaseDiscription = diseaseDiscription;
    }

    /**
     * @return the patients
     */
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    /**
     * @param patients the patients to set
     */
    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    
}
