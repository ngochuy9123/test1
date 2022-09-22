package lopCuThe;

import baseClass.Person;

public class NhanVienPhucVu extends Person {
	@Override
	public long tinhLuong(int hours) {
		return 24000*hours;
	}
}
