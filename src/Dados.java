import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Dados {

	public static void main(String args[]) {

		try {
			//"C:\\Users\\katha\\Documents\\NumerosOrdenarArquivo.txt"
			Scanner ler = new Scanner(System.in);
			System.out.println("Informe o caminho do arquivo");
			String caminho = ler.nextLine();
			long[] arquivo = carregarDados(caminho);

			Ordenacao ordenacao;
			System.out.println("Informe um método de ordenação: 1-QuickSort, 2-InsertionSort, 3-MergeSort");
			
			int opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				ordenacao = new QuickSort();
				break;
			case 2:
				ordenacao = new InsertionSort();
				break;
			case 3:
				ordenacao = new MergeSort();
				break;

			default:
				throw new Exception("Opção inválida!");

			}

			ResultadoOrdenacao listaOrdenada = ordenacao.Ordena(arquivo);

			for (int i = 0; i < listaOrdenada.getResultado().length; i++) {
				System.out.println(listaOrdenada.getResultado()[i]);
			}

			System.out.println(listaOrdenada.getTempo());

			System.out.println("Informe o valor a ser pesquisado: ");
			long valor = ler.nextLong();

			PesquisaBinaria pesquisaBinaria = new PesquisaBinaria();
			ResultadoPesquisa resultadoPesquisa = pesquisaBinaria.Pesquisa(listaOrdenada.getResultado(), valor);

			if (resultadoPesquisa.getResultado() != -1) {
				System.out.println("Valor encontrado na posição: " + resultadoPesquisa.getResultado());
			} else {
				System.out.println("Valor não encontrado!");
			}

			System.out.println(resultadoPesquisa.getTempo());

		} catch (IOException e) {
			System.out.println("Erro de arquivo!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Execução Finalizada!");
		}
	}

	private static long[] carregarDados(String caminho) throws IOException {
		Path path = Paths.get(caminho);
		long[] arquivo = Files.lines(path).mapToLong(linha -> Long.parseLong(linha)).toArray();
		return arquivo;
	}

}
