package testing;

import javabean.Fiesta_Copy;

public class Principal_Copy {

	public static void main(String[] args) {
		Fiesta_Copy fiesta1 , fiesta2, fiesta3, fiesta4;
		
		fiesta1 = new Fiesta_Copy("infantil", "Avenida Covadonga", 20, 15, 15, "3/12/2024", "15:00");
		
		fiesta2 = new Fiesta_Copy();
		fiesta2.setInvitados(10);
		fiesta2.setBedidas(10);
		fiesta2.setBocadillos(5);
		fiesta2.setDireccion("Calle La Paz N.º77, 03182 Torrevieja.");
		fiesta2.setTipoFiesta("cumpleaños");
		fiesta2.setFecha("29/11/2024");
		fiesta2.setHora("15:00");
		
		fiesta3 = new Fiesta_Copy("disfraces", "Avenida Robleda Nº177, 03184 Torrevieja.", 15, 30, 30, "1/12/2024", "20:00");
		fiesta4 = new Fiesta_Copy("infantil", "Calle Rodrigo N.º 57, 03184 Torrevieja.", 50, 50, 15, "30/11/2024", "14:00");
		
		System.out.println("\n*******************INICIO FIESTAS*******************\n");
		
		
		probarFiesta(fiesta1, 10, 5);
		
		System.out.println("\n*******************SIGUIENTE FIESTA******************\n");
		
		probarFiesta(fiesta2, 20, 10);
		
		System.out.println("\n*******************SIGUIENTE FIESTA******************\n");
		
		System.out.println(fiesta3.toString());
		fiesta3.mostrarFiesta();
		fiesta3.invitar(10);
		fiesta3.invitar();
		fiesta3.cancelarInvitacion(3);
		fiesta3.cancelarInvitacion();
		fiesta3.cuantoBebida();
		fiesta3.cuantoBocadillos();
		fiesta3.precioPersona();
		fiesta3.precioTotalFiesta();
		
		System.out.println("\n*******************SIGUIENTE FIESTA******************\n");
		
		System.out.println(fiesta4.toString());
		fiesta4.mostrarFiesta();
		fiesta4.invitar(30);
		fiesta4.invitar();
		fiesta4.cancelarInvitacion(4);
		fiesta4.cancelarInvitacion();
		fiesta4.cuantoBebida();
		fiesta4.cuantoBocadillos();
		fiesta4.precioPersona();
		fiesta4.precioTotalFiesta();
		
		

	}
	public static void probarFiesta(Fiesta_Copy fiestaParaProbar, int cantidadInvitados, int cantCancelInvitados) {
		//Escribir todas las pruebas aquí adentro.
		System.out.println(fiestaParaProbar);
		fiestaParaProbar.mostrarFiesta();
		fiestaParaProbar.mostrarFechaHoraDir();
		System.out.println("\n");
		System.out.println(fiestaParaProbar.getInvitados());
		System.out.println(fiestaParaProbar.getBedidas());
		System.out.println(fiestaParaProbar.getBocadillos());
		fiestaParaProbar.invitar();
		fiestaParaProbar.invitar(cantidadInvitados);
		System.out.println("\n");
		System.out.println(fiestaParaProbar.getInvitados());
		System.out.println(fiestaParaProbar.getBedidas());
		System.out.println(fiestaParaProbar.getBocadillos());
		fiestaParaProbar.cancelarInvitacion(cantCancelInvitados);
		fiestaParaProbar.cancelarInvitacion();
		System.out.println("\n");
		System.out.println(fiestaParaProbar.getInvitados());
		System.out.println(fiestaParaProbar.getBedidas());
		System.out.println(fiestaParaProbar.getBocadillos());
		fiestaParaProbar.cuantoBebida();
		fiestaParaProbar.cuantoBocadillos();
		fiestaParaProbar.precioPersona();
		fiestaParaProbar.precioTotalFiesta();
	}
}
