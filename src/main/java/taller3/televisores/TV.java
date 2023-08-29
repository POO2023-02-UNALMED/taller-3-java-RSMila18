package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	public static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		}
	public int getNumTV() {
		return numTV;
	}
	
	public void setNumTV(int num) {
		numTV ++;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public int getCanal(){
		return canal;
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 120 && estado == true) {
			this.canal = canal;}
	}
	
	public int getPrecio(){
		return precio;
	}
	
	public void setPrecio(int precio){
		this.precio = precio;
	}
	
	public int getVolumen(){
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		if (volumen >= 0 && volumen <=7 && estado == true) {
			this.volumen = volumen;}
	}
	
	public Control getControl(){
		return control;
	}
	
	public void setControl(Control control){
		this.control = control;
	}
	
	public void turnOn(){
		if (this.estado = false) {
			this.estado = true;
		}
	}
	
	public void turnOff(){
		if (this.estado = true) {
			this.estado = false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void canalUp(){
		if (this.canal >= 1 && this.canal < 120 && this.estado == true) {
			this.canal ++;
		}
	}
	
	public void canalDown(){
		if (this.canal > 1 && this.canal <= 120 && this.estado == true) {
			this.canal --;
		}
	}
	
	public void volumenUp() {
		if(this.volumen >= 0 && this.volumen < 7 && this.estado == true) {
			this.volumen ++;
		}
	}
	
	public void volumenDown() {
		if(this.volumen > 0 && this.volumen <= 120 && this.estado == true) {
			this.volumen --;
		}
	}
	
}
