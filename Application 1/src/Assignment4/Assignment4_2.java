package Assignment4;
import java.util.Scanner;
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
    public void setLinkNext(Node n) {
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
    public int size;
    public linkedList() {
        start = null;
        end = null;
        size = 0;
    }
    public boolean isEmpty() {
        return start == null;
    }
    public int getSize() {
        return size;
    }
    public void insertAtStart(int val) {
        Node nptr = new Node(val, null, null);    
        if (start == null) {            
            nptr.setLinkNext(nptr);
            nptr.setLinkPrev(nptr);
            start = nptr;
            end = start;            
        }
        else {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;        
        }
        size++ ;
    }
    public void insertAtEnd(int val) {
        Node nptr = new Node(val, null, null);        
        if (start == null) {
            nptr.setLinkNext(nptr);
            nptr.setLinkPrev(nptr);
            start = nptr;
            end = start;
        }
        else {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            end = nptr;    
        }
        size++;
    }
    public void insertAtPos(int val , int pos) {
   
        Node nptr = new Node(val, null, null);            
        Node ptr = start;
        for (int i = 2; i <= size; i++) {
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
    public void deleteAtStart(int p) {
    if (p == 1)  {
             if (size == 1) {
                 start = null;
                 end = null;
                 size = 0;
                 return;
             }
             start = start.getLinkNext();
             start.setLinkPrev(end);
             end.setLinkNext(start);
             size--;
             return ;
         }
    }
    public void deleteAtEnd(int k) {
    if (k == 1) {
            end = end.getLinkPrev();
            end.setLinkNext(start);
            start.setLinkPrev(end);
            size-- ;
        }
    }
    public void deleteAtPos(int pos) {        
        Node ptr = start.getLinkNext();
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
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
    public void reverse() {
     Node ptr = end;
          if (size == 0) {
              System.out.print("empty\n");
              return;
          }
          if (end.getLinkPrev() == end) {
              System.out.print(end.getData()+ "\n");
              return;
          }
          System.out.print(end.getData()+ "  ");
          ptr = end.getLinkPrev();
          while (ptr.getLinkPrev() !=end) {
              System.out.print(ptr.getData()+ "  ");
              ptr = ptr.getLinkPrev();
          }
          System.out.print(ptr.getData());
          System.out.println(" ");
      }
    public void display() {
        Node ptr = start;
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == start) {
            System.out.print(start.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ "  ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != start) {
            System.out.print(ptr.getData()+ "  ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData());
        System.out.println(" ");
    }
}
public class Assignment4_2 {    
    public static void main(String[] args) {            
        Scanner scan = new Scanner(System.in);
        linkedList list = new linkedList();
        boolean z =true;
        System.out.println("Circular Doubly Linked List Test");          
        do {
        System.out.println("1. Create a node");
            System.out.println("2. insert at the  begining");
            System.out.println("3. insert at the middle");
            System.out.println("4. insert at the end");
            System.out.println("5. delete at the begin");
            System.out.println("6. delete at the End");
            System.out.println("7. delete at the middle");
            System.out.println("8. Display");
            System.out.println("9. Reverse");
            System.out.println("10. Exit");
            System.out.println("Enter Your choice");
            int choice = scan.nextInt();            
            switch (choice) {
            case 1 :
            System.out.println("enter the element to insert");
                list.insertAtEnd( scan.nextInt() );                    
                break;
            case 2 :
                System.out.println("enter the element to insert");
                list.insertAtStart( scan.nextInt() );                    
                break;  
            case 3 :
                System.out.println("enter the position to insert");
                int pos = scan.nextInt() ;
                System.out.println("enter the element to insert");
                int num = scan.nextInt() ;
                if(pos==1) {
                list.insertAtPos(num,2);
                }
                if (pos < 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;      
            case 4 :
                System.out.println("enter element to insert");
                list.insertAtEnd( scan.nextInt() );                    
                break;                                                                  
            case 5 :
                int po =1;
                    list.deleteAtStart(po);
                break;
            case 6 :
                int P=1;
                    list.deleteAtEnd(P);
                break;
            case 7 :
                System.out.println("enter the position to delete");
                int p = scan.nextInt() ;
                if(p==1) {
                list.deleteAtPos(2);
                }
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 8 :
            z=true;
            break;
            case 9:
            list.reverse();
            break;
            case 10 :
            z=false;
                break;
             default :
                System.out.println("Wrong Entry \n ");
                break;  
            }
            if(choice==1||choice==2||choice==3||choice==4||choice==5||choice==6||choice==7||choice==8) {
            list.display();  
            }
        } while (z==true);              
    }
} 