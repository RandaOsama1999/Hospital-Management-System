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
public class Bill{
    
    private double billCash;
    private String ID;
    private Pharmacy p;
    private OperationTools t;
    Bill()
    {
        
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public double calcBill(){
        return billCash;
    }
        public double getBillCash() {
        return billCash;
    }

    public void setBillCash(double billCash) {
        this.billCash = billCash;
    }

    public Pharmacy getP() {
        return p;
    }

    public void setP(Pharmacy p) {
        this.p = p;
    }

    public OperationTools getT() {
        return t;
    }

    public void setT(OperationTools t) {
        this.t = t;
    }
}
