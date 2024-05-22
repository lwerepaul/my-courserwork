
package vu.evening;

public class cons_Course {
   //Fields
    String name;
    int duration;
    String faculty;
    
    //Construct
    cons_Course(String name,int duration,String faculty){
        this.name=name;
        this.duration=duration;
        this.faculty=faculty;
    }
    public void courses(){
    System.out.println("The course selected is:-" + name );
    System.out.println("The course has a duration of :-" + duration + " years");
    System.out.println("The course is under the Dpt of  :-" + faculty );
    }
     public static void main(String [] args){
     
      cons_Course course1=new cons_Course("BIT",3,"FST");
      cons_Course course2=new cons_Course("BCS",3,"FST");
      cons_Course course3=new cons_Course("BAV",4,"FST");
      
       System.out.println("The list of courses doing Java-OOP are  "  );
        System.out.println("1. "  );
      course1.courses();
      System.out.println("2. "  );
      course2.courses();
     System.out.println("3. "  );
      course3.courses();
      
      
         
     
     }
    }
    
   
    
   


