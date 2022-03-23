package QuanLiCanBo;

public class CongNhan extends CanBo{
    private int lever;

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    public CongNhan(String name, int age, String gender, String address, int lever) {
        super(name, age, gender, address);
        this.lever = lever;
    }
    public CongNhan(){

    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", lever=" + lever +
                '}';
    }
}
