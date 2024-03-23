package baithuchanh1.src.Hinhhoc;
import java.util.Scanner;

public class Hinhhoc{
    public String tenHinh;
    public final float Pi = 3.14f;
    public float ChuVi;
    public float DienTich;
    public float TheTich;
    public void nhapTenHinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n==== " + tenHinh + " ====");
    }
     public void inChuVi(){
        System.out.println("Chu Vi : " + ChuVi);
     }
     public void inDienTich(){
        System.out.println("Dien Tich : " + DienTich);
     }
     public void inTheTich(){
        System.out.println("The Tich: " + TheTich);
     }
    
}