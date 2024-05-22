/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.evening;

/**
 *
 * @author IT
 */
public class logical {
    public static void main(String [] args){
    //Logical operators
    
    boolean above18 = true;
    boolean canClub=true;
    boolean checkAND=above18 && canClub;
    boolean checkOR=above18 || canClub;
    boolean checkNOT=!above18;
    
    System.out.println(checkAND);
    System.out.println(checkOR);
    System.out.println(checkNOT);
    
    }
}
