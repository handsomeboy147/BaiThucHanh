import java.util.Scanner;

public class Bai9 {
public static void main(String[] args) {
	String chuoi;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap chuoi bat ki : ");
	chuoi=sc.nextLine();
	
	int dem1=0, dem2=0 , dem3=0;
	for(int i=0;i<chuoi.length();i++) {
		if(chuoi.charAt(i)>='a' && chuoi.charAt(i)<='z') {
			dem1++;
		}else if(chuoi.charAt(i)>='A' && chuoi.charAt(i)<='Z') {
			dem2++;
		}else if(chuoi.charAt(i)>='0' && chuoi.charAt(i)<='9'){
			dem3++;
		}
	}
	
	System.out.println("So ki tu thuong la "+dem1);
	System.out.println("So ki tu hoa la "+dem2);
	System.out.println("So ki tu so la "+dem3);
}
}
