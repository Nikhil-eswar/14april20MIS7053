package Assignment3;
import java.util.*;
import java.util.*;
class Node {
    protected int data;
    protected Node next, prev;
    public Node() {
        next = null;
        prev = null;
        data = 0;
    }
    public Node(int d, Node n, Node p) {
        data = d;
        next = n;
        prev = p;
    }
    public void setLinkNext(Node n)
    {
        next = n;
    }
    public void setLinkPrev(Node p) {
        prev = p;
    }  
    public Node getLinkNext() {
        return next;
    }
    public Node getLinkPrev() {
        return prev;
    }
    public void setData(int d) {
        data = d;
    }
    public int getData() {
        return data;
    }
}
class linkedList {
    protected Node start;
    protected Node end ;
    public int size ;
    public void linkedList() {
        start = null;
        end = null;
        size = 0;
    }
    public int getSize() {
return size;
}
    public void insertAtStart(int val) {
    Node nptr = new Node(val, null, null);        
        if(start == null) {
            start = nptr;
            end = start;
        } else {
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
    }
    public void insertAtMiddle(int val , int pos) {
    Node nptr = new Node(val, null, null);        
         Node ptr = start;
         for (int i = 1; i < size; i++) {
             if (i == pos) {
                 Node tmp = ptr.getLinkNext();
                 ptr.setLinkNext(nptr);
                 nptr.setLinkPrev(ptr);
                 nptr.setLinkNext(tmp);
                 tmp.setLinkPrev(nptr);
             }
             ptr = ptr.getLinkNext();            
         }
         size++ ;
    }
    public void insertAtEnd(int val) {
    Node nptr = new Node(val, null, null);        
        if(start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
    }
    public void deleteAtStart(int pos) {        
    if (pos == 1) {
             if (size == 1) {
                 start = null;
                 end = null;
                 size = 0;
                 return;
             }
             start = start.getLinkNext();
             start.setLinkPrev(null);
             size--;
             return ;
         }
    }
    public void deleteAtEnd(int pos) {
    if (pos == size) {
             end = end.getLinkPrev();
             end.setLinkNext(null);
             size-- ;
         }
    }
    public void deleteAtMiddle(int pos) {  
    Node ptr = start.getLinkNext();
        for (int i = 2; i <size; i++)
        {
            if (i == pos)
            {
                Node p = ptr.getLinkPrev();
                Node n = ptr.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getLinkNext();
        }        
    }
    public void display() {
    System.out.print("\nDoubly Linked List = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null) {
            System.out.println(start.getData()+" " );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ " ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null) {
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }

}
public class Ques2 {    
    public static void main(String[] args) {            
        Scanner scan = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("ImplementDouble Linked List ADT");
        char ch;
       boolean z =true;
do {
            System.out.println("1.Create a node");
            System.out.println("2.Insert node at the beginining");
            System.out.println("3.Insert node at the middle");
            System.out.println("4.Insert node at the end");
            System.out.println("5.Delete at begin");
            System.out.println("6.Delete at End");
            System.out.println("7.Delete at middle");    
            System.out.println("8.Display");
            System.out.println("9.Exit");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();
            switch (choice) {
            case 1 :
            System.out.println("Enter element to insert");
                list.insertAtStart( scan.nextInt() );                    
                break;
            case 2 :
                System.out.println("Enter element to insert");
                list.insertAtStart( scan.nextInt() );                    
                break;  
            case 3 :
                System.out.println("Enter position to insert");
                int pos = scan.nextInt() ;
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                if(pos==1)
                list.insertAtStart(num);
                if (pos < 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
               
                else
                    list.insertAtMiddle(num, pos);
                break;      
            case 4 :
                System.out.println("Enter element to insert");
                list.insertAtEnd( scan.nextInt() );                    
                break;                                                                  
            case 5 :
                int po =1;
                    list.deleteAtStart(po);
                break;
            case 6 :
                int P=2;
                    list.deleteAtEnd(P);
                break;
            case 7 :
                System.out.println("Enter position to delete");
                int p = scan.nextInt() ;
                if(p==1)
                list.deleteAtMiddle(2);
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtMiddle(p);
                break;
            case 8 :
            list.display();
            case 9 :
            z=false;
                break;
             default :
                System.out.println("Wrong Entry \n ");
                break;  
            }
            if(z==true) {
            list.display();  
            }
        } while (z==true);              
    }
}




