import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWr {

        //Stream de escrita de caracteres de arquivos
        //Cria ou recria o arquivo
        //Acrescente ao arquivo existente
        public static void main(String[] args) {
            String [] lines = new String [] {"Bom dia, Boa tarde , Boa noite"};

            String path = "C:\\Users\\IdeaProjects\\out.txt";

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
                for(String line: lines){
                    bw.write(line);
                    bw.newLine();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
    }

/* Esse codigo cria um arquivo do tipo txt
contendo as frases , Bom dia , boa tarde e boa noite
que será disponibilizado no caminho C:\Users\IdeaProjects\out.txt
 */
