package javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "numero")

public class TarjetaBancaria {
	private long numero;
	private String nombreTitular;
	private int year;
	private int mes;
	private int cvv;
	private Banco banco;
}
