import java.util.Collections;
import java.util.Stack;
import java.util.Vector;


class newsta{
    public void Cheak(){
        Vector V = new Vector(); 
        Stack st=new Stack();
        int[] ar ={12,11,19,46,7,42,53,40};
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i] +"\t");
        }
        st.push(-1);
        for (int i =ar.length; i<0; i++){
            while((int)st.peek() >ar[i]){
                st.pop();
            }
            V.add((int)st.peek());
            st.push(ar[i]);
        }
        Collections.reverse(V);
        System.out.println(' ');
        System.out.println(V);

    }
}



public class NextSmallest  {
    public static void main(String[] args) {
    newsta ne=new newsta();
    ne.Cheak();    
        
        
    }
}
    
