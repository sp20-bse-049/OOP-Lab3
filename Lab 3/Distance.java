
package lab4;


public class Distance {
    int feet , inch;
    public Distance(){
        feet = 5;
        inch = 6;
    }
    public Distance(int f , int i){
        feet = f;
        inch = i;
    }
    public void display(){
        System.out.println("feet = :" + feet);
        System.out.println("inches = :" + inch);
    }
}
