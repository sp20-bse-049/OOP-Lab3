
package lab4;


public class Circle {

   double radius;
   double p;
   public  Circle(){
       radius = 5.0;
       p = 3.14;
   }
   public  Circle(double r , double pi){
       radius = r;
       p = 3.14;
       
   }
   public void CircumFerence(){
       double Circum_f = 2 * p * radius;
       System.out.println("CircumFerence will be : " + Math.round(Circum_f * 100.0) / 100.0);
   }
}
