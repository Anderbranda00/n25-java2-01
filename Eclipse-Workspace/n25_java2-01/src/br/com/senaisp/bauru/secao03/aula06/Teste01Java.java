package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Teste01Java {

	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null,
				"Ola ,participante ,e bem vindo ao programa de namoro da america! Deseja continuar ?",
				"Bem vindo paraticipante ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        String questao01 = (String) JOptionPane.showInputDialog(null,
        		"Qual é seu nome",
        		"Questão 1",
        		JOptionPane.QUESTION_MESSAGE, //tipo de mensagem
        		null,//icone
        		null,//Opção de escolha
        		"String"); //opção default
        //Solicitar para o usuario
        //Seu time favorito
        //Deve selecionar de uma lista de times
        //Essa lista deve ter pelo menos 5 nomes
        //Sugestão: Corintians,SÃO Paulo, Santos,
        //Noroeste,Palmeiras,vasco...
        
        
        		
		
		
	}

}
