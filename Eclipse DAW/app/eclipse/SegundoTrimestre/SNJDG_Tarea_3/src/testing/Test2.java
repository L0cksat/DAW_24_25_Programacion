package testing;

import java.time.LocalDate;
import java.util.ArrayList;

import javabean.Banco;
import javabean.Cliente2;
import javabean.DireccionCliente;
import javabean.Pais;
import javabean.TarjetaBancaria;

public class Test2 {

	public static void main(String[] args) {
			//Creamos los dos objetos de País.
			
			Pais pais1 = new Pais(01, "España");
			Pais pais2 = new Pais(02, "Suecia");
			Pais pais3 = new Pais(03, "Francia");
			Pais pais4 = new Pais(04, "Alemania");
			//creamos dos paises más para dar variedad.
			
			//Creamos los dos objetos de Banco.
			Banco banco1 = new Banco(100, "Kutxabank", pais1);
			Banco banco2 = new Banco(200, "Swedbank", pais2);
			Banco banco3 = new Banco(300, "BNP Paribas", pais3);
			Banco banco4 = new Banco(400, "DZ Bank", pais4);
			//añadimos otros dos bancos para dar variedad.
			
			//Como hemos creado la primera tarjeta dentro de cliente1, vamos a crear la segunda tarjeta bancaria.
			TarjetaBancaria tarjeta1 = new TarjetaBancaria(3589742109845746L, "F. SALGADO DÍAZ", 28, 9, 258, banco1);
			TarjetaBancaria tarjeta2 = new TarjetaBancaria(8954123789512365L, "F. SALGADO DÍAZ", 30, 5, 891, banco2);
			TarjetaBancaria tarjeta3 = new TarjetaBancaria(7852145696852307L, "F. SALGADO DÍAZ", 29, 10, 704, banco3);
			TarjetaBancaria tarjeta4 = new TarjetaBancaria(1736894058412368l, "F. SALGADO DÍAZ", 31, 8, 583, banco4);
			
			//Creamos el Arraylist.
			ArrayList<TarjetaBancaria> lista = new ArrayList<TarjetaBancaria>();
			lista.add(tarjeta1);
			lista.add(tarjeta2);
			lista.add(tarjeta3);
			lista.add(tarjeta4);
			
			
			
			//Vamos a crear la direccion y la tarjeta bancaria a través de la clase Cliente.
			Cliente2 cliente1 = new Cliente2("ES01", "Francisco Salgado Díaz", "fsd@telefonica.net", LocalDate.of(1995, 10, 11), 
					new DireccionCliente("Calle La Paz, Nº 39", "Torrevieja", "Alicante", pais1), lista);
			
			//Vamos a probar ver los nombres de los bancos de las tarjetas y sus paises del cliente mencionado anteriormente.
			for (TarjetaBancaria tarjetaBancarias : lista) {
				System.out.println("Esta es una tarjeta en la lista, cuyo número de tarjeta es: " + tarjetaBancarias.getNumero() + 
						", cuyo banco es: " + tarjetaBancarias.getBanco().getNombre() + "\n"
						+"Que pertenece al país: " + tarjetaBancarias.getBanco().getPaisOpera().getNombre() + "\n");
			}
			
			//Vamos a sacar una lista de las tarjetas que tiene el cliente.
			System.out.println("Tarjetas bancarias para el cliente: " + cliente1.getNombre());
			for (TarjetaBancaria tarjetaBancarias : cliente1.getTarjetaBancarias()) {
				System.out.println(tarjetaBancarias);
			}	

	}

}
