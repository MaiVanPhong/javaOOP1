

import java.util.Scanner;

public class HinhChuNhat extends Hinhhoc{
    public float ChieuDai;
    public float ChieuRong;
    public void hinhchunhat(){
        super.tenHinh="hinh chu nhat";
    }
    public void nhapcd(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap chieu dai:");
        ChieuDai=sc.nextFloat();
    }
    public void nhapcr(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap chieu rong:");
        ChieuRong=sc.nextFloat();
        super.ChuVi=(ChieuDai+ChieuRong)*2;
        super.DienTich=ChieuDai*ChieuRong;
    }
    public void intt(){
        System.out.println("day la:"+super.tenHinh);
        System.out.println("chu vi hcn la:"+super.ChuVi);
        System.out.println("dien tich hcn la:"+super.DienTich);
    }
}
