
import java.util.Scanner;

import HinhHoc.hinhTron;
import HinhHoc.hinhchunhat;
import HinhHoc.hinhtrutron;
import HinhHoc.hinhvuong;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.printf(
                "\n1. Hình tròn \n2. Student \n3. Hình trụ tròn \n4. Nhân viên \n5. Hinh Chu Nhat \n6. Hinh Vuong \nVui lòng chọn: ");
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                hinhTron ht = new hinhTron();
                ht.nhapBankinh();
                ht.tinhChuVi();
                ht.tinhDientich();
                ht.inKetQua("tam I1");
                break;

            case 3:
                hinhtrutron htt = new hinhtrutron();
                htt.NhapBanKinh();
                htt.chuvi();
                htt.dientich();
                htt.thetich();
                htt.inthongtin();
                break;

            case 5:
                hinhchunhat hcn = new hinhchunhat();
                hcn.nhapChieuDai();
                hcn.nhapChieuRong();
                hcn.tinhChuVi();
                hcn.tinhDientich();
                hcn.inChuVi();
                hcn.inDienTich();
            case 6:
                hinhvuong hv = new hinhvuong();
                hv.nhapChieuDai();
                hv.nhapChieuRong();
                hv.tinhChuVi();
                hv.tinhDientich();
                hv.inChuVi();
                hv.inDienTich();
            default:
                System.out.println("vui long chon lai");
                break;
        }

    }
}