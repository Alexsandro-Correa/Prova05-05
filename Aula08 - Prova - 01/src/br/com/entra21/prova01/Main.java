package br.com.entra21.prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Crie um programa que informe o signo do usu�rio
		Capturar nome , dia e m�s de anivers�rio
		Criar constante para numero limite do dia do m�s, no caso 31
		Se 
		o dia for maior que o limite
		Informar o valor limite para um dia do m�s
		Sen�o
		escolher o m�s correspondente para fazer as valida��es especificas
		nesse m�s existe esse dia?
		com base no dia do m�s qual � o signo
		m�s invalido */
		
		codigoSignos();
		
		
		
}
	public static void codigoSignos() {
		
		//Nessa primeira parte do c�digo declarei as vari�veis e constantes
		//Usei String e Scanner para auxiliar o usu�rio e captar a sua resposta pra que o c�digo
		//funcione de acordo com o solicitado
		
		String nome,mes;
		byte dia;
		final byte diaMes = 31, diaMes2 = 30, diaMes3 =28;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = entrada.next();
		
		System.out.println("Digite o dia do seu nascimento: ");
		
		dia = entrada.nextByte();
		
		System.out.println("Digite seu m�s de nascimento: ");
		diaMes();
		mes = entrada.next();
		
		
        
        //Aqui eu usei o switch para saber qual m�s o usu�rio selecionou com default no final
		//mostrando que n�o foi selecionado uma op��o v�lida, caso n�o caia em nenhum dos cases.
		
		//Usei if/else para saber o signo do usu�rio e para mostrar um erro caso seja selecionada
		//uma data maior que a que existe no m�s referente. Para isso criei 3 constantes de m�s para
		//para n�o passar da data v�lida, e coloquei mensagem de erro para o usu�rio estar ciente
		//que n�o selecionou uma op��o v�lida
		
		//E usei o toLowerCase para se o usu�rio digitar em maiusculo o programa reconhecer em min�sculo
		//aumentando as probabilidades de execu��o do c�digo
		mes = mes.toLowerCase();
		switch(mes) {
		case "1","janeiro":
		if(dia >= 21 && dia <= diaMes && dia != 0) {
			System.out.println("\nSeu signo � aqu�rio.");
			System.out.println("Voc� nasceu dia " + dia + "/" + mes);
		}else if(dia >= diaMes || dia == 0) {
			System.out.println("Voc� n�o selecionou uma data v�lida");
		}else {
			System.out.println("\nSeu signo � capricornio.");
			System.out.println("Voc� nasceu dia " + dia + "/" + mes);
		}
			break;
			
		case "2","fevereiro":
			if(dia >= 19 && dia <= diaMes3 && dia != 0) {
				System.out.println("\nSeu signo � peixes.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes3 || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � aquario.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "3","mar�o":
			if(dia >= 21 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo � �ries.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � peixes.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "4","abril":
			if(dia >= 21 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo � touro.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes2 || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � �ries.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "5","maio":
			if(dia >= 21 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo � g�meos.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � touro.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
			
		case "6","junho":
			if(dia >= 21 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo � c�ncer.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes2 || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � g�meos.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "7","julho":
			if(dia >= 23 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo � le�o.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � c�ncer.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "8","agosto":
			if(dia >= 23 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo � virgem.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � le�o.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "9","setembro":
			if(dia >= 23 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo � libra.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes2 || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � virgem.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
			
		case "10","outubro":
			if(dia >= 23 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo � escorpi�o.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � libra.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "11","novembro":
			if(dia >= 22 && dia <= diaMes2 && dia != 0) {
				System.out.println("\nSeu signo � sagit�rio.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes2 || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � escorpi�o.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		
		case "12","dezembro":
			if(dia >= 22 && dia <= diaMes && dia != 0) {
				System.out.println("\nSeu signo � capric�rnio.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}else if(dia >= diaMes || dia == 0) {
				System.out.println("Voc� n�o selecionou uma data v�lida");
			}else {
				System.out.println("\nSeu signo � sagit�rio.");
				System.out.println("Voc� nasceu dia " + dia + "/" + mes);
			}
			break;
		default:
			System.out.println("\nVoc� digitou um m�s inv�lido.");
			break;
	}
	}
	
	
	//M�todo criado para o usu�rio escolher uma dessas op��es como m�s de nascimento
	public static void diaMes() {
		System.out.println("1 ou Janeiro");
		System.out.println("2 ou Fevereiro");
		System.out.println("3 ou Mar�o");
		System.out.println("4 ou Abril");
		System.out.println("5 ou Maio");
		System.out.println("6 ou Junho");
		System.out.println("7 ou Julho");
		System.out.println("8 ou Agosto");
		System.out.println("9 ou Setembro");
		System.out.println("10 ou Outubro");
		System.out.println("11 ou Novembro");
		System.out.println("12 ou Dezembro");
		return;
	}
	
	
		
		
	
}
