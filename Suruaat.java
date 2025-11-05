import java.util.Stack;

class Mystack{
    public void show(){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(40);
        s.push(90);
        int top=(int)s.peek();//that is method for letest value exist
        System.out.println(top);
        System.out.println(s);
        if(s.empty()){//empty is a method 
            System.out.println("Stsck is empty");
        }
        else{
            System.out.println("there is some element in stack");

        }
        s.pop();//pop the newest vlue
        System.out.println(s);

        int index = s.search(10);
        System.out.println(index);
        int count=0;
        while(s.empty()){
            count++;
            s.pop();
        }
        System.err.println(count);
        System.out.println("for not empty");
        while(!s.empty()){
            count++;
            s.pop();
        }
        System.err.println(count);   
    }
}
public class Suruaat{
    public static void main(String [] args){
        Mystack m =new Mystack();
        m.show();

    }

}
