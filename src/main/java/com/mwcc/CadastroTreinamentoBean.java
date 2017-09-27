package com.mwcc;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.DataInput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@ViewScoped
public class CadastroTreinamentoBean implements Serializable {
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
    private String cidades;

    public Date getDataHoje(){
        return new Date();
    }

    private List<String> cidadesEx = new ArrayList<>();
    private List<String> metodosPagamentos = new ArrayList<>();
    private List<String> formasPagamentos = new ArrayList<>();

    public CadastroTreinamentoBean() {
        cidadesEx.add("São Luis");
        cidadesEx.add("São Paulo");
        cidadesEx.add("Rio de Janeiro");
        cidadesEx.add("Paraná");
        cidadesEx.add("Alcantara");
        cidadesEx.add("Raposa");
        cidadesEx.add("São José de Ribamar");

        //Tipos de pagamento

        metodosPagamentos.add("CR");
        metodosPagamentos.add("CH");
        metodosPagamentos.add("BO");
    }


    public void carregarPagamentos(){
        formasPagamentos.clear();

        if ("CR".equals(formaPagamento)){
            formasPagamentos.add("Á vista");
            formasPagamentos.add("1x");
            formasPagamentos.add("2x");
            formasPagamentos.add("3x");
            formasPagamentos.add("4x");
            formasPagamentos.add("5x");
            formasPagamentos.add("6x");
        }else {
            if ("CH".equals(formaPagamento)){
                formasPagamentos.add("Á vista");
                formasPagamentos.add("Entrada + 30 dias");
            }else{
                if ("BO".equals(formaPagamento)){
                    formasPagamentos.add("Á vista");
                }
            }
        }
    }

    public List<String> sugerirCidades(String consulta){
        List<String> cidadesSugeridas = new ArrayList<>();

        for(String cidades : this.cidadesEx) {
            if(cidades.toLowerCase().startsWith(consulta.toLowerCase())) {
                cidadesSugeridas.add(cidades);
            }
        }

        return cidadesSugeridas;
    }

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

    public String getCidades() {
        return cidades;
    }

    public void setCidades(String cidades) {
        this.cidades = cidades;
    }

    public List<String> getCidadesEx() {
        return cidadesEx;
    }

    public void setCidadesEx(List<String> cidadesEx) {
        this.cidadesEx = cidadesEx;
    }

    public List<String> getMetodosPagamentos() {
        return metodosPagamentos;
    }

    public void setMetodosPagamentos(List<String> metodosPagamentos) {
        this.metodosPagamentos = metodosPagamentos;
    }

    public List<String> getFormasPagamentos() {
        return formasPagamentos;
    }

    public void setFormasPagamentos(List<String> formasPagamentos) {
        this.formasPagamentos = formasPagamentos;
    }
}