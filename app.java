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
public class app {
    public static void main (String [] args){
    Scanner save=new Scanner(System.in);
    System.out.println("Enter the name of the product");
    String product=save.nextLine();
    System.out.println("Enter the price of the product");
    double price=save.nextDouble(); 
    System.out.println("Enter the qantity required");
    int qty=save.nextInt();
    double amount=price*qty;
    
    
    
    System.out.println("The client bought " + qty + " pcs of " +product +" at total price of " + amount);
    
    }
    
}
