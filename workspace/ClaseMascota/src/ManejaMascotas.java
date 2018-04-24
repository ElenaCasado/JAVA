
public class ManejaMascotas {

	public static void main(String[] args) {
		ProyectoMascota cuqui; 
		cuqui=new ProyectoMascota("cuqui",3,"perro",'h');
		System.out.println("Mi mascota se llama "+cuqui.getNombre());
		System.out.println("Mi mascota tiene "+cuqui.getEdad()+" años");
		System.out.println("Mi mascota es "+cuqui.getEspecie());
		System.out.println("Mi mascota es "+cuqui.getSexo());
		//pasa un añpo
		cuqui.setEdad(4);
		System.out.println("Mi mascota ahora tiene "+cuqui.getEdad()+" años");
		System.out.println("por lo tanto nació en el año"+cuqui.getAnioNacimiento(2018));
	}

}

