package com.algaworks.osworks.api.model;

import java.time.OffsetTime;

public class ComentarioModel {
	
	private Long id;
	private String descricao;
	private OffsetTime dataEnvio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public OffsetTime getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(OffsetTime dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	
}
