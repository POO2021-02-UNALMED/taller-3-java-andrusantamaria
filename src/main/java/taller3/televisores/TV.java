package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1, precio = 500, volumen = 1 ;
	private boolean estado;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca,boolean estado) { 
		this.marca = marca;
		this.estado = estado;
		numTV += 1;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;	
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control control) {
		this.control = control;	
	}
	

	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;	
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		if(volumen >= 0 && volumen <= 7 && estado == true ) {
		this.volumen = volumen;	
		}
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int canal) {
		if(canal >= 1 && canal <= 120 && estado == true) {
		this.canal = canal;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	
	public static void setNumTV(int numero) {
		numTV = numero;	
	}
	
	public static int getNumTV() {
		return numTV;
	}
		
	public boolean getEstado() {
		return estado;
	}
	
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		 if(canal==120 | estado==false) {
			 return;
		 }
		 canal += 1;
	 }
	 public void canalDown() {
		 if(canal==1 | estado==false) {
			 return;
		 }
		 canal -=1;
	 }
	
	public void volumenUp() {
		if(volumen < 7 && estado == true){
			volumen += 1;
		}		
	}
	
	public void volumenDown() {
		if(volumen > 0 && estado == true){
			volumen -=1;
		}
	}
}
