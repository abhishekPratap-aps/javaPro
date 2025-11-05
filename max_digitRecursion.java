class max{
    void maxDigit(int no,int max){
        if(no==0){
            System.out.println(max);
            return;
        }
        int d=no%10;
        if(d>max){
            max=d;
        }
        System.out.println(max);
        maxDigit(no/10, max);

    }
}
public class max_digitRecursion {
    public static void main(String[] args){
        max m=new max();
       m.maxDigit(78064, 0); 
       
    }
    
}
