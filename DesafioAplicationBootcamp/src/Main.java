import java.time.LocalDate;

import br.com.desafio.dio.dominio.Bootcamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao do curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso javascript");
    curso2.setDescricao("descricao do curso javascript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("mentoria de java");
    mentoria1.setDescricao("descricao java mentoria");
    mentoria1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDecricao("Descricao Bootcamp Java Developer");
    bootcamp.setConteudos(curso1);
    bootcamp.setConteudos(curso2);
    bootcamp.setConteudos(mentoria1);

    Dev devEmerson = new Dev();
    devEmerson.setNome("Emerson");
    devEmerson.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Emerson: " + devEmerson.getConteudosInscritos());

    System.out.println("");
    System.out.println("-----------------------------------------------------------");

    devEmerson.progredir();
    System.out.println("Conteudos inscritos Emerson: " + devEmerson.getConteudosInscritos());
    System.out.println("XP: " + devEmerson.calcularTotalXp());

    System.out.println("");
    System.out.println("-----------------------------------------------------------");

    System.out.println("Conteudos concluidos Emerson: " + devEmerson.getConteudosConcluidos());

    System.out.println("");
    System.out.println("-----------------------------------------------------------");
    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());

    System.out.println("");
    System.out.println("-----------------------------------------------------------");

    System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
    System.out.println("XP: " + devEmerson.calcularTotalXp());


  }
}
