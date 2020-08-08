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
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Server extends JFrame implements Runnable{
    private ServerSocket Mysocket;
    private Socket clientsocket;
    private JTextField OneMessage;
    public  JLabel allMessage;
    private ArrayList<Socket> Allconnections=new ArrayList<Socket>();
    
    JButton sendMsg=new JButton("Send");
    public Server() throws IOException
    {
        setSize(new Dimension (600,600));
        setTitle("Server V 1.0");
        Mysocket=new ServerSocket(6000);
        setLayout(null);
        allMessage=new JLabel("<html>All messages here");
        OneMessage=new JTextField("Write message here");
        allMessage.setBounds(20, 20, 300, 100);
        OneMessage.setBounds(allMessage.getBounds().x,allMessage.getBounds().y+allMessage.getHeight()+10,150,50);
        sendMsg.setBounds(OneMessage.getBounds().x,OneMessage.getBounds().y+OneMessage.getHeight()+10,150,50);
        add(allMessage);
        add(OneMessage);
        add(sendMsg);
        sendMsg.addActionListener(new act());
    
        
    }
    public void run() 
    {
        try
        {
        while (true)
        {
        clientsocket=Mysocket.accept();
        Allconnections.add(clientsocket);
        ConnectionThread ct=new ConnectionThread(clientsocket,allMessage);
        Thread t1=new Thread(ct);
        t1.start();
        Thread.sleep(1000);
            System.out.println("Waiting for another client");
        }
        }
        catch (InterruptedException e)
        {}
        catch (IOException e)
        {}
    }
    private class act implements  ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                
                if (e.getSource().equals(sendMsg))
                {
                start(OneMessage.getText());
                allMessage.setText(allMessage.getText()+"<br>"+OneMessage.getText());
                OneMessage.setText(null);
                }
                
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        
    }
    public void start(String msg) throws IOException
    {
        for (Socket s: Allconnections)
        {
        OutputStream os=s.getOutputStream();
        PrintWriter pw=new PrintWriter(os,true);
        pw.println(msg);
        }
        /*pw.close();
        os.close();
                */
                
    }
}
