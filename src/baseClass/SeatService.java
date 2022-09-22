package baseClass;

public class SeatService implements ISeatService {
	public static boolean choNgoi[]= {true,false,true,false,false};

	public void findEmptyTable(boolean[] seats) {
		System.out.print("Cho con trong la: ");
		for(int i=0;i<seats.length;i++) {
			if(seats[i]!= true) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public boolean isFull(boolean[] seats) {
		for(int i=0;i<seats.length;i++) {
			if(seats[i]==false) {
				return false;
			}
		}
		return true;
	}
	public static void name() {
		
	}
}
