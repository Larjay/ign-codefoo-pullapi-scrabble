package com.codefooign.scrabblefind;

public class ScrabbleWord {

	private byte[] lettersInWord;
	private byte valueOfWord = 0;
	private String word;
	private int length;

	ScrabbleWord(String newWord) {
		lettersInWord = new byte[ScrabbleLetter.ALPHA_SIZE];
		
		for (int index = 0; index < ScrabbleLetter.ALPHA_SIZE; index++) {
			lettersInWord[index] = 0;
		}
		word = newWord;
		length = newWord.length();
		calcValueOfWord();
	}
	
	public int getLength() {
		return length;
	}

	public String getWord() {
		return word;
	}
	
	public void incrCountOfLetter(byte indexOfLetter) {
		this.lettersInWord[indexOfLetter]++;
	}
	
	public byte getCountOfLetter(byte indexOfLetter) {
		return lettersInWord[indexOfLetter];
	}
	
	public byte getValueOfWord() {
		return valueOfWord;
	}
	
	public void calcValueOfWord() {
		
		word = word.toUpperCase();
		for (int index = 0; index < word.length(); index++) {
			char testChar = word.charAt(index);
			
			switch (testChar) {
			
			case ScrabbleLetter.A:
				valueOfWord += ScrabbleLetter.A_VAL;
				lettersInWord[ScrabbleLetter.A_IND]++;
				break;
			case ScrabbleLetter.B:
				valueOfWord += ScrabbleLetter.B_VAL;
				lettersInWord[ScrabbleLetter.B_IND]++;
				break;
			case ScrabbleLetter.C:
				valueOfWord += ScrabbleLetter.C_VAL;
				lettersInWord[ScrabbleLetter.C_IND]++;
				break;
			case ScrabbleLetter.D:
				valueOfWord += ScrabbleLetter.D_VAL;
				lettersInWord[ScrabbleLetter.D_IND]++;
				break;
			case ScrabbleLetter.E:
				valueOfWord += ScrabbleLetter.E_VAL;
				lettersInWord[ScrabbleLetter.E_IND]++;
				break;
			case ScrabbleLetter.F:
				valueOfWord += ScrabbleLetter.F_VAL;
				lettersInWord[ScrabbleLetter.F_IND]++;
				break;
			case ScrabbleLetter.G:
				valueOfWord += ScrabbleLetter.G_VAL;
				lettersInWord[ScrabbleLetter.G_IND]++;
				break;
			case ScrabbleLetter.H:
				valueOfWord += ScrabbleLetter.H_VAL;
				lettersInWord[ScrabbleLetter.H_IND]++;
				break;
			case ScrabbleLetter.I:
				valueOfWord += ScrabbleLetter.I_VAL;
				lettersInWord[ScrabbleLetter.I_IND]++;
				break;
			case ScrabbleLetter.J:
				valueOfWord += ScrabbleLetter.J_VAL;
				lettersInWord[ScrabbleLetter.J_IND]++;
				break;
			case ScrabbleLetter.K:
				valueOfWord += ScrabbleLetter.K_VAL;
				lettersInWord[ScrabbleLetter.K_IND]++;
				break;
			case ScrabbleLetter.L:
				valueOfWord += ScrabbleLetter.L_VAL;
				lettersInWord[ScrabbleLetter.L_IND]++;
				break;
			case ScrabbleLetter.M:
				valueOfWord += ScrabbleLetter.M_VAL;
				lettersInWord[ScrabbleLetter.M_IND]++;
				break;
			case ScrabbleLetter.N:
				valueOfWord += ScrabbleLetter.N_VAL;
				lettersInWord[ScrabbleLetter.N_IND]++;
				break;
			case ScrabbleLetter.O:
				valueOfWord += ScrabbleLetter.O_VAL;
				lettersInWord[ScrabbleLetter.O_IND]++;
				break;
			case ScrabbleLetter.P:
				valueOfWord += ScrabbleLetter.P_VAL;
				lettersInWord[ScrabbleLetter.P_IND]++;
				break;
			case ScrabbleLetter.Q:
				valueOfWord += ScrabbleLetter.Q_VAL;
				lettersInWord[ScrabbleLetter.Q_IND]++;
				break;
			case ScrabbleLetter.R:
				valueOfWord += ScrabbleLetter.R_VAL;
				lettersInWord[ScrabbleLetter.R_IND]++;
				break;
			case ScrabbleLetter.S:
				valueOfWord += ScrabbleLetter.S_VAL;
				lettersInWord[ScrabbleLetter.S_IND]++;
				break;
			case ScrabbleLetter.T:
				valueOfWord += ScrabbleLetter.T_VAL;
				lettersInWord[ScrabbleLetter.T_IND]++;
				break;
			case ScrabbleLetter.U:
				valueOfWord += ScrabbleLetter.U_VAL;
				lettersInWord[ScrabbleLetter.U_IND]++;
				break;
			case ScrabbleLetter.V:
				valueOfWord += ScrabbleLetter.V_VAL;
				lettersInWord[ScrabbleLetter.V_IND]++;
				break;
			case ScrabbleLetter.W:
				valueOfWord += ScrabbleLetter.W_VAL;
				lettersInWord[ScrabbleLetter.W_IND]++;
				break;
			case ScrabbleLetter.X:
				valueOfWord += ScrabbleLetter.X_VAL;
				lettersInWord[ScrabbleLetter.X_IND]++;
				break;
			case ScrabbleLetter.Y:
				valueOfWord += ScrabbleLetter.Y_VAL;
				lettersInWord[ScrabbleLetter.Y_IND]++;
				break;
			case ScrabbleLetter.Z:
				valueOfWord += ScrabbleLetter.Z_VAL;
				lettersInWord[ScrabbleLetter.Z_IND]++;
				break;
				
			default:
				System.err.println("Character at " 
						+ index + 1 + " is not a valid character");
				break;
			}
		}
	}
	
}