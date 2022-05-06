package br.com.entra21.prova02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Crie um programa que fa�a v�rios c�lculos
Informe qual opera��o matem�tica deseja realizar
caso informe 0 deve encerrar o programa
1 = somar
2 = subtrair
3 = multiplicar
4 = dividir
Capturar os 2 valores e informar o resultado e esperar o pr�ximo calculo
		 
		 */
		
		float numeroA, numeroB;
		
		//Usei a base do projeto no m�todo selecaoOperacao(); para organizar melhor o c�digo e deixar o m�todo principal o mais limpo poss�vel.
		selecaoOperacao();
		selecaoOperacao();
		selecaoOperacao();
		selecaoOperacao();

	}
	
	public static void selecaoOperacao() {
		//Aqui usei String para direcionar o usu�rio ao comando que ele deve usar e Scanner para capturar o que ele digitou.
		Scanner entrada = new Scanner(System.in);
		String opcao; 
		System.out.println("Selecione a opera��o desejada: ");
		System.out.println("1 = somar = +");
		System.out.println("2 = subtrair = -");
		System.out.println("3 = multiplicar = *");
		System.out.println("4 = dividir = /");
		System.out.println("5 = sair");
		opcao = entrada.nextLine();
		
		/*Usei swtch aqui para quando o us�rio escolher uma opera��o o programa entender,
	 	de acordo com o que for solictado,caso n�o sej� uma op��o v�lida o programa
	    para de executar.*/
		switch(opcao) {
		case "1", "somar", "+":
			calculoSoma();
		break;
		
		case "2", "subtrair", "-":
			calculoSubtracao();
		break;
		
		case "3", "multiplicar", "*":
			calculoMultiplicacao();
		break;
		
		case "4", "dividir", "/":
			calculoDivisao();
		break;
		
		case "5","sair":
			System.out.println("\nFinalizar opera��o.");
		System.exit(0);
		default:
			System.out.println("Voc� n�o selecionou nenhuma op��o v�lida");
			System.exit(0);
		}
		

	}
	
	//Em todos os m�todos abaixo est�o as f�rmulas para a execu��o do c�digo desejado
	//Se o usu�rio digitar zero, o programa ir� parar de executar.
	
	public static void calculoSoma() {
		float numeroA, numeroB,soma;
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite seu primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo n�mero:");
		numeroB = entrada.nextFloat();
		
		if(numeroA == 0 || numeroB == 0) {
			System.out.println("Proib�do usar o n�mero 0(zero).");
		System.exit(0);
	}else {
		soma = numeroA + numeroB;
		System.out.println("O resultado da soma � " + soma);
	}
	}
	
	public static void calculoSubtracao() {
		float numeroA, numeroB,subtracao;
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite seu primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo n�mero:");
		numeroB = entrada.nextFloat();
		
		if(numeroA == 0 || numeroB == 0) {
			System.out.println("Proib�do usar o n�mero 0(zero).");
			System.exit(0);
		}else {
		subtracao = numeroA - numeroB;
		System.out.println("O resultado da subtra��o � " + subtracao);
		}
	}
	
	public static void calculoMultiplicacao() {
		float numeroA, numeroB ,mult;
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite seu primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo n�mero:");
		numeroB = entrada.nextFloat();
		
		if(numeroA == 0 || numeroB == 0) {
			System.out.println("Proib�do usar o n�mero 0(zero).");
			System.exit(0);
		}else {
		mult = numeroA * numeroB;
		System.out.println("O resultado da multiplica��o � " + mult);
	}
	}
	
	public static void calculoDivisao() {
		float numeroA, numeroB,div;
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite seu primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite seu segundo n�mero:");
		numeroB = entrada.nextFloat();
		
		if(numeroA == 0 || numeroB == 0) {
			System.out.println("Proib�do usar o n�mero 0(zero).");
			System.exit(0);
		}else {
		div = numeroA / numeroB;
		System.out.println("O resultado da divis�o � " + div);
	}
	}

}
