package lopCuThe;

import java.util.Arrays;

public class HambugerGa extends Hambuger {
	
	
	protected static String[] congThuc = Arrays.copyOf(thanhPhan, thanhPhan.length);
	public static void them() {
		congThuc = Arrays.copyOf(congThuc, congThuc.length+1);
		congThuc[congThuc.length-1] = ThitGa.ten;
	}
	@Override
	public void prepare() {
		HambugerGa.them();
		for(String str:congThuc) {
			System.out.print(str+"  ");
		}
	}
}
