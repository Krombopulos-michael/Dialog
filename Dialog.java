/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import java.util.Scanner;
import javax.swing.JOptionPane;




public class Dialog {

  
    public static void main(String[] args)  {
        
        int t =0 ,d=0 ;
        int a = 7, b = 7;
          System.out.println("Введите своё имя");
          Scanner name = new Scanner(System.in);
          String n = name.nextLine();
          
          System.out.println("Привет"+" "+n);
          
         
      
          String[][] ask ;
        ask = new String[2][7];
    
       /* 
        */
      ask[0][0] = "Вдохновляющие идеи; начиная, теории.";
      ask[0][1] = "Интересные, талантливые люди; общение.";
      ask[0][2] = "Эмоциональное предчувствие; поэтичность."; 
      ask[0][3] = "Кто хочет - тот добьётся; логика борьбы.";
      ask[0][4] ="Энергия влияет на людей и на их чувства.";
      ask [0][5] ="Условия жизни; умелые руки; независимость.";
      ask [0][6]="Обучение природа; тёплое общение и эмоции...";
      
      ask [1][0] ="Неприятие зла, воля к моральной чистоте...";
      ask [1][1] ="Я всё делаю быстро, эффективно и с пользой";
      ask [1][2] ="Добросовестность дел; надежность, качество.";
      ask [1][3] ="Логика системы; волевое внедрение.";
      ask [1][4] ="Радость, эмоции, праздник; хорошее настроение.";
      ask [1][5] ="Драмматизм, трагедия; сопереживание.";
       ask[1][6] ="Вера, надежда, любовь; преданность близким.";
       
     
       int i = 0,r = 0;
        int g;
                 while(ask[0].length>=i){
                   
                    
                    System.out.println(ask[0][i]);
                    i++;
                       
                    g = new Scanner(System.in).nextInt();
                   
                    
                    if (g==1)
                       t++;
              }
                   i = 0;   
                      while(ask[1].length>=i){
                          System.out.println(ask[1][i]);
                          i++;
                          g = new Scanner(System.in).nextInt();
                          
                          if(g==1)
                              d++;
                          
                      }
                 
                 System.out.println("Переменная t равна"+t+" "+"Переменная d равна"+d);     
                       
               
             

                     
                 if(t>d)
         System.out.print("переменная t равна" + t);
          
      
              else
          System.out.print("Переменная d равна"+d);
                 JOptionPane.showMessageDialog(null,".!.");
        
         
      }
    
  }