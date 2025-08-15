import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHorario(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHorario(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-------");
        System.out.println("Conteudos inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluídos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("------------------------------------------------------------------");
        
        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Andre: " + devAndre.getConteudosInscritos());
        devAndre.progredir();
        System.out.println("--------");
        System.out.println("Conteudos inscritos de Andre: " + devAndre.getConteudosInscritos());
        System.out.println("Conteudos concluídos de Andre: " + devAndre.getConteudosConcluidos());
        System.out.println("XP: " + devAndre.calcularTotalXp());


    }
}
