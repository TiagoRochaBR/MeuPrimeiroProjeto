package com.estudos.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.estudos.api.entities.Empresa;
import com.estudos.api.repositories.EmpresaRepository;
import com.estudos.api.services.ExemploService;
import com.estudos.api.utils.SenhaUtils;

@SpringBootApplication
@SuppressWarnings("unused")
public class MeuPrimeiroProjetoApplication {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private ExemploService exemploService;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
		// System.out.println("Meu primeiro projeto...");
	}
	
	@Bean
	public CommandLineRunner conmandlineRunner() {
		return args -> {
			
			// testeExemploService();
			
			// testeRepository();
			
			// testeBCrypt();
			
			// testeBuscaParametroApplicationProperties();
			
		};
	}
	
	private void testeExemploService() {
		this.exemploService.testarServico();
	}
	
	private void testeRepository() {
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Kazale IT");
		empresa.setCnpj("74645215000104");
		
		this.empresaRepository.save(empresa);
		
		List<Empresa> empresas = this.empresaRepository.findAll();
		empresas.forEach(System.out::println);
		
		Optional<Empresa> optionalEmpresaBD = this.empresaRepository.findById(1);
		Empresa empresaBD = optionalEmpresaBD.get();
		System.out.println("Empresa por ID: " + empresaBD);
		
		empresaBD.setRazaoSocial("Kazale IT Web");
		this.empresaRepository.save(empresaBD);
		
		Empresa empresaBD2 = this.empresaRepository.findByCnpj("74645215000104");
		System.out.println("Empresa por CNPJ: " + empresaBD2);
		
		this.empresaRepository.deleteAll();
		List<Empresa> empresasBD = this.empresaRepository.findAll();
		System.out.println("Quantidade de Empresas: " + empresasBD.size());
	}
	
	private void testeBCrypt() { // Necessita do Starter Security
		// String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
		// System.out.println("Senha encoded: " + senhaEncoded);
		//
		// senhaEncoded = SenhaUtils.gerarBCrypt("123456");
		// System.out.println("Senha encoded novamente: " + senhaEncoded);
		//
		// System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
	}
	
	private void testeBuscaParametroApplicationProperties() {
		System.out.println("### Quantidade de elementos por página = " + this.qtdPorPagina);
	}
	
}
