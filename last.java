

class TwoStackOneArray{
    int[] ar = new int[10];
    int top1=-1;
    int top2= ar.length;
    public void push1(int no){// it is for stack 1
        if (top2==top1+1){
            System.out.println("Stack is full");

        }
        else{
            top1++;
            ar[top1]=no;
        }
    }
    public void push2(int no){// it is for stack 2
        if (top2==top1+1){
            System.out.println("Stack is full");

        }
        else{
            top2--;
            ar[top2]=no;
        }
    }
    public void pop1(){// it is for sstack 2
        if(top1==-1){
            System.out.println("Stack is empty");
        }else{
            int element = ar[top1];
            System.out.println("Deleted item" +element);
            top1--;
        }
    }
    public void pop2(){
        if(top2==ar.length){
            System.out.println("Stack is empty");
        }else{
            int element = ar[top2];
            System.out.println("Deleted item" +element);
            top2++;
        }
    }
    public void Traverse1(){
        if(top1==-1){
            System.out.println("Stack 1 is empty");
        }else{
            System.out.println("stack 1 element");
            for(int i=0; i<=top1; i++){
                System.out.println(ar[i]);
            }
        }
    }
    public void Traverse2(){
        if(top2==ar.length){
            System.out.println("Stack 2 is empty");
        }else{
            System.out.println("stack 1 element");
            for(int i=ar.length-1; i>=top2; i--){
                System.out.println(ar[i]);
            }
        }
    }
    
}

public class last {
    public static void main(String[] args){
        TwoStackOneArray tw= new TwoStackOneArray();
        tw.Traverse1();
        tw.Traverse2();
        tw.push1(34);
        tw.push1(234);
        tw.push1(45);
        tw.push1(24);
        tw.push2(67);
        tw.push2(78);
        tw.push2(787);
        tw.push2(89);
        tw.push1(845);
        tw.push2(34);
        tw.pop1();
        tw.pop2();


    }
    
}
