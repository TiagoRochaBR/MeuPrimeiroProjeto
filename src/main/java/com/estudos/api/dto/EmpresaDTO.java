package com.estudos.api.dto;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@XmlRootElement
public class EmpresaDTO {
	
	private Integer id;
	private String razaoSocial;
	private String cnpj;
	
}
