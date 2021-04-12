package br.edu.infnet.appTodoology.model.negocio;

import java.util.Date;

public class Analise extends Tarefa
{
	private Integer qtdReqFunc;
	private Integer qtdReqNaoFunc;
	private Boolean isValidated;
	private Boolean isVerificated;
	private String recFunc;
	private String recNaoFunc;
	private Date dataReuniao;
	private String detalhamento;
	private Integer qtdSistemas;
	private Double orcamento;
	private Double custos;
	private Double despesas;
	
	public Integer getQtdReqFunc() 
	{
		return qtdReqFunc;
	}
	
	public void setQtdReqFunc(Integer qtdReqFunc) 
	{
		this.qtdReqFunc = qtdReqFunc;
	}
	
	public Integer getQtdReqNaoFunc() 
	{
		return qtdReqNaoFunc;
	}
	
	public void setQtdReqNaoFunc(Integer qtdReqNaoFunc) 
	{
		this.qtdReqNaoFunc = qtdReqNaoFunc;
	}
	
	public Boolean getIsValidated() 
	{
		return isValidated;
	}
	
	public void setIsValidated(Boolean isValidated) 
	{
		this.isValidated = isValidated;
	}
	
	public Boolean getIsVerificated() 
	{
		return isVerificated;
	}
	
	public void setIsVerificated(Boolean isVerificated) 
	{
		this.isVerificated = isVerificated;
	}
	
	public String getRecFunc() 
	{
		return recFunc;
	}
	
	public void setRecFunc(String recFunc) 
	{
		this.recFunc = recFunc;
	}
	
	public String getRecNaoFunc() 
	{
		return recNaoFunc;
	}
	
	public void setRecNaoFunc(String recNaoFunc) 
	{
		this.recNaoFunc = recNaoFunc;
	}
	
	public Date getDataReuniao() 
	{
		return dataReuniao;
	}
	
	public void setDataReuniao(Date dataReuniao) 
	{
		this.dataReuniao = dataReuniao;
	}
	
	public String getDetalhamento() 
	{
		return detalhamento;
	}
	
	public void setDetalhamento(String detalhamento) 
	{
		this.detalhamento = detalhamento;
	}
	
	public Integer getQtdSistemas() 
	{
		return qtdSistemas;
	}
	
	public void setQtdSistemas(Integer qtdSistemas) 
	{
		this.qtdSistemas = qtdSistemas;
	}
	
	public Double getOrcamento() 
	{
		return orcamento;
	}
	
	public void setOrcamento(Double orcamento) 
	{
		this.orcamento = orcamento;
	}
	
	public Double getCustos() 
	{
		return custos;
	}
	
	public void setCustos(Double custos) 
	{
		this.custos = custos;
	}
	
	public Double getDespesas() 
	{
		return despesas;
	}
	
	public void setDespesas(Double despesas) 
	{
		this.despesas = despesas;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "Analise [qtdReqFunc=" + qtdReqFunc + ", qtdReqNaoFunc=" + qtdReqNaoFunc + ", isValidated=" + isValidated
				+ ", isVerificated=" + isVerificated + ", recFunc=" + recFunc + ", recNaoFunc=" + recNaoFunc
				+ ", dataReuniao=" + dataReuniao + ", detalhamento=" + detalhamento + ", qtdSistemas=" + qtdSistemas
				+ ", orcamento=" + orcamento + ", custos=" + custos + ", despesas=" + despesas + "]";
	}
}