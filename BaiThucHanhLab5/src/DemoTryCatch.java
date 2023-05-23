import java.util.ArrayList;
import java.util.Scanner;

public class DemoTryCatch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);    
            int number,k;
            System.out.print("nhap so phan tu cua mang Arraylist: ");
            int n = sc.nextInt();
            for(int i = 0; i < n;i++)
            {
                do{
                    k=1;
                    try{
                System.out.println("nhap phan tu thu " + i+": ");
                number = sc.nextInt();
                arr.add(number);
                    }catch(Exception e ){
                        k=0;
                    } while(k==0);

        }
    }
    }