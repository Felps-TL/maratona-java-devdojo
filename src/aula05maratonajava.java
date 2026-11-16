/*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
 */

import java.time.LocalDate;
import java.util.Scanner;

public class aula05maratonajava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        LocalDate data = LocalDate.now();

        System.out.println("Eu " + nome + " morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data de " + data);
    }
}
