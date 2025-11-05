import java.util.Stack;

class MyStac{
    public void ValidNew(){
        String s="AlphaKbet@_jhgs_sdfLF";
        Stack st=new Stack();//predefine class of stack in util package
        for (int  i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        System.out.println(st);
        System.out.println("  ");
        int count=0;
        int count2=0;
        int atherate=0;
        int underscore=0;
        while(!st.empty()){//run after finishing the stack
            char ch=(char)st.peek();
            if(ch>='A' && ch<='Z'){
                count++;
            }
            if(ch>='a'&&ch<='z'){
                count2++;
            }
            if (ch=='@'){
                atherate++;
            }
            if(ch=='-'){
                underscore++;
            }
            st.pop();

        }
        if(count>=2 && count2>=3 && atherate==1 && underscore>=2){
            System.out.println("String is valid ");
        }
        else{
            System.out.println("string invalid");
        }
     
        
    }
}

public class ValidateName {
    public static void main(String[] args){
        MyStack m=new  MyStack();
        m.ValidNew(); 
        

    }
    
}

