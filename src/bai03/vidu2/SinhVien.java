package bai03.vidu2;

public class SinhVien {
    public String hoten;
    public int namsinh;
    public String sdt;
    
    public String getHoten() {
    	return this.hoten;
    }
    public void setHoten(String name) {
    	this.hoten = name;
    }
    public int getNamSinh() {
    	return this.namsinh;
    }
    public void setNamSinh(int yob) {
    	this.namsinh = yob;
    }
    public String getsdt() {
    	return this.sdt;
    }
    public void setsdt(String phone) {
    	this.sdt = phone;
    }
    public String toString() {
        return "Ho ten: " + hoten + "; Nam sinh: " + namsinh + "; SDT: " + sdt;
    }
}
