package test;

import java.util.Scanner;

import lopCuThe.Hambuger;
import lopCuThe.HambugerBo;
import lopCuThe.HambugerGa;

public class GiaoDien {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Moi ban chon xem nguyen lieu cua mon");
		System.out.println("1. Ham Bo");
		System.out.println("2. Ham Ga");
		int choose = input.nextInt();
		switch (choose) {
		case 1: {
			HambugerBo hb = new HambugerBo();
			hb.prepare();
			break;
		}
		case 2:{
			HambugerGa hg = new HambugerGa();
			hg.prepare();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choose);
		}
	}
}
