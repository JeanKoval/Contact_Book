package JeanKoval.com.github.programa;

import java.util.ArrayList;
import java.util.Scanner;

import JeanKoval.com.github.classes.*;

public class Agenda_Contatos {

	public static void main(String[] args) {
		Integer op=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("______ AGENDA DE CONTATOS: _______________________");
		while(op!=0) {
			System.out.println("Acões possiveis a executar em sua Agenda:");
			System.out.println("1 - Inserir;");
			System.out.println("2 - Listar Contatos;");
			System.out.println("3 - Visualizar um contato;");
			System.out.println("0 - Sair do Programa;");
			System.out.print("Qual sua escolha: ");
			op = scan.nextInt();
			
			switch(op) {
				case 0:				
				break;
				case 1:
					
				break;
				case 2:
					
				break;
				case 3:
					
				break;
				default:
					System.out.println("Não temos essa opção no momento!");
			}

		}//fim do while
		scan.close();
	}//fim da main
	
	public Agenda inserir() {
		Agenda dado = new Agenda() {};
		String nome;
		Integer op=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("_____ DADOS DO CONTATO: _____");
		System.out.print("Digite o 1° nome: ");
		nome = scan.next();
		
		Pessoa pessoa = new Pessoa(nome);
		dado.setPessoa(pessoa);
		
		while(op!=0) {
			System.out.println("Temos as seguintes informações adcionais do contato:");
			System.out.println("0 - Salvar Contato e Retornar;");
			System.out.println("1 - Adicionar Contatos Telefonicos;");
			System.out.println("3 - Adicionar endereço;");
			System.out.print("Digite sua escolha: ");
			op = scan.nextInt();
			
			switch(op) {
				case 0:
					System.out.println("Contato salvo com Sucesso!");
				break;
				case 1:
					ArrayList<Contato> contatos = new ArrayList<>();
					contatos.add(addContato());
					System.out.println("Contato Telefonico adicionado com Sucesso.");
				break;
				case 2:
				break;
			}
		}
		return dado;
	}//fim do inserir
	
	public Contato addContato() {
		Contato contato = new Contato();
		
		return contato;
	}
	
}//fim da class
