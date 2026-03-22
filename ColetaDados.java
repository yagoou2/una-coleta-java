import java.util.Scanner;

public class ColetaDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        

        System.out.println("--- SISTEMA DE SELEÇÃO INTERESTELAR ---");
        System.out.println("Por favor, insira os dados do candidato.");

        System.out.println("Nome completo do aspirante: ");
        String nome = leitor.nextLine();

        System.out.print("Idade terrestre: ");
        int idade = leitor.nextInt();

        System.out.print("Altura (em metros): ");
        double altura = leitor.nextDouble();

        System.out.print("Possui experiência com pilotagem de drone? (true/false): ");
        boolean temExperiencia = leitor.nextBoolean();

        System.out.print("\n--- PROCESSANDO DADOS DA FICHA ---");
        System.out.printf("\nCandidato: %s %n", nome);
        System.out.printf("Idade %d anos | Altura: %.2f m %n", idade, altura);
        System.out.println("Qualificado para pilotagem? " + (temExperiencia ? "Sim" : "Não"));

        if (idade >= 18 && idade <= 45) {
          System.out.println("Status: Apto para os testes físicos.");
        } else {
            System.out.println("Status: idade fora dos parâmetros da missão.");
        }

        leitor.close();
        System.out.println("------------------------------");
    }
}