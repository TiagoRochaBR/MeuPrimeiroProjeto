package com.estudos.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.api.dto.EmpresaDTO;
import com.estudos.api.responses.Response;

@RestController
@RequestMapping(path = "/api/empresas")
public class EmpresaController {
	
	@PostMapping
	public ResponseEntity <Response<EmpresaDTO>> exemplo(@RequestBody EmpresaDTO empresaDTO) {
		
		Response<EmpresaDTO> response = new Response<>();
		
		empresaDTO.setId(1);
		
		response.setData(empresaDTO);
		
		return ResponseEntity.ok(response);
	}
	
}
