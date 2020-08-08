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
public class Operations{
   private String OperationType;
   private String OperationID;
   private OperationTools t;

    public OperationTools getT() {
        return t;
    }

    public void setT(OperationTools t) {
        this.t = t;
    }
   Operations()
   {
       
   }
    public String getOperationType() {
        return OperationType;
    }

    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public String getOperationID() {
        return OperationID;
    }

    public void setOperationID(String OperationID) {
        this.OperationID = OperationID;
    }
}
