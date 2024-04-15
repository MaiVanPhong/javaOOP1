package NhanVien;

public class NhanvienPartTime {
    private int giolamviec;
    public NhanvienPartTime(String ten,int giolamviec){
        super.setten(ten);
        this.giolamviec=giolamviec;
    }
    @Override
    public String loainhanvien(){
        return "nhan vien parttime";
    }
    public void tinhluong(){
        long luong=configs.LUONG_NHAN_VIEN_PARTTIME_MOI_GIO*giolamviec;
    }
    
}
