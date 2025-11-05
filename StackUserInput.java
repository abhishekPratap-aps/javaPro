// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;
import java.util.*;//.Stack

class Sttack {

   public void Show() {
      Stack s = new Stack<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size the Stack");
      int size = sc.nextInt();

      for(int i = 0; i < size; i++) {
         System.out.println("push value in stack");
         int value = sc.nextInt();
         s.push(value);
      }

      System.out.println(s);
   }
}

public class StackUserInput {
    public static void main(String[] args) {
        Sttack st=new Sttack();
        st.Show();
        
    }
    
}
