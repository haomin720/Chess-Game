public class Block {

	public int pos;
	public String color;
	public boolean isFree;
	public ChessMan chessMan;
	public Block(int pos, String color, ChessMan chessMan, boolean isFree){
		this.pos = pos;
		this.color = color;
		this.chessMan = chessMan;
		this.isFree = isFree;
	}
	
	public int getPos(){
		return this.pos;
	}
	
	
	public String getColor(){
		return this.color;
	}
	
	
	public ChessMan getObject(){
		if (isFree = false){
			return this.chessMan;
		}
		else {
			return null;
		}
	}
}
