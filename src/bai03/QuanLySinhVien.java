package bai03;

public class QuanLySinhVien {

    public static void main(String[] args) {
        // khai bao doi tuong sv kieu sv
        SinhVien sv;
        // khoi tao doi tuong sv
        sv = new SinhVien();
        // gan gia tri cho cac thuoc tinh cua doi tuong sv
        sv.hoten = "gia huy";
        sv.namsinh = 2005;
        sv.sdt = "0935379085";
        // xuat gia tri cua doi tuong ra man hinh
        System.out.println("Ho ten: " + sv.hoten + "; nam sinh: " + sv.namsinh + "; sdt: " + sv.sdt);
    }
}
