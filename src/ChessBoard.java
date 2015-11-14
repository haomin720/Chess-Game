
public class ChessBoard {
	
	public Block [][] board = new Block [8][8];
	public ChessMan.King kingWhite;
	public ChessMan.King kingBlack;
	public ChessMan.Queen queenWhite;
	public ChessMan.Queen queenBlack;
	public ChessMan.Rook rookOneWhite;
	public ChessMan.Rook rookTwoWhite;
	public ChessMan.Rook rookOneBlack;
	public ChessMan.Rook rookTwoBlack;
	public ChessMan.Bishop bishopOneWhite;
	public ChessMan.Bishop bishopTwoWhite;
	public ChessMan.Bishop bishopOneBlack;
	public ChessMan.Bishop bishopTwoBlack;
	public ChessMan.Knight knightOneWhite;
	public ChessMan.Knight knightTwoWhite;
	public ChessMan.Knight knightOneBlack;
	public ChessMan.Knight knightTwoBlack;
	public ChessMan.Piece oneWhite;
	public ChessMan.Piece oneBlack;
	public ChessMan.Piece twoWhite;
	public ChessMan.Piece twoBlack;
	public ChessMan.Piece threeWhite;
	public ChessMan.Piece threeBlack;
	public ChessMan.Piece fourWhite;
	public ChessMan.Piece fourBlack;
	public ChessMan.Piece fiveWhite;
	public ChessMan.Piece fiveBlack;
	public ChessMan.Piece sixWhite;
	public ChessMan.Piece sixBlack;
	public ChessMan.Piece sevenWhite;
	public ChessMan.Piece sevenBlack;
	public ChessMan.Piece eightWhite;
	public ChessMan.Piece eightBlack;
	
	public ChessBoard(Block[][] board){
		this.board = board;
	}
	
	public void boardInitialization(){
		board[0][0] = new Block("A8", "white", rookOneBlack, false);
		board[0][1] = new Block("B8", "black", knightOneBlack, false);
		board[0][2] = new Block("C8", "white", bishopOneBlack, false);
		board[0][3] = new Block("D8", "black", queenBlack, false);
		board[0][4] = new Block("E8", "white", kingBlack, false);
		board[0][5] = new Block("F8", "black", bishopTwoBlack, false);
		board[0][6] = new Block("G8", "white", knightTwoBlack, false);
		board[0][7] = new Block("H8", "black", rookTwoBlack, false);
		board[1][0] = new Block("A7", "black", oneBlack, false);
		board[1][1] = new Block("B7", "white", twoBlack, false);
		board[1][2] = new Block("C7", "black", threeBlack, false);
		board[1][3] = new Block("D7", "white", fourBlack, false);
		board[1][4] = new Block("E7", "black", fiveBlack, false);
		board[1][5] = new Block("F7", "white", sixBlack, false);
		board[1][6] = new Block("G7", "black", sevenBlack, false);
		board[1][7] = new Block("H7", "white", eightBlack, false);
		board[2][0] = new Block("A6", "white", null, true);
		board[2][1] = new Block("B6", "black", null, true);
		board[2][2] = new Block("C6", "white", null, true);
		board[2][3] = new Block("D6", "black", null, true);
		board[2][4] = new Block("E6", "white", null, true);
		board[2][5] = new Block("F6", "black", null, true);
		board[2][6] = new Block("G6", "white", null, true);
		board[2][7] = new Block("H6", "black", null, true);
		board[3][0] = new Block("A5", "black", null, true);
		board[3][1] = new Block("B5", "white", null, true);
		board[3][2] = new Block("C5", "black", null, true);
		board[3][3] = new Block("D5", "white", null, true);
		board[3][4] = new Block("E5", "black", null, true);
		board[3][5] = new Block("F5", "white", null, true);
		board[3][6] = new Block("G5", "black", null, true);
		board[3][7] = new Block("H5", "white", null, true);
		board[4][0] = new Block("A4", "white", null, true);
		board[4][1] = new Block("B4", "black", null, true);
		board[4][2] = new Block("C4", "white", null, true);
		board[4][3] = new Block("D4", "black", null, true);
		board[4][4] = new Block("E4", "white", null, true);
		board[4][5] = new Block("F4", "black", null, true);
		board[4][6] = new Block("G4", "white", null, true);
		board[4][7] = new Block("H4", "black", null, true);
		board[5][0] = new Block("A3", "black", null, true);
		board[5][1] = new Block("B3", "white", null, true);
		board[5][2] = new Block("C3", "black", null, true);
		board[5][3] = new Block("D3", "white", null, true);
		board[5][4] = new Block("E3", "black", null, true);
		board[5][5] = new Block("F3", "white", null, true);
		board[5][6] = new Block("G3", "black", null, true);
		board[5][7] = new Block("H3", "white", null, true);
		board[6][0] = new Block("A2", "white", rookOneWhite, false);
		board[6][1] = new Block("B2", "black", knightOneWhite, false);
		board[6][2] = new Block("C2", "white", bishopOneWhite, false);
		board[6][3] = new Block("D2", "black", queenWhite, false);
		board[6][4] = new Block("E2", "white", kingWhite, false);
		board[6][5] = new Block("F2", "black", bishopTwoWhite, false);
		board[6][6] = new Block("G2", "white", knightTwoWhite, false);
		board[6][7] = new Block("H2", "black", rookTwoWhite, false);
		board[7][0] = new Block("A1", "black", oneWhite, false);
		board[7][1] = new Block("B1", "white", twoWhite, false);
		board[7][2] = new Block("C1", "black", threeWhite, false);
		board[7][3] = new Block("D1", "white", fourWhite, false);
		board[7][4] = new Block("E1", "black", fiveWhite, false);
		board[7][5] = new Block("F1", "white", sixWhite, false);
		board[7][6] = new Block("G1", "black", sevenWhite, false);
		board[7][7] = new Block("H1", "white", eightWhite, false);
	}
}
