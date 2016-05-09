package com.algorithms.frog;

public class Vertex {
	private Integer posX;
	private Integer posY;

	public Vertex(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public Integer getPosX() {
		return posX;
	}
	
	public void setPosX(int x){
		posX=x;
	}

	public Integer getPosY() {
		return posY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (((posX == null)&&(posY == null) ? 0 : (posX.hashCode()+posY.hashCode())));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Vertex other = (Vertex) obj;
		if((this.posX==other.posX)&&(this.posY==other.posY))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "The coordinates are: " + posX + ";" +posY;
	}

} 
