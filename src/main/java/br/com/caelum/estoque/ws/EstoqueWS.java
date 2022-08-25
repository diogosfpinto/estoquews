package br.com.caelum.estoque.ws;

import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class EstoqueWS {

    private ItemDao itemDao = new ItemDao();


    @WebMethod(operationName = "todosOsItens")
    @WebResult(name="itens")
    public ListaItens getItens(){
        System.out.println("Chamando todosOsItens()");
        return new ListaItens(itemDao.todosItens());
    }
}
