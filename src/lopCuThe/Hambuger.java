package lopCuThe;

import java.util.Arrays;

import baseClass.Product;

public abstract class Hambuger extends Product {
	protected static long cost = 7000;
	protected static String[] thanhPhan = {"Banh Mi","Rau Cai","Tuong ot","Tuong ca"};
	
	public Hambuger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hambuger(long id, long cost, String name, String type, String[] materials) {
		super(id, cost, name, type, materials);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void prepare() {
		for(String str:materials) {
			System.out.print(str+"   ");
		}
	}
	
}
