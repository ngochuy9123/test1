package test;

import lopCuThe.HambugerBo;
import lopCuThe.HambugerGa;

public class TestProduct {
	public static void main(String[] args) {
		
		HambugerBo ham = new HambugerBo();
		ham.prepare();
		System.out.println();
		HambugerGa hamg = new HambugerGa();
		hamg.prepare();
	}
}
