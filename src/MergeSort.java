
public class MergeSort extends Ordenacao {

	@Override
	public ResultadoOrdenacao Ordena(long[] entrada) {

		ResultadoOrdenacao resultado = new ResultadoOrdenacao();

		long tempoInicial = System.currentTimeMillis();

		long[] retorno = mergeSort(entrada, new long[entrada.length], 0, entrada.length - 1);

		long tempoFinal = System.currentTimeMillis();

		resultado.setTempo("Executado em = " + (tempoFinal - tempoInicial) + " ms");

		resultado.setResultado(retorno);

		return resultado;
	}

	private static long[] mergeSort(long[] v, long[] w, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(v, w, inicio, meio);
			mergeSort(v, w, meio + 1, fim);
			intercalar(v, w, inicio, meio, fim);

		}
		return v;
	}

	private static void intercalar(long[] v, long[] w, int inicio, int meio, int fim) {
		for (int k = inicio; k <= fim; k++) {
			w[k] = v[k];
		}
		int i = inicio;
		int j = meio + 1;

		for (int k = inicio; k <= fim; k++) {
			if (i > meio)
				v[k] = w[j++];
			else if (j > fim)
				v[k] = w[i++];
			else if (w[i] < w[j])
				v[k] = w[i++];
			else
				v[k] = w[j++];

		}

	}

}
