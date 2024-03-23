package baithuchanh1.src.person;

import java.util.Scanner;

public class fulltime extends employee{
    public float luongcung;
    public float thuongthem;
    public float baohiem;
    public void nhapluongft(){
        super.Tencv="fulltime";
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap luong cung:");
        luongcung=sc.nextFloat();
        System.out.print("nhap thuong them:");
        thuongthem=sc.nextFloat();
        System.out.print("nhap tien bao hiem");
        baohiem=sc.nextFloat();
    }
    public void tinhluongft(){
        super.Luong=luongcung+thuongthem-baohiem;
    }
    public void inluongft(){
        System.out.println("day la viec lam:"+super.Tencv);
        System.out.println("luong cong viec fulltime la:"+super.Luong);
    }
}
