package com.estudos.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class EmpresaDTO {
	
	private Integer id;
	private String razaoSocial;
	private String cnpj;
	
}
