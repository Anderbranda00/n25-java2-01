package br.com.senaisp.bauru.secao02.aula04;

public class Chickens01 {

	public static void main(String[] args) {
	int totalEggs = 0;
	int eggsPerChicken = 5, chickenCount = 3;
	
	//dia1 
    totalEggs += eggsPerChicken * chickenCount; //15
    
    //dia 2
    chickenCount ++;  //ganhou uma galiha
    totalEggs += eggsPerChicken * chickenCount;
    
    //dia 3
    chickenCount/=2; //animal come metade das galinhas
    totalEggs += eggsPerChicken * chickenCount;
    //imprimir o total
    System.out.println(totalEggs);
    
	}

}
