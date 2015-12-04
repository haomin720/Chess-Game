
public class PlayGame {
	public ChessBoard gameBoard;
	

	public void setUp(){
		Block [][] board = new Block [8][8];
		// initialize free block
		for (int r = 2; r < 6; r++) {
			boolean white;
			if (r%2 == 0)
				white  = true;
			else
				white = false;
			for (int c = 0; c < 8; c++) {
				String color;
				if (white)
					color = "white";
				else
					color = "black";
				int pos = (8-r)*10 + c + 1; //actual position on chess board
				Block tmp = new Block(pos, color, null, true);
				board[r][c] = tmp;
				//invert color for next block
				if (white)
					white = false;
				else
					white = true;
			}
		}
		// initialize black chessman
		Block tmp;
		//rooks
		ChessMan.Rook rook1 = new ChessMan.Rook(81, "black", true, 5);
		tmp = new Block (81, "white", rook1, false);
		board[0][0] = tmp;
		ChessMan.Rook rook2 = new ChessMan.Rook(88, "black", true, 5);
		tmp = new Block (88, "black", rook2, false);
		board[0][7] = tmp;
		//knights
		ChessMan.Knight  knight1 = new ChessMan.Knight(82, "black", true, 3);
		tmp = new Block (82, "black", knight1, false);
		board[0][1] = tmp;
		ChessMan.Rook knight2 = new ChessMan.Rook(87, "black", true, 3);
		tmp = new Block (87, "white", knight2, false);
		board[0][6] = tmp;
		//bishops
		ChessMan.Bishop bishop1 = new ChessMan.Bishop(83, "black", true, 3);
		tmp = new Block (83, "white", bishop1, false);
		board[0][2] = tmp;
		ChessMan.Bishop bishop2 = new ChessMan.Bishop(86, "black", true, 3);
		tmp = new Block (86, "black", bishop2, false);
		board[0][5] = tmp;
		//queen
		ChessMan.Queen queen = new ChessMan.Queen(84, "black", true, 9);
		tmp = new Block (84, "black", queen, false);
		board[0][3] = tmp;
		//king
		ChessMan.King king = new ChessMan.King(85, "black", true, 100);
		tmp = new Block (85, "white", king, false);
		board[0][4] = tmp;
		//pawns
		boolean white = false;
		for (int i = 0; i < 8; i++) {
			ChessMan.Pawn pawn = new ChessMan.Pawn(71+i, "black", true, 1);
			String color;
			if (white)
				color = "white";
			else
				color = "black";
			tmp = new Block(71+i, color, pawn, false);
			board[1][i] = tmp;
			//invert board color
			if (white)
				white = false;
			else
				white = true;
		}
		
		// initialize white chessman
	}
	
	public static void main(String[] args) {
		
	}

}
