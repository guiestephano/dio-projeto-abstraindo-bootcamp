package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Main {
	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Curso Java", "Descricao do curso Java", 8);
		Curso curso2 = new Curso("Curso Js", "Descricao do curso Js", 4);
		
		Mentoria mentoria = new Mentoria("Mentoria de Java", "Descricao da mentoria de Java", LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao do Bootcamp Java Developer");
		bootcamp.addConteudo(curso1);
		bootcamp.addConteudo(curso2);
		bootcamp.addConteudo(mentoria);
		
		Dev dev1 = new Dev("Camila");
		dev1.inscreverBootcamp(bootcamp);
		dev1.progredir();
		
		Dev dev2 = new Dev("Joao");
		dev2.inscreverBootcamp(bootcamp);
		dev2.progredir();
		dev2.progredir();
		
		System.out.println(dev1.getNome()+ " Conteudos inscritos: " + dev1.getConteudosInscritos());
		System.out.println(dev2.getNome()+ " Conteudos inscritos: " + dev2.getConteudosInscritos());
		System.out.println();
		
		System.out.println(dev1.getNome()+ " Conteudos concluidos: " + dev1.getConteudosConcluidos());
		System.out.println(dev2.getNome()+ " Conteudos concluidos: " + dev2.getConteudosConcluidos());
		System.out.println();
		 
		System.out.println(dev1.getNome()+ " Xp: " + dev1.calcularTotalXp());
		System.out.println(dev2.getNome()+ " Xp: " + dev2.calcularTotalXp());
	}
}
