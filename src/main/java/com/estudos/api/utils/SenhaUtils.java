package com.estudos.api.utils;

public class SenhaUtils { // Necessita do Starter Security
	
	/**
	 * Gera um hash utilizando o BCrypt.
	 * 
	 * @param senha
	 * @return String
	 */
	/*
	public static String gerarBCrypt(String senha) {
	
	if (senha == null) {
		return senha;
	}
	
	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	return bCryptPasswordEncoder.encode(senha);
	}
	
	*//**
		 * Verifica se a senha é válida.
		 * 
		 * @param senha
		 * @param senhaEncoded
		 * @return boolean
		 *//*
			public static boolean senhaValida(String senha, String senhaEncoded) {
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			return bCryptPasswordEncoder.matches(senha, senhaEncoded);
			}*/
	
}
