package Assignment4;
import java.util.Scanner;
class Node
{
    protected int data;
    protected Node next, prev;
    public Node()
    {
        next = null;
        prev = null;
        data = 0;
    }
    public Node(int d, Node n, Node p)
    {
        data = d;
        next = n;
        prev = p;
    }
    public void setLinkNext(Node n)
    {
        next = n;
    }
    public void setLinkPrev(Node p)
    {
        prev = p;
    }
    public Node getLinkNext()
    {
        return next;
    }
    public Node getLinkPrev()
    {
        return prev;
    }
    public void setData(int d)
    {
        data = d;
    }
    public int getData()
    {
        return data;
    }
}
class DoubleLinkedList
{
    protected Node start;
    protected Node end ;
    public int size;
    public DoubleLinkedList()
    {
        start = null;
        end = null;
        size=0;
    }
    public boolean isEmpty(){
        return start == null;
    }
    public int getSize()
    {
        return size;
    }
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null, null);
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
    }
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val, null, null);
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
    }
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null, null);
        if (pos == 1)
        {
            insertAtStart(val);
            return;
        }
        Node ptr = start;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
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
    public void deleteAtPos(int pos)
    {
        if (pos == 1)
        {
            if (size == 1)
            {
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
        if (pos == size)
        {
            end = end.getLinkPrev();
            end.setLinkNext(null);
            size-- ;
        }
        Node ptr = start.getLinkNext();
        for (int i = 2; i <= size; i++)
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
    public void reverse(){
        Node temp=null;
        Node current = start;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null){
            start = temp.prev;
        }
    }
    public void display()
    {
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null)
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ ",");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null)
        {
            System.out.print(ptr.getData()+ ",");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}
public class Main1{
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 10){
            System.out.println("\n1.create a node \n2.insert node at beggining \n3.insert node at middle \n4.insert node at end");
            System.out.println("5.delete at begin \n6.delete at end \n7.delete at middle \n8.display \n9.reverse \n10.exit");
            System.out.println("Enter your choice");
            option = scanner.nextInt();
            if (option == 1){
                System.out.println("Enter the value");
                int number_1 = scanner.nextInt();
                doubleLinkedList.insertAtStart(number_1);
            }
            if (option == 2){
                System.out.println("Enter the element to insert");
                int number_2 = scanner.nextInt();
                doubleLinkedList.insertAtStart(number_2);
            }
            if (option == 3){
                System.out.println("enter the position to add the element");
                int position = scanner.nextInt();
                System.out.println("Enter the element to insert");
                int number_3 = scanner.nextInt();
                if (position < 1 || position > doubleLinkedList.getSize() )
                    System.out.println("Invalid position\n");
                else
                    doubleLinkedList.insertAtPos(number_3, position);
            }
            if (option == 4){
                System.out.println("Enter the element to insert");
                int number_4 = scanner.nextInt();
                doubleLinkedList.insertAtEnd(number_4);
            }
            if (option == 5)
                doubleLinkedList.deleteAtPos(1);
            if (option == 6)
                doubleLinkedList.deleteAtPos(doubleLinkedList.getSize());
            if (option == 7){
                System.out.println("Enter the position to remove");
                int position = scanner.nextInt();
                if (position < 1 || position > doubleLinkedList.getSize() )
                    System.out.println("Invalid position\n");
                else
                    doubleLinkedList.deleteAtPos(position);
            }
            if (option == 9){
                doubleLinkedList.reverse();
            }
            doubleLinkedList.display();
        }

    }
}