package QuanLiCanBo;

public class NhanVien extends CanBo{
    private String CongViec;


    public NhanVien(String name, int age, String gender, String address, String congViec) {
        super(name, age, gender, address);
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }
    public NhanVien(){

    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", CongViec='" + CongViec + '\'' +
                '}';
    }
}
