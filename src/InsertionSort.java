public class InsertionSort extends Ordenacao {
	
	@Override
	public ResultadoOrdenacao Ordena(long[] entrada) {
		
		ResultadoOrdenacao resultado = new ResultadoOrdenacao();
		
		long tempoInicial = System.currentTimeMillis();
		  
        long[] retorno = insertionSort(entrada);

        long tempoFinal = System.currentTimeMillis();
        
        resultado.setTempo("Executado em = " + (tempoFinal - tempoInicial) + " ms");

       resultado.setResultado(retorno);		
		
		return resultado;
	}
	
	
		
	
	
	
	private static long[] insertionSort(long []vetor) {
		long x; 
		int j;
		for (int i = 1; i < vetor.length; i++) {
			x= vetor[i];
			j = i- 1;
			while((j>=0) && vetor[j] > x) {
				vetor[j+1] = vetor[j];
				j = j -1;
			}
			vetor[j+1] = x;
			
		}
		return vetor;
	}

}

	
	
	
