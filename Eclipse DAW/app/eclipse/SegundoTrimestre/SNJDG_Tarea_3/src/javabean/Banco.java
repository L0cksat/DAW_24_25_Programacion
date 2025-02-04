package javabean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "codigo")
public class Banco {
	private int codigo;
	private String nombre;
	private Pais paisOpera;
}
