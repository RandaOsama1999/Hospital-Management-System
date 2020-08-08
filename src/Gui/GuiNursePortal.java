/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import RSFN.Client;
import RSFN.DataLoad;
import RSFN.Server;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Randa
 */
public class GuiNursePortal extends JFrame{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    
    public GuiNursePortal(){
        setSize(10000,10000);
        JLabel string=new JLabel("Nurse Portal:");
        btn1=new JButton ("Add/Edit Patients Reports");
        btn2=new JButton ("Display Patient Reports");
        btn3=new JButton ("Display Dr's Appointments");
        btn4=new JButton ("Chatting");
        
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\rodyr\\Desktop\\Hospital pics\\dr4.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(GuiNursePortal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Container cont=getContentPane();
        cont.setLayout(null);
        
        string.setBounds(550, 90, 300, 60);
        btn1.setBounds(550, 150, 200, 40);
        btn2.setBounds(550, 200, 200, 40);
        btn3.setBounds(550, 250, 200, 40);
        btn4.setBounds(550, 300, 200, 40);
        string.setFont(new Font("",Font.BOLD,20));
        
        cont.add(string);
        cont.add(btn1);
        cont.add(btn2);
        cont.add(btn3);
        cont.add(btn4);
        
        btn1.addActionListener(new dosave());
        btn2.addActionListener(new dosave());
        btn3.addActionListener(new dosave());
        btn4.addActionListener(new dosave());
    }

    private class dosave implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource().equals(btn1)){
                try {
                    GuiAddPatientReport apr=new GuiAddPatientReport();
                    apr.setVisible(true);
                    apr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                } catch (ParseException ex) {
                    Logger.getLogger(GuiNursePortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (ae.getSource().equals(btn2)){
                GuiDisplayReports dr=new GuiDisplayReports();
                dr.setVisible(true);
                dr.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            else if (ae.getSource().equals(btn3)){
                GuiDisplayAppointment da=new GuiDisplayAppointment();
                da.setVisible(true);
                da.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
            else if (ae.getSource().equals(btn4)){
                /*try {
                    try (Socket soc = new Socket("10.0.15063",5000)) {
                        InputStream is=soc.getInputStream();
                        
                        try (BufferedReader bf = new BufferedReader(new InputStreamReader(is))) {
                            String ServerMessage=bf.readLine();
                            System.out.println("Server says :" + ServerMessage);
                        }
                    }
                    
                    try (ServerSocket ss = new ServerSocket(5000)) {
                        Socket ClientSocket=new Socket();
                        ClientSocket=ss.accept();
                        System.out.println("Client Connected " + ClientSocket.toString());
                        OutputStream os=ClientSocket.getOutputStream();
                        PrintWriter pw=new PrintWriter(os,true);
                        pw.write("Hello from the server");
                        pw.close();
                        ClientSocket.close();
                    }
                   
                    Server s=new Server();
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
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(GuiNursePortal.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            }
        }
    }
}
