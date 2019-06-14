
public class PracticaGit {

		String nombre;
		int edad;
		
		public String getDatos() {
			
			return ("Mi Fu** nombre es " + nombre + " " + "Y tengo " + edad); 
			
		}
			
	

	public static void main(String[] args) {

	    PracticaGit datos = new PracticaGit();
		datos.nombre = "Marco";
		datos.edad= 22;
		
		System.out.println(datos.getDatos());
			      
}
	
}
