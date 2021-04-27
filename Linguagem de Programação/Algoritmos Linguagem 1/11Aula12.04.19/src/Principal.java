/*
viacep.com.br/ws/970060160/xml //json,pped,quarty

1- aproveitar o sistema de ontem para validar(realmente) um CEP. A partir de um CEP digitado pelo usuario, extrair o endereço completo de(endereço, cidade, estado, etc) e paresntar na tela.
Usar o WebService o ViaCep.com pode extrair/ buscar as informaçoes usando as classes do Java, URL, Httpclient, URLConnection e outras ( pesquisarGoogle):
o retorno do WS pode ser: XML, Json, piped , Querty.
*/
public class Principal {
    public static void main(String[] args) {
        
        Cep cep = new Cep();
        cep.getCep();
    }
    
}
