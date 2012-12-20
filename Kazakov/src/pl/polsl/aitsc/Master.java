package pl.polsl.aitsc;

import pl.polsl.aitsc.algorithm.KazakovMatrix;
import pl.polsl.aitsc.algorithm.PiMatrix;
import pl.polsl.aitsc.algorithm.RawData;
import pl.polsl.aitsc.algorithm.SigmaMatrix;
import pl.polsl.aitsc.file.operations.Input;

public class Master {

	/**
	 * Entry point of the application
	 * 
	 * @param args
	 *            - input file
	 */
	public static void main(String[] args) {
//		if (!(args.length > 0)) {
//			return;
//		}
		String fileName = "test.txt";
		
		RawData rawData= Input.getDataFromFile(fileName);
		SigmaMatrix sigma = Input.getSigmaMatrix(rawData);
		PiMatrix pi = Input.getPiMatrix(rawData);
		
		KazakovMatrix km = new KazakovMatrix(sigma,pi);
		
		 byte b = (byte) 0b10001000;
		System.out.print(Byte.toString(b));

	}

}
