
public class PalavrasRevertidas {
	
	/*Complete the function that accepts a string parameter, and reverses each word in the string.
	 All spaces in the string should be retained.*/
	  public static String reverseWords(final String original)
	  {
		  String retorno = "";
		  StringBuilder buffer = new StringBuilder();
		  String[] separado = original.split(" ");
		  
		  for(int i = 0;i < separado.length;i++) {
			  buffer.setLength(0); // esvazia a StringBuilder
			  buffer.append(separado[i]);
			  separado[i] = buffer.reverse().toString();
			  retorno += separado[i];
			  if (i < separado.length-1) {//Adiciona um espaço após cada palavra, com exceção da última.
				  retorno += " ";
			  }
		  }
		  if (separado.length == 0) {//Verifica se a String original é constituída apenas de espaços.
			  retorno = original;
		  }
		  return retorno;
		  //return String.join(" ", separado);//Ou eu poderia ter usado isso como retorno
		  //Vi esse método na resolução de um outro cara, é bem mais enxuto que o meu.
		  //Esse metodo literalmente JUNTA UM ARRAY!
	  }

	public static void main(String[] args) {
		String teste = reverseWords("Primeira segunda    terceira.");
		System.out.println(teste);
	}

}
