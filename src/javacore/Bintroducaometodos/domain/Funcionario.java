package javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;
    public double mediaSalario;

    public void imprime() {

        System.out.println("-----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("ùltimos 3 salários: ");
        for (double salario : salarios) {
            System.out.print("R$" + salario + " | ");
            mediaSalario += salario;
        }
        mediaSalario /= salarios.length;
        System.out.println("\nA média dos 3 meses foi de: R$" + mediaSalario);
    }
}
