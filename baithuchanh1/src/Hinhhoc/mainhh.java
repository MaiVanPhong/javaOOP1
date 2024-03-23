package baithuchanh1.src.Hinhhoc;
import baithuchanh1.src.Hinhhoc.HinhChuNhat;
import baithuchanh1.src.Hinhhoc.HinhVuong;
import baithuchanh1.src.Hinhhoc.Hinhhoc;
import baithuchanh1.src.Hinhhoc.Hinhtron;
import baithuchanh1.src.Hinhhoc.Hinhtru;

public class mainhh {
    public static void main(String[] args){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.hinhchunhat();
        hcn.nhapcd();
        hcn.nhapcr();
        hcn.intt();
        HinhVuong hv = new HinhVuong();
        hv.hinhvuong();
        hv.nhaphv();
        hv.inhv();
        Hinhtron ht = new Hinhtron();
        ht.hinhtron();
        ht.nhapbk();
        ht.inht();
        Hinhtru htr =new Hinhtru();
        htr.hinhtru();
        htr.nhaph();
        htr.inh();
    }
    
}
