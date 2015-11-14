import java.util.ArrayList;

public class ChessMan{

	public static class Rook extends ChessMan{
		public String color;
		public boolean alive;
		public int val;
		public int position;
		public ArrayList<Integer> possibleMoves;

		public Rook(int position, String color, boolean alive, int val){
			this.color = color;
			this.alive = alive;
			this.val = val;
			this.position = position;
			this.possibleMoves = new ArrayList<Integer>();
		}
		
		
		public void take(){
			
		}
	}
	public static class Knight extends ChessMan{
		public String color;
		public boolean alive;
		public int val;
		public int position;
		
		public Knight(int pos, String color, boolean alive, int val){
			this.color = color;
			this.alive = alive;
			this.val = val;
			this.position = pos;
		}
		
		public void move(){
			
		}
		
		public void take(){
			
		}
	}
	public static class Bishop extends ChessMan{
		public String color;
		public boolean alive;
		public int val;
		public int position;
		
		public Bishop(int position, String color, boolean alive, int val){
			this.color = color;
			this.alive = alive;
			this.val = val;
			this.position = position;
		}
		
		public void move(){
			
		}
		
		public void take(){
			
		}
	}
	public static class King extends ChessMan{
		public String color;
		public boolean alive;
		public int val;
		public int position;
		
		public King(int position, String color, boolean alive, int val){
			this.color = color;
			this.alive = alive;
			this.val = val;
			this.position = position;
		}
		
		public void move(){
			
		}
		
		public void take(){
			
		}
	}
	public static class Queen extends ChessMan{
		public String color;
		public boolean alive;
		public int val;
		public int position;
		
		public Queen(int position, String color, boolean alive, int val){
			this.color = color;
			this.alive = alive;
			this.val = val;
			this.position = position;
		}
		
		public void move(){
			
		}
		
		public void take(){
			
		}
	}
	public static class Pawn extends ChessMan{
		public String color;
		public boolean alive;
		public int val;
		public int position;
		
		public Pawn(int position, String color, boolean alive, int val){
			this.color = color;
			this.alive = alive;
			this.val = val;
			this.position = position;
		}
		
		public void move(){
			
		}
		
		public void take(){
			
		}
	}
}