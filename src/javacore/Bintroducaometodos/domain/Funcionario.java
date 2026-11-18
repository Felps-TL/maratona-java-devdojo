package javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalario;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }
}
