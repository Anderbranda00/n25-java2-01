package br.com.senaisp.bauru.secao03.aula05;

public class Shoppingcart02 {

	public static void main(String[] args) {
	  
		String custName= "Alex";
		String itemDesc= "Camiseta"; //item a ser comprado
        double preco = 0.00;
        double imposto = 0.00;
        int quantidade = 0;
		//Montar a mensagem
        double totalPrice = preco * quantidade * (1 + imposto / 100);
        //vamos precisar ajustar a mensagem para esse exercicio
		String message = custName + " quer comprar " + " um(a)" + " " + itemDesc +
		                 " o custo total com imposto é R$: " + 
		                 Math.round(totalPrice *100)/100.;
		//Math.round arredonda para parte de inteira (caso de um valor fracionario) , por isso multiplicamos
		//imprimir mensagem 
		System.out.println(message);
		
				
		
		

	}

}
