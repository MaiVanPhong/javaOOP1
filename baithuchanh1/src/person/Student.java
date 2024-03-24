package person;

import java.util.Scanner;

public class Student extends Person{
    public String masv;
    public String lop;
    public String khoa;
    public void nhapttsv(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ma sinh vien cua ban:");
        masv=sc.nextLine();
        System.out.print("ban hoc lop:");
        lop=sc.nextLine();
        System.out.print("ban hoc khoa:");
        khoa=sc.nextLine();
    }
    public void inttsv(){
        System.out.println("ma sinh vien cua ban la:"+masv);
        System.out.println("lop cua ban la:"+lop);
        System.out.println("khoa cua ban la:"+khoa);
    }
}
