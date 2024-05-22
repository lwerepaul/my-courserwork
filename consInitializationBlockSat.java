
package vu.evening;

public class consInitializationBlockSat {
     //FIELD OR ATTRIBUTES
    
    private String empName;
    private String jobTitle;
    private double salary;
    static int empID ;
     
    //Initialization Block
    
   
    static 
    {
    empID=5;
    System.out.println("Initial Employee ID:  " + empID );
    }
    
    consInitializationBlockSat(String empName,String jobTitle,double salary){
    this.empName=empName;
    this.jobTitle=jobTitle;
    this.salary=salary;
    
    }
    
     public void runCode(){
     
       
    System.out.println( "Employee Name: " + this.empName + "Employee Job Title: " + this.jobTitle + "\n" + "Employee Salary: " + this.salary + "\n");
    
}
    public static void main(String [] args){
     consInitializationBlock emp1= new consInitializationBlock("Lwere Paul","IT Officer", 130000);
     
     System.out.println("Employee ID:  " + ++empID );
     emp1.runCode();
     
    
    }
}
