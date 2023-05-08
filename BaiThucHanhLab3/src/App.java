
import java.util.Scanner;

import HinhHoc.hinhTron;
import HinhHoc.hinhTron2;
import HinhHoc.hinhchunhat;
import HinhHoc.hinhtrutron;
import HinhHoc.hinhvuong;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        System.out.printf(
                "\n1. Hinh tron \n2. Hinh tru tron \n3. Hinh Chu Nhat \n4. Hinh Vuong \n5. Hinh tron 2 \nVui long chon: ");
        chon = sc.nextInt();
        switch (chon) {
            case 1:
                hinhTron ht = new hinhTron();
                ht.nhapBankinh(6);
                ht.tinhChuVi();
                ht.tinhDientich();
                ht.inKetQua("tam I1");
                break;

            case 2:
                hinhtrutron htt = new hinhtrutron();
                htt.NhapBanKinh();
                htt.chuvi();
                htt.dientich();
                htt.thetich();
                htt.inthongtin();
                break;

            case 3:
                hinhchunhat hcn = new hinhchunhat();
                hcn.nhapChieuDai();
                hcn.nhapChieuRong();
                hcn.tinhChuVi();
                hcn.tinhDientich();
                hcn.inChuVi();
                hcn.inDienTich();
            case 4:
                hinhvuong hv = new hinhvuong();
                hv.nhapChieuDai();
                hv.nhapChieuRong();
                hv.tinhChuVi();
                hv.tinhDientich();
                hv.inChuVi();
                hv.inDienTich();
            case 5:
                hinhTron2 ht2 = new hinhTron2();
                ht2.tinhChuVi();
                ht2.tinhDienTich();

            default:
                System.out.println("vui long chon lai");
                break;
        }
    }
}