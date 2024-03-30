package person;
import java.util.Scanner;

public class parttime extends employee{
        public float sogio;
        public float songay;
        public float cong1gio;
        public void nhapSoNgayLamViec(){
            super.Tencv="parttime";
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap so ngay lam viec trong mot thang : ");
            songay = sc.nextFloat();
            System.out.print("so gio lam viec:");
            sogio = sc.nextFloat();
            System.out.print("cong mot gio la:");
            cong1gio=sc.nextFloat();
        }
        public void TinhLuong(){
            super.Luong = cong1gio*sogio*songay;
        }
        public void inluongpt(){
            System.out.println("day la viec lam:"+super.Tencv);
            System.out.println("luong cv parttime la:"+super.Luong);
        }
}