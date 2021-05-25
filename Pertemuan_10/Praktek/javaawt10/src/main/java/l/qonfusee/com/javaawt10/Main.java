/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.qonfusee.com.javaawt10;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JPanel;
import java.applet.Applet;

/**
 *
 * @author arbyazra
 */
public class Main {
    
    
    public static void main(String[] args){
        BeratIdealForm startedAutomatically = new BeratIdealForm();
    }
}

class BeratIdealForm implements ActionListener{
    Label jnim,jnama,jberat,jtinggi,jresult;
    TextField lnim,lnama,lberat,ltinggi;
    Button submit;
        
    BeratIdealForm(){
        Frame frm=new Frame("Kalkulator Berat Ideal");
        Panel p = new Panel();
        Panel p1 = new Panel();
        jnim = new Label("NIM");
        lnim = new TextField(20);
        jnama =new Label("NAMA");
         lnama=new TextField(20);
        jberat =new Label("BERAT");
         lberat=new TextField(20);
         jtinggi =new Label("TINGGI");
         ltinggi=new TextField(20);
         
        p.setLayout(new GridLayout(8,1));
        p.add(jnim);
        p.add(lnim);
        p.add(jnama);
        p.add(lnama);
        p.add(jberat);
        p.add(lberat);
        p.add(jtinggi);
        p.add(ltinggi);
        submit=new Button("Hitung");
        submit.addActionListener(this);
        jresult =new Label("Hasil akan tampil disini");
        p.add(submit);
        p.add(jresult);
        p1.add(p);
        
        
        frm.setSize(500,500);
        frm.setVisible(true);
        frm.add(p1,BorderLayout.NORTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String berat=lberat.getText();  
        String tinggi=ltinggi.getText();  
        
        double a=Double.parseDouble(berat);  
        double b=Double.parseDouble(tinggi);  
        double tallconverted=b/100;  
        double result= a/(tallconverted*tallconverted);
        System.out.println(a);
        System.out.println(b);
        System.out.println(tallconverted);
        System.out.println(tallconverted*tallconverted);
        System.out.println(result);
        
//        if(e.getSource()==submit){  
//            result = 
//        }
        
        if(result<18.5){
            jresult.setText("Berat badan anda tidak ideal (kurus)");
        } else if(result>=18.5&&result<=24.9){
            jresult.setText("Berat badan anda normal");
        } else if(result>=25&&result<=29.9){
            jresult.setText("Berat badan anda tidak ideal (overweight)");
        } else{
            jresult.setText("Berat badan anda tidak ideal (obesitas)");
        }
        
    }
}
