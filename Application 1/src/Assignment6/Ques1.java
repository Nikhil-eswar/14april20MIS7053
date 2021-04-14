package Assignment6;
import java.util.Scanner;
public class Ques1{
      static String str=new String();
      static char rev[]=new char[20];
      static int top;
      public static void main(String args[]){
            top=-1;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter string to reverse");
            str=sc.nextLine();
            for(int i=0;i<str.length();i++){
                 push(str.charAt(i));
            }
            System.out.println("String after reversal");
            for(int i=top;i>=0;i--){
                 pop();
            }
      }
      public static void push(char ch){
            top++;
            rev[top]=ch;
            System.out.println(ch);
      }
      public static void pop(){
            System.out.print(rev[top]);
            top--;
      }
}


