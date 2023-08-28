package taller3.televisores;

public class Control {
	public TV tv;
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public int getCanal() {
		return this.tv.getCanal();
	}
	
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	
	public int getVolumen() {
		return this.tv.getCanal();	
	}
	
	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}
}
