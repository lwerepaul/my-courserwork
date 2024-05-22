/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.evening;

/**
 *
 * @author IT
 */

import java.util.Scanner; 
public class learningTUT {
  Scanner storeData=new Scanner(System.in);
  String subject;
  int marks;
  int myAge=58;
  
  public void processALevelData(){
  System.out.println("Enter the Name of A level subject ");
  subject=storeData.nextLine();
  System.out.println("Enter the marks got in A level subject above");
  marks=storeData.nextInt();
  
  if(marks >= 80 && marks<=100){
  System.out.println("You scored "  + marks + "% " +"in "+subject +""+ " , Your grade is  A , " + "Teacher comment: "  + "Excellent");
  }
  else if(marks >= 65 && marks<=79){
System.out.println("You scored "  + marks + "% " +"in "+subject +""+ " , Your grade is  B ," + "Teacher comment: "  + "V.Good");
  }
  
  else if(marks >= 50 && marks<=64){
  System.out.println("You scored "  + marks + "% " +"in "+subject +""+ " , Your grade is  C ," + "Teacher comment: "  + "Good");
  }
  else {
  System.out.println("You scored  " + marks + "% " +" :: "+ " This is below the pass-mark!!");
  }
  }
  
  public void processOLevelData(){
  System.out.println("Enter the Name of O level subject ");
  subject=storeData.nextLine();
  System.out.println("Enter the marks got in O level subject above");
  marks=storeData.nextInt();
  
  if(marks >= 80 && marks<=100){
  System.out.println("You scored "  + marks + "% " +"in "+subject +""+ " , Your grade is  D1 , " + "Teacher comment: "  + "Excellent");
  }
  else if(marks >= 65 && marks<=79){
System.out.println("You scored "  + marks + "% " +"in "+subject +""+ " , Your grade is  D2 ," + "Teacher comment: "  + "V.Good");
  }
  
  else if(marks >= 50 && marks<=64){
  System.out.println("You scored "  + marks + "% " +"in "+subject +""+ " , Your grade is  C ," + "Teacher comment: "  + "Good");
  }
  else {
  System.out.println("You scored  " + marks + "% " +" :: "+ " This is below the pass-mark!!");
  }
  }
  public static void main (String [] args){
  
      learningTUT studentGrade=new learningTUT();
      learningTUT student_Grade=new learningTUT();
      studentGrade.processALevelData();
      student_Grade.processOLevelData();
      
     
  
  }
}
