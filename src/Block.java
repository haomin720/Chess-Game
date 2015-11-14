public class Block {

	public String name;
	public String color;
	public boolean isFree;
	public ChessMan obj;
	public String [] nameList = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8",
								 "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8",
								 "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8",
								 "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8",
								 "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8",
								 "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8",
								 "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8",
								 "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8"}; 
	public Block(String name, String color, ChessMan obj, boolean isFree){
		this.name = name;
		this.color = color;
		this.obj = obj;
		this.isFree = isFree;
	}
	
	public void setName(String name){
		boolean contain = false;
		for (int i=0; i<nameList.length; i++){
			if (nameList[i].equals(name)){
				contain = true;
			}
		}
		if (contain == true){
			this.name = name;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setColor(String color){
		if (!(color.equals("black") || color.equals("white"))){}
		if (color.equals("black")){
			this.color = "black";
		}
		if (color.equals("white")){
			this.color = "white";
		}
	}
	
	public String getColor(){
		return color;
	}
	
	public void setObject(ChessMan obj){
		this.obj = obj;
		isFree = false;
	}
	
	public ChessMan getObject(){
		if (isFree = false){
			return obj;
		}
		else {
			return null;
		}
	}
}
