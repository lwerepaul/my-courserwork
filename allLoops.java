
package vu.evening;

public class allLoops {
    int y=10;
     static void fLoop(){
    
        for(int x=10;x <= 20; x++){
            System.out.println(x + "\n" +"\n");
            System.out.println("\n");
        }
     
    }
     
    
    public static void main (String [] args){
   fLoop();
   int y=14;
   
    System.out.println("Below is a do while loop");
   do{
      if(y%2!=0)
       System.out.println(y +"\n");
       y++;
   }while(y<29);
   
    System.out.println("Below is a while loop");
   int w=40;
    while(w<=53){
    System.out.print(w + ",");
    w++;
    }
    System.out.println("\n");
   //FOR EACH LOOP USE CASE
   System.out.println("Below is a FOR loop Use case");
   double[] myArrayTest={22.1,23.2,24.3,25.4,26.5};
  for(double Ans:myArrayTest){
   System.out.println(Ans);
   
   }
  
 
    }
}
