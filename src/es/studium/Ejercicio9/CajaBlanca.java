package es.studium.Ejercicio9;

public class CajaBlanca 
{
	public static String diasDeLaSemana(int day) {
		switch (day) {
		case 1:
			System.out.println("Hoy es lunes");
			return "Hoy es lunes";
		case 2:
			System.out.println("Hoy es martes");
			return "Hoy es martes";
		case 3:
			System.out.println("Hoy es mi�rcoles");
			return "Hoy es mi�rcoles";
		case 4:
			System.out.println("Hoy es jueves");
			return "Hoy es jueves";
		case 5:
			System.out.println("Hoy es viernes");
			return "Hoy es viernes";
		case 6:
			System.out.println("Hoy es s�bado");
			return "Hoy es s�bado";
		case 7:
			System.out.println("Hoy es domingo");
			return "Hoy es domingo";
		default:
			return "No es un d�a v�lido";
		}
	}
}