import java.util.Scanner;

public class Bai8 {
public static void main(String[] args) {
	int n,tong=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap n : ");
	n=sc.nextInt();
	
	int arr[]= new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Nhap a["+i+"] : ");
		arr[i]=sc.nextInt();
		tong=tong+arr[i];
	}
	System.out.println("Trung binh cong "+n+" so = " +((float)tong/n));
}
}
