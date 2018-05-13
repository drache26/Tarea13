package Tarea13;

public class Direccion {
	
	private String calle;
	private int cp;
	private String provincia;
	
	 //Hacemos ahora un constructor que recibe por dato los 4 parámetros

	public Direccion(String calle,int cp,String provincia) {
		
		//almacenar el valor del parametro dentro del campo de clase
		this.calle=calle;
		this.cp=cp;
		this.provincia=provincia;
	}
	
	//Realizar los métodos
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return  this.getCalle() + "," +  this.getCp() + "," +  this.getProvincia();
	}	

}

