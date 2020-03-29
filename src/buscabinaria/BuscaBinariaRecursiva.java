package buscabinaria;

public class BuscaBinariaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {200,300,400,410,450,465,500};
		
		System.out.println("esse é o indice em que se encontra esse valor: "+ buscaBinariaRecursiva(array, 465));
		
	

	}
	
	public static int buscaBinariaRecursiva(int[] array, int elemento) {
		
		return buscaRecursiva(array, elemento, 0, array.length-1);
	}
	
	public static int buscaRecursiva(int[] array,int elemento, int menor, int maior) {
		int media= (menor+maior)/2;
		
		if(menor>maior) {
			return -1;
		}
		if(array[media]==elemento) {
			return media;
			
		}
		if(array[media]< elemento) {
			return buscaRecursiva(array,elemento, media+1,maior);
			
		}else {
			return buscaRecursiva(array,elemento,menor, media -1);
		}
		
		
		
	}

}
