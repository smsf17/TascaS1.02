package n1exercici1SamayoaS;

import java.util.ArrayList;

public class Venda {
	
	private ArrayList<Producte> productes;
	private double preuTotalVenda;
	
	public Venda(ArrayList<Producte> productes, double preuTotalVenda) {
		super();
		this.productes = productes;
		this.preuTotalVenda = preuTotalVenda;
	}
	
	public Venda() {
		super();
	}


	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}
	
	public double getPreuTotalVenda() {
		return preuTotalVenda;
	}

	public void setPreuTotalVenda(double preuTotalVenda) {
		this.preuTotalVenda = preuTotalVenda;
	}

	public double agregarProducto(Producte ticket) {	
		this.productes.add(ticket);
		//double aux = ticket.getPreu();
		System.out.println(ticket);
		this.preuTotalVenda = preuTotalVenda + ticket.getPreu();;
		return this.preuTotalVenda;
	}
	
	
	public void calcularTotal() {
		try 
		{
			System.out.println("el total de la compra es de: " + this.getPreuTotalVenda());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Per fer una venda primer has d’afegir productes");
		}
		finally {
			System.out.println("Gracias por su visita!");
		}
	}
			

	@Override
	public String toString() {
		return "El total es de:" + preuTotalVenda + "€" + "Gracias por su compra! ";
	}
}
