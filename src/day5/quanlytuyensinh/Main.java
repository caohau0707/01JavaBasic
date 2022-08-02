package day5.quanlytuyensinh;

public class Main {

	public static void main(String[] args) {
		
//		inDanhSach(nhapThongTin());
		SinhVien[] danhSachBatDau =nhapThongTin();
	//	SinhVien[] danhSachDaSap =sapXepTheoMa(danhSachBatDau);
	//	inDanhSach(danhSachDaSap);
		SinhVien[] danhSachDaSap = sapXepTheoHoTen(danhSachBatDau);
		inDanhSach(danhSachDaSap);
		
	}


	// Nhap thong tin sinh vien
	public static SinhVien[] nhapThongTin() {

		SinhVien s1 = new SinhVien();
		s1.mSv = "M07";
		s1.hoTen = "Hiep";
		s1.gioiTinh = "Nam";
		s1.userName = "hiep1";
		s1.passWord = "h1";
		s1.role = "Sinh Vien";

		SinhVien s2 = new SinhVien();
		s2.mSv = "M02";
		s2.hoTen = "Lan";
		s2.gioiTinh = "Nu";
		s2.userName = "Lan1";
		s2.passWord = "l1";
		s2.role = "Sinh Vien";

		SinhVien s3 = new SinhVien();
		s3.mSv = "M03";
		s3.hoTen = "Ngoc";
		s3.gioiTinh = "Nu";
		s3.userName = "ngoc1";
		s3.passWord = "n1";
		s3.role = "Sinh Vien";

		SinhVien s4 = new SinhVien();
		s4.mSv = "M04";
		s4.hoTen = "LanNgoc";
		s4.gioiTinh = "Nu";
		s4.userName = "ln1";
		s4.passWord = "h12";
		s4.role = "Sinh Vien";

		SinhVien s5 = new SinhVien();
		s5.mSv = "M05";
		s5.hoTen = "Binh";
		s5.gioiTinh = "Nam";
		s5.userName = "hhinh1";
		s5.passWord = "h5";
		s5.role = "Sinh Vien";

		SinhVien[] danhSachSinhVien = new SinhVien[5];
		danhSachSinhVien[0] = s1;
		danhSachSinhVien[1] = s2;
		danhSachSinhVien[2] = s3;
		danhSachSinhVien[3] = s4;
		danhSachSinhVien[4] = s5;
		return danhSachSinhVien;
	}
	public static void inDanhSach(SinhVien[] danhSachSinhVien) {
		for(int i=0;i<danhSachSinhVien.length;i++) {
			System.out.print(danhSachSinhVien[i].mSv + " ");
			System.out.print(danhSachSinhVien[i].hoTen + " ");
			System.out.print(danhSachSinhVien[i].gioiTinh + " ");
			System.out.print(danhSachSinhVien[i].userName + " ");
			System.out.print(danhSachSinhVien[i].passWord+ " ");
			System.out.print(danhSachSinhVien[i].role+ " ");
			System.out.println();
		}
	}
	//Cach 1
	public static SinhVien[] sapXepTheoMa(SinhVien[] danhSachSinhVien){
 		for(int i=0;i<danhSachSinhVien.length;i++) {
 			for(int j =0;j<danhSachSinhVien.length-1-i;j++) {
				if(danhSachSinhVien[j].mSv.compareTo(danhSachSinhVien[j+1].mSv) <0) {
					SinhVien temp =danhSachSinhVien[j];
					danhSachSinhVien[j]= danhSachSinhVien[j+1];
					danhSachSinhVien[j+1]=temp;
				}
		}
	}
 		return danhSachSinhVien;

}
	//cach2:
	public static SinhVien[]sapXepTheoHoTen(SinhVien[] danhSachSinhVien){
		for (int i=0;i<danhSachSinhVien.length;i++) {
			for(int j=0;j<danhSachSinhVien.length-1-i;j++) {
				if(danhSachSinhVien[j].hoTen.compareTo(danhSachSinhVien[j+1].hoTen)>0) {
					SinhVien temp = danhSachSinhVien[j];
					danhSachSinhVien[j] = danhSachSinhVien[j+1];
					danhSachSinhVien[j+1] = temp;
				}
			}
		}
		return danhSachSinhVien;
	}
}

	
