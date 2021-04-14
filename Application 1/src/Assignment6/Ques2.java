package Assignment6;
import java.util.Scanner;
public class Ques2{
   static char stack[]=new char[20];
   static int top;
   public static void main(String args[]){
      int i,f=0;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the paranthesis string ends with $");
      String str=s.nextLine();
      top=-1;
      push('$');
      for(i=0;str.charAt(i)!='$';i++){
          if(str.charAt(i)=='{'){
              push(str.charAt(i));
          }
          else if(str.charAt(i)=='}'& stack[top]=='{'){
              pop();
          }
          else if(str.charAt(i)=='}'& stack[top]=='$'){
              break;
          }
      }
      if(str.charAt(i)=='$' & stack[top]=='$'){
          System.out.println("balanced Paranthesis");
      }
      else {
          System.out.println("unbalanced Paranthesis");
      }
   }
   public static void push(char ch){
       top++;
       stack[top]=ch;
       System.out.println("pushed"+" "+stack[top]);
   }
   public static void pop(){
       System.out.println("popped"+" "+stack[top]);
       top--;
   }
}

