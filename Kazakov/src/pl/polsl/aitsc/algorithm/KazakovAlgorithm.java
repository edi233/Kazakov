package pl.polsl.aitsc.algorithm;

import java.util.Set;

public class KazakovAlgorithm {

	private SigmaMatrix sigma;
	private PiMatrix pi;

	public KazakovAlgorithm(SigmaMatrix sigma, PiMatrix pi) {
		this.setSigmaMatrix(sigma);
		this.setPiMatrix(pi);
	}

	public static Set<Iteration> getImpilcators(){
		return null;
		
	}
	
	
	public SigmaMatrix getSigmaMatrix() {
		return sigma;
	}

	public void setSigmaMatrix(SigmaMatrix sigma) {
		this.sigma = sigma;
	}


	public PiMatrix getPiMatrix() {
		return pi;
	}


	public void setPiMatrix(PiMatrix pi) {
		this.pi = pi;
	}
	
	


}
