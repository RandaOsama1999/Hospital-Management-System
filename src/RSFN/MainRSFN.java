package RSFN;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Gui.GuiLoginAs;
import Gui.GuiManagerFrame;
import Gui.GuiManagerLogin;
import Gui.GuiNursePortal;
import Gui.GuiOtherLogin;
import Gui.GuiRecepPortal;
import hospitalmanagementsystemrsfn.ManagerialStaff.Financial;
import hospitalmanagementsystemrsfn.ManagerialStaff.HR;
import hospitalmanagementsystemrsfn.ManagerialStaff.Receptionist;
import hospitalmanagementsystemrsfn.MedicalStaff.Doctor;
import hospitalmanagementsystemrsfn.MedicalStaff.Nurse;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Randa
 */
public class MainRSFN {

    public static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    public static ArrayList<Nurse> nurses = new ArrayList<>();
    public static ArrayList<Financial> financials = new ArrayList<>();
    public static ArrayList<HR> hrs = new ArrayList<>();
    public static ArrayList<Receptionist> receptionists = new ArrayList<>();
    public static ArrayList<Patient> patients=new ArrayList<>();
    
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:00");
    public static Date date=new Date();
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        
        
        
        //GuiRecepPortal Log=new GuiRecepPortal();
        //GuiOtherLogin Log=new GuiOtherLogin();
        //GuiManagerFrame Log=new GuiManagerFrame();
        //GuiNursePortal Log=new GuiNursePortal();
        //GuiManagerLogin Log=new GuiManagerLogin();
        //GuiOtherLogin Log=new GuiOtherLogin();
        
        DataLoad.readDoctors();
        DataLoad.readPatient();
        DataLoad.readFinancials();
        DataLoad.readHR();
        DataLoad.readReceps();
        DataLoad.readNurses();
        
        //System.out.println("Doctors==>" + doctors.size());
        
        GuiLoginAs Log=new GuiLoginAs();
        Log.setVisible(true);
        Log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        /*Server s=new Server();
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread t=new Thread(s);
        t.start();
        
        Client cl=new Client("Nurse");
        cl.setVisible(true);
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Client cl2=new Client("Doctor");
        cl2.setVisible(true);
        cl2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Socket soc=new Socket("10.0.15063",5000);
        InputStream is=soc.getInputStream();
        
        BufferedReader bf=new BufferedReader(new InputStreamReader(is));
        String ServerMessage=bf.readLine();
        System.out.println("Server says :" + ServerMessage);
        bf.close();
        soc.close();
        
        ServerSocket ss=new ServerSocket(5000);
        Socket ClientSocket=new Socket();
        ClientSocket=ss.accept();
        System.out.println("Client Connected " + ClientSocket.toString()); 
        OutputStream os=ClientSocket.getOutputStream();
        //InputStream is=ClientSocket.getInputStream();
        PrintWriter pw=new PrintWriter(os,true);
        pw.write("Hello from the server");
        pw.close();
        ClientSocket.close();
        ss.close();*/
    }
    
    
}
