package modelo;

public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	
	public Persona() {
		this.nombre="";
		this.dni="";
		this.edad=0;
	}
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public Persona(String nombre,String dni,int edad) {
		this.nombre=nombre;
		this.dni=dni;
		this.edad=edad;
	}
	
	public Persona(Persona p) {
		this.nombre=p.nombre;
		this.dni=p.dni;
		this.edad=p.edad;
	}
	
	
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad>=0)
			this.edad = edad;
	}
	
	public void saluda() {
		System.out.printf("%s tiene %d años\n",
				nombre,edad);
	}
	
	public static Persona[] copiaArray(Persona[] personas) {
		Persona[] otrasPersonas=new Persona[personas.length];
		for(int i=0;i<personas.length;i++) {
			otrasPersonas[i]=new Persona(personas[i]);
		}
		return otrasPersonas;
	}
	
	

}
