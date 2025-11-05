import java.util.Stack;


class vowel {
 
    public void vowelR(){
        String s="India";
        String revStr="";
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
            st.push(s.charAt(i));

        }
        int count=0;
        System.out.println(st);
        while(!st.empty()){// while(!st.empty()) not rum this
            char c=(char)st.peek();
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;

            }
            st.pop();

        }
        System.out.println(count);
    }
}

public class vowelSTACK {
    public static void main(String[] args) {
        vowel n=new vowel();
        n.vowelR();
        
    }}
    


    

