import java.util.Scanner;

public class dtdemo {
    public String ten;
    public float namsinh;
    public float lop;
    public void nhaptt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ten:");
        ten = sc.nextLine();
        System.out.println("nhap nam sinh:");
        namsinh=sc.nextFloat();
        System.out.println("nhap lop:");
        lop=sc.nextFloat();
        
    }
    
}
