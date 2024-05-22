/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.evening;

import java.util.Scanner; 
/**
 *
 * @author IT
 */
public class gradeBook {
    
    Scanner storeMarks=new Scanner(System.in);
    
    int Geo;
   //ALEVEL GRADING BELOW...
    
    void A_level(){
     if (Geo >=80 && Geo <=100){
     System.out.println("Your score is : " +Geo +"% "+ " You got an  A ");
     }
     else if (Geo >=70 && Geo <=79){
     System.out.println("Your score is : " +Geo +"% "+ " You got a  B ");
     }
      else if (Geo >=50 && Geo <=69){
     System.out.println("Your score is : " +Geo +"% "+ " \n" +
"     if (Geo >=80 && Geo <=100){\n" +
"     System.out.println(\"Your score is : \" +Geo +\"% \"+ \" You got an  A \");\n" +
"     }\n" +
"     else if (Geo >=70 && Geo <=79){You got a  C ");
     }
     else {
     System.out.println("Your score is : " +Geo +"% "+ " Your are below pass mark ");
     }
    }
     
    //O LEVEL GRADING BELOW ....
    
    void O_level(){
     if (Geo >=80 && Geo <=100){
     System.out.println("Your score is : " +Geo +"% "+ " You got a D1  ");
     }
     else if (Geo >=70 && Geo <=79){
     System.out.println("Your score is : " +Geo +"% "+ " You got a  D2 ");
     }
      else if (Geo >=50 && Geo <=69){
     System.out.println("Your score is : " +Geo +"% "+ " You got a  C ");
     }
     else {
     System.out.println("Your score is : " +Geo +"% "+ " Your are below pass mark ");
     }
    }
    public static void main(String [] args){
    gradeBook ALevelGeo=new gradeBook();
    
     ALevelGeo.Geo=44;
    
     gradeBook OLevelGeo=new gradeBook();
     OLevelGeo.Geo=91;
    ALevelGeo.A_level();
    OLevelGeo.O_level();
    
    }
    
}
