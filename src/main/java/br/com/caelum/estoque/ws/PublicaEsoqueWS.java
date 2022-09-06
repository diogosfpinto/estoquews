package br.com.caelum.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaEsoqueWS {
    public static void main(String[] args) {
        EstoqueWS implEstoqueWS = new EstoqueWS();
        String URL = "http://localhost:8081/estoquews";

        System.out.println("EstoqueWS rodando: " + URL);

        Endpoint.publish(URL, implEstoqueWS);
    }
}
