package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso Java");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devNathan = new Dev();
		devNathan.setNome("Nathan");
		devNathan.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Nathan " + devNathan.getConteudosInscritos());
		devNathan.progredir();
		System.out.println("Conteudos Concluidos Nathan " + devNathan.getConteudosConcluidos());
		System.out.println("XP" + devNathan.calcularTotalXp());
		
		 System.out.println("----------------");
		
		Dev devMarcos = new Dev();
		devMarcos.setNome("Marcos");
		devMarcos.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Marcos " + devMarcos.getConteudosInscritos());
		devMarcos.progredir();
		System.out.println("Conteudos Concluidos Marcos " + devMarcos.getConteudosConcluidos());
		System.out.println("XP" + devMarcos.calcularTotalXp());

		
		
		

	}
}
