import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[5];
        double salarioBruto, salarioLiquido, inss, impostoRenda;
        System.out.println("Digite o salário de 5 funcionários a seguir.");
        for (int i=0; i<salarios.length;i++) {
            System.out.print("Digite o "+(i+1)+"º salário: ");
            salarios[i] = scanner.nextDouble();
        }
        for (int i=0;i<5;i++) {
            salarioBruto = salarios[i];
            inss = calcularInss(salarioBruto);
            impostoRenda = calcularImpostoRenda(salarioBruto);
            salarioLiquido = salarioBruto - inss - impostoRenda;

            System.out.println("\n---------- "+(i+1)+"º funcionário ----------");
            System.out.printf("Salário bruto: R$ %.2f \n", salarioBruto);
            System.out.printf("Pagou R$ %.2f ao INSS. \n", inss);
            System.out.printf("Pagou R$ %.2f de imposto de renda. \n",impostoRenda);
            System.out.printf("Salário líquido: R$ %.2f \n", salarioLiquido);
        }
    }
    private static double calcularInss(double salario) {
        if (salario <= 1212.00) {
            return salario * 0.075;
        } else if (salario <= 2427.35) {
            return salario * 0.09;
        } else if (salario <= 3641.03) {
            return salario * 0.12;
        } else {
            return salario * 0.14;
        }
    }

    private static double calcularImpostoRenda(double salario) {
        if (salario<=1903.98) {
            return 0;
        } else if (salario<=2826.65) {
            return salario*0.075;
        } else if (salario<=3751.05) {
            return salario*0.15;
        } else if (salario<=4464.68) {
            return salario*0.225;
        } else {
            return salario*0.275;
        }
    }
}
