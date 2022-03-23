package QuanLiCanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    public static void main(String[] args) {

        DsCanBo ds=new DsCanBo();
        Scanner sc = new Scanner(System.in);
//        CanBo x=new CanBo();

        boolean flag=true;
        while (flag){
            System.out.println("moi ban chon");
            System.out.println("1.them can bo \n2.xuat danh sach \n3.in so luong \n4.xoa can bo \n5.update can bo \n6.thoat");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("1.them NhanVien \n2.them CongNhan \n3.them KySu");
                    int opt=sc.nextInt();
                    switch (opt){
                        case 1:
                            System.out.println("nhap ten \n");
                            sc=new Scanner(System.in);
                            String name=sc.nextLine();
                            System.out.println("nhap tuoi \n");
                            int age=sc.nextInt();
                            sc=new Scanner(System.in);
                            System.out.println("nhap gender \n");
                            String gender=sc.nextLine();
                            System.out.println("nhap address \n");
                            String address=sc.nextLine();
                            System.out.println("nhap cong viec \n");
                            String congviec=sc.nextLine();
                            NhanVien nv=new NhanVien(name,age,gender,address,congviec);
                            ds.themCanBo(nv);
                            break;
                        case 2:
                            System.out.println("nhap ten \n");
                            sc=new Scanner(System.in);
                            String name1=sc.nextLine();
                            System.out.println("nhap age \n");
                            int age1=sc.nextInt();
                            sc=new Scanner(System.in);
                            System.out.println("nhap gender \n");
                            String gender1=sc.nextLine();
                            System.out.println("nhap address \n");
                            String address1=sc.nextLine();
                            System.out.println("nhap lever \n");
                            int lever=sc.nextInt();
                            CongNhan cn=new CongNhan(name1,age1,gender1,address1,lever);
                            ds.themCanBo(cn);
                            break;
                        case 3:
                            System.out.println("nhap ten \n");
                            sc=new Scanner(System.in);
                            String name2=sc.nextLine();
                            System.out.println("nhap age \n");
                            int age2=sc.nextInt();
                            sc=new Scanner(System.in);
                            System.out.println("nhap gender \n");
                            String gender2=sc.nextLine();
                            System.out.println("nhap address \n");
                            String address2=sc.nextLine();
                            System.out.println("nhap nganh dao tao \n");
                            String nganhdaotao=sc.nextLine();
                            KySu ks=new KySu(name2,age2,gender2,address2,nganhdaotao);
                            ds.themCanBo(ks);
                            break;
                    }
                    break;
                case 2:
//                    CanBo cb=new CanBo();
                    System.out.println("danh sach can bo");
                    ds.xuatDanhSach();
                    break;
                case 3:
                    System.out.println("so luong can bo");
                    System.out.println(ds.inSoLuong());
                    break;
                case 4:
                    System.out.println("nhap ten can bo muon xoa");
                    sc=new Scanner(System.in);
                    String delname=sc.nextLine();
//                    CanBo cbx=new CanBo(delname);
                    if(ds.xoaCanBo(delname)==true){
                        System.out.println("xoa thanh cong");
                    }else{
                        System.out.println("xoa that bai1");
                }
                    break;
                case 5:
                    System.out.println("cap nhat ten moi");
                    sc=new Scanner(System.in);
                    String nameNew=sc.nextLine();
                    System.out.println("cap nhat ten cu");
                    String nameOle=sc.nextLine();
                    if(ds.updateCanBo(nameNew,nameOle)==true){
                        System.out.println("update thanh cong");
                    }else{
                        System.out.println("update that bai");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menu);
            }
        }
    }
}
