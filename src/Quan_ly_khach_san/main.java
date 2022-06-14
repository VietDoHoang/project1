package Quan_ly_khach_san;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		nguoi khach1 = new nguoi("Do Hoang Viet",22,"022201000100","0515","A",1);
		nguoi khach2 = new nguoi("Tran Duc Viet",23,"022201000101","0616","B",2);
		nguoi khach3 = new nguoi("Pham Nam Viet",23,"022201000102","0717","C",3);
		
		khachsan danhsach = new khachsan();
		danhsach.add(khach1);
		danhsach.add(khach2);
		danhsach.add(khach3);
		danhsach.show();
		danhsach.delete("022201000102");
		danhsach.show();
		danhsach.calculator("022201000100");
		danhsach.calculator("022201000101");
	}

}
