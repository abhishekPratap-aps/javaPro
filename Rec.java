import java.util.Stack ;
class MyStack{
    
    int add=0;
    public void sum(Stack st){
         if(st.empty()){
             return;
         }
         int top =(int)st.peek();
         add=add+top;
         st.pop();
         sum(st);
         st.push(top);
        }
    
    public void AddOfStack(){

        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(60);
        st.push(80);
        System.out.println(st);
        sum(st);
        System.out.println("workdone");
        System.out.println("add="+add);
        
        System.out.println(st);

    }
    
}



public class Rec
{
	public static void main(String[] args) {
		MyStack p = new MyStack();
		p.AddOfStack();
	}
}