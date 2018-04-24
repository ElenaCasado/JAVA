
public class manejaSegmento {
	public static void main(String[] args){
		punto a,b;
		segmento ab;
		a= new punto (2,3,'A');
		b= new punto (3,1,'B');
		ab= new segmento (a,b);
		System.out.println("El segmento tiene una longitud de "+ab.getDistance());
			
			
			
		}
}


