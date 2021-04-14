package Assingment2;
import java.util.Scanner;
public class Ques1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=sc.nextInt();
	int sum=addNumbers(number);
	System.out.println("Sum = " + sum);	
	}
	public static int addNumbers(int num) {
	if (num !=0)
		return num + addNumbers(num - 1);
	else
		return num;
	}
}
//Time complexity for sum of n natural numbers is O(n)
//Here n=9
//Time complexity is O(9)






