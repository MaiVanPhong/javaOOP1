package baithuchanh1.src.person;

import java.util.Scanner;

public class Person {
    public String hoten;
    public String gioitinh;
    public String cccd;
    public int namsinh;
    public int tuoi;
    public void nhaptt(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ho ten:");
        hoten=sc.nextLine();
        System.out.print("nhap gioi tinh:");
        gioitinh=sc.nextLine();
        System.out.print("nhap ma cccd:");
        cccd=sc.nextLine();
        System.out.print("nhap nam sinh:");
        namsinh=sc.nextInt();
    }
    public void tinhtuoi(){
        tuoi=2024-namsinh;
    }
    public void inthongtin(){
        System.out.println("ho va ten:"+hoten);
        System.out.println("gioi tinh:"+gioitinh);
        System.out.println("ma cccd:"+cccd);
        System.out.println("nam sinh:"+namsinh);
        System.out.println("tuoi:"+tuoi);
    }
}
