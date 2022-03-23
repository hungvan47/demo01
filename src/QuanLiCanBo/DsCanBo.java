package QuanLiCanBo;

import java.util.ArrayList;

public class DsCanBo {
    ArrayList <CanBo>list=new ArrayList<>(20);
//    CanBo x=new CanBo();
    public void themCanBo(CanBo x){
        list.add(x);
    }
    public void xuatDanhSach(){
        for (CanBo cb:list){
            if (cb instanceof NhanVien){
                System.out.println(cb.toString());
            }else if (cb instanceof CongNhan){
                System.out.println(cb.toString());
            }if (cb instanceof KySu){
                System.out.println(cb.toString());
            }
        }
    }
    public int inSoLuong(){
        return list.size();
    }
    public boolean xoaCanBo(String namedel){
//        CanBo
        for (CanBo cb:list){
            if(cb.getName().equalsIgnoreCase(namedel)){
                list.remove(cb);
                return true;
            }
        }
        return false;
    }
   public boolean updateCanBo(String nameNew,String nameOle){
       for (CanBo cb:list){
           if(cb.getName().equalsIgnoreCase(nameOle)){
               cb.setName(nameNew);
               return true;
           }
       }
       return false;
   }
}
