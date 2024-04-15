package NhanVien;

public class mainnv {
    public static void main(String[] args) {
        NhanvienFulltTime sep=new NhanvienFulltTime("Pham Quang Sep");
        sep.SetLoaiChucVu(configs.NHAN_VIEN_SEP);
        NhanvienFulltTime linh1=new NhanvienFulltTime("Nguyen A");
        linh1.SetLoaiChucVu(configs.NHAN_VIEN_LINH);
        NhanvienFulltTime linh2=new NhanvienFulltTime("nguyen B", 3)
        linh2.SetLoaiChucVu(configs.NHAN_VIEN_LINH);
        NhanvienPartTime thoivu=new NhanvienPartTime("Nguyen C", 200);
        sep.tinhluong();
        linh1.tinhluong();
        linh2.tinhluong();
        thoivu.tinhluong();
        sep.xuatthongtin();
        linh1.xuatthongtin();
        linh2.xuatthongtin();
        thoivu.xuatthongtin();
    }
    
}
