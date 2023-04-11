package HinhHoc;

import java.util.Scanner;

public class hinhTron {
    final float Pi = 3.14f;
    float r;
    float dt, cv;

    public void nhapBankinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập bán kính hình tròn: ");
        r = sc.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * r * Pi;
    }

    public void tinhDientich() {
        dt = r * r * Pi;

    }

    public void inKetQua(String name) {
        System.out.printf("chu vi của hình tròn %s ban kính %f = %f", name, r, cv);
        System.out.printf("\ndiện tích của hình tròn %s ban kính %f = %f", name, r, dt);
    }

}
