import java.util.Iterator;
import java.util.LinkedList;

public class ExemplosLinkedList {

	public static void main(String[] args) {
		
		LinkedList nomelista = new LinkedList(); //cria ela
		nomelista.add(05); //adiciona uma pessoa
		nomelista.add("novembro"); 
		nomelista.add(1998);
		Iterator i = nomelista.iterator(); //cria um objeto Iterator da sua LinkedList
		while (i.hasNext()) { //percorrer toda a lista até o ultimo elemento
		System.out.println(i.next()); //Mostra o valor da Lista
		}

	}

}
