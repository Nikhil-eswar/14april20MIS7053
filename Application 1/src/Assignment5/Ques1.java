package Assignment5;
import java.io.*;
import java.util.*;
public class Ques1 {
static int arr[];
static int top;
int capacity;
Ques1(int size) {
arr = new int[size];
capacity=size;
top = -1;
}
public void push(int x) {
if (isFull()) {
System.out.println("Stack OverFlow");
System.exit(1);
}
arr[++top] = x;
}
public int pop() {
if (isEmpty()) {
System.out.println("STACK EMPTY");
System.exit(1);
}
return arr[top--];
}
public int getSize() {
return top + 1;
}
public Boolean isEmpty() {
return top == -1;
}
public Boolean isFull() {
return top == capacity - 1;
}
public void printStack() {
System.out.println("The elements in STACK");
for (int i = top; i>=0; i--) {
System.out.println(arr[i]);
}
}
public static void main(String[] args) {
boolean z =true;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of STACK");
int n=s.nextInt();
Ques1 stack = new Ques1(n);
do {
System.out.println("STACK OPERATIONS USING ARRAY");
System.out.println("-----------------------------");
System.out.println("1.PUSH");
System.out.println("2.POP");
System.out.println("3.DISPLAY");
System.out.println("4.EXIT");
System.out.println("Enter the Choice");
int choice = s.nextInt();
switch (choice) {
case 1 :
System.out.println("Enter a value to be pushed:");
int val=s.nextInt();
stack.push(val);
break;
case 2 :
System.out.println("The popped elements is:"+arr[top]);
stack.pop();
break;
case 3 :
stack.printStack();
break;
case 4 :
z=false;
break;
}
} while (z==true);
}
}


