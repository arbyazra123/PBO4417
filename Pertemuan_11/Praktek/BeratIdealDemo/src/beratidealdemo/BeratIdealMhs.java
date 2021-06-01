/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beratidealdemo;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ExecutionException;
import javax.swing.*;
/**
 *
 * @author arbyazra
 */
public class BeratIdealMhs implements ActionListener{
    
    // field
    private Frame mainFrame;
    private Label nim,nama,berat,tinggi,statusLabel; 
    private TextField setnim,setnama,setBerat,setTinggi;

    private Button btnHitung;
    
    //construct
    BeratIdealMhs(){
        prepareGUI();
    }
    
    public void prepareGUI(){
        mainFrame = new Frame("Hitung Berat Ideal");
        mainFrame.setSize(600,400);
        mainFrame.setLayout(null);
        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
    });
        nim = new Label("NIM");
        nim.setBounds(20,50,100,20);
        setnim = new TextField();
        setnim.setBounds(150,50,150,20);
        
        nama = new Label("NAMA");
        nama.setBounds(20,100,100,20);
        setnama = new TextField();
        setnama.setBounds(150,100,150,20);
        
        berat = new Label("BERAT");
        berat.setBounds(20,150,100,20);
        setBerat = new TextField();
        setBerat.setBounds(150,150,150,20);
        
        tinggi = new Label("TINGGI");
        tinggi.setBounds(20,200,100,20);
        setTinggi = new TextField();
        setTinggi.setBounds(150,200,150,20);

        
        btnHitung = new Button("Hitung");
        btnHitung.setBounds(90,250,70,30);
        btnHitung.addActionListener(this);
        
        statusLabel = new Label();
        statusLabel.setBounds(30,300,300,50);
        statusLabel.setAlignment(Label.CENTER);
        
        mainFrame.add(nim);
        mainFrame.add(setnim);
        mainFrame.add(nama);
        mainFrame.add(setnama);
        mainFrame.add(berat);
        mainFrame.add(setBerat);
        mainFrame.add(tinggi);
        mainFrame.add(setTinggi);
        mainFrame.add(btnHitung);

        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);   
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        try{
            String nim = setnim.getText();
            String name = setnama.getText();
            String Berat = setBerat.getText();
            String Tinggi = setTinggi.getText();
            float berat = Float.parseFloat(Berat);
            float tinggi = Float.parseFloat(Tinggi);
            float meter = tinggi/100;
            float result = 0;
            
            if(e.getSource()==btnHitung){
                result = (berat/(meter*meter));
                if(result <= 22.9){
                    statusLabel.setText(nim +" "+name+" Berat Anda Ideal ");
                }else{
                    statusLabel.setText(nim +" "+name+" Berat Anda Belum Ideal");
                }
                  
            }           
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    
    
    
    
}
