package pl.polsl.aitsc.algorithm;

import java.util.ArrayList;

import pl.polsl.aitsc.utils.AbstractMatrix;
import pl.polsl.aitsc.utils.KoByte;

public class PiMatrix extends AbstractMatrix{

	public PiMatrix(ArrayList<KoByte> input) {
		for (KoByte kob : input) {
			try {
				data.remove(input.indexOf(kob));
			} catch (IndexOutOfBoundsException e) {
			}
			data.add(data.indexOf(kob), kob);
		}
	}
}
