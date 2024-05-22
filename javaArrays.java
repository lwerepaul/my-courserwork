
package vu.evening;

public class javaArrays {
    public static void main(String [] args){
    //ARRAYS IN JAVA
    
   int [] storedEls={18,36,54,72};
   int sum=0;
   for(int i=0;i<storedEls.length;i++){
       System.out.println(storedEls[i] + "\n");
       sum +=storedEls[i];
      
   }
     System.out.print( "sum of Array Elements is :" + sum);
    }
}
