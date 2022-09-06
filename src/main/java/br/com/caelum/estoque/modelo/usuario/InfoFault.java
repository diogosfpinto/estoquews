package br.com.caelum.estoque.modelo.usuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {

    private Date dataErro;
    private String mensagem;

    public InfoFault(String msg, Date dateErro) {
        this.mensagem = msg;
        this.dataErro = dateErro;
    }

    InfoFault(){

    }
}
