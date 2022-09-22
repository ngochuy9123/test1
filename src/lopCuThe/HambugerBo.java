package lopCuThe;

import java.util.Arrays;

public class HambugerBo extends Hambuger {
	static ThitBo meat = new ThitBo();
	protected static String thit = meat.getTen();
	static String[] congThuc = Hambuger.thanhPhan;
	
	public HambugerBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HambugerBo(long id, long cost, String name, String type, String[] materials) {
		super(id, cost, name, type, materials);
		// TODO Auto-generated constructor stub
	}
	public static void them() {
		congThuc = Arrays.copyOf(congThuc, congThuc.length+1);
		congThuc[congThuc.length-1] = thit;
	}
	@Override
	public void prepare() {
		HambugerBo.them();
		for(String str:congThuc) {
			System.out.print(str+"  ");
		}
	}
	public void	test() {
		
		System.out.println(congThuc.length);
	}
	
	
	
}
