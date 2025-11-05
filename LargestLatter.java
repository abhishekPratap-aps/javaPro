import java.util.Stack;

class Newstack{
    public void Largest(){
        String s="king of forest is lion";
        String str="";
        Stack st=new Stack();
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            st.push(s.charAt(i));
        }
        System.out.println(st);
        int count=65;    
        if((int)st.peek()>=count){
            count=count;

        }
        st.pop();
        System.out.println((char)count);
    }
  
}


public class LargestLatter {
    public static void main(String[] str){
    Newstack k=new Newstack();
    k.Largest();
    
    
}
}