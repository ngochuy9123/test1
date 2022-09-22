package lopCuThe;

import baseClass.Materials;

public class ThitBo extends Materials {
	protected static int soLuong = 20;
	protected String ten ="Thịt Bò";
	
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
