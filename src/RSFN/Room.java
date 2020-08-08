/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSFN;

//import static RSFN.MainRSFN.rooms;
import java.io.Serializable;

/**
 *
 * @author Randa
 */
public class Room implements Serializable {
    
    protected int roomID;
    protected String roomName;
    protected boolean isAvailable;
    protected int Price;
    //String[] hospitalDepartments = new String[] {"Surgery", "Neurology", "Psychology" ,"Ophthalmology"
    //                                                       ,"Dentistry","Otolaryngology", "Obstetrics","Cardiology"};
    
    
    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
     public void Add() {
        System.out.println("Patients===>");
        //rooms.add(this);
    }
     public void checkRoom()
     {
         
     }
    
}
