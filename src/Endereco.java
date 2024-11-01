import com.google.gson.annotations.SerializedName;

public class Endereco
{
    String cep;
    @SerializedName("logradouro")   String rua;
    String complemento;
    String bairro;
    @SerializedName("localidade")    String cidade;
    String uf;    

    @Override
    public String toString()
    {
        return "CEP: " + cep + "\n" +
               "Rua: " + rua + "\n" +
               "Complemento: " + complemento + "\n" +
               "Bairro: " + bairro + "\n" +
               "Cidade: " + cidade + "\n" +
               "UF: " + uf + "\n";
    }
}
