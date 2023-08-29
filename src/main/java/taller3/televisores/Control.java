package taller3.televisores;

public class Control {
	public TV tv;
	
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.setControl(this);
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}

	public void setCanal(int canal) {
		this.tv.setCanal(canal);	
	}

	public int getCanal() {
		return this.tv.getCanal();
	}

	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}

	public int getVolumen() {
		return this.tv.getVolumen();
	}

	public void volumenDown() {
		this.tv.volumenDown();
	}

	public void volumenUp() {
		this.tv.volumenUp();
	}

	public void canalDown() {
		this.tv.canalDown();
	}

	public void canalUp() {
		this.tv.canalUp();
	}

	public void turnOff() {
		this.tv.setEstado(false);
	}

	public void turnOn() {
		this.tv.setEstado(true);
	}
}
