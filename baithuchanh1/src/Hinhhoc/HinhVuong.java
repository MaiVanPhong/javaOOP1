package baithuchanh1.src.Hinhhoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public float canh;
    public void hinhvuong(){
        super.tenHinh="hinh vuong";
    }
    public void nhaphv(){
        super.nhapcd();
        canh = super.ChieuDai;
        super.ChuVi=canh*4;
        super.DienTich=canh*canh;
        
    }
    public void inhv(){
        System.out.println("day la:"+super.tenHinh);
        System.out.println("canh cua hinh vuong la:"+canh);
        System.out.println("chu vi hinh vuong la:"+super.ChuVi);
        System.out.println("dien tich hinh vuong la"+super.DienTich);
    }
    
}
