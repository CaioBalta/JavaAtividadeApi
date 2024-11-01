import com.google.gson.Gson;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        Gson gson = new Gson();
        ConsomeApi api = new ConsomeApi();
        Endereco[] enderecos = new Endereco[3];
        //String endereco = api.buscarDados();
        //Endereco end = gson.fromJson(endereco, Endereco.class);
        int i = 0;
        while(i < 3)
        { 
            System.out.println("Digite o CEP: ");
            String cepin = scan.nextLine();
            if(cepin.length() != 8)
            {
                System.out.println("CEP inválido. Digite novamente.");
                continue;
            }
            String enderecoJson = api.buscarDados(cepin);
            Endereco endereco = gson.fromJson(enderecoJson, Endereco.class);
            enderecos[i] = endereco;
            i++;
        }

        System.out.println("\nConsultas realizadas:");
        for (Endereco endereco : enderecos)
        {
            System.out.println(endereco);

        }
    }
}