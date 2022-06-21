package n1exercici1SamayoaS;
import java.util.ArrayList;

/*class VendaBuidaExeption extends Exception {
	
	public VendaBuidaExeption(String errorMessage)
		  {	    
			super(errorMessage);
		  }
}*/

public class N1exercici1SamayoaS {

	public static void main(String[] args) {
		ArrayList<Producte> listaInventario = new ArrayList();
		
		Producte P1 = new Producte("cebolla", 0.82);
		listaInventario.add(P1);
		Producte P2 = new Producte("zanahoria", 0.60);
		listaInventario.add(P2);
		Producte P3 = new Producte("jabon", 1.20);
		listaInventario.add(P3);
		Producte P4 = new Producte("pollo", 7.01);
		listaInventario.add(P4);
		Producte P5 = new Producte("pan", 1.45);
		listaInventario.add(P5);
	
		//String ListaCompra [] = {"jabon","pan","pollo","cebolla"};
		String ListaCompra[] = {"ajo", "jamon"};
	
		buscarCesta(listaInventario, ListaCompra);
		
	}

	public static void buscarCesta(ArrayList<Producte>listaInventario, String ListaCompra[]) {
		
		double exe = 0;

		for (int i = 0; i < ListaCompra.length; i++) {
		
			boolean encontrado = false;
		
			for (int id = 0; id<listaInventario.size() &&  !encontrado; id++) {

				if(listaInventario.get(id).getNom().equalsIgnoreCase(ListaCompra[i]))  {
					Producte ticket = listaInventario.get(id);
					exe = exe + ticket.getPreu();
					Venda producto = new Venda(listaInventario, id);
					producto.agregarProducto(ticket);
					//System.out.println(ticket);
					encontrado = true;           
				}
			}
		}

			if (exe>0)  			
				System.out.println("el total de su compra es de: " +exe +"€");
			else
				try {
					getMessage();
				} catch (VendaBuidaExeption e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
		}	
	
	public static void getMessage() throws VendaBuidaExeption{
		throw new VendaBuidaExeption("Per fer una venda primer has d’afegir productes");
	}
}


