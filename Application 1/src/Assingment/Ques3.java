package Assingment;
import java.util.*;
public class Ques3 {
public static void main(String[] args) {
	int n, temp;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of elements you want in array:");
	n = sc.nextInt();
	int a[] = new int[n];
	for (int i = 0; i < n; i++) {
	a[i] = sc.nextInt();
	}
	for (int i = 0; i < n; i++) {
	for (int j = i + 1; j < n; j++) {
	if (a[i] > a[j]) {
	temp = a[i];
	a[i] = a[j];
	a[j] = temp;
	}
	}
	}
	int highest=0;
	int lowest=0;
	int secondlowest=0;
	for(int i=0;i<n;i++) {
	highest=a[n-1];
	lowest=a[0];
	secondlowest=a[1];
	}
	int maximumdifference=highest-lowest;
	int minimumdifference=secondlowest-lowest;
	System.out.println(maximumdifference+" "+minimumdifference);
}
}

