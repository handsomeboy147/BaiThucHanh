import java.util.HashSet;
import java.util.Scanner;

public class slide56 {
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
    kytu = sc.nextLine();
    if(hash.contains(kytu))
    {
        hash.add(kytu);
        hash.remove(kytu);
        System.out.println("Xoa thanh cong !");
        System.out.println("Xac phan tu cua Hashset sau khi xoa la:");
        System.out.println(hash);
    }else{
        System.out.println("Xoa khong thanh cong");
    }
    }

}
