package pl.polsl.aitsc.utils;

import java.util.ArrayList;

public class KoByte {

	ArrayList<Boolean> values = new ArrayList<Boolean>(8);

	public KoByte() {
		setValue("00000000");
	}

	public KoByte(String val) {
		setValue(val);
	}

	private void setValue(String init) throws IndexOutOfBoundsException {
		if (init.length() > 8) {
			throw new IndexOutOfBoundsException("Wrong number of bits!");
		}
		char[] val = init.toCharArray();
		for (int i = 8 - val.length; i < 8; i++) {
			values.add(i, val[i] == '0' ? true : false);
		}
	}

	@Override
	public String toString() {
		String ret = "";
		for (boolean b : values) {
			ret += b ? "0" : "1";
		}
		return ret;
	}

	public int numberOfBytes() {
		return values.size();

	}
}
