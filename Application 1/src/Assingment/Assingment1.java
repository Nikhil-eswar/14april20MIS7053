package Assingment;
import java.util.*;
public class Assingment1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=10;
		int a[]=new int[n];
		for(int i=0;i<10;i++) {
		a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
		if(i<5) {
		System.out.print(a[i]+" ");
		}
		if(i==5) {
		System.out.println(" ");
		}
		if(i>4) {
		System.out.print(a[i]+" ");
		}
		}
	}
	
}

