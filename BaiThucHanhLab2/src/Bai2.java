package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vap so can kiem tra: ");
        number = scanner.nextInt();

        // số chẵn là số chia hết cho 2
        if (number % 2 == 0) {
            System.out.println(number + " la so chan");
        } else {
            // ngược lại là số lẻ
            System.out.println(number + " la so le");
        }
    }
}