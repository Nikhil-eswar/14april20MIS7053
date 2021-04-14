package Assignment3;
import java.util.*;
import java.util.*;
class Node {
    protected int data;
    protected Node link;
    public Node() {
        link = null;
        data = 0;
    }  
    public Node(int d,Node n) {
        data = d;
        link = n;
    }  
    public void setLink(Node n) {
        link = n;
    }    
    public void setData(int d) {
        data = d;
    }    
    public Node getLink() {
        return link;
    }
    public int getData() {
        return data;
    }
}
class linkedList {
    protected Node start;
    protected Node end ;
    public int size ;
    public void linkedList(int c) {
if(c==1) {
        start = null;
        end = null;
        size = 0;
    }
    }
    public int getSize() {
return size;
}
    public void insertAtStart(int val) {
        Node nptr = new Node(val, null);    
        size++ ;    
        if(start == null) {
            start = nptr;
            end = start;
        }
        else {
            nptr.setLink(start);
            start = nptr;
        }
    }
    public void insertAtMiddle(int val , int pos) {
        Node nptr = new Node(val, null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink() ;
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++ ;
    }
    public void insertAtEnd(int val) {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(start == null) {
            start = nptr;
            end = start;
        }
        else  {
            end.setLink(nptr);
            end = nptr;
        }
    }
    public void deleteAtStart(int pos) {        
    if(pos==1) {
            start = start.getLink();
            size--;
            return ;
    }
    }
    public void deleteAtEnd(int pos) {
    if (pos == 2) {
            Node s = start;
            Node t = start;
            while (s != end) {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
    }
    public void deleteAtMiddle(int pos) {        
        Node ptr = start;
    pos=pos;
    for(int i = 1;i < size;i++) {
    if(i == pos)
    {
    Node tmp = ptr.getLink();
    tmp = tmp.getLink();
    ptr.setLink(tmp);
    break;
    }
    ptr = ptr.getLink();
    }
    size--;
    }
    public void display() {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) {
            System.out.println(start.getData()+" ");
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+" ");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}
public class Ques1 {    
    public static void main(String[] args) {            
        Scanner sc= new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("ImplementSingly Linked List ADT");
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
            System.out.println("8.DisplayExit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();            
            switch (choice) {
            case 1 :
            int a=1;
            list.linkedList(a);
            System.out.println("Enter element to insert");
                list.insertAtStart( sc.nextInt() );                    
                break;
            case 2 :
                System.out.println("Enter element to insert");
                list.insertAtStart( sc.nextInt() );                    
                break;  
            case 3 :
                System.out.println("Enter position to insert");
                int pos = sc.nextInt() ;
                System.out.println("Enter integer element to insert");
                int num = sc.nextInt() ;
                if(pos==1)
                list.insertAtMiddle(num,2);
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtMiddle(num, pos);
                break;      
            case 4 :
                System.out.println("Enter element to insert");
                list.insertAtEnd( sc.nextInt() );                    
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
                int p = sc.nextInt() ;
                if(p==1)
                list.deleteAtMiddle(2);
                if(p==list.getSize())
                list.deleteAtEnd(2);
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtMiddle(p);
                break;
            case 8 :
            int b=1;
            list.linkedList(b);
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