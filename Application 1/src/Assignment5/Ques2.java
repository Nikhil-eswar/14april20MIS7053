package Assignment5;
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
    public void deleteAtStart() {
            start = start.getLink();
            size--;
            return ;
    }
    public void pop() {
    if (size == 0) {
             System.out.println("Stack is under flow/empty");
             return;
         }
    System.out.println("The popped elements is:"+end.getData());
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
    public void display() {
        if (size == 0) {
            System.out.println("Stack is under flow/empty");
            return;
        }    
        if (start.getLink() == null) {
            System.out.println(start.getData()+" ");
            return;
        }
        Node ptr = start;
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}
public class Ques2 {    
    public static void main(String[] args) {            
        Scanner s = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("Reversing a String using Stack (using linked list)");
       boolean z =true;
       boolean k=true;
       int p=0;
       do {
        System.out.println("STACK OPERATIONS USING SLL");  
       System.out.println("-----------------------------");
        System.out.println("1.PUSH");
           System.out.println("2.POP");
           System.out.println("3.DISPLAY");
           System.out.println("4.EXIT");
           System.out.println("Enter the Choice");
           int choice = s.nextInt();
           switch (choice) {
           case 1 :
            System.out.println("Enter the value");
            int val=s.nextInt();
            p=p+1;
            if(p==1) {
            list.insertAtStart(val);
            }
            list.insertAtEnd(val);
            k=false;
               break;
           case 2 :
          p=p+1;
               list.pop();
               if(p==1) {
              list.deleteAtStart();
               }
               k=false;
               break;  
           case 3 :
          k=true;
          break;      
           case 4 :
            z=false;
            k=false;
               break;
       }
             if(k==true) {
                list.display();  
             }
            } while (z==true);              
    }
}  

