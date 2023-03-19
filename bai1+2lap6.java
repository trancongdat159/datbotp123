//Bai1//

public class HocSinh {
    public String hoTen;
    public String lop;
    public double toan;
    public double li;
    public double hoa;
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen=hoTen;
    }
    public String getLop(){
        return this.lop;
    }
    public void setLop(String lop) {
        this.lop=lop;
    }
    public double getToan(){
        return this.toan;
    }
    public void setToan(double toan) {
        this.toan=toan;
    }
    public double getLi(){
        return this.li;
    }
    public void setLi(double li) {
        this.li=li;
    }
    public double getHoa(){
        return this.hoa;
    }
    public void setHoa(double hoa) {
        this.hoa=hoa;
    }
    public void diemTB() {
        System.out.println("Diemtb: " +((toan+li+hoa)/3));
    }
}
public class HocSinhChuyenToan extends HocSinh {
    @Override
    public void diemTB() {
        System.out.println("Diemtb hoc sinh chuyen Toan: "+(toan*2+li+hoa)/4);
    }
}
public class Mainclass {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        hocSinh.diemTB();
        hocSinh = new HocSinhChuyenToan();
        hocSinh.diemTB();
    }
}



//Bai2//
package lab6;
public class NhanVien {
    public String ten;
    public long luong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }


public NhanVien() {}
public NhanVien(String ten) {
    this.ten=ten;
}
public String loaiNhanVien() {
    return this.ten;
}
public void tinhLuong() {
    System.out.println("Luong la: ");
}
public void xuatThongTin() {
    System.out.println("Thong tin cua nhan vien: ");
}
}
public class NhanVienFullTime extends NhanVien {   
    public int loaiChucVu;
    public int ngayLamThem;
    public NhanVienFullTime() {
        }
    public NhanVienFullTime(int loaiChucVu,int ngayLamThem) {
        this.loaiChucVu=loaiChucVu;
        this.ngayLamThem=ngayLamThem;
    }
        public int getLoaiChucVu() {
            return loaiChucVu;
        }

        public void setLoaiChucVu(int loaiChucVu) {
            this.loaiChucVu = loaiChucVu;
        }

        public int getNgayLamThem() {
            return ngayLamThem;
        }

        public void setNgayLamThem(int ngayLamThem) {
            this.ngayLamThem = ngayLamThem;
        }

        public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {}
        @Override
        public String loaiNhanVien() {
        return "Nhan vien full time";
        }
        @Override
        public void tinhLuong() {
            System.out.println("Luong cua Nhan vien full time: "+loaiChucVu*luong+ngayLamThem);
        }
}
public class NhanVienPartTime extends NhanVien {
public NhanVienPartTime() {}
    int gioLamViec;

        public int getGioLamViec() {
            return gioLamViec;
        }

        public void setGioLamViec(int gioLamViec) {
            this.gioLamViec = gioLamViec;
        }
    public NhanVienPartTime(String ten, int gioLamViec) {}
    @Override 
    public String loaiNhanVien() {
    return "loai nhan vien";
    }
    @Override
    public void tinhLuong() {
        System.out.println("Luong cua nhan vien Part time:" +gioLamViec*luong);
    }
}

 class Mainclass {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.tinhLuong();
        nv.xuatThongTin();
        nv = new NhanVienPartTime();
        nv.tinhLuong();
        nv = new NhanVienFullTime();
        nv.tinhLuong();    
    }
 }
