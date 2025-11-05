import java.util.*;

class PrintStack{
    public void sho(){
        Stack st=new Stack<>();
    st.push(23);
    st.push(46);
    st.push(57);
    st.push(57);
    System.out.println(st);
    //using loop 
    for (int i=0;i<=st.size();i++){
        System.out.println(st.get(i)+"\t");
    }
    //for reverce
    for(int i=st.size()-1;i>=0;i--){
    System.out.println(st.get(i));
    }
    }
}


public class usingQue {
    public static void main(String[] arg){
        PrintStack pt=new PrintStack();
        pt.sho();
    }

    
}

