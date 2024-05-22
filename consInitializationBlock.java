//CONSTRUCTOR AND INITIALIZATION BLOCK
package vu.evening;


public class consInitializationBlock {
    //FIELD OR ATTRIBUTES
    
    private String empName;
    private String jobTitle;
    private double salary;
     
    //Initialization Block
    {
    empName="Unknown";
    jobTitle="Unknown";
    salary=0;
    System.out.println("Employee Name:  "+empName);
    System.out.println("Employee Job Title:  " + jobTitle);
    System.out.println("Employee salary:  " + salary +"\n");
    }
    
    consInitializationBlock(String empName,String jobTitle,double salary){
    this.empName=empName;
    this.jobTitle=jobTitle;
    this.salary=salary;
    
    }
    
     public void runCode(){
    System.out.println("Employee Name: " + this.empName +   "\n" + "Employee Job Title: " + this.jobTitle + "\n" + "Employee Salary: " + this.salary + "\n");
    
}
    public static void main(String [] args){
     consInitializationBlock emp1= new consInitializationBlock("Lwere Paul","IT Officer", 130000);
     emp1.runCode();
     
    
    }
}
