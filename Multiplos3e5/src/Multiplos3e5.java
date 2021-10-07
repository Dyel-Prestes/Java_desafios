
public class Multiplos3e5 {

	/*If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 *  we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below
 the number passed in.
 Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.*/
	
	  public static int solution(int number) {
		    int soma = 0;
		    for (int cont = 0;cont < number; cont++) {
		    	if (cont%3 == 0 || cont%5 == 0) {
		    		System.out.println(cont + "    " + soma);
		    		soma += cont;
		    	}
		    }
		    
		    return soma;
		  }
	
	public static void main(String[] args) {
		int teste = solution(10);
		System.out.println(teste);
	}

}
