import java.io.File;
import java.util.Scanner;

public class mkdir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //Criar um vetor que vai mostrar uma lista de pastas no caminho especificado acima
        File [] folders = path.listFiles(File ::isDirectory);
        //Usando a sintaxe de referencia a metodos para utilizar um metodo como parametro;
        System.out.println("FOLDERS:");
        for(File folder : folders){
            System.out.println(folder);
            //mostra as pastas contidas no caminho
            //mostra pastas ocultas tambem
        }
        File [] files= path.listFiles(File ::isFile);
        System.out.println("FILES");
        for(File file : files){
            System.out.println(file);
        }

        sc.close();

    }
}
