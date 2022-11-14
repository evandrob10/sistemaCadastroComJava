package Application;

//importação de pacotes:

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import Entites.Participante;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List <Participante> listaParticipante = new ArrayList();
		
		int opcao = 0;
		do {
			opcao = showMenu();
			switch (opcao){
				case 1:
					cadastroParticipantes(listaParticipante);
					break;
				case 2:
					showRelatorio(listaParticipante);
					break;
			}
		}while(opcao != 3);
	}	
	public static int showMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.printf(" 1 - Cadastrar participante %n 2 - Relatorio de participantes %n 3 - Sair %n");
		int opcao = input.nextInt();
		return opcao;
	}
	public static void cadastroParticipantes(List <Participante> ListaParticipante) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String name = input.nextLine();
		
		System.out.println("Digite a idade: ");
		Integer idade = input.nextInt();
		
		System.out.println("Digite a altura: ");
		Double altura = input.nextDouble();
		
		System.out.println("Digite o peso: ");
		Double peso = input.nextDouble();
		
		if(name != null && idade != 0 && altura != 0 && peso != 0 ) {
			Participante participante = new Participante(name,idade,altura,peso);
			ListaParticipante.add(participante);
		}
	}
	public static void showRelatorio(List <Participante> ListaParticipante) {
		for(Participante objetos : ListaParticipante) {
			System.out.println(objetos.toString());
		}
	}
}
