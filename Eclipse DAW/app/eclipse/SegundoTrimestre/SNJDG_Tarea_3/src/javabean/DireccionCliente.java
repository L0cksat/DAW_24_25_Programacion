package javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "direccion")

public class DireccionCliente {
	private String direccion;
	private String localidad;
	private String provincia;
	private Pais pais;
}
