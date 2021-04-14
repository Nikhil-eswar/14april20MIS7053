package Assingment2;
import java.util.Scanner;
public class Ques3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table : ");	
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
}
	
}
// Time complexity for multiples is O(n)
// Here n=10
// Time complexity is O(10)





