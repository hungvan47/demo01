package QuanLiCanBo;

public class KySu extends CanBo {
    private String NganhDaoTao;

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    public KySu(String name, int age, String gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        NganhDaoTao = nganhDaoTao;
    }
    public KySu(){

    }

    @Override
    public String toString() {
        return "KySu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", NganhDaoTao='" + NganhDaoTao + '\'' +
                '}';
    }
}
