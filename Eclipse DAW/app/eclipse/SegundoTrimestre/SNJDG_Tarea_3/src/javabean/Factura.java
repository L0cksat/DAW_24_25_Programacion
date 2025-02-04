package javabean;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "codigoFactura")

public class Factura {
	private String codigoFactura;
	private String descripcion;
	private LocalDate fechaFactura;
	private Pedido pedido;
}
