import java.time.LocalDate;

import desafioDominio.Bootcamp;
import desafioDominio.Curso;
import desafioDominio.Dev;
import desafioDominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);    
        bootcamp.getConteudos().add(mentoria);

        Dev devTulio = new Dev();
        devTulio.setNome("Tulio");
        devTulio.inscreverBootcamp(bootcamp);
        devTulio.progredir();
        devTulio.progredir();
        System.out.println("Conteúdos Inscritos Tulio: " + devTulio.getConteudoIncritos());
        System.out.println("Conteúdos Concluídos Tulio: " + devTulio.getConteudoConcluidos());
        System.out.println("XP: " + devTulio.calcularTotalXp());

        System.out.println("-------------------------");

        Dev devBrennda = new Dev();
        devBrennda.setNome("Brennda");
        devBrennda.inscreverBootcamp(bootcamp);
        devBrennda.progredir();
        System.out.println("Conteúdos Inscritos Brennda: " + devBrennda.getConteudoIncritos());
        System.out.println("Conteúdos Concluídos Brennda: " + devBrennda.getConteudoConcluidos());
        System.out.println("XP: " + devBrennda.calcularTotalXp());


    }
}   