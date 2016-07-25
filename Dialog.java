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
        
          System.out.println("Введите своё имя");
          Scanner name = new Scanner(System.in);
          String n = name.nextLine();
          
          System.out.println("Привет"+" "+n);
          
         
      
          String[] ask ;
        ask = new String[14];
       /* 
        */
      ask[0] = "Вдохновляющие идеи; начиная, теории.";
      ask[1] = "Интересные, талантливые люди; общение.";
      ask[2] = "Эмоциональное предчувствие; поэтичность."; 
      ask[3] = "Кто хочет - тот добьётся; логика борьбы.";
      ask[4] ="Энергия влияет на людей и на их чувства.";
      ask [5] ="Условия жизни; умелые руки; независимость.";
      ask [6] ="Обучение природа; тёплое общение и эмоции...";
      
      ask [7] ="Неприятие зла, воля к моральной чистоте...";
      ask [8] ="Я всё делаю быстро, эффективно и с пользой";
      ask [9] ="Добросовестность дел; надежность, качество.";
      ask [10] ="Логика системы; волевое внедрение.";
      ask [11] ="Радость, эмоции, праздник; хорошее настроение.";
      ask [12] ="Драмматизм, трагедия; сопереживание.";
       ask[13] ="Вера, надежда, любовь; преданность близким.";
       
       int i = 0;
        int g;
                 while(ask.length>=i){
                   
                    
                    System.out.println(ask[i]);
                    i++;
                        
                    g = new Scanner(System.in).nextInt();
                    if (g!=1) continue;
                    
                    if (g==1 && i%2 == 0){
                       t++;
                    }
                    
                     else if (g==1 && i%2==1){
                          d++;
                     
                     }
                 }
                      
                      System.out.println("Переменная t равна"+t+" "+"Переменная d равна"+d);     
                       
               
             

                     
                 if(t>d)
         System.out.print("переменная t равна" + t);
          
      
              else
          System.out.print("Переменная d равна"+d);
                 JOptionPane.showMessageDialog(null,".!.");
        
         
      }
    
  }
    
    
