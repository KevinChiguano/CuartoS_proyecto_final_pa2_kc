package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.IVehiculoRepository;
import com.uce.edu.demo.repository.modelo.VehiculoVIP;
import com.uce.edu.demo.service.IGestorReservaVehiculoService;

@SpringBootApplication
public class ProyectoFinalPa2KcApplication implements CommandLineRunner{

	@Autowired
	private IGestorReservaVehiculoService gestorReservaVehiculoImpl;
	
	@Autowired 
	private IVehiculoRepository vehiculoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalPa2KcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//this.gestorReservaVehiculoImpl.reservarVehiculo("AAA", "123", LocalDateTime.of(2022, 1, 6, 0, 0), LocalDateTime.of(2022, 1, 8, 0, 0), "171458");
		
		//this.gestorReservaVehiculoImpl.retirarVehiculoReservado("1");
		
		List<VehiculoVIP> lista = this.vehiculoRepository.reporteVehiculosVip("2022", "1");
		
		lista.forEach(VehiculoVIP -> System.out.println(VehiculoVIP));

		//this.gestorReservaVehiculoImpl.regresarVehiculoReservado("1");
	}

}
