package concatenandoQuadrados;
//Crie uma função que recebe um numero inteiro e retorna as unidades
//q compoem esse numero ao quadrado e unidas em uma nova integer.
public class ConcatenandoQuadrados {
	
	  public int squareDigits(int n1) {
	        String number = String.valueOf(n1);//conversão

	        String[] digits = number.split("(?<=.)");//esse split divide os números e 
	        //os coloca no vetor. mas como funciona?

	        int[] intArray = new int[digits.length];
	        
	        String total = "";
	        
	        for(int i = 0; i < digits.length; i++) {
	            intArray[i] = Integer.parseInt(digits[i]);
	            intArray[i] = (int) Math.pow(intArray[i], 2);//fazendo ao quadrado
		        total += Integer.toString(intArray[i]);
	            System.out.println(intArray[i]);
	        }

	        int finalera = Integer.parseInt(total);
		  
		  return finalera;
	  }

	public static void main(String[] args) {
		


	}

}
