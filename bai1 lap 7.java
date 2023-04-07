public class HangSanXuat {
    private String tenHangSanXuat;
    private String tenQuocGia;
}
public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    
    @Override
    public double layVanToc() {
        return 0;
    }
    public void catCanh(){
        
    }
    public void haCanh(){
        
    }
}
abstract class PhuongTienDiChuyen {
    private String loaiPhuongTien;
    private HangSanXuat hangSanXuat;
    
    abstract double layVanToc();
    
    public String layTenHangSanXuat(){
        
        
    }
    public void batDau(){
        
    }
    public void tangToc(){
        
    }
    public void dungLai(){
        
    }
    
}
public class XeDap extends PhuongTienDiChuyen{

    @Override
    double layVanToc() {
        return 0;
    }
    

}
public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    @Override
    double layVanToc() {
        return 0;
    }
    
}
public class main {
  public static void main(String[] args) {
        MayBay mb = new MayBay();
        mb.catCanh();
        mb.haCanh();
        mb.layVanToc();
        
        XeOto oto = new XeOto();
        oto.layVanToc();
        
        XeDap xd = new XeDap();
        xd.layVanToc();
    }
    
}
