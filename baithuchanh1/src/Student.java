import java.util.Scanner;

public class Student {
    public String ten;
    public String lop;
    public float msv;
    public float toan;
    public float van;
    public float anh;
    public float diemtongket;
    public void nhapthongtin(){
        Scanner sc=new Scanner(System.in);
        ten=sc.nextLine();
        lop=sc.nextLine();
        msv=sc.nextFloat();
        toan=sc.nextFloat();
        van=sc.nextFloat();
        anh=sc.nextFloat();
        diemtongket=(toan+van+anh)/3;
    }
    public void inthongtin(){
        System.out.print("diem tong ket la:"+diemtongket);
    }
    public static void main(String[] srgs){
        Student st=new Student();
        st.nhapthongtin();
        st.inthongtin();
    }
}
