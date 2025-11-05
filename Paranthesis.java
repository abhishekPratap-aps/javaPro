import  java.util.Stack;
class MyNewStack{
    public void doValidate(){
        String s="[{()}]";
        int flag=0;
        Stack st=new Stack<>();
        for (int i=0;i<=s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(' ){
                st.push(ch);
            }
            else{
                if(!st.empty()){
                    char symbol=(char)st.peek();
                    if(ch==')'){
                        if(symbol !=')'){
                        flag=1;
                        break;
                        }
                    }
                }
            }
        }
        System.out.println(st);

    }
}


public class Paranthesis {
    public static void main(String[] args){
        MyNewStack p=new MyNewStack();
        p.doValidate();

    }
    
}
