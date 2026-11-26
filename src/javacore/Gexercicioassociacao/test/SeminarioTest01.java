package javacore.Gexercicioassociacao.test;

import javacore.Gexercicioassociacao.domain.Aluno;
import javacore.Gexercicioassociacao.domain.Local;
import javacore.Gexercicioassociacao.domain.Professor;
import javacore.Gexercicioassociacao.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Universidade Monstros");
        Aluno aluno = new Aluno("Sullivan", 18);
        Professor professor = new Professor("Abigail Hardscrabble", "Programa de Sustos");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Susto Assustador", alunos, local);
        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
