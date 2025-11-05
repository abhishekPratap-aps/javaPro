public class linklList{
    Node head;
    class Node{  // in link list node reprsent as a clss 
        int data;
        Node next;

        Node(int data) {   //cunstructure for requred opretions
            this.data=data;
            this.next=null;
        }
        
    }
//FUNCTION FOE ADD NODE FRONT OF LINK LIST
    public void addFIRST(int data){  //create the function for add data and new node in link list
   Node newNode=new Node(data);    // create the new node
   if(head==null){    //if  link list is empty then head become a new node
    head=newNode;
    return;
   }
   newNode.next=head;  // if  data prsent in link list then new node add in head or newnode next point the next node
   head=newNode;
}

// FUNCTION FOR ADD NEW NODE END OF LINK LIST
public void addlast(int data){
     Node newNode=new Node(data);    // create the new node
   if(head==null){    //if  link list is empty then head become a new node
    head=newNode;
    return;
   }
   Node currNod=head;//create a node to assigne the value of the head
   while(currNod.next!=null){ //update the  current node ultil trevle the update node when the current node next is null
    currNod=currNod.next; //become the crrent node  is current next
   }
   //if achive the null next then assigne the  last node to the next node
   currNod.next=newNode;
}

// PRINT THE DATA OF THE LINK LIST CREAT THE FUNCTION
public  void printlist(){
    if(head==null){
        System.out.println("list is null");
        return;
    }
     Node currNod=head;
        while(currNod!=null){
            System.out .print(currNod.data+" -> ");
            currNod=currNod.next; 
        }
     System.out .println("NULL");  
}
    public static void main(String argm[]){
    linklList list=new linklList(); // create the object of his class in link list 

    list.addFIRST(1);  // add data in  to the list
    list.addFIRST(2);
    list.addFIRST(3);
    list.addFIRST(4);
 list.printlist();
 list.addlast(90);
 list.printlist();
    }
}