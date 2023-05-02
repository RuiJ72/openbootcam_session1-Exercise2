package open.bootcamp.com;

import java.util.Scanner;

public class CalculoPrecoComIva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço sem IVA: ");

        double precoSemIva = scanner.nextDouble();
        double precoComIva = calcularPrecoComIva(precoSemIva);

        System.out.println("Preço com IVA: " + precoComIva);
    }

    public static double calcularPrecoComIva(double precoSemIva) {
        double taxaIva = 0.09; // 9% de IVA
        double precoComIva = precoSemIva * (1 + taxaIva);
        return precoComIva;
    }
}
