package com.example.demo.controllers;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.models.Tickets;
import com.example.demo.models.Clientes;
import com.example.demo.models.Ventas;
import com.example.demo.models.Computadoras;
import com.example.demo.models.Proveedores;
@Controller
@RequestMapping("/examenUnidad2")
public class LigasController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/Computadoras")
	public String Computadoras (Model modelo) {
		
		ArrayList<Computadoras> computadora = new ArrayList<Computadoras>();
		computadora.add(new Computadoras(161130055,"Hp","Core i3","Windows10",6,4));
		computadora.add(new Computadoras(161130077,"Lenovo","Core i5","Windows10",12,8));
		computadora.add(new Computadoras(16114567,"Asus","Core i3","Windows10",8,4));
		computadora.add(new Computadoras(161741277,"Dell","Core i7","Ubuntu",16,8));
		computadora.add(new Computadoras(16163577,"Hp","Celeron","Fedora",4,4));
		
		computadora.add(new Computadoras(161130645,"Aus","Celeron","Windows10",6,4));
		computadora.add(new Computadoras(161130345,"Toshiba","Core i3","Windows10",12,8));
		computadora.add(new Computadoras(161144181,"Lenovo","Core i9","Windows10",8,8));
		computadora.add(new Computadoras(161164652,"Acer","AMD","Ubuntu",4,4));
		computadora.add(new Computadoras(162621524,"Acer","Celeron","Fedora",4,4));
		modelo.addAttribute("Computadoras",computadora);
		modelo.addAttribute("titulo","Tabla de Computadoras");
		return "computadoras";
	}
	
	@GetMapping("/Tickets")
	public String Tickets (Model modelo) {
		
		ArrayList<Tickets> ticket = new ArrayList<Tickets>();
		ticket.add(new Tickets(1013,11,161130055,2,12500));
		ticket.add(new Tickets(1014,12,161130077,1,14000));
		ticket.add(new Tickets(1015,13,16114567,2,13350));
		ticket.add(new Tickets(1016,14,161741277,1,16300));
		ticket.add(new Tickets(1017,15,16163577,3,6630));
		
		ticket.add(new Tickets(1018,16,161130645,2,12500));
		ticket.add(new Tickets(1019,17,161130345,1,14000));
		ticket.add(new Tickets(1020,18,161144181,3,13350));
		ticket.add(new Tickets(1021,19,161164652,1,6300));
		ticket.add(new Tickets(1022,20,162621524,2,6630));
		
		modelo.addAttribute("Tickets",ticket);
		modelo.addAttribute("titulo","Tabla de Tickets");
		return "Tickets";
	}
	
		@GetMapping("/Ventas")
		public String Ventas (Model modelo) {
		ArrayList<Ventas> venta = new ArrayList<Ventas>();
		venta.add(new Ventas(11,001,"16-11-2020",25000,4000,150,29150));
		venta.add(new Ventas(12,002,"16-11-2020",14000,2240,150,16390));
		venta.add(new Ventas(13,003,"11-06-2020",26700,4272,150,31122));
		venta.add(new Ventas(14,004,"16-08-2020",16300,2608,150,19058));
		venta.add(new Ventas(15,005,"16-09-2020",19890,3182,150,23220));
		
		venta.add(new Ventas(16,001,"16-11-2020",25000,4000,150,29150));
		venta.add(new Ventas(17,002,"16-11-2020",14000,2240,150,16390));
		venta.add(new Ventas(18,003,"11-06-2020",26700,4272,150,31122));
		venta.add(new Ventas(19,004,"16-08-2020",1630,2608,150,19058));
		venta.add(new Ventas(20,005,"16-09-2020",19890,3182,150,23220));
		
		modelo.addAttribute("Ventas",venta);
		modelo.addAttribute("titulo","Tabla de Ventas");
		return "Ventas";
		
	}
		
		@GetMapping("/Clientes")
		
		public String Clientes (Model modelo) {
			ArrayList<Clientes> cliente = new ArrayList<Clientes>();
			cliente.add(new Clientes(161130055,"Eduardo","Acosta",2030175142,"Eduardo@Acosta.com","Ecatepec"));
			cliente.add(new Clientes(161130077,"Pedro","Sola",2030625142,"Pedro@Sola.com","CDMX"));
			cliente.add(new Clientes(16114567,"Amalia","Padilla",2030624842,"Amalia@Padilla.com","Ecatepec"));
			cliente.add(new Clientes(161741277,"Pedro","Sola",2030624452,"Pedro@Sola.com","Coacalco"));
			cliente.add(new Clientes(16163577,"Noemi","Leyva",2034639142,"Noemi@Leyva.com","Ecatepec"));
			
			cliente.add(new Clientes(6841,"Julio","Sánchez",203527527,"Julio@Sanchez.com","Tecamac"));
			cliente.add(new Clientes(16841,"Albero","Madrazo",207862752,"Alberto@Madrazo.com","Tenayuca"));
			cliente.add(new Clientes(16354,"Armando","Ángeles",208627275,"Armando@Angeles.com","CDMX"));
			cliente.add(new Clientes(14681,"Armando","Hernandez",2078672572,"Armando@Hernandez.com","Ecatepec"));
			cliente.add(new Clientes(13458,"Julio","Solis",20786452,"Julio@Solis.com","Ecatepec"));
			
			modelo.addAttribute("Clientes",cliente);
			modelo.addAttribute("titulo","Tabla de Clientes");
			return "Clientes";
		}
		
		@GetMapping("/Proveedores")
		
		public String Proveedores (Model modelo) {
			ArrayList<Proveedores> proveedor = new ArrayList<Proveedores>();
			proveedor.add(new Proveedores(161130055,"Hp","Acosta","Acosta@Hp.com","ASF6151",25698547,"Ecatepec"));
			proveedor.add(new Proveedores(161130077,"Dell","Sola","Sola@Dell.com","EASFAS5",78698456,"Ecatepec"));
			proveedor.add(new Proveedores(16114567,"Asus","Padilla","Amalia@Asus.com","FAFAS611",63298547,"Ecatepec"));
			proveedor.add(new Proveedores(161741277,"Hp","Julio","Julio@Hp.com","SFDCAS511",96398547,"Ecatepec"));
			proveedor.add(new Proveedores(16163577,"Dell","Leyva","Leyva@Dell.com","AFSAS5151",14598547,"Ecatepec"));
			
			proveedor.add(new Proveedores(4534504,"Toshiba","Ivan","Ivan@Toshiba.com","ASF51651",453698547,"Ecatepec"));
			proveedor.add(new Proveedores(4634534,"Walmart","Samuel","Samuel@Walmart.com","AGSASFA5151",712456,"Ecatepec"));
			proveedor.add(new Proveedores(1453784,"Aurrera","Ernesto","Ernesto@Aurrera.com","ASF5A151",64538547,"Ecatepec"));
			proveedor.add(new Proveedores(4564856,"Elektra","Pedro","Pedro@Elektra.com","ASFA15151",45398547,"Ecatepec"));
			proveedor.add(new Proveedores(1464563,"Coppel","Francisco","Francisco@Coppel.com","ASF1515",53598547,"Ecatepec"));
			
			modelo.addAttribute("Proveedores",proveedor);
			modelo.addAttribute("titulo","Tabla de Proveedores");
			return "Proveedores";
		}
}
