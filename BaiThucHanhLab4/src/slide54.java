import java.util.HashSet;
import java.util.Scanner;

public class slide54 {
    public static void main(String[] args) {
        String kytu;
    HashSet<String> hash = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    hash.add("X");
    hash.add("I");
    hash.add("N");
    hash.add("C");
    hash.add("H");
    hash.add("A");
    hash.add("O");
    System.out.println("Cac ky phan tu trong Hashset la: ");
    System.out.println(hash);
    System.out.println("nhap cac phan tu can them: ");
    kytu = sc.nextLine();
    if(!hash.contains(kytu))
    {
        hash.add(kytu);
        System.out.println("Them thanh cong");
        System.out.println("cac phan tu cua Hashset sau khi them la:");
        System.out.println(hash);
    }else{
        System.out.println("phan tu "+ kytu + " da ton tai");
    }
    }

}
