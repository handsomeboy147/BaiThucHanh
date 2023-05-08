package HinhHoc;

import java.util.Scanner;

public class hinhTron {
    final float Pi = 3.14f;
    float r;
    float dt, cv;

    public void nhapBankinh(float r) {
        this.r = r;
    }

    public float tinhChuVi() {
        cv = 2 * r * Pi;
    }

    public float tinhDientich() {
        dt = r * r * Pi;

    }

    public void inKetQua(String name) {
        System.out.printf("chu vi cua hinh tron %s ban kinh %f = %f", name, r, cv);
        System.out.printf("\ndien tich cua hinh tron %s ban kinh %f = %f", name, r, dt);
    }
}
