package testing;

import java.time.LocalDate;

import javabean.Banco;
import javabean.Cliente;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

public class Test1 {

	public static void main(String[] args) {
		//Creamos los dos objetos de País.
		
		Pais pais1 = new Pais(01, "España");
		Pais pais2 = new Pais(02, "Suecia");
		
		//Creamos los dos objetos de Banco.
		Banco banco1 = new Banco(100, "Kutxabank", pais1);
		Banco banco2 = new Banco(200, "Swedbank", pais2);
		
		
		//Vamos a crear la direccion y la tarjeta bancaria a través de la clase Cliente.
		Cliente cliente1 = new Cliente("C001", "Francisco Salgado Díaz", "fsd@telefonica.net", LocalDate.of(1995, 11, 01), new DireccionCliente("Calle La Paz, Nº 37", "Torrevieja", "Alicante", pais1), new TarjetaBancaria(7312895674123896L, "F. SALGADO DÍAZ", 28, 12, 723, banco1));
		
		//Como hemos creado la primera tarjeta dentro de cliente1, vamos a crear la segunda tarjeta bancaria.
		TarjetaBancaria tarjeta2 = new TarjetaBancaria(8954123789512365L, "LINA STRÖM", 30, 05, 891, banco2);
		
		//Como ya habíamos creado 
		
		//Vamos a crear el pedido del cliente.
		Pedido pedido1 = new Pedido(100, LocalDate.of(2025, 01, 10), "Pendiente", cliente1);
		
		//Vamos a crear la factuar del pedido anterior.
		Factura factura1 = new Factura("F01", "Pedido: Compra de billetes de avión: 1.500€", LocalDate.of(2025, 01, 10), pedido1);
		
		//Vamos a realizar el test con los "sysos"
		System.out.println("----REALIZAMOS EL TEST CON LOS PARAMETROS SOLICITADOS----\n");
		
		//1. La descripción de la Factura.
		System.out.println("La descripción de la factura es: " + factura1.getDescripcion() + "\n");
		
		//2. La fecha y el estado del pedido.
		System.out.println("La fecha y estado del pedido es: " + factura1.getPedido().getCreatedAt() + " " + factura1.getPedido().getEstado() + "\n");
		
		//3. El nombre del cliente de ese pedido de esa factura.
		System.out.println("El nombre del cliente del pedido de la factura es: " + factura1.getPedido().getCliente().getNombre() + "\n");
		
		//4. La dirección del cliente del pedido de la factura.
		System.out.println("La dirección del cliente del pedido de la factura es: " + factura1.getPedido().getCliente().getDireccion().getDireccion() + "\n");
		
		//5. El número de la tarjeta del cliente del pedido de la factura.
		System.out.println("El número de la tarjeta del cliente del pedido de la factura: " + factura1.getPedido().getCliente().getTarjetaBancaria().getNumero() + "\n");
		
		//6. El nombre del titular de la tarjeta del cliente del pedido de la factura.
		System.out.println("El nombre del titular de la tarjeta del cliente del pedido de la factura: " + factura1.getPedido().getCliente().getTarjetaBancaria().getNombreTitular() + "\n");
		
		//7. El nombre del banco de la tarjeta del cliente del pedido de la factura.
		System.out.println("El nombre del banco de la tarjeta del cliente del pedido de la factura: " + factura1.getPedido().getCliente().getTarjetaBancaria().getBanco().getNombre() + "\n");
		
		//8. El país del banco de la tarjeta del cliente del pedido de la factura.
		System.out.println("El país del banco de la tarjeta del cliente del pedido de la factura: " + factura1.getPedido().getCliente().getTarjetaBancaria().getBanco().getPaisOpera().getNombre() + "\n");
		
		//9. El país de la dirección del cliente del pedido de la factura.
		System.out.println("El país de la dirección del cliente del pedido de la factura: " + factura1.getPedido().getCliente().getDireccion().getPais().getNombre() + "\n");
	}

}
