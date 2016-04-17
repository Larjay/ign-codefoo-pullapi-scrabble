package com.codefooign.scrabblefind;

public class ScrabblePlayer {
	
	private byte[] countOfLetters;
	private int pValue;
	private String pWord;

	ScrabblePlayer() {
		pValue = 0;
		countOfLetters = new byte[ScrabbleLetter.ALPHA_SIZE];
		
		for (int index = 0; index < ScrabbleLetter.ALPHA_SIZE; index++) {
			countOfLetters[index] = 0;
		}
	}
	
	public void incrCountOfLetter(byte indexOfLetter) {
		countOfLetters[indexOfLetter]++;
	}
	
	public byte getCountOfLetter(byte indexOfLetter) {
		return this.countOfLetters[indexOfLetter];
	}

	public int getPlayerValue() {
		return pValue;
	}

	public void setPlayerValue(int playerValue) {
		this.pValue = playerValue;
	}

	public String getPlayerWord() {
		return pWord;
	}

	public void setPlayerWord(String pWord) {
		this.pWord = pWord;
	}
}