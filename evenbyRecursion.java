import java.util.*;
class add{
    public void addDigit(int no,int sum){
        if(no==0){
            System.out.println(sum);
            return;
        }
        int d=no%10;

        if(d%2==0){
            sum=sum+d;
        }
        addDigit(no/10,sum);
        System.out.println(sum);

    }
}

public class evenbyRecursion {
    public static void main(String[] args) {
        add ak=new add();
        ak.addDigit(84321,0);    
    }   
}   
