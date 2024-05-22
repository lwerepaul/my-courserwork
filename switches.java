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
public class switches {
    
    public static void main(String [] args){
    
    Scanner dataCapture=new Scanner(System.in);
     int wkDays;
     System.out.println("Enter day number e.g 1 to have the day revealed: ");
     wkDays=dataCapture.nextInt();
     switch(wkDays){
         case 1 :
        System.out.println("The number : " + wkDays + " entered is eqvivalent to Sunday");
        break;
        case 2 :
        System.out.println("The number : " + wkDays + " entered is eqvivalent to Monday");
        break;
        case 3 :
        System.out.println("The number : " + wkDays + " entered is eqvivalent to Tuesday");
        break;
        case 4 :
        System.out.println("The number : " + wkDays + " entered is eqvivalent to Wednesday");
        break;
        case 5 :
        System.out.println("The number : " + wkDays + " entered is eqvivalent to Thursday");
        break;
        case 6 :
        System.out.println("The number : " + wkDays + " entered is eqvivalent to Friday");
        break;
        case 7 :
        System.out.println("The number : " + wkDays + " entered is eqvivalent to Saturday");
        break;
        default:
        System.out.println("The number : " + wkDays + " entered is invalid to map a day!");
        
     
     }
    }
    
}
