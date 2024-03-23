package baithuchanh1.src.Hinhhoc;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float h;
    public void hinhtru(){
        super.tenHinh="hinh tru";
    }
    public void nhaph(){
        super.nhapbk();
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap chieu cao:");
        h=sc.nextFloat();
        super.TheTich=Pi*bk*bk*h;
        
    }
    public void inh(){
        System.out.println("day la:"+super.tenHinh);
        System.out.println("the tich hinh tru la:"+super.TheTich);
    }
    
}
