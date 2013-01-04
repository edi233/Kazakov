package pl.polsl.aitsc.utils;

import java.util.ArrayList;


public abstract class AbstractMatrix {

	protected ArrayList<KoByte> data = new ArrayList<>();

	public AbstractMatrix() {
		super();
	}

	void addRow(KoByte row) {
		if(data.size()!=0){
			if(row.numberOfBytes() == data.get(0).numberOfBytes()){
				
			}else{
				throw new IndexOutOfBoundsException("Rows must be equal in length.");
			}
		}
	}

}