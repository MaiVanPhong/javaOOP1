package baithuchanh1.src.person;
import baithuchanh1.src.person.employee;
import baithuchanh1.src.person.Person;
import baithuchanh1.src.person.parttime;
import baithuchanh1.src.person.fulltime;

public class mainps {
    public static void main(String[] args) {
        Person ps=new Person();
        ps.nhaptt();
        ps.tinhtuoi();
        ps.inthongtin();
        employee epl=new employee();
        epl.xuatTen();
        epl.nhapThongTinnv();
        epl.nhapLuong();
        epl.inLuongThang();
        fulltime ft=new fulltime();
        ft.nhapluongft();
        ft.tinhluongft();
        ft.inluongft();
        parttime pte=new parttime();
        pte.nhapSoNgayLamViec();
        pte.TinhLuong();
        pte.inluongpt();
    }
}
