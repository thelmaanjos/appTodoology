package br.edu.infnet.appTodoology.model.negocio;

import java.util.Date;

public class Projeto 
{
	private Integer id;
	private Integer qtdTarefas;
	private String nomeProj;
	private String descProj;
	private Date dataCriacao;
	private Boolean hasTasks;
	private Double pctCapacidadeTarefas;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public Integer getQtdTarefas() 
	{
		return qtdTarefas;
	}
	
	public void setQtdTarefas(Integer qtdTarefas) 
	{
		this.qtdTarefas = qtdTarefas;
	}
	
	public String getNomeProj() 
	{
		return nomeProj;
	}
	
	public void setNomeProj(String nomeProj) 
	{
		this.nomeProj = nomeProj;
	}
	
	public String getDescProj() 
	{
		return descProj;
	}
	
	public void setDescProj(String descProj) 
	{
		this.descProj = descProj;
	}
	
	public Date getDataCriacao() 
	{
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao) 
	{
		this.dataCriacao = dataCriacao;
	}
	
	public Boolean getHasTasks() 
	{
		return hasTasks;
	}
	
	public void setHasTasks(Boolean hasTasks) 
	{
		this.hasTasks = hasTasks;
	}
	
	public Double getPctCapacidadeTarefas() 
	{
		return pctCapacidadeTarefas;
	}
	
	public void setPctCapacidadeTarefas(Double pctCapacidadeTarefas) 
	{
		this.pctCapacidadeTarefas = pctCapacidadeTarefas;
	}

	@Override
	public String toString() 
	{
		return "Projeto [id=" + id + ", qtdTarefas=" + qtdTarefas + ", nomeProj=" + nomeProj + ", descProj=" + descProj
				+ ", dataCriacao=" + dataCriacao + ", hasTasks=" + hasTasks + ", pctCapacidadeTarefas="
				+ pctCapacidadeTarefas + "]";
	}
}
