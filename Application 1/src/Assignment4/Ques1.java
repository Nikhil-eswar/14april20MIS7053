package Assignment4;
import java.util.Scanner;
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
    protected Node start ;
    protected Node end ;
    public int size ;
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
    public void insertAtStart(int val){
        Node nptr = new Node(val,null);    
        nptr.setLink(start);
        if(start == null) {            
            start = nptr;
            nptr.setLink(start);
            end = start;            
        } else {
            end.setLink(nptr);
            start = nptr;        
        }
        size++ ;
    }
    public void insertAtEnd(int val) {
        Node nptr = new Node(val,null);    
        nptr.setLink(start);
        if(start == null) {            
            start = nptr;
            nptr.setLink(start);
            end = start;            
        } else {
            end.setLink(nptr);
            end = nptr;            
        }
        size++ ;
    }
    public void insertAtPos(int val , int pos) {
        Node nptr = new Node(val,null);                
        Node ptr = start;
        pos= pos+1;
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink() ;
                ptr.setLink( nptr );
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++ ;
    }
    public void deleteAtPos(int pos) {        
        Node ptr = start;
        pos = pos ;
        for (int i = 2; i <= size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }
    public void deleteAtStart(int po) {
if (size == 1 && po == 1) {
            start = null;
            end = null;
            size = 0;
            return ;
        }        
        if (po == 1) {
            start = start.getLink();
            end.setLink(start);
            size--;
            return ;
        }
}    
    public void deleteAtEnd(int p) {  
    if (p == 1)
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(start);
            size --;
            return;
        }
    }
    public void display() {
    Node ptr = start;
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == start) {
            System.out.print(start.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ "  ");
        ptr = start.getLink();
        while (ptr.getLink() != start) {
            System.out.print(ptr.getData()+ "  ");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData());
        System.out.println(" ");
    }
    }
public class Ques1 {    
    public static void main(String[] args) {            
        Scanner scan = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("Circular Singly Linked List Test");          
        boolean z =true;
        do {
            System.out.println("Circular Singly Linked List Operations");
            System.out.println("1. Create a node");
            System.out.println("2. insert node at the  begining");
            System.out.println("3. insert node at the middle");
            System.out.println("4. insert node at the end");
            System.out.println("5. delete at the begin");
            System.out.println("6. delete at the End");
            System.out.println("7. delete at the middle");
            System.out.println("8. Display");
            System.out.println("9. Exit");
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


