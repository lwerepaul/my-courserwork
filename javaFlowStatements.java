
package vu.evening;

//SCANNER
import java.util.Scanner;
public class javaFlowStatements {
    //CHECKING VOTERS ELIGIBILITY
    
    Scanner store_userInput=new Scanner(System.in);
    String firstName;
    String lastName;
    static int  age;
    int voterID;
    
    static {
        age=18;
        System.out.println("The Eligible voter should be " + age + " years old and above" + "\n");
       }
    
    
    javaFlowStatements(String Fname,String Lname,int vID,int age){
    this.firstName=Fname;
    this.lastName=Lname;
    this.voterID=vID;
    
    }
    void runCode(){
    System.out.println(
    "Voter Id Number: " + this.voterID + " Surname: " + this.firstName +
     " Givenname: " + this.lastName + " Age :" + age  + "\n"
       
    );
    
     if(age==18){
        System.out.println("Yes its true your variable contains a value of " + age);
    }
    else{System.out.println("The condition is not met " + age);}
    }
    
    //CHECKING IF ELSE STATEMENT
    
    void if_else(){
    if(age==18){
        System.out.println("Yes its true your variable contains a value of " + age);
    }
    else{System.out.println("Yes its true your variable contains a value of " + age);}
    }
    
    public static void main(String [] args){
        javaFlowStatements voter_ID_num=new javaFlowStatements("Lwere","Victor",1,age);
        voter_ID_num.runCode();
       
        
    }
}
