import java.util.Scanner;

public class Bai12 {
public static void main(String[] args) {
	int i,j,n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap so hang : ");
	i=sc.nextInt();
	System.out.print("Nhap so cot : ");
	j=sc.nextInt();
	int a[][]= new int[i][j];
	for(int b=0;b<i;b++) {
		for(int c=0;c<j;c++) {
			System.out.print("Nhap phan tu a["+b+"]["+c+"]:");
			a[b][c]=sc.nextInt();
		}
	}
	System.out.println("Ma tran vua nhap la :");
	for(int b=0;b<i;b++) {
		for(int c=0;c<j;c++) {
			System.out.print(a[b][c]+" ");
		}
		System.out.println();
	}
	int max=a[0][0];
	for(int b=0;b<i;b++) {
		for(int c=0;c<j;c++) {
			if(a[b][c]>max) {
				max=a[b][c];
			}
		}
	}
	System.out.println("Gia tri max :"+max);
}
}
