package br.com.senaisp.bauru.secao03.aula05;

public class Casting01 {

	public static void main(String[] args) {
		//Essa linha abaixo da erro porque o bite vai de 128 á 127
		//byte bVlr = 128;
		short sVlr = 128;
		//Mostrando o short convertido para bye
		System.out.println("isso vai dar perda de conversão: "+ ((byte) sVlr));
		byte bVlr =127;
		bVlr = 127;
		bVlr++; //iria para 128, o limite do byte é + 128 á 127
		System.out.println("isso vai extrapolar o limite do byte:" + bVlr);
		

	}

}
