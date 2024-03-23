package baithuchanh1.src.person;

import java.util.Scanner;

public class employee extends Person{
        public String Tencv;
        public String manv;
        public String PhongBan;
        public String ChucVu;
        public float Luong;
        public void xuatTen(){
            Scanner sc=new Scanner(System.in);
            System.out.print("nhap ten cv:");
            Tencv=sc.nextLine();
        }
        public void nhapThongTinnv(){
             Scanner sc = new Scanner(System.in);
             System.out.print("nhap ma nhan vien : ");
             manv = sc.nextLine();
             System.out.print("nhap phong ban : ");
             PhongBan = sc.nextLine();
             System.out.print("nhap chuc vu : ");
             ChucVu = sc.nextLine();
        }
         public void nhapLuong(){
            Scanner sc=new Scanner(System.in);
            System.out.print("nhap luong:");
            Luong=sc.nextFloat();
        }
         public void inLuongThang(){
             System.out.println("Luong thang : "+Luong);
        }
}
