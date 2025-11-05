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
    public int dfacto(int no){
        if(no==1){
            return 1;
        }
        return no*dfacto(no-1);

    }
}

public class skdhbsdv {
    public static void main(String[] args) {
        facto ft=new facto();
        ft.Factorial(6,1);
        int res=ft.dfacto(6);
        System.out.println(res);
    }
    
}
