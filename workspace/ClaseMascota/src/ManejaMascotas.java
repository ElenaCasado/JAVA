
public class ManejaMascotas {

	public static void main(String[] args) {
		ProyectoMascota cuqui; 
		cuqui=new ProyectoMascota("cuqui",3,"perro",'h');
		System.out.println("Mi mascota se llama "+cuqui.getNombre());
		System.out.println("Mi mascota tiene "+cuqui.getEdad()+" a�os");
		System.out.println("Mi mascota es "+cuqui.getEspecie());
		System.out.println("Mi mascota es "+cuqui.getSexo());
		//pasa un a�po
		cuqui.setEdad(4);
		System.out.println("Mi mascota ahora tiene "+cuqui.getEdad()+" a�os");
		System.out.println("por lo tanto naci� en el a�o"+cuqui.getAnioNacimiento(2018));
	}

}

