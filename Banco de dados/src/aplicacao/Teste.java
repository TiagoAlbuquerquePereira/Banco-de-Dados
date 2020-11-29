package aplicacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import dao.PessoaDao;
import objetos.Pessoa;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Atividade 4.2 - Sistema de cadastro de pessoas");

		System.out.print(
				"Digite (1) para cadastrar uma nova pessoa, (2) para listar as pessoas cadastradas ou (3) para sair");
		int x = sc.nextInt();

		if (x == 1) {

			System.out.print("Digite o nome completo: ");
			String nome_completo = sc.next();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.print("Digite o endereço no formato (Rua, número, CEP, bairro, cidade): ");
			String endereco = sc.next();
			Pessoa p = new Pessoa();
			p.setEndereco(endereco);
			p.setIdade(idade);
			p.setNome(nome_completo);
			PessoaDao.salvar(p);
			System.out.print("Pessoa cadastrada com sucesso!");

		}

		if (x == 2) {

			System.out.println("Objetos cadastrados na tabela Pessoa:");
			ArrayList<Pessoa> lista = PessoaDao.buscarTodos();
			for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
				Pessoa pessoa = (Pessoa) iterator.next();
				System.out.println(pessoa.toString());
			}
		}

		if (x == 3) {

			System.exit(0);
		}

	}

}
