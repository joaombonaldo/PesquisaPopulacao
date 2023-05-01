package Folha3;
import java.util.Scanner;

/*A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados 
sobre o salário e número de filhos. A prefeitura deseja saber:
(a) média do salário da população;
(b) média do número de filhos;
(c) maior salário;
(d) percentual de pessoas com salário até R$2000,00.
 * 
 */
public class Exercicio15Folha3 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario = 0, somaSal = 0, maiorSal = 0, porcSal = 0;
        int filhos = 0, hab = 0, somaFilhos = 0;
        String opcao = "s";

            while (opcao.equalsIgnoreCase("s")){
                System.out.println("Digite o seu salário:");
                salario = teclado.nextDouble();
                while (salario < 0){
                    System.out.println("Salário inválido!");
                    System.out.println("Digite seu salário:");
                    salario = teclado.nextDouble();
                }
                somaSal += salario;
                hab++;

                if (salario <= 2000){
                    porcSal++;
                }

                if (maiorSal < salario){
                    maiorSal = salario;
                }

                System.out.println("Digite a quantidade de filhos:");
                filhos = teclado.nextInt();
                while (filhos < 0){
                    System.out.println("Quantidade de filhos inválida!");
                    System.out.println("Digite a quantidade de filhos:");
                    filhos = teclado.nextInt();
                }
                somaFilhos += filhos;

                System.out.println("Deseja continuar adicionando? (s/n)");
                teclado.nextLine();
                opcao = teclado.nextLine();
                while (opcao != "s" || opcao != "n"){
                    System.out.println("Opção inválida!");
                    System.out.println("Deseja continuar adicionando? (s/n)");
                    teclado.nextLine();
                    opcao = teclado.nextLine();
                }
            }
            
            System.out.printf("Média do salário: %.2f\n", (somaSal/hab));
            System.out.println("Média do número de filhos: " + somaFilhos/hab);
            System.out.printf("Maior salário: %.2f\n", maiorSal);
            System.out.println("Porcentagens de salários até R$2.000,00: " + (porcSal * 100.0/hab) + "%");
    }
    
}
