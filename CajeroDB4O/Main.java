package CajeroDB4O;

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		DataBase4O d = new DataBase4O();
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);
		SecureRandom rand = new SecureRandom();
		do {
			System.out.println("\n**Registro del INE**\n\n Selecciones una opción\n" + "1) Crear cuenta "
					+ "\n2) Consultar cuenta");
			int ans = sc.nextInt();

			if (ans == 1) {
				// CREAR CUENTA
				System.out.println("Nombre:");
				p.setNombrePersona(sc.next());
				System.out.println("Apellido Paterno:");
				p.setApellidoPPersona(sc.next());
				System.out.println("Apelliedo Marterno:");
				p.setApellidoMPersona(sc.next());
				System.out.println("Fecha de Nacimiento:");
				p.setFechadenaci(sc.next());
				System.out.println("sexo:");
				p.setSexo(sc.next());
				System.out.println("Domicilio:");
				p.setDomicilio(sc.next());
				System.out.println("Clave de elector:");
				p.setClavedeelector(sc.next());
				System.out.println("Curp");
				p.setCurp(sc.next());
				System.out.println("Año de Registro:");
				p.setAnioderegistro(sc.nextInt());				
				System.out.println("Estado");
				p.setEstado(sc.nextInt());
				System.out.println("Localidad:");
				p.setLocalidad(sc.nextInt());
				System.out.println("Municipio");
				p.setMunicipio(sc.nextInt());
				System.out.println("Emisión");
				p.setEmision(sc.nextInt());
				System.out.println("Sección");
				p.setSeccion(sc.nextInt());
				System.out.println("Vigencia");
				p.setVigencia(sc.nextInt());
				d.insertarRegistro(p);
				System.out.println(p);
			} else if (ans == 2) {
				// CONSULTAR CUENTA
				System.out.println("Curp:");
				p.setCurp(sc.next());
				p = d.seleccionarPersona(p);
				System.out.println(p);
			} else {
				// MOSTRAR CUENTAS
				List<Persona> lp = d.seleccionarPersonas();
				for (Persona persona : lp) {
					System.out.println(persona);
				}
			}
		} while (true);
		// ELIMINAR PERSONA
		// r.eliminarPersona(1587);

		//2sc.close();

	}

}
