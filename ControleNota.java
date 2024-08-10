import java.util.Scanner;

public class ControleNota {   

   /*  if (nota >= 7)
    System.out.println("Aprovado");

    else if (nota >= 5 && nota <7)
    system.out.println("Recuperação");

    else 
    System.out.println("Reprovado");
    */

    // Utilizando condição Ternária para a simplificação da condição acima de  IF e ELSE

    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler os dados via terminal
        final Scanner scanner = new Scanner(System.in); 

    //Declaração de variáveis 
        int nota;

        //Captura das notas via Terminal
        System.out.print("Por favor, digite a nota do aluno: ");
        nota = scanner.nextInt();

            // VEja a seguir como o uso da condição Ternária reduz para somente 1 linha um codigo em que se utiliza a condição de else/if
            String resultado = nota >= 7 ? "Aprovado" :nota >= 5 &&  nota <7  ? "Recuperação"   :   "Reprovado";
             System.out.println(resultado);
    }
}
