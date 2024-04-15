

import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    public float bk;
    public void hinhtron(){
        super.tenHinh = "hinh tron";
    }
    public void nhapbk(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ban kinh:");
        bk=sc.nextFloat();
        super.ChuVi=2*Pi*bk;
        super.DienTich=Pi*bk*bk;
    }
    public void inht(){
        System.out.println("day la:"+super.tenHinh);
        System.out.println("chu vi la:"+super.ChuVi);
        System.out.println("dien tich la:"+super.DienTich);
    }
}
