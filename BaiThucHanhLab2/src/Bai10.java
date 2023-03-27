import java.util.Scanner;

public class Bai10 {
public static void main(String[] args) {
	String c;
	int dem =0;
	Scanner sc= new Scanner(System.in);
	do {
		System.out.println("Nhap chuoi ki tu : ");
		c=sc.nextLine();
	} while (c.length()>=80);
	
	System.out.println("Nhap 1 ki tu bat ki : ");
	char kitu=sc.next().charAt(0);
	for(int i=0;i<c.length();i++) {
		if(c.charAt(i)==kitu) {
			dem++;
		}
	}
	System.out.println("So lan xuat hien ki tu "+kitu+" la " +dem);
}
}
