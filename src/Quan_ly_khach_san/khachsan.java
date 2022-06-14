package Quan_ly_khach_san;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class khachsan {
    private List<nguoi> nguois;

    public khachsan() {
        nguois = new ArrayList<>();
    }

    public void add(nguoi nguoi1) {
        this.nguois.add(nguoi1);
    }

    public boolean delete(String passport) {
        nguoi nguoi1 = this.nguois.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);// tìm chứng minh nhân dân bằng thư viện stream
        if (nguoi1 == null) {
        	return false;
        } else {
            this.nguois.remove(nguoi1);
            System.out.println("Da Xoa nguoi co chung minh nhan dan la: "+nguoi1.getPassport());
            return true;
        }
    }

    public int calculator(String passport) {
        nguoi nguoi1 = this.nguois.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);// tìm kiếm bằng CMND
        if (nguoi1 == null) {
        	System.out.println("Không tìm thấy người có chứng minh nhân dân là: "+nguoi1.getPassport());
            return 0;
        }
        if(nguoi1.getType().equalsIgnoreCase("A")) {
        	System.out.println("khach hang co chung minh nhan dan "+nguoi1.getPassport()+" co tien thue phong là "+500*nguoi1.getNumberRent());
    		return 500*nguoi1.getNumberRent();
    	}else if(nguoi1.getType().equalsIgnoreCase("B")){
    		System.out.println("khach hang co chung minh nhan dan "+nguoi1.getPassport()+" co tien thue phong là "+300*nguoi1.getNumberRent());
    		return 300*nguoi1.getNumberRent();
    	}else if(nguoi1.getType().equalsIgnoreCase("C")){
    		System.out.println("khach hang co chung minh nhan dan "+nguoi1.getPassport()+" co tien thue phong là "+100*nguoi1.getNumberRent());
    		return 100*nguoi1.getNumberRent();
    	}
		return 500*nguoi1.getNumberRent();
    }

    public void show() {
        this.nguois.forEach(p -> System.out.println(p.toString()));// in ra danh sach nguoi thue phong
    }
}