package javabean;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "idPedido")

public class Pedido {
	private int idPedido;
	private LocalDate createdAt;
	private String estado;
	private Cliente cliente;
}
