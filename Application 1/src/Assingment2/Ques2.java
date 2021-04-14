package Assingment2;
import java.util.Scanner;
public class Ques2 {
public static int fibonacciRecursion(int n) {
	if(n<=1) {
		return n;
	}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How may numbers you want in the sequence: ");
	int maxNumber = sc.nextInt();
		System.out.print("Fibonacci Series of "+maxNumber+ " numbers: ");
	for(int i = 0; i < maxNumber;i++) {
		System.out.print(fibonacciRecursion(i)+" ");
		}
	}
	
}
//Time complexity for Fibonacci series  is O(2^n)
//Here n=6
//Time complexity is O(2^6) = O(64)



