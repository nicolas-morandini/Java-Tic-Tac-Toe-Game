package tic_tac_toe;

import java.util.Random;
import java.util.Scanner;

public class ttt {
	
	

	public static void main(String[] args) {
		
		boolean gameover = false;
		
		char[][] iniboard = {{' ', ' ', ' '},
		                    {' ', ' ', ' '},
		                    {' ', ' ', ' '}};
		
		char[][] board = {{' ', ' ', ' '},
				          {' ', ' ', ' '},
				          {' ', ' ', ' '}};
		
		char[][] board2 = {{'1', '2', '3'},
		                   {'4', '5', '6'},
		                   {'7', '8', '9'}};
	

		printBoard(board2);
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		int count1 = 0;
		
		while(gameover == false) {
			
		System.out.println("Where would you like to play? (1-9)");	
			
		String userInput = scanner.nextLine();
			
		System.out.println(userInput);	
		
		set_choice(board, userInput);
		
		printBoard(board);
		
		pc_turn(board);
		
		printBoard(board);
		
	
		
		gameover = game_won(gameover, board, 'X');
		gameover = game_won(gameover, board, 'O');
		
		
		
		
		if (gameover == true) {
			
			System.out.println("Would you like to play again? type yes or no");
			
			String play_again = scanner.nextLine();
			
			
		
			
			if(play_again !="no") {
			
				gameover = false;
				System.out.println("Lets play again");
				board = iniboard;
				printBoard(board2);
			}
				else {
					
					System.out.println("thanks for playing!");
				}
			
		
		}
		
		count1++;
		}
		
		
		
	}

	private static boolean game_won(boolean gameover, char[][] board, char symbol) {
		for (int i = 0; i <=2; i++) {
			
			
		if(board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol ) {
			
			gameover = true;
			System.out.println("Player "+ symbol + " won");
			break; }
		
		if(board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol ) {
			
			gameover = true;
			System.out.println("Player "+ symbol + " won");
			break; }
		
		if(board[0][0] == symbol && board[1][1] == symbol  && board[2][2] == symbol ) {
			
			gameover = true;
			System.out.println("Player "+ symbol + " won");
			break; }
		
		if(board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol ) {
			
			gameover = true;
			System.out.println("Player "+ symbol + " won");
			break; }
		
		
		}
		return gameover;
	}
	
	// Methods	
	// ------------------------------------------------------------------------------------------------------------------------------------
	
	private static void pc_turn(char[][] board) {
		System.out.println("Computers Turn!");
		
		Random rand = new Random();
		
		int min = 0;
		int max = 2;
		int count = 0;
		
		
		while(count<100) {
			
	//	if(board[0][0] !=''  )
			
		
		int randomNum_y = rand.nextInt((max - min) + 1) + min;
		int randomNum_x = rand.nextInt((max - min) + 1) + min;
		
		if (board[randomNum_y][randomNum_x] != 'X' && board[randomNum_y][randomNum_x] !='O') {
			
			board[randomNum_y][randomNum_x] = 'O';
			
			break;
			
		}
		
		
		
		
		
		else
			
		count ++;
		}
	}


	private static void set_choice(char[][] board, String userInput) {
		switch(userInput) {
		
		case "1":
		    board[0][0] = 'X';
		    break;
		
		case "2":
			board[0][1] = 'X';
			break;
			
		case "3":
			board[0][2] = 'X';
			break;
			
		case "4":
			board[1][0] = 'X';
			break;
			
		case "5":
			board[1][1] = 'X';
			break;	
		
		case "6":
			board[1][2] = 'X';
			break;	
			
		case "7":
			board[2][0] = 'X';
			break;	
			
		case "8":
			board[2][1] = 'X';
			break;	
			
		case "9":
			board[2][2] = 'X';
			break;	
			
		}
	}
	
	private static void printBoard(char[][] board) {
		System.out.println((board[0][0]) + "|" + (board[0][1]) + "|" + (board[0][2]));
		
		System.out.println("-+-+-");
		
		System.out.println((board[1][0]) + "|" + (board[1][1]) + "|" + (board[1][2]));
		
		System.out.println("-+-+-");
		
		System.out.println((board[2][0]) + "|" + (board[2][1]) + "|" + (board[2][2]));
	
	
	
	}

}
