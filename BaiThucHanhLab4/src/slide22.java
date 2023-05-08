import java.util.ArrayList;
import java.util.Scanner;
public class slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
            int number;
            System.out.print("nhap so phan tu cua mang Arraylist: ");
            int n = sc.nextInt();
            for(int i = 0; i < n;i++)
            {
                System.out.println("nhap phan tu thu " + i+": ");
                number = sc.nextInt();
                arr.add(number);
            }
            for(int i = 0; i < arr.size(); i++)
            {
                arr.sort((o1,o2)->o1-o2);
            }
            System.out.println("phan tu lon nhat trong mang Arraylist la: " + arr.get(arr.size()-1));
            System.out.println("phan tu nho nhat trong mang Arralist la: "+ arr.get(0));
    }
}
