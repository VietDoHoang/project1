package bai_tap_tuan_29;

public class DemSo {
	public int soSoChiaHet5(int a) {
		int count =0;
		for(int i=1;i<=a;i++) {
			if(i%5==0) {
				count ++;
			}
		}
		return count;
	}
	public int soSoChiaHet5Du1(int a) {
		int count =0;
		for(int i=1;i<=a;i++) {
			if(i%5==1) {
				count ++;
			}
		}
		return count;
	}
	public int soSoChiaHet5Du2(int a) {
		int count =0;
		for(int i=1;i<=a;i++) {
			if(i%5==2) {
				count ++;
			}
		}
		return count;
	}
	public int soSoChiaHet5Du3(int a) {
		int count =0;
		for(int i=1;i<=a;i++) {
			if(i%5==3) {
				count ++;
			}
		}
		return count;
	}


}
