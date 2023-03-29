public class Board {

    public static final int BOARD_SIZE = 10;

    public Field[][] board = new Field[BOARD_SIZE][BOARD_SIZE];

    public Board(){
        initBoard();
    }

    private void initBoard(){
        for(int i = 0; i < BOARD_SIZE; i++){
            for(int j = 0; j < BOARD_SIZE; j++){
                board[i][j] = new Field(i, j, State.BRAK);
            }
        }
    }


    public void printBoard(){

        printLeters();

        for(int i = 0; i < board.length; i++){
            if( i < 9 ){
                System.out.print(' ');
            }
            System.out.print( i + 1);
            System.out.print(" | ");

            for(int j = 0; j < board[i].length; j++){

                char letterState = board[i][j].stateToChar();
                System.out.print(letterState);
                System.out.print(" | ");
            }

            System.out.print('\n');
        }
    }


    private static void printLeters(){

        System.out.print("     ");

        for( int i = 0; i < BOARD_SIZE; i++){
            System.out.print((char) ('A' + i) );
            System.out.print(" | ");
        }
        System.out.println();
    }
}
