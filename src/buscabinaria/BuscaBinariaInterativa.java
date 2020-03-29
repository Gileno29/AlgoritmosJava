package buscabinaria;

public class BuscaBinariaInterativa {
	public static void main(String[]args) {
		int[] s= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,44,57,58,89,100};
		int indice= binario(s,44);
		System.out.println(indice);
		
		
	}
	private static int binario(int[] s,int x) {
		int meio;
		int inicio, fim;
		inicio=0;
		fim=s.length-1;
		
		while(inicio<=fim) {
			meio=(inicio+fim)/2;
			
			if(meio==x)
				return meio;
			else if (meio<x)
				inicio=meio+1;
			else
				fim=meio -1;
		}
		
		return -1;
		
	}

}
