package com.codefooign.scrabblefind;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleFind {
		
	private static ArrayList<ScrabbleWord> wordList;
	private static ScrabblePlayer player;
	private static int wordListSize;
	
	private static ArrayList<ScrabbleWord> GetWordsFromFile(String source) {
		
		ArrayList<ScrabbleWord> listFromFile = 
				new ArrayList<ScrabbleWord>();
		
		try {
			File inputFile = new File(source);
			Scanner scanner = new Scanner(inputFile);
			
			while (scanner.next() != null) {
				String temp = scanner.next();
				listFromFile.add(new ScrabbleWord(temp));
			}
		
			scanner.close();
			
		} catch(Exception e) {
			e.getMessage();
		}
		
		return listFromFile;
	}
	
	/**
	 * Test program to find the highest scoring scrabble word with a 
	 * set of letters
	 * @param args first index of command line argument are a string of letters
	 * @param args second index of command line argument to be used as file path
	 * 		  for a file listing words to be used
	 */
	public static void main(String[] args) {
		
		player = new ScrabblePlayer();
		
		String filePath = null;
		String letters = null;
		
		try {
			letters = args[0].toUpperCase();
			System.out.println("Letters are: " + letters);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			filePath = args[1];
			System.out.println("File Path is: " + filePath);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		countLettersPlayer(player, letters);
		
		wordList = GetWordsFromFile(filePath);
		
		wordListSize = wordList.size();
		
		calculateBest(player);
		System.out.println("Best word: " + player.getPlayerWord());
		
	}

	/**
	 * Displays a list of words and their point values
	 */
	@SuppressWarnings("unused")
	private static void showWordValues() {
		
		for (int index = 0; index < wordListSize; index++) {
			
			ScrabbleWord wordRef = wordList.get(index);
			System.out.println(wordRef.getWord() + " " + wordRef.getValueOfWord());
		}
	}
	
	private static void calculateBest(ScrabblePlayer player) {
		
		int matchesFound = 0;
		
		for (int wordIndex = 0; wordIndex < wordListSize; wordIndex++) {
			
			matchesFound = 0;
			
			if (player.getPlayerValue() > 
				wordList.get(wordIndex).getValueOfWord()) {
			
				continue;
			}
			
			for (byte alphaIndex = 0; alphaIndex < ScrabbleLetter.ALPHA_SIZE; alphaIndex++) {
				
				int playerCount = player.getCountOfLetter(alphaIndex);
				int wordCount = wordList.get(wordIndex).getCountOfLetter(alphaIndex);
				
				if (wordCount > 0 && playerCount >= wordCount) {
					matchesFound += wordCount;
				}
				
			}
			
			if (matchesFound == wordList.get(wordIndex).getLength()) {
				player.setPlayerValue(wordList.get(wordIndex).getValueOfWord());
				player.setPlayerWord(wordList.get(wordIndex).getWord());
			}
		}
	}

	private static void countLettersPlayer(ScrabblePlayer player, 
			String letters) {
		
		int argLengthLetters = letters.length();
		char charArray[] = new char[argLengthLetters];
		
		for (int charIndex = 0; charIndex < argLengthLetters; charIndex++) {
			charArray[charIndex] = letters.charAt(charIndex);
			
			switch (charArray[charIndex]) {
			case ScrabbleLetter.A:
				player.incrCountOfLetter(ScrabbleLetter.A_IND);
				break;
			case ScrabbleLetter.B:
				player.incrCountOfLetter(ScrabbleLetter.B_IND);
				break;
			case ScrabbleLetter.C:
				player.incrCountOfLetter(ScrabbleLetter.C_IND);
				break;
			case ScrabbleLetter.D:
				player.incrCountOfLetter(ScrabbleLetter.D_IND);
				break;
			case ScrabbleLetter.E:
				player.incrCountOfLetter(ScrabbleLetter.E_IND);
				break;
			case ScrabbleLetter.F:
				player.incrCountOfLetter(ScrabbleLetter.F_IND);
				break;
			case ScrabbleLetter.G:
				player.incrCountOfLetter(ScrabbleLetter.G_IND);
				break;
			case ScrabbleLetter.H:
				player.incrCountOfLetter(ScrabbleLetter.H_IND);
				break;
			case ScrabbleLetter.I:
				player.incrCountOfLetter(ScrabbleLetter.I_IND);
				break;
			case ScrabbleLetter.J:
				player.incrCountOfLetter(ScrabbleLetter.J_IND);
				break;
			case ScrabbleLetter.K:
				player.incrCountOfLetter(ScrabbleLetter.K_IND);
				break;
			case ScrabbleLetter.L:
				player.incrCountOfLetter(ScrabbleLetter.L_IND);
				break;
			case ScrabbleLetter.M:
				player.incrCountOfLetter(ScrabbleLetter.M_IND);
				break;
			case ScrabbleLetter.N:
				player.incrCountOfLetter(ScrabbleLetter.N_IND);
				break;
			case ScrabbleLetter.O:
				player.incrCountOfLetter(ScrabbleLetter.O_IND);
				break;
			case ScrabbleLetter.P:
				player.incrCountOfLetter(ScrabbleLetter.P_IND);
				break;
			case ScrabbleLetter.Q:
				player.incrCountOfLetter(ScrabbleLetter.Q_IND);
				break;
			case ScrabbleLetter.R:
				player.incrCountOfLetter(ScrabbleLetter.R_IND);
				break;
			case ScrabbleLetter.S:
				player.incrCountOfLetter(ScrabbleLetter.S_IND);
				break;
			case ScrabbleLetter.T:
				player.incrCountOfLetter(ScrabbleLetter.T_IND);
				break;
			case ScrabbleLetter.U:
				player.incrCountOfLetter(ScrabbleLetter.U_IND);
				break;
			case ScrabbleLetter.V:
				player.incrCountOfLetter(ScrabbleLetter.V_IND);
				break;
			case ScrabbleLetter.W:
				player.incrCountOfLetter(ScrabbleLetter.W_IND);
				break;
			case ScrabbleLetter.X:
				player.incrCountOfLetter(ScrabbleLetter.X_IND);
				break;
			case ScrabbleLetter.Y:
				player.incrCountOfLetter(ScrabbleLetter.Y_IND);
				break;
			case ScrabbleLetter.Z:
				player.incrCountOfLetter(ScrabbleLetter.Z_IND);
				break;
				
			default:
				break;
			}	
		}
	}
	
}