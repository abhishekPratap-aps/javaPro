import java.util.*;
class facto{
    public void Factorial(int no,int fact){
        if(no==0){
            System.out.println(fact);
            return;
        }
        fact=fact*no;
        // System.out.println(fact);
        Factorial(no-1,fact);
    }
}

public class factorialByRecursion {
    public static void main(String[] args) {
        facto ft=new facto();
        ft.Factorial(6,1);
    }
    
}
