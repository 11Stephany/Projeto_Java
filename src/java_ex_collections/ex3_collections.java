package java_ex_collections;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	public class ex3_collections {
		
		public static void main(String[] args) {
			
			List<Integer> minhaLista = new ArrayList<Integer>();
			
			
			minhaLista.add(2);
			minhaLista.add(5);
			minhaLista.add(9);
			minhaLista.add(4);
			minhaLista.add(3);
			minhaLista.add(1);	
			minhaLista.add((int) Math.random());
		
			
			for(Integer listaElementos:minhaLista) {
				System.out.println(listaElementos);
			}	
			
			System.out.println("\nRemovendo o elemento da lista...");
			System.out.println();
			minhaLista.remove(0);
		
			
			for(Integer listaElementos:minhaLista) {
				System.out.println(listaElementos);
			}
			
			int primeiroNumero = minhaLista.get(0);
	
			System.out.println("\nO primeiro elemento foi: "+primeiroNumero);
			System.out.println();
			
			for(int i=0;i<minhaLista.size();i++) {
	
				System.out.println("\nElemento: "+minhaLista.get(i));
				System.out.println(minhaLista);
			}
			
			Collections.sort(minhaLista);
		
			System.out.println("Depois de ordenada...");
			System.out.println(minhaLista);
			
			Set<Integer> meuSet = new HashSet<Integer>();
			
			meuSet.add(5);
			meuSet.add(1);
			meuSet.add(3);
			meuSet.add(4);
			meuSet.add(2);
			
			Iterator<Integer> iMeuSet = meuSet.iterator();
			
			
			while(iMeuSet.hasNext()) {
				
				System.out.println(iMeuSet.next());
			}		
			
	}

}
