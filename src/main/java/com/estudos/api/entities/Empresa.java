package com.estudos.api.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empresa")
@Getter
@Setter
@NoArgsConstructor
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1117419233999057472L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "razao_social", nullable = false)
	private String razaoSocial;
	
	@Column(name = "cnpj", nullable = false)
	private String cnpj;
	
	@Column(name = "data_criacao", nullable = false)
	private Date dataCriacao;
	
	@Column(name = "data_atualizacao", nullable = false)
	private Date dataAtualizacao;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Funcionario> funcionarios;
	
	@PrePersist
	public void prePersist() {
		final Date atual = new Date();
		dataCriacao = atual;
		dataAtualizacao = atual;
	}
	
	@PreUpdate
	public void preUpdate() {
		this.dataAtualizacao = new Date();
	}
	
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataCriacao=" + dataCriacao + ", dataAtualizacao=" + dataAtualizacao + "]";
	}
	
}
