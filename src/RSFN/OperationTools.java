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
public class OperationTools {
    
   private String ToolName;
   private String ToolID;
   private double ToolPrice;

    public void setToolPrice(double ToolPrice) {
        this.ToolPrice = ToolPrice;
    }

    public double getToolPrice() {
        return ToolPrice;
    }
   
   OperationTools()
   {
       
   }
    public String getToolName() {
        return ToolName;
    }

    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    public String getToolID() {
        return ToolID;
    }

    public void setToolID(String ToolID) {
        this.ToolID = ToolID;
    }
   
}
