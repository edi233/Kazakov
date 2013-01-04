package pl.polsl.aitsc;

import pl.polsl.aitsc.algorithm.KazakovAlgorithm;
import pl.polsl.aitsc.utils.Input;
import pl.polsl.aitsc.utils.KoByte;

public class Master {

	/**
	 * Entry point of the application
	 * 
	 * @param args
	 *            - input file name
	 */
	public static void main(String[] args) {
//		if (!(args.length > 0)) {
//			return;
//		}
		String fileName = "test.txt";
		
		KazakovAlgorithm kazakov = Input.getDataFromFile(fileName);
		
		KoByte kb = null;
			kb = new KoByte("01010101");
		System.out.println(kb.toString());
	}

}
