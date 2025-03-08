package mes;

public class Sema {
    public static void main(String[] args) {
        for(DiaDaSemana dia: DiaDaSemana.values()){
            System.out.println(" ");
            System.out.println(dia.getDiaSemana()  + " - " + dia.getDiaMes());
        }

        DiaDaSemana tr = DiaDaSemana.TERCA;
        System.out.println("\nHoje é " + tr.getDiaSemana() + " - " + tr.getDiaMes());
        somar(10,20);

        somars(10,20);
      

        System.out.println("Resultado: " + somars(30,20) + " - RETURN imprime o valor fora do método");
    }

    public static void somar(int a, int b){
        int res = a + b;
        System.out.println("Resultado: " + res + " - VOID imprime o valor dentro do método");
    }

    public static int somars(int num1, int num2){
        return num1 + num2;
    }
}
