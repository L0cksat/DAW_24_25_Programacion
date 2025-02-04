package javabean;

import java.time.LocalDate;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode (of = "idCliente")

public class Cliente2 {
	private String idCliente;
	private String nombre;
	private String email;
	private LocalDate createdAt;
	private DireccionCliente direccion;
	private ArrayList<TarjetaBancaria> tarjetaBancarias;

	//METODOS PROPIOS.
	//1. AÑADIR TARJETA.
	public boolean addTarjeta(TarjetaBancaria tarjetaBancaria) {
		if (tarjetaBancarias == null)
			tarjetaBancarias = new ArrayList<TarjetaBancaria>();
				return tarjetaBancarias.add(tarjetaBancaria);
				
			}
	//2. ELIMINAR TARJETA.
	public boolean removeTarjeta(TarjetaBancaria tarjetaBancaria) {
		if (tarjetaBancarias == null)
			tarjetaBancarias = new ArrayList<TarjetaBancaria>();
			return tarjetaBancarias.remove(tarjetaBancaria);
	}
}



