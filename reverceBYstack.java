import java.util.Stack;

class BYstack{
    public void reverce(){
        String s="India";
        String revStr="";
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            st.push(s.charAt(i));

        }
        System.out.println(st);
        while(!st.empty()){// while(!st.empty()) not rum this
            char c=(char)st.peek();
            revStr=revStr+c;
            st.pop();

        }
        System.out.println(revStr);


    }
}

public class reverceBYstack {
    public static void main(String[] args) {
        BYstack n=new BYstack();
        n.reverce();
            
    }}
    

