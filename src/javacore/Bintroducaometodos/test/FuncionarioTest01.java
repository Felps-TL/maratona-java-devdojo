package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Bento");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1300, 987.32, 2000});

        funcionario.imprime();
    }
}
