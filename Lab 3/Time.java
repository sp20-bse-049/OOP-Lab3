
package lab4;


public class Time {
   int hours , min , sec , ho , mi , se ;
   public Time(){
       hours = 0;
       min = 0;
       sec = 0;
   }
   public Time(int h , int m , int s){
        ho = h;
        mi = m;
        se = s;
       
          
       
   }
   public void chekTime(int a , int b , int c){
       int x , y ,z;
       x =a;
       y = b;
       z = c;
       if(x == ho && y == mi && z == se){
           System.out.println("time is equal");
        }
       else
           System.out.println("time is not egual");
   }
   public void display(){
       System.out.println("hours = " + ho + "\nminutes = " + mi + "\nseconds = "+ se);
       
   }
}
