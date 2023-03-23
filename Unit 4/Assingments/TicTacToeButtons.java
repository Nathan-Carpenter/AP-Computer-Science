import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeButtons {

  static int turn = 1;
  public static void main(String[] args) {

    System.out.println("\033[H\033[2J");


    JFrame window = new JFrame();
    JPanel gamePanel = new JPanel();
  
    window.setSize(300, 300);
    gamePanel.setSize(300, 300);
    gamePanel.setLayout(new GridLayout(3, 3));

    boolean ongoing = true;

    GameSquare[][] board = new GameSquare[3][3];

    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        GameSquare newSquare = new GameSquare();
        
        newSquare.addActionListener( new SquareListener() );
        
        board[row][col] = newSquare;
        
        gamePanel.add(newSquare);
        
      }
      
    }

    window.add(gamePanel);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    while(ongoing){
      int winMessage = checkWinner(board);

      if (winMessage == 1){
        System.out.println("Player X Wins!");
        ongoing = false;
        window.dispose();
        System.out.println(" ");
      }
      else if (winMessage == -1){
        System.out.println("Player O Wins!");
        ongoing = false;
        window.dispose();
        System.out.println(" ");
      }
    }
  }

  public static int checkWinner(GameSquare[][] board) {
    int winner = 0;

    for(int y = 0; y < 3; y++){
      if(board[y][0].value != 0 && board[y][0].value == board[y][1].value && board[y][0].value == board[y][2].value){
        winner = board[y][0].value;
      }
    }

    for(int x = 0; x < 3; x++){
      if(board[0][x].value != 0 && board[0][x].value == board[1][x].value && board[0][x].value == board[2][x].value){
        winner = board[0][x].value;
      }
    }

    if(board[1][1].value != 0){
      if(board[0][0].value == board[1][1].value && board[0][0].value == board[2][2].value){
        winner = board[0][0].value;
      }

      if(board[2][0].value == board[1][1].value && board[2][0].value == board[0][2].value){
        winner = board[2][0].value;
      }
    }
    return winner;
  }
}

class GameSquare extends JButton {
  int value = 0;
}

class SquareListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    GameSquare clickedSquare = (GameSquare)e.getSource();
    String squareText = "";
    if (TicTacToeButtons.turn == 1 && clickedSquare.value == 0) {
      clickedSquare.value = TicTacToeButtons.turn;
      squareText = "X";
    }
    if (TicTacToeButtons.turn == -1 && clickedSquare.value == 0) {
      clickedSquare.value = TicTacToeButtons.turn;
      squareText = "O";
    }
    if(squareText.equals("X") || squareText.equals("O")){
      clickedSquare.setText(squareText);
      TicTacToeButtons.turn = -1 * TicTacToeButtons.turn;
    }
  }
}
