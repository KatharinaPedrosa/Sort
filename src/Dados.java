import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Dados {
	
	public static void main(String args[]){
		Path path =Paths.get("C:\\Users\\katha\\Documents\\NumerosOrdenarArquivo.txt");
		
		try {
			
			long[] arquivo = Files.lines(path)
					.mapToLong(linha -> Long.parseLong(linha))
					.toArray();
			
			QuickSort quickSort = new QuickSort();
			ResultadoOrdenacao listaOrdenada = quickSort.Ordena(arquivo);
			
			for (int i = 0; i < listaOrdenada.getResultado().length ; i++) {
				System.out.println(listaOrdenada.getResultado()[i]);
			}
			
			System.out.println(listaOrdenada.getTempo()); 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}

	
