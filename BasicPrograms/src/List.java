import java.util.Scanner;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head;
    void append (int data)
    {
        Node newNode=new Node(data);
        Node current=head;
        if(head==null){
            head=newNode;
            return;
        }
        else
        {
            while(current.next!=null){
                current=current.next;
            }
        current.next=newNode;
        return;    
        }
    }
public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    
}
public void reverse(){
    Node previousNode=null;
    Node nextNode;
    Node currentNode=head;
    while(currentNode != null)
    {
        
        nextNode=currentNode.next;
        currentNode=previousNode;
        previousNode=currentNode;
        currentNode=nextNode;
    }
    head=previousNode;
   System.out.println(head);
}
}
public class List{
    public static void main(String args[]){
        LinkedList L1=new LinkedList();
        Scanner sc=new Scanner(System.in);
        String ch;
        do{
            System.out.println("Enter the value:");
            int val=sc.nextInt();
            L1.append(val);
            System.out.println("Do you want to add another node? Type Yes/No");
            ch=sc.next();
        }while (ch.equals("Yes")||(ch.equals("yes")));
        System.out.print("The elements in the linked list are: ");
        L1.display();
        L1.reverse();
        System.out.println("\nThe elements in the reversed linked list are :");
        L1.display();
    }
}
