package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.modelo.item.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

@WebService
public class EstoqueWS {

    private ItemDao itemDao = new ItemDao();


    //Anotações definem a estrutura do contrato wsdl que será gerado pelo SOAP.
    @WebMethod(operationName = "todosOsItens")
    //WebResult: nome da resposta que sera enviada para o cliente
    @WebResult(name="itens")
    @ResponseWrapper(localName = "itens")
    @RequestWrapper(localName = "listaItens")
    public List<Item> getItens(@WebParam(name = "filtros") Filtros filtros){
        System.out.println("Chamando todosOsItens()");

        List<Filtro> lista = filtros.getLista();
        List<Item> itensResultado  = itemDao.todosItens(lista);

        return itensResultado;
    }
}
