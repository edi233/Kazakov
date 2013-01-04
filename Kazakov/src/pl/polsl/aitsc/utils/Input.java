package pl.polsl.aitsc.utils;

import pl.polsl.aitsc.algorithm.KazakovAlgorithm;
import pl.polsl.aitsc.algorithm.PiMatrix;
import pl.polsl.aitsc.algorithm.SigmaMatrix;

public class Input {
	

	/**
	 * HOWTO <br/>
	 * 
	 * <ol>
	 * <li>Get one line from file
	 * <li>Is it empty?
	 * <ul>
	 * <li>NO: Create an {@link KoByte} object and add it to {@link SigmaMatrix}
	 * <li>YES: Skip and the next: Create an {@link KoByte} object and add it to {@link PiMatrix}
	 * </ul>
	 * <li>From sigma and pi create and return an {@link Input} Object
	 * </ol>
	 *
	 * @param fileName - name of the file to parse
	 * @return {@link KazakovAlgorithm} with a sigma and pi matrixes to use
	 */
	public static KazakovAlgorithm getDataFromFile(String fileName) {

		// TODO Get data from file like in the example

		// TODO Set up sigma matrix
		SigmaMatrix sigma = null;
		// TODO Set up pi matrix
		PiMatrix pi = null;

		return new KazakovAlgorithm(sigma, pi);
	}


}
