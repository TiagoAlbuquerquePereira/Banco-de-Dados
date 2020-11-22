package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.Pessoa;

public class Teste {

	
	public static void main(String[] args) {
		List<Pessoa> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Atividade 4.2 - Sistema de cadastro de pessoas");

		System.out.print("Digite (1) para cadastrar uma nova pessoa ou (2) para sair");
		int x = sc.nextInt();

		if (x == 1) {

			int z = 1;

			do {

				int id = 0;
				System.out.print("Digite o nome completo: ");
				String nome_completo = sc.next();
				System.out.print("Digite a idade: ");
				int idade = sc.nextInt();
				System.out.print("Digite o endereço no formato (Rua, número, CEP, bairro, cidade: ");
				String endereço = sc.next();
				Pessoa p = new Pessoa(id, nome_completo, idade, endereço);
				list.add(p);
				System.out.print("Pessoa cadastrada com sucesso!");
				System.out.print(
						"Caso deseje fazer outro cadastro digite 1, ou digite outro número para sair do programa: ");
				z = sc.nextInt();

			}

			while (z == 1);
		}
	}
}
