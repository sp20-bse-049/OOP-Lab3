
package lab4;


public class Marks {
    int m1 , m2 , m3 ,s;
    public Marks(){
        m1 = 50;
        m2 = 89;
        m3 = 76;
    }
    public Marks(int x , int y , int z){
        m1 = x;
        m2 = y;
        m3 = z;
    }
    public int sum(){
       
        s = m1 +m2+m3;
        return(s);
    }
    public void display(){
        System.out.println(s);
    }
}
