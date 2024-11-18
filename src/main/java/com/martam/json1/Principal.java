package com.martam.json1;

public class Principal {

	public static void main(String[] args) {
		// JSON solo acepta dobles comillas, y se tienen que escapar
		String json = "{\"nombre\" : \"Pedro\" }";
		LeerJsonPersona leer = new LeerJsonPersona();
		
		Persona p = leer.getPersona(json);
		
		System.out.println(p.getNombre());
	}

}
