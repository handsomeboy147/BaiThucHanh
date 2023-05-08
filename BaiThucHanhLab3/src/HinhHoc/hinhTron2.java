package HinhHoc;

public class hinhTron2 {
    private final float PI = 3.14f;
    private float banKinh;
    private float chuVi;
    private float dienTich;

    // Constructor
    public hinhTron2(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getChuVi() {
        return chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
