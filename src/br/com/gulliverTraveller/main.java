package br.com.gulliverTraveller;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		System.out.print("Informe seu nome: ");
		String name = new Scanner(System.in).nextLine();

		System.out.print("Informe seu email: ");
		String email = new Scanner(System.in).nextLine();

		System.out.print("Informe seu CEP: ");
		String cep = new Scanner(System.in).nextLine();
		Address address = CEPService.findByCEP(cep);

		System.out.print("|| USUÁRIO || \n");
		System.out.println("Nome: " + name);
		System.out.println("Email: " + email);
		System.out.println("Bairro: " + address.getBairro());
		System.out.println("Logradouro: " + address.getLogradouro());
		System.out.println("Localidade: " + address.getLocalidade());
	}
}
