/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package realtry;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;



/**
 *
 * @author tgstajyer
 */
public class RealTry {

    
    
    public static void main(String[] args) throws FileNotFoundException {
       final AtomicReference<String> konum = new AtomicReference<String>("");
       
       JTextField ktx = new JTextField();
       ImageIcon ii = new ImageIcon("eca.png");
       
       JFrame main = new JFrame("Device Manager");
       JLabel ww = new JLabel("      Kimliğinizi doğrulayın");
       JPanel mpp = new JPanel();
       String PASSWORD = "admin123";
       JPasswordField pass =  new JPasswordField();
       JButton bu4 = new JButton("Ekle");
       JButton bu5 = new JButton("Giriş");
       GridLayout nb = new GridLayout();
       nb.setColumns(1);
       nb.setRows(4);
       main.setVisible(true);
       main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       main.setSize(300, 200);
       main.setLocationRelativeTo(null);
       main.setIconImage(ii.getImage());
       mpp.add(ww);
       mpp.add(pass);
       mpp.add(bu5);
       mpp.add(ktx);
       mpp.setLayout(nb);
       main.add(mpp);
       GridLayout gl = new GridLayout();
       gl.setColumns(2);
       gl.setRows(20);
       GridLayout glMain = new GridLayout();
       glMain.setColumns(1);
       glMain.setRows(8);
       GridLayout yazgl = new GridLayout();
       yazgl.setColumns(2);
       yazgl.setRows(11);
       GridLayout digLay = new GridLayout();
       digLay.setColumns(2);
       digLay.setRows(12);
       JFrame j = new JFrame("Device Manager");
       j.setIconImage(ii.getImage());
       JPanel blank1 = new JPanel();
       JPanel blank2 = new JPanel();
       JLabel blank = new JLabel("            ||||||||||            ");
       //konum = ktx.getText();
       JButton b = new JButton("add");
       JPanel listP = new JPanel();
       JPanel bilPan = new JPanel();
       JPanel yazPan = new JPanel();
       JPanel swiPan = new JPanel();
       JPanel kamPan = new JPanel();
       JPanel digPan = new JPanel();
       
       JButton yaz0 = new JButton("Yazıcı");
       JButton swi0 = new JButton("Switch");
       JButton kam0 = new JButton("Kamera");
       JButton dig0 = new JButton("Diğer donanım");
       JButton geri = new JButton("Geri");
       JLabel l = new JLabel("              Eklemek istediğiniz cihaz tipini seçiniz.");
       l.setSize(250, 30);
       listP.add(blank);
       listP.add(l);
       listP.add(blank);
       
       
       
       //Bilgisayar panelinde kullanılacak olan JLabel
       JLabel str1 = new JLabel("              *Birim:");
       JLabel str2 = new JLabel("              *MAC Adresi:");
       JLabel str3 = new JLabel("              *IP Adresi:");
       JLabel str4 = new JLabel("              *Bilgisayar adı:");
       JLabel str5 = new JLabel("              *IP Türü:");
       JLabel str6 = new JLabel("              *Personel adı soyadı:");
       JLabel str7 = new JLabel("              *Seri NO:");
       JLabel str8 = new JLabel("              Zorunlu yazılımlar:");
       JLabel str9 = new JLabel("              Kullanıcı Adı:");
       JLabel str10 = new JLabel("              Lokasyon:");
       JLabel str11 = new JLabel("              Marka:");
       JLabel str12 = new JLabel("              Model:");
       JLabel str13 = new JLabel("              Tip(Masaüstü veya Laptop):");
       JLabel str14 = new JLabel("              Ram:");
       JLabel str15 = new JLabel("              İşlemci:");
       JLabel str16 = new JLabel("              İşletim sistemi:");
       JLabel str17 = new JLabel("              Garanti Başlangıç:");
       JLabel str18 = new JLabel("              Garanti Bitiş:");

       //
       String[] OS = new String[]{" ","Windows 10","Windows 11", "MacOS"};
       String[] tip = new String[]{" ","Laptop","Masaüstü"};
       String[] IPTip = new String[]{" ","DHCP","Elle"};
       
       JTextField jtf1 = new JTextField();
       jtf1.setBounds(90,100,500,200);
       JTextField jtf2 = new JTextField();
       jtf2.setBounds(90,100,500,200);
       JTextField jtf3 = new JTextField();
       jtf3.setBounds(90,100,500,200);
       JTextField jtf4 = new JTextField();
       jtf4.setBounds(90,100,500,200);
       jtf4.setText("VFL-");
       JTextField jtf7 = new JTextField();
       jtf7.setBounds(90,100,500,200);
       JTextField jtf6 = new JTextField();
       jtf6.setBounds(90,100,500,200); 
       JComboBox jtf5 = new JComboBox(IPTip);
              
       JTextField jtf8 = new JTextField();                //JTextField for bilgisayar panel
       jtf8.setBounds(90,100,500,200);
       JTextField jtf9 = new JTextField();
       jtf9.setBounds(90,100,500,200);
       JTextField jtf10 = new JTextField();
       jtf10.setBounds(90,100,500,200);
       JTextField jtf11 = new JTextField();
       jtf11.setBounds(90,100,500,200);
       JTextField jtf12 = new JTextField();
       jtf12.setBounds(90,100,500,200);
       JComboBox jtf13 = new JComboBox(tip);
      
       JTextField jtf14 = new JTextField();
       jtf14.setBounds(90,100,500,200);
       JTextField jtf15 = new JTextField();
       jtf15.setBounds(90,100,500,200);
       JComboBox jtf16 = new JComboBox(OS);
       
       JCheckBox jccb1 = new JCheckBox("ABI HAYAT");
       JCheckBox jccb2 = new JCheckBox("NX");
       JCheckBox jccb3 = new JCheckBox("AUTOCAD");
       JCheckBox jccb4 = new JCheckBox("AnyDesk");
       JCheckBox jccb5 = new JCheckBox("WaterFox");
       JCheckBox jccb6 = new JCheckBox("FortiClient");
       
       String days[] = new String[]{"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
       String months[] = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
       Integer[] years = new Integer[100];
       int k = 2000; 
       for (int i = 0; i < 100; i++) {
            
            years[i]=k;
            k++;
        }
        JComboBox jcb1 = new JComboBox(days);
        JComboBox jcb2 = new JComboBox(months);
        JComboBox jcb3 = new JComboBox(years);
        JComboBox jcb4 = new JComboBox(days);
        JComboBox jcb5 = new JComboBox(months);
        JComboBox jcb6 = new JComboBox(years);
        JPanel pfc1 = new JPanel();
        pfc1.add(jcb1);
        pfc1.add(jcb2);
        pfc1.add(jcb3);
        JPanel pfc2 = new JPanel();
        pfc2.add(jcb4);
        pfc2.add(jcb5);
        pfc2.add(jcb6);
       
       JTextField jtfx1 = new JTextField();
       jtfx1.setBounds(90,100,500,200);
       JTextField jtfx2 = new JTextField();
       jtfx2.setBounds(90,100,500,200);
       JTextField jtfx3 = new JTextField();
       jtfx3.setBounds(90,100,500,200);
       JTextField jtfx4 = new JTextField();
       jtfx4.setBounds(90,100,500,200);
       JTextField jtfx5 = new JTextField();
       jtfx5.setBounds(90,100,500,200);
       JTextField jtfx6 = new JTextField();
       jtfx6.setBounds(90,100,500,200); 
       JTextField jtfx7 = new JTextField();
       jtfx7.setBounds(90,100,500,200);       
       JTextField jtfx8 = new JTextField();
       jtfx8.setBounds(90,100,500,200);
       JTextField jtfx9 = new JTextField();
       jtfx9.setBounds(90,100,500,200);
       
       JPanel chb = new JPanel();
       chb.add(jccb1);
       chb.add(jccb2);
       chb.add(jccb3);
       chb.add(jccb4);
       chb.add(jccb5);
       chb.add(jccb6);
       
       
       
       
       
       
       

       
       JButton bil0 = new JButton("Bilgisayar");
       bil0.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent be){
               j.setVisible(false);
               //j.dispose();
               JFrame bilF = new JFrame();
               bilF.setIconImage(ii.getImage());
               bilF.setSize(1300,600);
               bilF.setVisible(true);
               bilF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               bilF.setLocationRelativeTo(null);
               Container bilContant = bilF.getContentPane();
               bilContant.add(str1);
               bilContant.add(jtf1);
               bilContant.add(str2);
               bilContant.add(jtf2);
               bilContant.add(str3);
               bilContant.add(jtf3);
               bilContant.add(str4);
               bilContant.add(jtf4);
               bilContant.add(str5);
               bilContant.add(jtf5);
               bilContant.add(str6);
               bilContant.add(jtf6);
               bilContant.add(str7);
               bilContant.add(jtf7);
               bilContant.add(str8);
               bilContant.add(jtf8);
               bilContant.add(str9);
               bilContant.add(jtf9);
               bilContant.add(str10);
               bilContant.add(jtf10);
               bilContant.add(str11);
               bilContant.add(jtf11);
               bilContant.add(str12);
               bilContant.add(jtf12);
               bilContant.add(str13);
               bilContant.add(jtf13);
               bilContant.add(str14);
               bilContant.add(jtf14);
               bilContant.add(str15);
               bilContant.add(jtf15);
               bilContant.add(str16);
               bilContant.add(jtf16);
               bilContant.add(str17);
               bilContant.add(pfc1);
               bilContant.add(str18);
               bilContant.add(pfc2);
               bilContant.add(blank1);
               bilContant.add(blank2);
               
               JButton insideBack = new JButton("İptal Et");
               insideBack.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       bilF.dispose();
                       j.setVisible(true);
                       /*JFrame jback = new JFrame("Device Manager");
                       jback.setIconImage(ii.getImage());
                       jback.add(listP);
                       jback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       jback.setSize(720,480);
                       jback.setVisible(true);
                       jback.setLayout(null);
                       jback.setLocationRelativeTo(null);*/
                       
                   }
               });
               
               JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(jtf4.getText().substring(0, 4).equals("VFL-") && jtf4.getText().length() == 7 && 0<=Integer.parseInt(jtf4.getText().substring(4))&& Integer.parseInt(jtf4.getText().substring(4))<1000 && (jtf2.getText().length()==17) && (jtf2.getText().charAt(2)==(':')) && (jtf2.getText().charAt(5)==(':'))&&(jtf2.getText().charAt(8)==(':'))&&(jtf2.getText().charAt(11)==(':'))&&(jtf2.getText().charAt(14)==(':'))){
                           File myObj = new File(konum+"\\Bilgisayar\\"+jtf4.getText()+".txt");
                           if(!myObj.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(myObj);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(jtf1.getText());
                           buffer.newLine();
                           buffer.write(jtf2.getText());
                           buffer.newLine();
                           buffer.write(jtf3.getText());
                           buffer.newLine();
                           buffer.write(jtf4.getText());
                           buffer.newLine();
                           buffer.write(jtf5.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jtf6.getText());
                           buffer.newLine();
                           buffer.write(jtf7.getText());
                           buffer.newLine();
                           buffer.write(jtf8.getText());
                           buffer.newLine();
                           buffer.write(jtf9.getText());
                           buffer.newLine();
                           buffer.write(jtf10.getText());
                           buffer.newLine();
                           buffer.write(jtf11.getText());
                           buffer.newLine();
                           buffer.write(jtf12.getText());
                           buffer.newLine();
                           buffer.write(jtf13.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jtf14.getText());
                           buffer.newLine();
                           buffer.write(jtf15.getText());
                           buffer.newLine();
                           buffer.write(jtf16.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb1.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb2.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb3.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb4.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb5.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb6.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           jtf1.setText("");
                           jtf2.setText("");
                           jtf3.setText("");
                           jtf4.setText("VFL-");
                           jtf5.setSelectedIndex(0);
                           jtf6.setText("");
                           jtf7.setText("");
                           jtf8.setText("");
                           jtf9.setText("");
                           jtf10.setText("");
                           jtf11.setText("");
                           jtf12.setText("");
                           jtf13.setSelectedIndex(0);
                           jtf14.setText("");
                           jtf15.setText("");
                           jtf16.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           bilF.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully added.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  j.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               bilF.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("That file already exists. Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(myObj);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(jtf1.getText());
                                            buffer.newLine();
                                            buffer.write(jtf2.getText());
                                            buffer.newLine();
                                            buffer.write(jtf3.getText());
                                            buffer.newLine();
                                            buffer.write(jtf4.getText());
                                            buffer.newLine();
                                            buffer.write(jtf5.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jtf6.getText());
                                            buffer.newLine();
                                            buffer.write(jtf7.getText());
                                            buffer.newLine();
                                            buffer.write(jtf8.getText());
                                            buffer.newLine();
                                            buffer.write(jtf9.getText());
                                            buffer.newLine();
                                            buffer.write(jtf10.getText());
                                            buffer.newLine();
                                            buffer.write(jtf11.getText());
                                            buffer.newLine();
                                            buffer.write(jtf12.getText());
                                            buffer.newLine();
                                            buffer.write(jtf13.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jtf14.getText());
                                            buffer.newLine();
                                            buffer.write(jtf15.getText());
                                            buffer.newLine();
                                            buffer.write(jtf16.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb1.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb2.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb3.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb4.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb5.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb6.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            jtf1.setText("");
                                            jtf2.setText("");
                                            jtf3.setText("");
                                            jtf4.setText("VFL-");
                                            jtf5.setSelectedIndex(0);
                                            jtf6.setText("");
                                            jtf7.setText("");
                                            jtf8.setText("");
                                            jtf9.setText("");
                                            jtf10.setText("");
                                            jtf11.setText("");
                                            jtf12.setText("");
                                            jtf13.setSelectedIndex(0);
                                            jtf14.setText("");
                                            jtf15.setText("");
                                            jtf16.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            bilF.dispose();
                                            sure.dispose();
                                            j.setVisible(true);
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       sure.dispose();
                                       bilF.dispose();
                                       j.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              bilF.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't added.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   jtf1.setText("");
                                   jtf2.setText("");
                                   jtf3.setText("");
                                   jtf4.setText("VFL-");
                                   jtf5.setSelectedIndex(0);
                                   jtf6.setText("");
                                   jtf7.setText("");
                                   jtf8.setText("");
                                   jtf9.setText("");
                                   jtf10.setText("");
                                   jtf11.setText("");
                                   jtf12.setText("");
                                   jtf13.setSelectedIndex(0);
                                   jtf14.setText("");
                                   jtf15.setText("");
                                   jtf16.setSelectedIndex(0);
                                   j.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               bilF.add(insideBack);
               bilF.add(kaydet);
               bilF.setLayout(gl);
           }
       });
       
       yaz0.addActionListener(new ActionListener(){
           JLabel yzs1 = new JLabel("                  *Birim:");
           JLabel yzs2 = new JLabel("                  *MAC Adresi:");
           JLabel yzs3 = new JLabel("                  *IP Adresi:");
           JLabel yzs4 = new JLabel("                  *Yazıcı adı:");
           JLabel yzs5 = new JLabel("                  *Seri NO:");
           JLabel yzs6 = new JLabel("                  Lokasyon:");
           JLabel yzs7 = new JLabel("                  Marka:");
           JLabel yzs8 = new JLabel("                  Model:");
           JLabel yzs9 = new JLabel("                  Garanti Başlangıç:");
           JLabel yzs10 = new JLabel("                  Garanti Bitiş:");
           
           JTextField yztf1 = new JTextField();
           JTextField yztf2 = new JTextField();
           JTextField yztf3 = new JTextField();
           JTextField yztf4 = new JTextField("VFL-");
           JTextField yztf5 = new JTextField();
           JTextField yztf6 = new JTextField();
           JTextField yztf7 = new JTextField();
           JTextField yztf8 = new JTextField();
           
           JPanel pfc11 = new JPanel();
           JPanel pfc22 = new JPanel();
           JComboBox jcb11 = new JComboBox(days);
           JComboBox jcb22 = new JComboBox(months);
           JComboBox jcb33 = new JComboBox(years);
           JComboBox jcb44 = new JComboBox(days);
           JComboBox jcb55 = new JComboBox(months);
           JComboBox jcb66 = new JComboBox(years);
               
           
           
           @Override
           public void actionPerformed(ActionEvent ae){
               pfc11.add(jcb11);
               pfc11.add(jcb22);
               pfc11.add(jcb33);
               pfc22.add(jcb44);
               pfc22.add(jcb55);
               pfc22.add(jcb66);
               
               j.setVisible(false);
               JFrame yazF = new JFrame("Yazıcı ekleme ekranı");
               yazF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               yazF.setVisible(true);
               yazF.setSize(720,400);
               yazF.setIconImage(ii.getImage());
               yazF.setLocationRelativeTo(null);
               Container yazContant = yazF.getContentPane();
               yazContant.add(yzs1);
               yazContant.add(yztf1);
               yazContant.add(yzs2);
               yazContant.add(yztf2);
               yazContant.add(yzs3);
               yazContant.add(yztf3);
               yazContant.add(yzs4);
               yazContant.add(yztf4);
               yazContant.add(yzs5);
               yazContant.add(yztf5);
               yazContant.add(yzs6);
               yazContant.add(yztf6);
               yazContant.add(yzs7);
               yazContant.add(yztf7);
               yazContant.add(yzs8);
               yazContant.add(yztf8);
               yazContant.add(yzs9);
               yazContant.add(pfc11);
               yazContant.add(yzs10);
               yazContant.add(pfc22);
               
               
               JButton insideBack = new JButton("İptal Et");
               insideBack.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yazF.dispose();
                       j.setVisible(true);
                       /*JFrame jback = new JFrame("Device Manager");
                       jback.setIconImage(ii.getImage());
                       jback.add(listP);
                       jback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       jback.setSize(720,480);
                       jback.setVisible(true);
                       jback.setLayout(null);
                       jback.setLocationRelativeTo(null);*/
                       
                   }
               });
               
               JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length() > 3 && yztf1.getText().length() > 2 && yztf2.getText().length() > 5 && yztf3.getText().length() > 5){
                           File myObj = new File(konum+"\\Printer\\"+yztf4.getText()+".txt");
                           if(!myObj.exists()){
                               
                           FileWriter fw = new FileWriter(myObj);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           
                           buffer.close();
                           System.out.println("Succesfully added.");
                           yazF.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully added.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  j.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               yazF.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("That file already exists. Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(myObj);
                                       BufferedWriter buffer = new BufferedWriter(fw);
                                       buffer.write(yztf1.getText());
                                       buffer.newLine();
                                       buffer.write(yztf2.getText());
                                       buffer.newLine();
                                       buffer.write(yztf3.getText());
                                       buffer.newLine();
                                       buffer.write(yztf4.getText());
                                       buffer.newLine();
                                       buffer.write(yztf5.getText());
                                       buffer.newLine();
                                       buffer.write(yztf6.getText());
                                       buffer.newLine();
                                       buffer.write(yztf7.getText());
                                       buffer.newLine();
                                       buffer.write(yztf8.getText());
                                       buffer.newLine();
                                       buffer.write(jcb11.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb22.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb33.getSelectedItem().toString());
                                       buffer.newLine();
                                       buffer.write(jcb44.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb55.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            System.out.println("Succesfully added.");
                                            yazF.dispose();
                                            sure.dispose();
                                            j.setVisible(true);
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       sure.dispose();
                                       yazF.dispose();
                                       j.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              yazF.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't added.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   j.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                    }
               
               });
               yazF.add(insideBack);
               yazF.add(kaydet);
               yazF.setLayout(yazgl);
           }
       });
       
       
       kam0.addActionListener(new ActionListener(){
           JLabel yzs1 = new JLabel("                  *Birim:");
           JLabel yzs2 = new JLabel("                  *MAC Adresi:");
           JLabel yzs3 = new JLabel("                  *IP Adresi:");
           JLabel yzs4 = new JLabel("                  *Kamera adı:");
           JLabel yzs5 = new JLabel("                  *Seri NO:");
           JLabel yzs6 = new JLabel("                  Lokasyon:");
           JLabel yzs7 = new JLabel("                  Marka:");
           JLabel yzs8 = new JLabel("                  Model:");
           JLabel yzs9 = new JLabel("                  Garanti Başlangıç:");
           JLabel yzs10 = new JLabel("                  Garanti Bitiş:");
           
           JTextField yztf1 = new JTextField();
           JTextField yztf2 = new JTextField();
           JTextField yztf3 = new JTextField();
           JTextField yztf4 = new JTextField("VFL-");
           JTextField yztf5 = new JTextField();
           JTextField yztf6 = new JTextField();
           JTextField yztf7 = new JTextField();
           JTextField yztf8 = new JTextField();
           
           JPanel pfc11 = new JPanel();
           JPanel pfc22 = new JPanel();
           JComboBox jcb11 = new JComboBox(days);
           JComboBox jcb22 = new JComboBox(months);
           JComboBox jcb33 = new JComboBox(years);
           JComboBox jcb44 = new JComboBox(days);
           JComboBox jcb55 = new JComboBox(months);
           JComboBox jcb66 = new JComboBox(years);
               
           
           
           @Override
           public void actionPerformed(ActionEvent ae){
               pfc11.add(jcb11);
               pfc11.add(jcb22);
               pfc11.add(jcb33);
               pfc22.add(jcb44);
               pfc22.add(jcb55);
               pfc22.add(jcb66);
               
               j.setVisible(false);
               JFrame yazF = new JFrame("Yazıcı ekleme ekranı");
               yazF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               yazF.setVisible(true);
               yazF.setSize(720,400);
               yazF.setIconImage(ii.getImage());
               yazF.setLocationRelativeTo(null);
               Container yazContant = yazF.getContentPane();
               yazContant.add(yzs1);
               yazContant.add(yztf1);
               yazContant.add(yzs2);
               yazContant.add(yztf2);
               yazContant.add(yzs3);
               yazContant.add(yztf3);
               yazContant.add(yzs4);
               yazContant.add(yztf4);
               yazContant.add(yzs5);
               yazContant.add(yztf5);
               yazContant.add(yzs6);
               yazContant.add(yztf6);
               yazContant.add(yzs7);
               yazContant.add(yztf7);
               yazContant.add(yzs8);
               yazContant.add(yztf8);
               yazContant.add(yzs9);
               yazContant.add(pfc11);
               yazContant.add(yzs10);
               yazContant.add(pfc22);
               
               
               JButton insideBack = new JButton("İptal Et");
               insideBack.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yazF.dispose();
                       j.setVisible(true);
                       /*JFrame jback = new JFrame("Device Manager");
                       jback.setIconImage(ii.getImage());
                       jback.add(listP);
                       jback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       jback.setSize(720,480);
                       jback.setVisible(true);
                       jback.setLayout(null);
                       jback.setLocationRelativeTo(null);*/
                       
                   }
               });
               
               JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length() > 3 && yztf1.getText().length() > 2 && yztf2.getText().length() > 5 && yztf3.getText().length() > 5){
                           File myObj = new File(konum+"\\Kamera\\"+yztf4.getText()+".txt");
                           if(!myObj.exists()){
                               
                           FileWriter fw = new FileWriter(myObj);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           
                           buffer.close();
                           System.out.println("Succesfully added.");
                           yazF.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully added.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  j.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               yazF.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("That file already exists. Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(myObj);
                                       BufferedWriter buffer = new BufferedWriter(fw);
                                       buffer.write(yztf1.getText());
                                       buffer.newLine();
                                       buffer.write(yztf2.getText());
                                       buffer.newLine();
                                       buffer.write(yztf3.getText());
                                       buffer.newLine();
                                       buffer.write(yztf4.getText());
                                       buffer.newLine();
                                       buffer.write(yztf5.getText());
                                       buffer.newLine();
                                       buffer.write(yztf6.getText());
                                       buffer.newLine();
                                       buffer.write(yztf7.getText());
                                       buffer.newLine();
                                       buffer.write(yztf8.getText());
                                       buffer.newLine();
                                       buffer.write(jcb11.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb22.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb33.getSelectedItem().toString());
                                       buffer.newLine();
                                       buffer.write(jcb44.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb55.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            System.out.println("Succesfully added.");
                                            yazF.dispose();
                                            sure.dispose();
                                            j.setVisible(true);
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       sure.dispose();
                                       yazF.dispose();
                                       j.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              yazF.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't added.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   j.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                    }
               
               });
               yazF.add(insideBack);
               yazF.add(kaydet);
               yazF.setLayout(yazgl);
           }
       });
       
       
       swi0.addActionListener(new ActionListener(){
           JLabel yzs1 = new JLabel("                  *Birim:");
           JLabel yzs2 = new JLabel("                  *MAC Adresi:");
           JLabel yzs3 = new JLabel("                  *IP Adresi:");
           JLabel yzs4 = new JLabel("                  *Switch adı:");
           JLabel yzs5 = new JLabel("                  *Seri NO:");
           JLabel yzs6 = new JLabel("                  Lokasyon:");
           JLabel yzs7 = new JLabel("                  Marka:");
           JLabel yzs8 = new JLabel("                  Model:");
           JLabel yzs9 = new JLabel("                  Garanti Başlangıç:");
           JLabel yzs10 = new JLabel("                  Garanti Bitiş:");
           
           JTextField yztf1 = new JTextField();
           JTextField yztf2 = new JTextField();
           JTextField yztf3 = new JTextField();
           JTextField yztf4 = new JTextField("");
           JTextField yztf5 = new JTextField();
           JTextField yztf6 = new JTextField();
           JTextField yztf7 = new JTextField();
           JTextField yztf8 = new JTextField();
           
           JPanel pfc11 = new JPanel();
           JPanel pfc22 = new JPanel();
           JComboBox jcb11 = new JComboBox(days);
           JComboBox jcb22 = new JComboBox(months);
           JComboBox jcb33 = new JComboBox(years);
           JComboBox jcb44 = new JComboBox(days);
           JComboBox jcb55 = new JComboBox(months);
           JComboBox jcb66 = new JComboBox(years);
               
           
           
           @Override
           public void actionPerformed(ActionEvent ae){
               pfc11.add(jcb11);
               pfc11.add(jcb22);
               pfc11.add(jcb33);
               pfc22.add(jcb44);
               pfc22.add(jcb55);
               pfc22.add(jcb66);
               
               j.setVisible(false);
               JFrame yazF = new JFrame("Yazıcı ekleme ekranı");
               yazF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               yazF.setVisible(true);
               yazF.setSize(720,400);
               yazF.setIconImage(ii.getImage());
               yazF.setLocationRelativeTo(null);
               Container yazContant = yazF.getContentPane();
               yazContant.add(yzs1);
               yazContant.add(yztf1);
               yazContant.add(yzs2);
               yazContant.add(yztf2);
               yazContant.add(yzs3);
               yazContant.add(yztf3);
               yazContant.add(yzs4);
               yazContant.add(yztf4);
               yazContant.add(yzs5);
               yazContant.add(yztf5);
               yazContant.add(yzs6);
               yazContant.add(yztf6);
               yazContant.add(yzs7);
               yazContant.add(yztf7);
               yazContant.add(yzs8);
               yazContant.add(yztf8);
               yazContant.add(yzs9);
               yazContant.add(pfc11);
               yazContant.add(yzs10);
               yazContant.add(pfc22);
               
               
               JButton insideBack = new JButton("İptal Et");
               insideBack.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yazF.dispose();
                       j.setVisible(true);
                       /*JFrame jback = new JFrame("Device Manager");
                       jback.setIconImage(ii.getImage());
                       jback.add(listP);
                       jback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       jback.setSize(720,480);
                       jback.setVisible(true);
                       jback.setLayout(null);
                       jback.setLocationRelativeTo(null);*/
                       
                   }
               });
               
               JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length() > 3 && yztf1.getText().length() > 2 && yztf2.getText().length() > 5 && yztf3.getText().length() > 5){
                           File myObj = new File(konum+"\\Switch\\"+yztf4.getText()+".txt");
                           if(!myObj.exists()){
                               
                           FileWriter fw = new FileWriter(myObj);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           
                           buffer.close();
                           System.out.println("Succesfully added.");
                           yazF.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully added.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  j.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               yazF.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("That file already exists. Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(myObj);
                                       BufferedWriter buffer = new BufferedWriter(fw);
                                       buffer.write(yztf1.getText());
                                       buffer.newLine();
                                       buffer.write(yztf2.getText());
                                       buffer.newLine();
                                       buffer.write(yztf3.getText());
                                       buffer.newLine();
                                       buffer.write(yztf4.getText());
                                       buffer.newLine();
                                       buffer.write(yztf5.getText());
                                       buffer.newLine();
                                       buffer.write(yztf6.getText());
                                       buffer.newLine();
                                       buffer.write(yztf7.getText());
                                       buffer.newLine();
                                       buffer.write(yztf8.getText());
                                       buffer.newLine();
                                       buffer.write(jcb11.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb22.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb33.getSelectedItem().toString());
                                       buffer.newLine();
                                       buffer.write(jcb44.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb55.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            System.out.println("Succesfully added.");
                                            yazF.dispose();
                                            sure.dispose();
                                            j.setVisible(true);
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       sure.dispose();
                                       yazF.dispose();
                                       j.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              yazF.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't added.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   j.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                    }
               
               });
               yazF.add(insideBack);
               yazF.add(kaydet);
               yazF.setLayout(yazgl);
           }
       });
       
       
       dig0.addActionListener(new ActionListener(){
           JLabel yzs1 = new JLabel("                  *Birim:");
           JLabel yzs2 = new JLabel("                  *MAC Adresi:");
           JLabel yzs3 = new JLabel("                  *IP Adresi:");
           JLabel yzs4 = new JLabel("                  *Diğer donanım adı:");
           JLabel yzs5 = new JLabel("                  *Seri NO:");
           JLabel yzs6 = new JLabel("                  Lokasyon:");
           JLabel yzs7 = new JLabel("                  Marka:");
           JLabel yzs8 = new JLabel("                  Model:");
           JLabel yzs9 = new JLabel("                  Garanti Başlangıç:");
           JLabel yzs10 = new JLabel("                  Garanti Bitiş:");
           JLabel yzs11 = new JLabel("                  Diğer donanım tanım");
           
           JTextField yztf1 = new JTextField();
           JTextField yztf2 = new JTextField();
           JTextField yztf3 = new JTextField();
           JTextField yztf4 = new JTextField("VFL-");
           JTextField yztf5 = new JTextField();
           JTextField yztf6 = new JTextField();
           JTextField yztf7 = new JTextField();
           JTextField yztf8 = new JTextField();
           JTextField yztf9 = new JTextField();
           
           JPanel pfc11 = new JPanel();
           JPanel pfc22 = new JPanel();
           JComboBox jcb11 = new JComboBox(days);
           JComboBox jcb22 = new JComboBox(months);
           JComboBox jcb33 = new JComboBox(years);
           JComboBox jcb44 = new JComboBox(days);
           JComboBox jcb55 = new JComboBox(months);
           JComboBox jcb66 = new JComboBox(years);
               
           
           
           @Override
           public void actionPerformed(ActionEvent ae){
               pfc11.add(jcb11);
               pfc11.add(jcb22);
               pfc11.add(jcb33);
               pfc22.add(jcb44);
               pfc22.add(jcb55);
               pfc22.add(jcb66);
               
               j.setVisible(false);
               JFrame yazF = new JFrame("Yazıcı ekleme ekranı");
               yazF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               yazF.setVisible(true);
               yazF.setSize(720,400);
               yazF.setIconImage(ii.getImage());
               yazF.setLocationRelativeTo(null);
               Container yazContant = yazF.getContentPane();
               yazContant.add(yzs1);
               yazContant.add(yztf1);
               yazContant.add(yzs2);
               yazContant.add(yztf2);
               yazContant.add(yzs3);
               yazContant.add(yztf3);
               yazContant.add(yzs4);
               yazContant.add(yztf4);
               yazContant.add(yzs5);
               yazContant.add(yztf5);
               yazContant.add(yzs6);
               yazContant.add(yztf6);
               yazContant.add(yzs7);
               yazContant.add(yztf7);
               yazContant.add(yzs8);
               yazContant.add(yztf8);
               yazContant.add(yzs9);
               yazContant.add(pfc11);
               yazContant.add(yzs10);
               yazContant.add(pfc22);
               yazContant.add(yzs11);
               yazContant.add(yztf9);
               
               
               JButton insideBack = new JButton("İptal Et");
               insideBack.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yazF.dispose();
                       j.setVisible(true);
                       /*JFrame jback = new JFrame("Device Manager");
                       jback.setIconImage(ii.getImage());
                       jback.add(listP);
                       jback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       jback.setSize(720,480);
                       jback.setVisible(true);
                       jback.setLayout(null);
                       jback.setLocationRelativeTo(null);*/
                       
                   }
               });
               
               JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length() > 3 && yztf1.getText().length() > 2 && yztf2.getText().length() > 5 && yztf3.getText().length() > 5){
                           File myObj = new File(konum+"\\Other\\"+yztf4.getText()+".txt");
                           if(!myObj.exists()){
                               
                           FileWriter fw = new FileWriter(myObj);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(yztf9.getText());
                           
                           
                           buffer.close();
                           System.out.println("Succesfully added.");
                           yazF.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully added.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  j.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               yazF.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("That file already exists. Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(myObj);
                                       BufferedWriter buffer = new BufferedWriter(fw);
                                       buffer.write(yztf1.getText());
                                       buffer.newLine();
                                       buffer.write(yztf2.getText());
                                       buffer.newLine();
                                       buffer.write(yztf3.getText());
                                       buffer.newLine();
                                       buffer.write(yztf4.getText());
                                       buffer.newLine();
                                       buffer.write(yztf5.getText());
                                       buffer.newLine();
                                       buffer.write(yztf6.getText());
                                       buffer.newLine();
                                       buffer.write(yztf7.getText());
                                       buffer.newLine();
                                       buffer.write(yztf8.getText());
                                       buffer.newLine();
                                       buffer.write(jcb11.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb22.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb33.getSelectedItem().toString());
                                       buffer.newLine();
                                       buffer.write(jcb44.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb55.getSelectedItem().toString());
                                       buffer.write(".");
                                       buffer.write(jcb66.getSelectedItem().toString());
                                       buffer.newLine();
                                       buffer.write(yztf9.getText());
                                            
                           
                                            buffer.close();
                                            System.out.println("Succesfully added.");
                                            yazF.dispose();
                                            sure.dispose();
                                            j.setVisible(true);
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       sure.dispose();
                                       yazF.dispose();
                                       j.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              yazF.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't added.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   j.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                    }
               
               });
               yazF.add(insideBack);
               yazF.add(kaydet);
               yazF.setLayout(digLay);
           }
       });
       
       
       
           
       
       
       listP.add(blank);
       listP.add(bil0);
       listP.add(blank);
       listP.add(blank);
       listP.add(yaz0);
       listP.add(blank);
       listP.add(blank);
       listP.add(swi0);
       listP.add(blank);
       listP.add(blank);
       listP.add(kam0);
       listP.add(blank);
       listP.add(blank);
       listP.add(dig0);
       listP.add(blank);
       listP.add(blank);
       listP.add(geri);
       listP.add(blank);
       listP.setLayout(glMain);
       j.add(listP);
       
       
       
       
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       j.setSize(400,480);
       j.setVisible(false);
       j.setLocationRelativeTo(null);
       
       GridLayout gl2 = new GridLayout();
       gl2.setColumns(6);
       gl2.setRows(1);
       GridLayout atib = new GridLayout();
       atib.setColumns(2);
       atib.setRows(1);
       
       JFrame arama = new JFrame("Arama ekranı");
       arama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       arama.setLocationRelativeTo(null);
       arama.setSize(1300,720);
       arama.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
       
       
       JLabel neye = new JLabel("         Neye göre arama yapmak istersiniz?             ");
       JRadioButton mac = new JRadioButton("MAC");
       JRadioButton ipe = new JRadioButton("IP");
       JRadioButton kulisim = new JRadioButton("Kullanıcı ismi");
       JRadioButton cihazisim = new JRadioButton("Cihaz ismi");
       JRadioButton serino = new JRadioButton("Seri NO");
       JRadioButton tum = new JRadioButton("Tümü");
       ButtonGroup group = new ButtonGroup();
       group.add(tum);
       group.add(mac);
       group.add(ipe);
       group.add(kulisim);
       group.add(cihazisim);
       group.add(serino);
       mac.setSelected(true);
       
       JPanel panara = new JPanel();
       JPanel jpnl = new JPanel();
       panara.add(neye);
       panara.add(mac);
       panara.add(ipe);
       panara.add(kulisim);
       panara.add(cihazisim);
       panara.add(serino);
       //panara.setLayout();
       //arama.add(jpnl);
       //arama.add(panara);
       
       JTabbedPane tp = new JTabbedPane();
       JScrollPane tumtum = new JScrollPane();
       JPanel arama1 = new JPanel();
       JPanel arama2 = new JPanel();
       JPanel arama3 = new JPanel();
       JPanel arama4 = new JPanel();
       JPanel arama5 = new JPanel();
       
       
        
       JPanel belki = new JPanel();
       belki.setBounds(0, 0, 300, 1000);
       
       //table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       
       ArrayList<String>  al = new ArrayList();
       DefaultListModel<String> model = new DefaultListModel<>();
       DefaultListModel<String> model2 = new DefaultListModel<>();
       DefaultListModel<String> model3 = new DefaultListModel<>();
       DefaultListModel<String> model4 = new DefaultListModel<>();
       
       
       JTextField aranacak1 = new JTextField();
       JLabel gir1 = new JLabel(" MAC Değer giriniz.");
       JTextField aranacak2 = new JTextField();
       JLabel gir2 = new JLabel("IP Değer giriniz.");
       JTextField aranacak3 = new JTextField();
       JLabel gir3 = new JLabel("Kullanıcı ismi Değer giriniz.");
       JTextField aranacak4 = new JTextField();
       JLabel gir4 = new JLabel("Cihaz ismi Değer giriniz.");
       JTextField aranacak5 = new JTextField();
       JLabel gir5 = new JLabel("Seri NO Değer giriniz.");
       
       JButton ara1  = new JButton("Ara");
       JButton ara2  = new JButton("Ara");
       JButton ara3  = new JButton("Ara");
       JButton ara4  = new JButton("Ara");
       JButton ara5  = new JButton("Ara");
       
       
       /*File files1 = new File(konum+"\\Bilgisayar");
       File files2 = new File(konum+"\\Switch");
       File files3 = new File(konum+"\\Printer");
       File files4 = new File(konum+"\\Kamera");
       File files5 = new File(konum+"\\Other");*/
       
       
       
       
        
        ArrayList<Integer> ar1 = new ArrayList();
        
        /*FileReader fww = new FileReader(konum+"\\Bilgisayar");*/
        
       
       
        
       
       ara1.addActionListener(new ActionListener(){
           @Override
           
           public void actionPerformed(ActionEvent ll){
               int sayi =0;
               if(aranacak1.getText().length()==17 && aranacak1.getText().charAt(2)==':' && aranacak1.getText().charAt(5)==':' && aranacak1.getText().charAt(8)==':' && aranacak1.getText().charAt(11)==':' && aranacak1.getText().charAt(14)==':'){
                   JFrame hell = new JFrame();
                   arama.setVisible(false);
                   hell.setSize(480,720);
                   hell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            sayi++;
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line1 + "   " + line2 + "   " + line3 + "   " + line4 + "   " + line5 + "   " + line6 + "   " + line7 + "   " + line8 + "   " + line9 + "   " + line10 + "   " + line11 + "   " + line12 + "   " + line13 + "   " + line14 + "   " + line15 + "   " + line16 + "   " + line17 + "   " + line18;
                            JLabel fg = new JLabel(lineline);
                            //list.add(fg);
                              
                            if(aranacak1.getText().equals(line2)){
                                //JFrame eh = new JFrame("Yordu");
                                
                                //eh.setSize(1300,720);
                                JLabel oldu = new JLabel("OLDU!");
                                oldu.setBounds(20, 40, 50, 300);
                                //eh.add(oldu);
                                //eh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                //eh.setVisible(true);
                                hell.add(oldu);
                                System.out.println(line2);
                                
                                
                            }
                            
                            }catch(IOException ftt){
                                
                            }
                            
                        }
                    }
                   hell.setVisible(true);
               }
           }
       });
       GridLayout glbl = new GridLayout();
       glbl.setColumns(2);
       glbl.setRows(2);
       arama1.add(gir1);
       arama1.add(aranacak1);
       arama1.add(ara1);
       arama2.add(gir2);
       arama2.add(aranacak2);
       arama3.add(gir3);
       arama3.add(aranacak3);
       arama4.add(gir4);
       arama4.add(aranacak4);
       arama5.add(gir5);
       arama5.add(aranacak5);
       
       arama1.setLayout(glbl);
       arama2.setLayout(atib);
       arama3.setLayout(atib);
       arama4.setLayout(atib);
       arama5.setLayout(atib);
       
       JList butbut = new JList();
       JButton inbut1 = new JButton("Düzenle/Görüntüle");
       
       JButton inbut2 = new JButton("Sil");
       butbut.add(inbut1);
       butbut.add(inbut2);
       
       GridLayout dort = new GridLayout();
       dort.setColumns(4);
       dort.setRows(1);
       
       
       JPanel listeler = new JPanel();
       
      
       JList<String> list = new JList<String>(model);
       
       JList<String> list2 = new JList<String>(model2);
       list2.setEnabled(false);
       JList<String> list3 = new JList<String>(model3);
       list3.setEnabled(false);
       JList<String> list4 = new JList<String>(model4);
       list4.setEnabled(false);
       listeler.add(list);
       listeler.add(list2);
       listeler.add(list3);
       listeler.add(list4);
       
       listeler.setLayout(dort);
       
       JScrollPane mtv = new JScrollPane(listeler);
       
       tp.add("Tümü",mtv);
       tp.add("MAC",arama1);
       tp.add("IP",arama2);
       tp.add("Kullanıcı isimleri",arama3);
       tp.add("Cihaz ismi",arama4);
       tp.add("Seri NO",arama5);
       
       
       
       //arama.add(tp);
       bu4.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent kep){
               arama.setVisible(false);
               j.setVisible(true);
           }
       });
       
       bu5.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent kelal){
               String inputt = ktx.getText();
               //inputt.replaceAll("/", "\\");
               File kontrol =  new File(inputt+"\\yes");
               if(kontrol.exists()){
                   
                   konum.set(inputt+"\\yes");
               }
               else{
                   try{
                      kontrol.createNewFile();
                      File inna1 = new File(konum+"\\Bilgisayar");
                      File inna2 = new File(konum+"\\Kamera");
                      File inna3 = new File(konum+"\\Other");
                      File inna4 = new File(konum+"\\Printer");
                      File inna5 = new File(konum+"\\Switch");
                      inna1.createNewFile();
                      inna2.createNewFile();
                      inna3.createNewFile();
                      inna4.createNewFile();
                      inna5.createNewFile();
                   }catch(IOException jhg){
                       
                   }
               }
               if(String.valueOf(pass.getPassword()).equals(PASSWORD)){
               main.setVisible(false);
               list.setBackground(Color.yellow);
               list2.setBackground(Color.yellow);
               list3.setBackground(Color.yellow);
               list4.setBackground(Color.yellow);
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
                for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                            
                            }catch(IOException ftt){
                                
                            }
                            
                        }
                    }
                list.setSelectedIndex(0);
                arama.setVisible(true);
           }
           }
       });
       
       mac.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent qe){
               if(mac.isSelected()){
                   
               }
           }
       });
       JButton itter = new JButton("     Aramak için tıkla     ");
       JTextField iyi = new JTextField();
       GridLayout ffff = new GridLayout();
       ffff.setColumns(3);
       ffff.setRows(1);
       JPanel aceb = new JPanel();
       JPanel butonlar = new JPanel();
       
       GridLayout birdort = new GridLayout();
       birdort.setColumns(4);
       birdort.setRows(1);
       
       JPanel basliklar = new JPanel();
       JLabel baslik1 = new JLabel("                Cihaz Adı               ");
       JLabel baslik2 = new JLabel("           Birim Adı             ");
       JLabel baslik3  = new JLabel("      IP Adresi         ");
       JLabel baslik4 = new JLabel("    Zimmetli İsmi        ");
       
       basliklar.add(baslik1);
       basliklar.add(baslik2);
       basliklar.add(baslik3);
       basliklar.add(baslik4);
       
       basliklar.setLayout(birdort);
       
       
       butonlar.add(inbut1);
       butonlar.add(inbut2);
       butonlar.add(bu4);
       butonlar.add(blank);
       GridLayout ftr = new GridLayout();
       ftr.setRows(2);
       ftr.setColumns(2);
       GridLayout ikibir = new GridLayout();
       ikibir.setColumns(1);
       ikibir.setRows(2);
       
       butonlar.setSize(200,600);
       JPanel butonlar2 = new JPanel();
       
       butonlar2.add(iyi);
       
       butonlar2.add(itter);
       //butonlar2.add(bu4);
       butonlar2.setLayout(ftr);
       
       //aceb.setLayout(ffff);
       aceb.add(list);
       aceb.add(list2);
       aceb.add(list3);
       aceb.add(list4);
       aceb.setLayout(dort);
       JPanel aceb2 = new JPanel();
       aceb2.add(butonlar);
       aceb2.add(butonlar2);
       
       JScrollPane otv = new JScrollPane(aceb);
       
       JPanel agh = new JPanel();
       agh.add(basliklar, BorderLayout.NORTH);
       agh.add(otv, BorderLayout.CENTER);
       //agh.setLayout(ikibir);
       
       GridLayout essah = new GridLayout();
               essah.setColumns(2);
               essah.setRows(1);
       
               DefaultListModel<String> model5 = new DefaultListModel<>();
       DefaultListModel<String> model6 = new DefaultListModel<>();
       DefaultListModel<String> model7 = new DefaultListModel<>();
       DefaultListModel<String> model8 = new DefaultListModel<>();
       
       JList<String> list5 = new JList(model5);
       
       JList<String> list6 = new JList(model6);
       list6.setEnabled(false);
       JList<String> list7 = new JList(model7);
       list7.setEnabled(false);
       JList<String> list8 = new JList(model8);
       list8.setEnabled(false);        
               
       inbut1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent olur){
               arama.setVisible(false);
               JFrame jfk = new JFrame();
               jfk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               jfk.setLocationRelativeTo(null);
               jfk.setSize(1100,720);
               
               jfk.setVisible(true);
               String ap = list.getSelectedValue();
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            if(ap.equals(line4)){
                                JPanel olk = new JPanel();
                                olk.add(str1);
                                olk.add(jtf1);
                                jtf1.setText(line1);
                                olk.add(str2);
                                olk.add(jtf2);
                                jtf2.setText(line2);
                                olk.add(str3);
                                olk.add(jtf3);
                                jtf3.setText(line3);
                                olk.add(str4);
                                olk.add(jtf4);
                                jtf4.setText(line4);
                                olk.add(str5);
                                olk.add(jtf5);
                                jtf5.setSelectedItem(line5);
                                olk.add(str6);
                                olk.add(jtf6);
                                jtf6.setText(line6);
                                olk.add(str7);
                                olk.add(jtf7);
                                jtf7.setText(line7);
                                olk.add(str8);
                                olk.add(jtf8);
                                jtf8.setText(line8);
                                olk.add(str9);
                                olk.add(jtf9);
                                jtf9.setText(line9);
                                olk.add(str10);
                                olk.add(jtf10);
                                jtf10.setText(line10);
                                olk.add(str11);
                                olk.add(jtf11);
                                jtf11.setText(line11);
                                olk.add(str12);
                                olk.add(jtf12);
                                jtf12.setText(line12);
                                olk.add(str13);
                                olk.add(jtf13);
                                jtf13.setSelectedItem(line13);
                                olk.add(str14);
                                olk.add(jtf14);
                                jtf14.setText(line14);
                                olk.add(str15);
                                olk.add(jtf15);
                                jtf15.setText(line15);
                                olk.add(str16);
                                olk.add(jtf16);
                                jtf16.setSelectedItem(line16);
                                olk.add(str17);
                                olk.add(pfc1);
                                jcb1.setSelectedItem(line17.substring(0, 2));
                                jcb2.setSelectedItem(line17.substring(3, 6));
                                jcb3.setSelectedItem(line17.substring(7));
                                olk.add(str18);
                                olk.add(pfc2);
                                jcb4.setSelectedItem(line18.substring(0, 2));
                                jcb5.setSelectedItem(line18.substring(3, 6));
                                jcb6.setSelectedItem(line18.substring(7));
                                //olk.add(gerg);
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(jtf4.getText().substring(0, 4).equals("VFL-") && jtf4.getText().length() == 7 && 0<=Integer.parseInt(jtf4.getText().substring(4))&& Integer.parseInt(jtf4.getText().substring(4))<1000 && (jtf2.getText().length()==17) && (jtf2.getText().charAt(2)==(':')) && (jtf2.getText().charAt(5)==(':'))&&(jtf2.getText().charAt(8)==(':'))&&(jtf2.getText().charAt(11)==(':'))&&(jtf2.getText().charAt(14)==(':'))){
                           File myObj = new File(konum+"\\Bilgisayar\\"+jtf4.getText()+".txt");
                           if(!myObj.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(myObj);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(jtf1.getText());
                           buffer.newLine();
                           buffer.write(jtf2.getText());
                           buffer.newLine();
                           buffer.write(jtf3.getText());
                           buffer.newLine();
                           buffer.write(jtf4.getText());
                           buffer.newLine();
                           buffer.write(jtf5.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jtf6.getText());
                           buffer.newLine();
                           buffer.write(jtf7.getText());
                           buffer.newLine();
                           buffer.write(jtf8.getText());
                           buffer.newLine();
                           buffer.write(jtf9.getText());
                           buffer.newLine();
                           buffer.write(jtf10.getText());
                           buffer.newLine();
                           buffer.write(jtf11.getText());
                           buffer.newLine();
                           buffer.write(jtf12.getText());
                           buffer.newLine();
                           buffer.write(jtf13.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jtf14.getText());
                           buffer.newLine();
                           buffer.write(jtf15.getText());
                           buffer.newLine();
                           buffer.write(jtf16.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb1.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb2.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb3.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb4.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb5.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb6.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           jtf1.setText("");
                           jtf2.setText("");
                           jtf3.setText("");
                           jtf4.setText("VFL-");
                           jtf5.setSelectedIndex(0);
                           jtf6.setText("");
                           jtf7.setText("");
                           jtf8.setText("");
                           jtf9.setText("");
                           jtf10.setText("");
                           jtf11.setText("");
                           jtf12.setText("");
                           jtf13.setSelectedIndex(0);
                           jtf14.setText("");
                           jtf15.setText("");
                           jtf16.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(myObj);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(jtf1.getText());
                                            buffer.newLine();
                                            buffer.write(jtf2.getText());
                                            buffer.newLine();
                                            buffer.write(jtf3.getText());
                                            buffer.newLine();
                                            buffer.write(jtf4.getText());
                                            buffer.newLine();
                                            buffer.write(jtf5.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jtf6.getText());
                                            buffer.newLine();
                                            buffer.write(jtf7.getText());
                                            buffer.newLine();
                                            buffer.write(jtf8.getText());
                                            buffer.newLine();
                                            buffer.write(jtf9.getText());
                                            buffer.newLine();
                                            buffer.write(jtf10.getText());
                                            buffer.newLine();
                                            buffer.write(jtf11.getText());
                                            buffer.newLine();
                                            buffer.write(jtf12.getText());
                                            buffer.newLine();
                                            buffer.write(jtf13.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jtf14.getText());
                                            buffer.newLine();
                                            buffer.write(jtf15.getText());
                                            buffer.newLine();
                                            buffer.write(jtf16.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb1.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb2.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb3.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb4.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb5.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb6.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            jtf1.setText("");
                                            jtf2.setText("");
                                            jtf3.setText("");
                                            jtf4.setText("VFL-");
                                            jtf5.setSelectedIndex(0);
                                            jtf6.setText("");
                                            jtf7.setText("");
                                            jtf8.setText("");
                                            jtf9.setText("");
                                            jtf10.setText("");
                                            jtf11.setText("");
                                            jtf12.setText("");
                                            jtf13.setSelectedIndex(0);
                                            jtf14.setText("");
                                            jtf15.setText("");
                                            jtf16.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel plk = new JPanel();
                JPanel hattip = new JPanel();
                
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                JPanel hgf = new JPanel();
                hattip.add(basliklar, BorderLayout.NORTH);
                hattip.add(hatat, BorderLayout.CENTER);
                hgf.add(hattip);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       jtf1.setText("");
                           jtf2.setText("");
                           jtf3.setText("");
                           jtf4.setText("VFL-");
                           jtf5.setSelectedIndex(0);
                           jtf6.setText("");
                           jtf7.setText("");
                           jtf8.setText("");
                           jtf9.setText("");
                           jtf10.setText("");
                           jtf11.setText("");
                           jtf12.setText("");
                           jtf13.setSelectedIndex(0);
                           jtf14.setText("");
                           jtf15.setText("");
                           jtf16.setSelectedIndex(0);
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   jtf1.setText("");
                                   jtf2.setText("");
                                   jtf3.setText("");
                                   jtf4.setText("VFL-");
                                   jtf5.setSelectedIndex(0);
                                   jtf6.setText("");
                                   jtf7.setText("");
                                   jtf8.setText("");
                                   jtf9.setText("");
                                   jtf10.setText("");
                                   jtf11.setText("");
                                   jtf12.setText("");
                                   jtf13.setSelectedIndex(0);
                                   jtf14.setText("");
                                   jtf15.setText("");
                                   jtf16.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       jtf1.setText("");
                           jtf2.setText("");
                           jtf3.setText("");
                           jtf4.setText("VFL-");
                           jtf5.setSelectedIndex(0);
                           jtf6.setText("");
                           jtf7.setText("");
                           jtf8.setText("");
                           jtf9.setText("");
                           jtf10.setText("");
                           jtf11.setText("");
                           jtf12.setText("");
                           jtf13.setSelectedIndex(0);
                           jtf14.setText("");
                           jtf15.setText("");
                           jtf16.setSelectedIndex(0);
                       jfk.dispose();
                       arama.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException ftt){
                                System.out.println("No Entry");
                            }
                            
                        }
                        
                    }
               String ap2 = list.getSelectedValue()+".txt";
               
               JLabel yzs1 = new JLabel("                  *Birim:");
               JLabel yzs2 = new JLabel("                  *MAC Adresi:");
               JLabel yzs3 = new JLabel("                  *IP Adresi:");
               JLabel yzs4 = new JLabel("                  *Yazıcı adı:");
               JLabel yzs5 = new JLabel("                  *Seri NO:");
               JLabel yzs6 = new JLabel("                  Lokasyon:");
               JLabel yzs7 = new JLabel("                  Marka:");
               JLabel yzs8 = new JLabel("                  Model:");
               JLabel yzs9 = new JLabel("                  Garanti Başlangıç:");
               JLabel yzs10 = new JLabel("                  Garanti Bitiş:");
               JLabel yzs11 = new JLabel("                  Diğer Donanım Tanım");
               
               JTextField yztf1 = new JTextField();
               JTextField yztf2 = new JTextField();
               JTextField yztf3 = new JTextField();
               JTextField yztf4 = new JTextField();
               JTextField yztf5 = new JTextField();
               JTextField yztf6 = new JTextField();
               JTextField yztf7 = new JTextField();
               JTextField yztf8 = new JTextField();
               JTextField yztf9 = new JTextField();
               
               JPanel pfc11 = new JPanel();
               JPanel pfc22 = new JPanel();
               JComboBox jcb11 = new JComboBox(days);
               JComboBox jcb22 = new JComboBox(months);
               JComboBox jcb33 = new JComboBox(years);
               JComboBox jcb44 = new JComboBox(days);
               JComboBox jcb55 = new JComboBox(months);
               JComboBox jcb66 = new JComboBox(years);
               pfc11.add(jcb11);
               pfc11.add(jcb22);
               pfc11.add(jcb33);
               pfc22.add(jcb44);
               pfc22.add(jcb55);
               pfc22.add(jcb66);
               
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(yzs9);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(yzs10);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir2 = new File(konum+"\\Printer");
               String[] yazar2 = yazdir2.list();
               
                   for (int y = 0; y < yazar2.length; y++) {
                       File htpp5 = new File(konum+"\\Printer\\" + yazar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir2 = new File(konum+"\\Kamera");
                String[] kamar2 = kamdir2.list();
                
                   for (int y = 0; y < kamar2.length; y++) {
                       File htpp5 = new File(konum+"\\Kamera\\" + kamar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                                
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir2 = new File(konum+"\\Switch");
                   String[] swiar2 = swidir2.list();
                
                   for (int y = 0; y < swiar2.length; y++) {
                       File htpp5 = new File(konum+"\\Switch\\" + swiar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir2 = new File(konum+"\\Other");
                   String[] digar2 = digdir2.list();
                
                   for (int y = 0; y < digar2.length; y++) {
                       File htpp5 = new File(konum+"\\Other\\" + digar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp8 = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp8.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp8);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel plk = new JPanel();
                JPanel hattip = new JPanel();
                
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                JPanel hgf = new JPanel();
                hattip.add(basliklar, BorderLayout.NORTH);
                hattip.add(hatat, BorderLayout.CENTER);
                hgf.add(hattip);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                       jfk.dispose();
                       arama.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(str17);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(str18);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel plk = new JPanel();
                JPanel hattip = new JPanel();
                
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                JPanel hgf = new JPanel();
                hattip.add(basliklar, BorderLayout.NORTH);
                hattip.add(hatat, BorderLayout.CENTER);
                hgf.add(hattip);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                       jfk.dispose();
                       arama.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(str17);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(str18);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel plk = new JPanel();
                JPanel hattip = new JPanel();
                
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                JPanel hgf = new JPanel();
                hattip.add(basliklar, BorderLayout.NORTH);
                hattip.add(hatat, BorderLayout.CENTER);
                hgf.add(hattip);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                       jfk.dispose();
                       arama.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(str17);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(str18);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                olk.add(yzs9);
                                olk.add(yztf9);
                                yztf9.setText(line11);
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(yztf9.getText());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           yztf9.setText("");
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(yztf9.getText());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                            yztf9.setText("");
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel plk = new JPanel();
                JPanel hattip = new JPanel();
                
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                JPanel hgf = new JPanel();
                hattip.add(basliklar, BorderLayout.NORTH);
                hattip.add(hatat, BorderLayout.CENTER);
                hgf.add(hattip);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                            yztf9.setText("");
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                            yztf9.setText("");
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           yztf9.setText("");
                       jfk.dispose();
                       arama.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
           }
           
           
       });        
               
       geri.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent iol){
               j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel plk = new JPanel();
                JPanel hnb = new JPanel();
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                hnb.add(basliklar,BorderLayout.NORTH);
                hnb.add(hatat,BorderLayout.CENTER);
                JPanel hgf = new JPanel();
                hgf.add(hnb);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
           }
       });        
       
       inbut2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ose){
               String ap = list.getSelectedValue().substring(0, 7);
               String ap22 = list.getSelectedValue();
               
               JPanel haha = new JPanel();
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
                        
                        
                        
                        
                        
                        File ktp = new File(konum+"\\Bilgisayar\\" + ap + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx = new File(ktp.getAbsolutePath());
                        azx.delete();
                        
                        File ktp2 = new File(konum+"\\Switch\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx2 = new File(ktp2.getAbsolutePath());
                        azx2.delete();
                        
                        File ktp3 = new File(konum+"\\Kamera\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx3 = new File(ktp3.getAbsolutePath());
                        azx3.delete();
                        
                        File ktp4 = new File(konum+"\\Printer\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx4 = new File(ktp4.getAbsolutePath());
                        azx4.delete();
                        
                        File ktp5 = new File(konum+"\\Other\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx5 = new File(ktp5.getAbsolutePath());
                        azx5.delete();
                        
                        
                main.setVisible(false);
                
                File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               
                for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
                arama.setVisible(true);
                //haha.add(list);
                JPanel plk = new JPanel();
                
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                JPanel ukun = new JPanel();
                ukun.add(basliklar,BorderLayout.NORTH);
                ukun.add(hatat,BorderLayout.CENTER);
                JPanel hgf = new JPanel();
                hgf.add(ukun);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                        }
                    
                    
           });
       
       
       
       
       itter.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent kjn){
               String yay = iyi.getText();
               
               
               
               
               JPanel jpnl9 = new JPanel();
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            String[] kah = new String[10];
                            kah[0] = line1;
                            kah[1] = line2;
                            kah[2] = line3;
                            kah[3] = line4;
                            kah[4] = line5;
                            kah[5] = line6;
                            kah[6] = line7;
                            kah[7] = line8;
                            kah[8] = line9;
                            kah[9] = line10;
                            
                            
                                for (int m = 0; m < 10; m++) {
                                    if(kah[m].contains(yay)){
                                        model5.addElement(line4);
                                        model6.addElement(line1);
                                        model7.addElement(line3);
                                        model8.addElement(line9);
                                        
                                        System.out.println("Added");
                                        break;
                                    }
                                }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            String[] kah = new String[10];
                            kah[0] = line1;
                            kah[1] = line2;
                            kah[2] = line3;
                            kah[3] = line4;
                            kah[4] = line5;
                            kah[5] = line6;
                            kah[6] = line7;
                            kah[7] = line8;
                            kah[8] = line9;
                            kah[9] = line10;
                            
                            
                                for (int m = 0; m < 10; m++) {
                                    if(kah[m].contains(yay)){
                                        model5.addElement(line4);
                                        model6.addElement(line1);
                                        model7.addElement(line3);
                                        model8.addElement(line9);
                                        
                                        System.out.println("Added");
                                        break;
                                    }
                                }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            String[] kah = new String[10];
                            kah[0] = line1;
                            kah[1] = line2;
                            kah[2] = line3;
                            kah[3] = line4;
                            kah[4] = line5;
                            kah[5] = line6;
                            kah[6] = line7;
                            kah[7] = line8;
                            kah[8] = line9;
                            kah[9] = line10;
                            
                            
                                for (int m = 0; m < 10; m++) {
                                    if(kah[m].contains(yay)){
                                        model5.addElement(line4);
                                        model6.addElement(line1);
                                        model7.addElement(line3);
                                        model8.addElement(line9);
                                        
                                        System.out.println("Added");
                                        break;
                                    }
                                }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            
                            String[] kah = new String[11];
                            kah[0] = line1;
                            kah[1] = line2;
                            kah[2] = line3;
                            kah[3] = line4;
                            kah[4] = line5;
                            kah[5] = line6;
                            kah[6] = line7;
                            kah[7] = line8;
                            kah[8] = line9;
                            kah[9] = line10;
                            kah[10] = line11;
                            
                            
                                for (int m = 0; m < 11; m++) {
                                    if(kah[m].contains(yay)){
                                        model5.addElement(line4);
                                        model6.addElement(line1);
                                        model7.addElement(line3);
                                        model8.addElement(line9);
                                        
                                        System.out.println("Added");
                                        break;
                                    }
                                }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            
                            String[] kah = new String[18];
                            kah[0] = line1;
                            kah[1] = line2;
                            kah[2] = line3;
                            kah[3] = line4;
                            kah[4] = line5;
                            kah[5] = line6;
                            kah[6] = line7;
                            kah[7] = line8;
                            kah[8] = line9;
                            kah[9] = line10;
                            kah[10] = line11;
                            kah[11] = line12;
                            kah[12] = line13;
                            kah[13] = line14;
                            kah[14] = line15;
                            kah[15] = line16;
                            kah[16] = line17;
                            kah[17] = line18;
                            
                                for (int m = 0; m < 18; m++) {
                                    if(kah[m].contains(yay)){
                                        model5.addElement(line4);
                                        model6.addElement(line1);
                                        model7.addElement(line3);
                                        model8.addElement(line6);
                                        
                                        System.out.println("Added");
                                        break;
                                    }
                                }
                            
                            
                                
                            
                            }catch(IOException ftt){
                                
                            }
                            
                        }
                    }
               arama.setVisible(false);
               //JList<String> insideList = new JList<String>(model5);
               JButton insideEdit = new JButton("Edit this");
               JButton gepger = new JButton("Ana Ekrana Geri Dön");
               
               //JScrollPane oll = new JScrollPane(insideList);
               JFrame goster = new JFrame();
               
               gepger.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent okj){
                       goster.dispose();
                       arama.setVisible(true);
                       arama.getContentPane().removeAll();
                       arama.getContentPane().revalidate();
                       arama.getContentPane().repaint();
                       
                       list.removeAll();
                       model.clear();
                       list2.removeAll();
                       model2.clear();
                       list3.removeAll();
                       model3.clear();
                       list4.removeAll();
                       model4.clear();
                       list5.removeAll();
                       model5.clear();
                       list6.removeAll();
                       model6.clear();
                       list7.removeAll();
                       model7.clear();
                       list8.removeAll();
                       model8.clear();
                       iyi.setText("");
                       
                       File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                       
                       for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                            
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
                       
                       JPanel plk = new JPanel();
                JPanel bht = new JPanel();
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                bht.add(basliklar,BorderLayout.NORTH);
                bht.add(hatat,BorderLayout.CENTER);
                JPanel hgf = new JPanel();
                hgf.add(bht);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                list.setSelectedIndex(0);
                   }
               });
               
               insideEdit.addActionListener(new ActionListener(){
                    @Override
           public void actionPerformed(ActionEvent olur){
               arama.setVisible(false);
               JFrame jfk = new JFrame();
               jfk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               jfk.setLocationRelativeTo(null);
               jfk.setSize(1100,720);
               
               jfk.setVisible(true);
               String ap9 = list5.getSelectedValue().toString();
               String ap2 = list5.getSelectedValue()+".txt";
               
               JLabel yzs1 = new JLabel("                  *Birim:");
               JLabel yzs2 = new JLabel("                  *MAC Adresi:");
               JLabel yzs3 = new JLabel("                  *IP Adresi:");
               JLabel yzs4 = new JLabel("                  *Yazıcı adı:");
               JLabel yzs5 = new JLabel("                  *Seri NO:");
               JLabel yzs6 = new JLabel("                  Lokasyon:");
               JLabel yzs7 = new JLabel("                  Marka:");
               JLabel yzs8 = new JLabel("                  Model:");
               JLabel yzs9 = new JLabel("                  Garanti Başlangıç:");
               JLabel yzs10 = new JLabel("                  Garanti Bitiş:");
               JLabel yzs11 = new JLabel("                  Diğer Donanım Tanım");
               
               JTextField yztf1 = new JTextField();
               JTextField yztf2 = new JTextField();
               JTextField yztf3 = new JTextField();
               JTextField yztf4 = new JTextField();
               JTextField yztf5 = new JTextField();
               JTextField yztf6 = new JTextField();
               JTextField yztf7 = new JTextField();
               JTextField yztf8 = new JTextField();
               JTextField yztf9 = new JTextField();
               
               JPanel pfc11 = new JPanel();
               JPanel pfc22 = new JPanel();
               JComboBox jcb11 = new JComboBox(days);
               JComboBox jcb22 = new JComboBox(months);
               JComboBox jcb33 = new JComboBox(years);
               JComboBox jcb44 = new JComboBox(days);
               JComboBox jcb55 = new JComboBox(months);
               JComboBox jcb66 = new JComboBox(years);
               pfc11.add(jcb11);
               pfc11.add(jcb22);
               pfc11.add(jcb33);
               pfc22.add(jcb44);
               pfc22.add(jcb55);
               pfc22.add(jcb66);
               
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(yzs9);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(yzs10);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            goster.setVisible(true);
                                            
                                            
               goster.getContentPane().removeAll();
               goster.getContentPane().revalidate();
               goster.getContentPane().repaint();
               
               list5.removeAll();
               model5.clear();
               list6.removeAll();
               model6.clear();
               list7.removeAll();
               model7.clear();
               list8.removeAll();
               model8.clear();
               goster.setVisible(true);
               
               File yazdir2 = new File(konum+"\\Printer");
               String[] yazar2 = yazdir2.list();
               
                   for (int y = 0; y < yazar2.length; y++) {
                       File htpp5 = new File(konum+"\\Printer\\" + yazar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir2 = new File(konum+"\\Kamera");
                String[] kamar2 = kamdir2.list();
                
                   for (int y = 0; y < kamar2.length; y++) {
                       File htpp5 = new File(konum+"\\Kamera\\" + kamar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                                
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir2 = new File(konum+"\\Switch");
                   String[] swiar2 = swidir2.list();
                
                   for (int y = 0; y < swiar2.length; y++) {
                       File htpp5 = new File(konum+"\\Switch\\" + swiar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir2 = new File(konum+"\\Other");
                   String[] digar2 = digdir2.list();
                
                   for (int y = 0; y < digar2.length; y++) {
                       File htpp5 = new File(konum+"\\Other\\" + digar2[y]);
                        if(htpp5.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp5);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp8 = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp8.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp8);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel jpnl98 = new JPanel();     //isimler değişcek
                                   JPanel adf8 = new JPanel();
               goster.setSize(1300,720);
               goster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               goster.setLocationRelativeTo(null);
               GridLayout poh8 = new GridLayout();
               poh8.setColumns(2);
               poh8.setRows(1);
               GridLayout doka8 =new GridLayout();
               doka8.setColumns(4);
               doka8.setRows(1);
               jpnl98.add(list5);
               jpnl98.add(list6);
               jpnl98.add(list7);
               jpnl98.add(list8);
               jpnl98.setLayout(doka8);
               adf8.add(insideEdit);
               adf8.add(gepger);
               JScrollPane lipa8 = new JScrollPane(jpnl98);
               
               
               JPanel sonn8  = new JPanel();
               sonn8.add(basliklar,BorderLayout.NORTH);
               sonn8.add(lipa8,BorderLayout.CENTER);
               
               JPanel soson8 = new JPanel();
               soson8.add(sonn8);
               soson8.add(adf8);
               soson8.setLayout(poh8);
               //oll.add(insideList);
               //jpnl9.add(oll);
               //jpnl.setLayout(poh);
               
               goster.add(soson8);
               
               goster.setExtendedState(JFrame.MAXIMIZED_BOTH);
               goster.setVisible(true);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                                   
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(false);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                       jfk.dispose();
                       goster.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(str17);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(str18);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model5.addElement(line4);
                            model6.addElement(line1);
                            model7.addElement(line3);
                            model8.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel jpnl98 = new JPanel();     //isimler değişcek
                                   JPanel adf8 = new JPanel();
               goster.setSize(1300,720);
               goster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               goster.setLocationRelativeTo(null);
               GridLayout poh8 = new GridLayout();
               poh8.setColumns(2);
               poh8.setRows(1);
               GridLayout doka8 =new GridLayout();
               doka8.setColumns(4);
               doka8.setRows(1);
               jpnl98.add(list5);
               jpnl98.add(list6);
               jpnl98.add(list7);
               jpnl98.add(list8);
               jpnl98.setLayout(doka8);
               adf8.add(insideEdit);
               adf8.add(gepger);
               JScrollPane lipa8 = new JScrollPane(jpnl98);
               
               
               JPanel sonn8  = new JPanel();
               sonn8.add(basliklar,BorderLayout.NORTH);
               sonn8.add(lipa8,BorderLayout.CENTER);
               
               JPanel soson8 = new JPanel();
               soson8.add(sonn8);
               soson8.add(adf8);
               soson8.setLayout(poh8);
               //oll.add(insideList);
               //jpnl9.add(oll);
               //jpnl.setLayout(poh);
               
               goster.add(soson8);
               
               goster.setExtendedState(JFrame.MAXIMIZED_BOTH);
               goster.setVisible(true);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                       jfk.dispose();
                       goster.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(str17);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(str18);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel jpnl98 = new JPanel();     //isimler değişcek
                                   JPanel adf8 = new JPanel();
               goster.setSize(1300,720);
               goster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               goster.setLocationRelativeTo(null);
               GridLayout poh8 = new GridLayout();
               poh8.setColumns(2);
               poh8.setRows(1);
               GridLayout doka8 =new GridLayout();
               doka8.setColumns(4);
               doka8.setRows(1);
               jpnl98.add(list5);
               jpnl98.add(list6);
               jpnl98.add(list7);
               jpnl98.add(list8);
               jpnl98.setLayout(doka8);
               adf8.add(insideEdit);
               adf8.add(gepger);
               JScrollPane lipa8 = new JScrollPane(jpnl98);
               
               
               JPanel sonn8  = new JPanel();
               sonn8.add(basliklar,BorderLayout.NORTH);
               sonn8.add(lipa8,BorderLayout.CENTER);
               
               JPanel soson8 = new JPanel();
               soson8.add(sonn8);
               soson8.add(adf8);
               soson8.setLayout(poh8);
               //oll.add(insideList);
               //jpnl9.add(oll);
               //jpnl.setLayout(poh);
               
               goster.add(soson8);
               
               goster.setExtendedState(JFrame.MAXIMIZED_BOTH);
               goster.setVisible(true);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                       jfk.dispose();
                       goster.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            
                            
                            if(htpp.getName().equals(ap2)){
                                JPanel olk = new JPanel();
                                olk.add(yzs1);
                                olk.add(yztf1);
                                yztf1.setText(line1);
                                olk.add(yzs2);
                                olk.add(yztf2);
                                yztf2.setText(line2);
                                olk.add(yzs3);
                                olk.add(yztf3);
                                yztf3.setText(line3);
                                olk.add(yzs4);
                                olk.add(yztf4);
                                yztf4.setText(line4);
                                olk.add(yzs5);
                                olk.add(yztf5);
                                yztf5.setText(line5);
                                olk.add(yzs6);
                                olk.add(yztf6);
                                yztf6.setText(line6);
                                olk.add(yzs7);
                                olk.add(yztf7);
                                yztf7.setText(line7);
                                olk.add(yzs8);
                                olk.add(yztf8);
                                yztf8.setText(line8);
                                olk.add(str17);
                                olk.add(pfc11);
                                jcb11.setSelectedItem(line9.substring(0, 2));
                                jcb22.setSelectedItem(line9.substring(3, 6));
                                jcb33.setSelectedItem(line9.substring(7));
                                olk.add(str18);
                                olk.add(pfc22);
                                jcb44.setSelectedItem(line10.substring(0, 2));
                                jcb55.setSelectedItem(line10.substring(3, 6));
                                jcb66.setSelectedItem(line10.substring(7));
                                olk.add(yzs9);
                                olk.add(yztf9);
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(yztf4.getText().length()>3){
                           if(!htpp.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(htpp);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(yztf1.getText());
                           buffer.newLine();
                           buffer.write(yztf2.getText());
                           buffer.newLine();
                           buffer.write(yztf3.getText());
                           buffer.newLine();
                           buffer.write(yztf4.getText());
                           buffer.newLine();
                           buffer.write(yztf5.getText());
                           buffer.newLine();
                           buffer.write(yztf6.getText());
                           buffer.newLine();
                           buffer.write(yztf7.getText());
                           buffer.newLine();
                           buffer.write(yztf8.getText());
                           buffer.newLine();
                           
                           buffer.write(jcb11.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb22.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb33.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb44.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb55.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb66.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(yztf9.getText());
                           
                           buffer.close();
                           
                           yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           yztf9.setText("");
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(htpp);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(yztf1.getText());
                                            buffer.newLine();
                                            buffer.write(yztf2.getText());
                                            buffer.newLine();
                                            buffer.write(yztf3.getText());
                                            buffer.newLine();
                                            buffer.write(yztf4.getText());
                                            buffer.newLine();
                                            buffer.write(yztf5.getText());
                                            buffer.newLine();
                                            buffer.write(yztf6.getText());
                                            buffer.newLine();
                                            buffer.write(yztf7.getText());
                                            buffer.newLine();
                                            buffer.write(yztf8.getText());
                                            buffer.newLine();
                                            
                                            buffer.write(jcb11.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb22.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb33.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb44.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb55.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb66.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(yztf9.getText());
                                            
                           
                                            buffer.close();
                                            
                                            yztf1.setText("");
                                            yztf2.setText("");
                                            yztf3.setText("");
                                            yztf4.setText("");
                                            yztf5.setText("");
                                            yztf6.setText("");
                                            yztf7.setText("");
                                            yztf8.setText("");
                                            jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                            yztf9.setText("");
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            arama.setVisible(true);
                                            
                                            j.setVisible(false);
               arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               arama.setVisible(true);
               
               File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line9);
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel jpnl98 = new JPanel();     //isimler değişcek
                                   JPanel adf8 = new JPanel();
               goster.setSize(1300,720);
               goster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               goster.setLocationRelativeTo(null);
               GridLayout poh8 = new GridLayout();
               poh8.setColumns(2);
               poh8.setRows(1);
               GridLayout doka8 =new GridLayout();
               doka8.setColumns(4);
               doka8.setRows(1);
               jpnl98.add(list5);
               jpnl98.add(list6);
               jpnl98.add(list7);
               jpnl98.add(list8);
               jpnl98.setLayout(doka8);
               adf8.add(insideEdit);
               adf8.add(gepger);
               JScrollPane lipa8 = new JScrollPane(jpnl98);
               
               
               JPanel sonn8  = new JPanel();
               sonn8.add(basliklar,BorderLayout.NORTH);
               sonn8.add(lipa8,BorderLayout.CENTER);
               
               JPanel soson8 = new JPanel();
               soson8.add(sonn8);
               soson8.add(adf8);
               soson8.setLayout(poh8);
               //oll.add(insideList);
               //jpnl9.add(oll);
               //jpnl.setLayout(poh);
               
               goster.add(soson8);
               
               goster.setExtendedState(JFrame.MAXIMIZED_BOTH);
               goster.setVisible(true);
                                            
                                       }catch(IOException egd){
                                           
                                       }
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                            yztf9.setText("");
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                                            jcb22.setSelectedIndex(0);
                                            jcb33.setSelectedIndex(0);
                                            jcb44.setSelectedIndex(0);
                                            jcb55.setSelectedIndex(0);
                                            jcb66.setSelectedIndex(0);
                                            yztf9.setText("");
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       yztf1.setText("");
                           yztf2.setText("");
                           yztf3.setText("");
                           yztf4.setText("");
                           yztf5.setText("");
                           yztf6.setText("");
                           yztf7.setText("");
                           yztf8.setText("");
                           jcb11.setSelectedIndex(0);
                           jcb22.setSelectedIndex(0);
                           jcb33.setSelectedIndex(0);
                           jcb44.setSelectedIndex(0);
                           jcb55.setSelectedIndex(0);
                           jcb66.setSelectedIndex(0);
                           yztf9.setText("");
                       jfk.dispose();
                       goster.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                                JButton gerg = new JButton("Geri");
                                gerg.addActionListener(new ActionListener(){
                                    @Override
                                    public void actionPerformed(ActionEvent yuu){
                                        jfk.dispose();
                                        arama.setVisible(true);
                                    }
                                });
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            if(ap9.equals(line4)){
                                JPanel olk = new JPanel();
                                olk.add(str1);
                                olk.add(jtf1);
                                jtf1.setText(line1);
                                olk.add(str2);
                                olk.add(jtf2);
                                jtf2.setText(line2);
                                olk.add(str3);
                                olk.add(jtf3);
                                jtf3.setText(line3);
                                olk.add(str4);
                                olk.add(jtf4);
                                jtf4.setText(line4);
                                olk.add(str5);
                                olk.add(jtf5);
                                jtf5.setSelectedItem(line5);
                                olk.add(str6);
                                olk.add(jtf6);
                                jtf6.setText(line6);
                                olk.add(str7);
                                olk.add(jtf7);
                                jtf7.setText(line7);
                                olk.add(str8);
                                olk.add(jtf8);
                                jtf8.setText(line8);
                                olk.add(str9);
                                olk.add(jtf9);
                                jtf9.setText(line9);
                                olk.add(str10);
                                olk.add(jtf10);
                                jtf10.setText(line10);
                                olk.add(str11);
                                olk.add(jtf11);
                                jtf11.setText(line11);
                                olk.add(str12);
                                olk.add(jtf12);
                                jtf12.setText(line12);
                                olk.add(str13);
                                olk.add(jtf13);
                                jtf13.setSelectedItem(line13);
                                olk.add(str14);
                                olk.add(jtf14);
                                jtf14.setText(line14);
                                olk.add(str15);
                                olk.add(jtf15);
                                jtf15.setText(line15);
                                olk.add(str16);
                                olk.add(jtf16);
                                jtf16.setSelectedItem(line16);
                                olk.add(str17);
                                olk.add(pfc1);
                                jcb1.setSelectedItem(line17.substring(0, 2));
                                jcb2.setSelectedItem(line17.substring(3, 6));
                                jcb3.setSelectedItem(line17.substring(7));
                                olk.add(str18);
                                olk.add(pfc2);
                                jcb4.setSelectedItem(line18.substring(0, 2));
                                jcb5.setSelectedItem(line18.substring(3, 6));
                                jcb6.setSelectedItem(line18.substring(7));
                                //olk.add(gerg);
                                
                                JButton kaydet = new JButton("Kaydet");
               kaydet.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ke){
                       try{
                           if(jtf4.getText().substring(0, 4).equals("VFL-") && jtf4.getText().length() == 7 && 0<=Integer.parseInt(jtf4.getText().substring(4))&& Integer.parseInt(jtf4.getText().substring(4))<1000 && (jtf2.getText().length()==17) && (jtf2.getText().charAt(2)==(':')) && (jtf2.getText().charAt(5)==(':'))&&(jtf2.getText().charAt(8)==(':'))&&(jtf2.getText().charAt(11)==(':'))&&(jtf2.getText().charAt(14)==(':'))){
                           File myObj = new File(konum+"\\Bilgisayar\\"+jtf4.getText()+".txt");
                           if(!myObj.exists()){
                               System.out.println(Integer.parseInt(jtf4.getText().substring(4)));
                           FileWriter fw = new FileWriter(myObj);
                           BufferedWriter buffer = new BufferedWriter(fw);
                           buffer.write(jtf1.getText());
                           buffer.newLine();
                           buffer.write(jtf2.getText());
                           buffer.newLine();
                           buffer.write(jtf3.getText());
                           buffer.newLine();
                           buffer.write(jtf4.getText());
                           buffer.newLine();
                           buffer.write(jtf5.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jtf6.getText());
                           buffer.newLine();
                           buffer.write(jtf7.getText());
                           buffer.newLine();
                           buffer.write(jtf8.getText());
                           buffer.newLine();
                           buffer.write(jtf9.getText());
                           buffer.newLine();
                           buffer.write(jtf10.getText());
                           buffer.newLine();
                           buffer.write(jtf11.getText());
                           buffer.newLine();
                           buffer.write(jtf12.getText());
                           buffer.newLine();
                           buffer.write(jtf13.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jtf14.getText());
                           buffer.newLine();
                           buffer.write(jtf15.getText());
                           buffer.newLine();
                           buffer.write(jtf16.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb1.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb2.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb3.getSelectedItem().toString());
                           buffer.newLine();
                           buffer.write(jcb4.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb5.getSelectedItem().toString());
                           buffer.write(".");
                           buffer.write(jcb6.getSelectedItem().toString());
                           
                           buffer.close();
                           
                           jtf1.setText("");
                           jtf2.setText("");
                           jtf3.setText("");
                           jtf4.setText("VFL-");
                           jtf5.setSelectedIndex(0);
                           jtf6.setText("");
                           jtf7.setText("");
                           jtf8.setText("");
                           jtf9.setText("");
                           jtf10.setText("");
                           jtf11.setText("");
                           jtf12.setText("");
                           jtf13.setSelectedIndex(0);
                           jtf14.setText("");
                           jtf15.setText("");
                           jtf16.setSelectedIndex(0);
                           
                           
                           System.out.println("Succesfully added.");
                           jfk.dispose();
                           //pdfwrite(jtf4.getText());
                           JFrame warning = new JFrame("Info");
                           warning.setIconImage(ii.getImage());
                           warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                           warning.setVisible(true);
                           warning.setLocationRelativeTo(null);
                           JLabel label = new JLabel("Device successfully edited.");
                           warning.setSize(200, 100);
                           JButton ok = new JButton("OK!");
                           ok.setSize(50,100);
                           ok.addActionListener(new ActionListener(){
                           @Override
                                public void actionPerformed(ActionEvent ue){
                              
                                  warning.dispose();
                                  arama.setVisible(true);
                                }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           }
                           else{
                               jfk.setVisible(false);
                               JFrame sure  = new JFrame("Approve");
                               sure.setIconImage(ii.getImage());
                               sure.setVisible(true);
                               sure.setSize(400,200);
                               sure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                               JLabel guarentee = new JLabel("Are you sure you want to override?");
                               JButton yes = new JButton("Yes");
                               JButton Cancel = new JButton("Cancel");
                               yes.setSize(50,100);
                               yes.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent kir){
                                       try{
                                       FileWriter fw = new FileWriter(myObj);
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            buffer.write(jtf1.getText());
                                            buffer.newLine();
                                            buffer.write(jtf2.getText());
                                            buffer.newLine();
                                            buffer.write(jtf3.getText());
                                            buffer.newLine();
                                            buffer.write(jtf4.getText());
                                            buffer.newLine();
                                            buffer.write(jtf5.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jtf6.getText());
                                            buffer.newLine();
                                            buffer.write(jtf7.getText());
                                            buffer.newLine();
                                            buffer.write(jtf8.getText());
                                            buffer.newLine();
                                            buffer.write(jtf9.getText());
                                            buffer.newLine();
                                            buffer.write(jtf10.getText());
                                            buffer.newLine();
                                            buffer.write(jtf11.getText());
                                            buffer.newLine();
                                            buffer.write(jtf12.getText());
                                            buffer.newLine();
                                            buffer.write(jtf13.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jtf14.getText());
                                            buffer.newLine();
                                            buffer.write(jtf15.getText());
                                            buffer.newLine();
                                            buffer.write(jtf16.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb1.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb2.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb3.getSelectedItem().toString());
                                            buffer.newLine();
                                            buffer.write(jcb4.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb5.getSelectedItem().toString());
                                            buffer.write(".");
                                            buffer.write(jcb6.getSelectedItem().toString());
                                            
                           
                                            buffer.close();
                                            
                                            jtf1.setText("");
                                            jtf2.setText("");
                                            jtf3.setText("");
                                            jtf4.setText("VFL-");
                                            jtf5.setSelectedIndex(0);
                                            jtf6.setText("");
                                            jtf7.setText("");
                                            jtf8.setText("");
                                            jtf9.setText("");
                                            jtf10.setText("");
                                            jtf11.setText("");
                                            jtf12.setText("");
                                            jtf13.setSelectedIndex(0);
                                            jtf14.setText("");
                                            jtf15.setText("");
                                            jtf16.setSelectedIndex(0);
                           
                                            System.out.println("Succesfully added.");
                                            jfk.dispose();
                                            sure.dispose();
                                            
                                            arama.setVisible(false);
                                       }catch(IOException egd){
                                           
                                       }
                                       arama.getContentPane().removeAll();
               arama.getContentPane().revalidate();
               arama.getContentPane().repaint();
               
               list.removeAll();
               model.clear();
               list2.removeAll();
               model2.clear();
               list3.removeAll();
               model3.clear();
               list4.removeAll();
               model4.clear();
               
               goster.getContentPane().removeAll();
               goster.getContentPane().revalidate();
               goster.getContentPane().repaint();
               
               list5.removeAll();
               model5.clear();
               list6.removeAll();
               model6.clear();
               list7.removeAll();
               model7.clear();
               list8.removeAll();
               model8.clear();
               
               for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            String[] kah = new String[18];
                            kah[0] = line1;
                            kah[1] = line2;
                            kah[2] = line3;
                            kah[3] = line4;
                            kah[4] = line5;
                            kah[5] = line6;
                            kah[6] = line7;
                            kah[7] = line8;
                            kah[8] = line9;
                            kah[9] = line10;
                            kah[10] = line11;
                            kah[11] = line12;
                            kah[12] = line13;
                            kah[13] = line14;
                            kah[14] = line15;
                            kah[15] = line16;
                            kah[16] = line17;
                            kah[17] = line18;
                            
                                for (int m = 0; m < 18; m++) {
                                    if(kah[m].contains(yay)){
                                        model5.addElement(line4);
                                        model6.addElement(line1);
                                        model7.addElement(line3);
                                        model8.addElement(line6);
                                        
                                        System.out.println("Added");
                                        break;
                                    }
                                }
                            model.addElement(line4);
                            model2.addElement(line1);
                            model3.addElement(line3);
                            model4.addElement(line6);
                            
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
               JPanel jpnl92 = new JPanel();
               JPanel adf2 = new JPanel();
               //goster.setSize(1300,720);
               goster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               goster.setLocationRelativeTo(null);
               GridLayout poh2 = new GridLayout();
               poh2.setColumns(2);
               poh2.setRows(1);
               GridLayout doka2 =new GridLayout();
               doka2.setColumns(4);
               doka2.setRows(1);
               jpnl92.add(list5);
               jpnl92.add(list6);
               jpnl92.add(list7);
               jpnl92.add(list8);
               jpnl92.setLayout(doka2);
               adf2.add(insideEdit);
               adf2.add(gepger);
               JScrollPane lipa2 = new JScrollPane(jpnl92);
               
               
               JPanel sonn2  = new JPanel();
               sonn2.add(basliklar,BorderLayout.NORTH);
               sonn2.add(lipa2,BorderLayout.CENTER);
               
               JPanel soson2 = new JPanel();
               soson2.add(sonn2);
               soson2.add(adf2);
               soson2.setLayout(poh2);
               //oll.add(insideList);
               //jpnl9.add(oll);
               //jpnl.setLayout(poh);
               
               goster.add(soson2);
               //goster.setResizable(false);
               
               goster.setVisible(true);
               
               JPanel plk = new JPanel();
                JPanel bht = new JPanel();
                plk.add(butonlar);
                plk.add(butonlar2);
                JPanel uytu = new JPanel();
                uytu.add(list);
                uytu.add(list2);
                uytu.add(list3);
                uytu.add(list4);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                bht.add(basliklar,BorderLayout.NORTH);
                bht.add(hatat,BorderLayout.CENTER);
                JPanel hgf = new JPanel();
                hgf.add(bht);
                hgf.add(plk);
                hgf.setLayout(essah);
                arama.add(hgf);
                                   }
                               });
                               Cancel.setSize(50,100);
                               Cancel.addActionListener(new ActionListener(){
                                   @Override
                                   public void actionPerformed(ActionEvent zir){
                                       sure.dispose();
                                       jfk.dispose();
                                       arama.setVisible(false);
                                       goster.setVisible(true);
                                   }
                               });
                               JPanel panpan = new JPanel();
                               panpan.add(guarentee);
                               panpan.add(Cancel);
                               panpan.add(yes);
                               sure.add(panpan);
                           }
                           }
                           else{
                              System.out.println("couldn't add");
                              jfk.dispose();
                              JFrame warning = new JFrame("Info");
                              warning.setIconImage(ii.getImage());
                              warning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              warning.setVisible(true);
                              warning.setLocationRelativeTo(null);
                              JLabel label = new JLabel("Device couldn't edited.");
                              warning.setSize(200, 100);
                              JButton ok = new JButton("OK!");
                              ok.setSize(50,100);
                              ok.addActionListener(new ActionListener(){
                              @Override
                              public void actionPerformed(ActionEvent ue){
                                   
                                   warning.dispose();
                                   jtf1.setText("");
                                   jtf2.setText("");
                                   jtf3.setText("");
                                   jtf4.setText("VFL-");
                                   jtf5.setSelectedIndex(0);
                                   jtf6.setText("");
                                   jtf7.setText("");
                                   jtf8.setText("");
                                   jtf9.setText("");
                                   jtf10.setText("");
                                   jtf11.setText("");
                                   jtf12.setText("");
                                   jtf13.setSelectedIndex(0);
                                   jtf14.setText("");
                                   jtf15.setText("");
                                   jtf16.setSelectedIndex(0);
                                   arama.setVisible(true);
                                 }
                            });
                            JPanel inP = new JPanel();
                            inP.add(label);
                            inP.add(ok);
                            warning.add(inP);
                           
                           }
                        }catch(IOException eg){
                           eg.getStackTrace();
                           System.out.println("An error accrued!");
                        }
                       
                   }
               });
               JButton insideBackk = new JButton("Geri / İptal Et");
               insideBackk.addActionListener(new ActionListener(){
                   @Override
                   public void actionPerformed(ActionEvent ze){
                       jfk.dispose();
                       
                       goster.setVisible(true);
                       
                       
                   }
               });
               olk.add(insideBackk);
               olk.add(kaydet);
               olk.setLayout(gl);
               jfk.add(olk);
                            }
                            
                            }catch(IOException ftt){
                                System.out.println("No Entry");
                            }
                            
                        }
                        
                    }
              
               
           }
               });
               JButton insideDelete =  new JButton("Sil");
               insideDelete.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent ozmozz){
                       String ap = list5.getSelectedValue().substring(0, 7);
               String ap22 = list5.getSelectedValue();
               
               JPanel haha = new JPanel();
               goster.getContentPane().removeAll();
               goster.getContentPane().revalidate();
               goster.getContentPane().repaint();
               
               list5.removeAll();
               model5.clear();
               list6.removeAll();
               model6.clear();
               list7.removeAll();
               model7.clear();
               list8.removeAll();
               model8.clear();
                        
                        
                        
                        
                        
                        File ktp = new File(konum+"\\Bilgisayar\\" + ap + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx = new File(ktp.getAbsolutePath());
                        azx.delete();
                        
                        File ktp2 = new File(konum+"\\Switch\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx2 = new File(ktp2.getAbsolutePath());
                        azx2.delete();
                        
                        File ktp3 = new File(konum+"\\Kamera\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx3 = new File(ktp3.getAbsolutePath());
                        azx3.delete();
                        
                        File ktp4 = new File(konum+"\\Printer\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx4 = new File(ktp4.getAbsolutePath());
                        azx4.delete();
                        
                        File ktp5 = new File(konum+"\\Other\\" + ap22 + ".txt");
                            System.gc();
                            
                            System.out.println(ktp.getAbsolutePath());
                            File azx5 = new File(ktp5.getAbsolutePath());
                        azx5.delete();
                        
                        
                arama.setVisible(false);
                
                File yazdir = new File(konum+"\\Printer");
               String[] yazar = yazdir.list();
               
                   for (int y = 0; y < yazar.length; y++) {
                       File htpp = new File(konum+"\\Printer\\" + yazar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String[] azgar = new String[10];               
                            azgar[0] = line1;
                            azgar[1] = line2;
                            azgar[2] = line3;
                            azgar[3] = line4;
                            azgar[4] = line5;
                            azgar[5] = line6;
                            azgar[6] = line7;
                            azgar[7] = line8;
                            azgar[8] = line9;
                            azgar[9] = line10;
                            for(int o = 0; o<10; o++){
                               if(azgar[o].contains(iyi.getText())){
                                  model5.addElement(line4);
                                  model6.addElement(line1);
                                  model7.addElement(line3);
                                  model8.addElement(line9);
                               }
                            }
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                File kamdir = new File(konum+"\\Kamera");
                String[] kamar = kamdir.list();
                
                   for (int y = 0; y < kamar.length; y++) {
                       File htpp = new File(konum+"\\Kamera\\" + kamar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                                
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String[] azgar = new String[10];               
                            azgar[0] = line1;
                            azgar[1] = line2;
                            azgar[2] = line3;
                            azgar[3] = line4;
                            azgar[4] = line5;
                            azgar[5] = line6;
                            azgar[6] = line7;
                            azgar[7] = line8;
                            azgar[8] = line9;
                            azgar[9] = line10;
                            for(int o = 0; o<10; o++){
                               if(azgar[o].contains(iyi.getText())){
                                  model5.addElement(line4);
                                  model6.addElement(line1);
                                  model7.addElement(line3);
                                  model8.addElement(line9);
                               }
                            }
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File swidir = new File(konum+"\\Switch");
                   String[] swiar = swidir.list();
                
                   for (int y = 0; y < swiar.length; y++) {
                       File htpp = new File(konum+"\\Switch\\" + swiar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String[] azgar = new String[10];               
                            azgar[0] = line1;
                            azgar[1] = line2;
                            azgar[2] = line3;
                            azgar[3] = line4;
                            azgar[4] = line5;
                            azgar[5] = line6;
                            azgar[6] = line7;
                            azgar[7] = line8;
                            azgar[8] = line9;
                            azgar[9] = line10;
                            for(int o = 0; o<10; o++){
                               if(azgar[o].contains(iyi.getText())){
                                  model5.addElement(line4);
                                  model6.addElement(line1);
                                  model7.addElement(line3);
                                  model8.addElement(line9);
                               }
                            }
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
                   
                   File digdir = new File(konum+"\\Other");
                   String[] digar = digdir.list();
                
                   for (int y = 0; y < digar.length; y++) {
                       File htpp = new File(konum+"\\Other\\" + digar[y]);
                        if(htpp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htpp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String[] azgar = new String[11];               
                            azgar[0] = line1;
                            azgar[1] = line2;
                            azgar[2] = line3;
                            azgar[3] = line4;
                            azgar[4] = line5;
                            azgar[5] = line6;
                            azgar[6] = line7;
                            azgar[7] = line8;
                            azgar[8] = line9;
                            azgar[9] = line10;
                            azgar[10] = line11;
                            for(int o = 0; o<11; o++){
                               if(azgar[o].contains(iyi.getText())){
                                  model5.addElement(line4);
                                  model6.addElement(line1);
                                  model7.addElement(line3);
                                  model8.addElement(line9);
                               }
                            }
                            }catch(IOException grrr){
                                
                            }
                        }
                   }
               
               
                for (int i = 1; i < 1000; i++) {
                        int t  = 0;
                        
                        String htr = "";
                        if(i>0 && i<10){
                             htr = "00"+i;
                        }
                        if(i>=10 && i<100){
                             htr = "0"+i;
                        }
                        if(i>=100){
                             htr = Integer.toString(i);
                        }
                        String aga = "VFL-"+htr;
                        File htp = new File(konum+"\\Bilgisayar\\" + aga + ".txt");
                        if(htp.exists()){
                            
                            
                            try{
                            FileReader frr = new FileReader(htp);
                            BufferedReader bff = new BufferedReader(frr);
                            String line1 = bff.readLine();
                            String line2 = bff.readLine();
                            String line3 = bff.readLine();
                            String line4 = bff.readLine();
                            String line5 = bff.readLine();
                            String line6 = bff.readLine();
                            String line7 = bff.readLine();
                            String line8 = bff.readLine();
                            String line9 = bff.readLine();
                            String line10 = bff.readLine();
                            String line11 = bff.readLine();
                            String line12 = bff.readLine();
                            String line13 = bff.readLine();
                            String line14 = bff.readLine();
                            String line15 = bff.readLine();
                            String line16 = bff.readLine();
                            String line17 = bff.readLine();
                            String line18 = bff.readLine();
                            String lineline = line4 + "                                    " + line1 + "                                                   " + line3 + "                                                " + line6+"                           ";
                            /*JLabel fg = new JLabel(lineline);
                            list.add(fg);*/
                            String[] azgar = new String[18];               
                            azgar[0] = line1;
                            azgar[1] = line2;
                            azgar[2] = line3;
                            azgar[3] = line4;
                            azgar[4] = line5;
                            azgar[5] = line6;
                            azgar[6] = line7;
                            azgar[7] = line8;
                            azgar[8] = line9;
                            azgar[9] = line10;
                            azgar[10] = line11;
                            azgar[11] = line12;
                            azgar[12] = line13;
                            azgar[13] = line14;
                            azgar[14] = line15;
                            azgar[15] = line16;
                            azgar[16] = line17;
                            azgar[17] = line18;
                            
                            for(int o = 0; o<18; o++){
                               if(azgar[o].contains(iyi.getText())){
                                  model5.addElement(line4);
                                  model6.addElement(line1);
                                  model7.addElement(line3);
                                  model8.addElement(line6);
                               }
                            }
                                
                            
                            }catch(IOException ftt){
                                System.out.println("NO Entry");
                            }
                            
                        }
                    }
                goster.setVisible(true);
                //haha.add(list);
                JPanel plk = new JPanel();
                
                plk.add(insideEdit);
                plk.add(insideDelete);
                plk.add(gepger);
                JPanel uytu = new JPanel();
                uytu.add(list5);
                uytu.add(list6);
                uytu.add(list7);
                uytu.add(list8);
                uytu.setLayout(dort);
                JScrollPane hatat = new JScrollPane(uytu);
                JPanel ukun = new JPanel();
                ukun.add(basliklar,BorderLayout.NORTH);
                ukun.add(hatat,BorderLayout.CENTER);
                JPanel hgf = new JPanel();
                hgf.add(ukun);
                hgf.add(plk);
                hgf.setLayout(essah);
                goster.add(hgf);
                   }
               });          
               JPanel adf = new JPanel();
               goster.setSize(1300,720);
               goster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               goster.setLocationRelativeTo(null);
               GridLayout poh = new GridLayout();
               poh.setColumns(2);
               poh.setRows(1);
               GridLayout doka =new GridLayout();
               doka.setColumns(4);
               doka.setRows(1);
               jpnl9.add(list5);
               jpnl9.add(list6);
               jpnl9.add(list7);
               jpnl9.add(list8);
               jpnl9.setLayout(doka);
               adf.add(insideEdit);
               adf.add(insideDelete);
               adf.add(gepger);
               JScrollPane lipa = new JScrollPane(jpnl9);
               
               
               JPanel sonn  = new JPanel();
               sonn.add(basliklar,BorderLayout.NORTH);
               sonn.add(lipa,BorderLayout.CENTER);
               
               JPanel soson = new JPanel();
               soson.add(sonn);
               soson.add(adf);
               soson.setLayout(poh);
               //oll.add(insideList);
               //jpnl9.add(oll);
               //jpnl.setLayout(poh);
               
               goster.add(soson);
               
               goster.setExtendedState(JFrame.MAXIMIZED_BOTH);
               goster.setVisible(true);
           }
       });
       
        
        arama.add(agh);
        arama.add(aceb2);
        arama.setLayout(essah);
       
    }
    
     
}
               
