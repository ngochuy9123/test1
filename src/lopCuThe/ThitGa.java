package lopCuThe;

import baseClass.Materials;

public class ThitGa extends Materials {
	protected static int soLuong = 25;
	protected static String ten ="Thịt Ga";
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public void kiemTraSoLuong() {
		System.out.println("Số lượng "+ten+" còn lại là "+soLuong);
	}
}
