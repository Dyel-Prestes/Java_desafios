package testandoUnsTrambites;

public class TestandoUnsTrambites {

	public static void main(String[] args) {


		       /* int n1 = 12223;
		      
		        String number = String.valueOf(n1);

		        char[] digits1 = number.toCharArray();
		        
		        
		        int[] intArray = new int[digits1.length];// criação do array int

		        for(int i = 0; i < digits1.length; i++) {
		            System.out.println(digits1[i]);
		        }
		    
//=============================================================================================
		     /*   for (int i = 0; i < digits1.length; i++) {
		            
		            try {
		                intArray[i] = Integer.parseInt(digits1[i]);
		            } catch (Exception e) {
		                System.out.println("Unable to parse string to int: " + e.getMessage());
		            }
		        }*/
//=============================================================================================
/*Tenho uma int que vira String para mim poder dividir seus caracteres, em um vetor String,
 * que então é tudo colocado em um vetor Int*/
				
				int number1 = 12223;

		        String number = String.valueOf(number1);//conversão

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
		        System.out.println(finalera);
		        
	}

}
