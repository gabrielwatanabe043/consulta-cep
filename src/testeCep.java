import java.io.IOException;
import java.util.Scanner;

public class testeCep {
    public static void main(String[] args) {
        Scanner cepBuscando = new Scanner(System.in);
        System.out.println("Digite o cep para buscarmos");
        String resposta = cepBuscando.nextLine();
        ConsultaCep consulta = new ConsultaCep();
        try {
            Endereco novoEndereco = consulta.buscaEndereco(resposta);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação");
        }


    }
}
