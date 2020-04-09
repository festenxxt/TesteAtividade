package atv1;

import atv1.interfaces.TriangulITF;

public class Triangulo implements TriangulITF {
	
	private int x;
	private int y;
	private int z;


	public Triangulo(int lado_1, int lado_2, int lado_3) {
		this.x = lado_1;
		this.y = lado_2;
		this.z = lado_3;
	}
	
	public boolean isTriangulo() {
		if ((x < y + z) && (y < x + z) && (z < x+y)){
			return true;
		}
		return false;
	}

	public boolean isTrianguloEscaleno() {
		if((x!= y && x!= z && y!=z) && this.isTriangulo()) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloEquilatero() {
		if((x == y && x == z) && this.isTriangulo()) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloIsoceles() {
		if(((x == y) || (x == z)) && this.isTriangulo()) return true;
		return false;
	}

}
