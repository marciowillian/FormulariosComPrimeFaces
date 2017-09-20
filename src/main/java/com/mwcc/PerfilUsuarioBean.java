package com.mwcc;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.DataInput;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String razaoSocial;
    private Integer cnpj;
    private String cidadeContrato;
    private Integer modalidade;
    private DataInput dataContrato;
    private Integer valorContrato;
    private String metodoPagamento;
    private String formaPagamento;
    private String cursoContratado;

    public void cadastrar(){
        System.out.println("Razão social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Cidade do contrato: " + this.cidadeContrato);
        System.out.println("Modalidade: " + this.modalidade);
        System.out.println("Data do contrato: " + this.dataContrato);
        System.out.println("Valor do contrato: " + this.valorContrato);
        System.out.println("Metodo de pagamento: " + this.metodoPagamento);
        System.out.println("Forma de pagamento: " + this.formaPagamento);
        System.out.println("Curso contratado: " + this.cursoContratado);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastrado com sucesso!"));
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidadeContrato() {
        return cidadeContrato;
    }

    public void setCidadeContrato(String cidadeContrato) {
        this.cidadeContrato = cidadeContrato;
    }

    public Integer getModalidade() {
        return modalidade;
    }

    public void setModalidade(Integer modalidade) {
        this.modalidade = modalidade;
    }

    public DataInput getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(DataInput dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Integer getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Integer valorContrato) {
        this.valorContrato = valorContrato;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getCursoContratado() {
        return cursoContratado;
    }

    public void setCursoContratado(String cursoContratado) {
        this.cursoContratado = cursoContratado;
    }
}
