package org.klomp.snark;

public class PieceFrequency implements Comparable<PieceFrequency> {
	int pieceNumber;
	int frequency;
	
	PieceFrequency(int pieceNumber, int frequency){
		this.pieceNumber = pieceNumber;
		this.frequency = frequency;
	}

	public int getPieceNumber() {
		return pieceNumber;
	}

	public void setPieceNumber(int pieceNumber) {
		this.pieceNumber = pieceNumber;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	public void addOne(){
		frequency++;
	}
	
	public int compareTo(PieceFrequency pf){
		return ((pf.getFrequency() < frequency) ? 1 : (frequency < pf.getFrequency()) ? -1 : 0);
	}
}
