import java.util.Stack;

class Mystck{
    public void validate(){
        String s="Alphabet";
        Stack st=new Stack();//predefine class of stack in util package
        for (int  i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        System.out.println(st);
        System.out.println("  ");
        int count=0;
        while(!st.empty()){//run after finishing the stack
            char ch=(char)st.peek();
            if(ch>='A' && ch<='Z'){
                count++;
            }
            st.pop();

        }
        if(count<=2){
            System.out.println("string is valid because string has only  two large values ");
            

        }else{
            System.out.println("invalid String because it has most of 3 large valuse in string");
        }
    }
}

public class Valid_Invalide_Strin {
    public static void main(String[] args){
        Mystck m=new  Mystck();
        m.validate();

    }
    
}

