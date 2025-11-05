//wriete a program to impliment the queue using stack 

import java.util.*;
class newQueue{
    Stack st1=new Stack<>();
    Stack st2=new Stack<>();
    public void enQueue(int no){ //here we add element in queue
        st1.push(no);
      }
    public void   DeQueue(){
        if(st2.isEmpty()){
            if(st1.isEmpty()){
                System.out.println("queue is empty");
            }
            else{
                //first
                while(!st1.isEmpty()){

                    int top =(int).st1.peek();
                    st2.push(top);
                    st1.pop(); 
                }
                st2.pop();
            }
        }
        else{
            s2.peek();
        }
       // Treversing......................................................................................................

        public void Treverce(){
            if(st1.isEmpty() && st2.isEmpty()){//case 1
                System.out.println("queue is empty");
            }
            else{
                if(st2.isEmpty()){//case 2 :it means user only inserted elemetnts
                    for(int i=0;i<st1.size();i++){
                        System.out.println(st1.get(i)+"\t");                    
                    }
                }
                else{//case 3
                    for(int i=st2.size()-1;i>=0;i--1){
                        System.out.println(st2.get(i)+"\t");
                    }
                }
                if(!st1.isEmpty()){//case 4
                    for(int i=0;i<st1.size();i++){
                        System.out.println(st1.get(i));

                    }
                }
            }
        }
    } 
}
1
public class QueueUsingStack {
    public static void main(String[] args){
        newQueue nq=new newQueue();
        np.Treverce();
        np.DeQueue();
        nq.enQueue(23); 
        nq.enQueue(34); 
        nq.enQueue(56); 
        nq.enQueue(12); 
        nq.enQueue(346); 
        np.Treverce();
        np.DeQueue();
        System.out.println("    ");
        np.treverce();
        np.enQueue(25);
        np.enQueue(35);
        System.out.println("       ");
        np.treverce();

    }
    
}
