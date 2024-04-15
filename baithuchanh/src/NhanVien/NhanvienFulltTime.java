package NhanVien;
public class Nhanvien {
    private String ten;
    private static long luong;
    private String loainhanvien;
    public nhanvien();
    public nhanvien(String ten);
    public static void setten(String ten){
        this.ten=ten;
    }
    public String getten(){
        return ten;
    }
    public void setluong(long luong){
        this.luong=luong;
    }
    public long getluong(){
        return luong;
    }
    public void setloainhanvien(String loainhanvien){
        this.loainhanvien=loainhanvien;
    }
    public Stirng getloainhanvien(){
        return loainhanvien;
    }
    public void xuatthongtin(){
        System.out.println("Ten:" + ten);
        System.out.println("Luong:" + luong);
        System.out.println("loai nhan vien:" + loainhanvien);
    }
    
}
