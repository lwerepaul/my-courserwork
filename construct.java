/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.evening;

/**
 *
 * @author IT
 */
public class construct {
    String fruit;
    double price;
    
    public construct(String fruitName,double priceTag){
    this.fruit = fruitName;
    this.price = priceTag;
    
    }
    public static void main(String [] args){
     construct FRUIT=new construct("Mango",800);
     
     System.out.println("You have bought " + FRUIT.fruit + " -Fruit at a cost of "  + FRUIT.price + " UGX  only ," + " Thank you for supporting us!");
     
    
    }
}
