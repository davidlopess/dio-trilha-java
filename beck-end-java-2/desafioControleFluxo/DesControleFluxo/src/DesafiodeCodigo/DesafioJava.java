package DesafiodeCodigo;
import java.util.Scanner;
public class DesafioJava {
    public static void main(String[] args) {
            @SuppressWarnings("resource")
            Scanner leitorDeEntrada = new Scanner(System.in); 
            System.out.println(" ");
            System.out.println("Digite o valor do seu salario: ");
            float valorSalario = leitorDeEntrada.nextFloat();
            System.out.println("Digite o valor do seu beneficio: ");
            float valorBeneficio = leitorDeEntrada.nextFloat();

            float valorImposto = 0;
            if(valorSalario >= 0 && valorSalario <= 1100){
                valorImposto = 0.05F * valorSalario;

            } else if(valorSalario >= 1100.01 && valorSalario <= 2500){
                valorImposto = 0.10F * valorSalario;

            }else{
                valorImposto = 0.15F * valorSalario;
            }

            float saida = valorSalario - valorImposto + valorBeneficio;

            System.out.println("O valor do seu salario atua é de: " + saida);
        }
    }
    

