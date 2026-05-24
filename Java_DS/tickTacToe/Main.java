package tickTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char board[][] = new char[3][3];
        for(int row = 0 ; row < board.length ; row++){
            for(int col = 0 ; col < board[row].length; col++){
                board[row][col] = ' ';
            }
        }

        char palyer = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while (!gameOver) {
            printBoard(board);
            System.out.println("Player" + palyer + " enter : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = palyer;
                gameOver = haveWon(board, palyer);
                if(gameOver){
                    System.out.print("Player " + palyer + " has won..");
                }else{
                    if (palyer == 'X') {
                        palyer = 'O';
                    }else{
                        palyer= 'X';
                    }
                }
            }else{
                System.out.println("Invalid move...");
            }
        }
        printBoard(board);

    }

    public static boolean haveWon(char [][]board, char palyer){
        
        // row
        for(int row = 0 ; row < board.length ; row++){
           if(board[row][0] == palyer && board[row][1] == palyer && board[row][2] == palyer ){
            return true;
           }
        }

        //col
        for(int col = 0 ; col < board[0].length ; col++){
           if(board[0][col] == palyer && board[1][col] == palyer && board[2][col] == palyer ){
            return true;
           }
        }

        // Diagonal
        if(board[0][2] == palyer && board[1][1]== palyer && board[2][0]== palyer){
            return true;
        }

        return false;

    }

    public static void printBoard(char[][] board) {
        for(int row = 0 ; row < board.length ; row++){
            for(int col = 0 ; col < board[row].length; col++){
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
