package br.com.senaisp.bauru.secao02.aula04;

public class Chickens02 {

	public static void main(String[] args) {
      double dailyAverage = 0, mouthlyAverage = 0, mouthlyProfit = 0;
      int totalEggs= 0;
      //dia 1 
      totalEggs= 100;
      //dia2
      totalEggs = +121;
      //fazendo as contas
      dailyAverage = totalEggs / 3.; // dailyAvarage = (double) dailyAvarage = totalEggs 0/3;
      mouthlyAverage = dailyAverage * 30;
      System.out.println("Dayly Avarage:    " +dailyAverage);
      System.out.println("Mounthly Avarage: " +mouthlyAverage);
      System.out.println("mounthly Profit: $" +mouthlyProfit);

	}

}
