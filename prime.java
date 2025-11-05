 import java.util.Stack;
class Sack{
    int count=0;
    int add=0;
    int no;
    public void Prime(Stack st){
        while(st.empty()){
            return;
        }
        for(int i=1;i<no-1;i++){
            int top=(int)st.peek();
            if(top%i==0){
                count=count+1;
            }
        }
        if(count==2){


        }

    }
    public void AddOfStack(){

        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(60);
        st.push(80);
        int no=st.length();
        System.out.println(st);
        Prime(st);
        System.out.println("workdone");
        System.out.println("prime number"+prime);
        
        System.out.println(st);
    }
}


public class prime {
    public static void main(String[] args) {
        Sack p=new Sack();
        p.AddOfStack();
    }

    
}
