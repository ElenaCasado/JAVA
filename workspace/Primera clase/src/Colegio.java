
public class Colegio extends Edificio {
	private int numeroAulas;
	private boolean pabellon;
	public Colegio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral,int numeroAulas) {
		super(direccion, codigoPostal, altura, calefaccionCentral);
		this.numeroAulas=numeroAulas;

	}
	public int getCapacidadColegio(){
		int capacidadColegio;
		capacidadColegio=numeroAulas*30;
		return(capacidadColegio);
	}
	

}
