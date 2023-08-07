import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static boolean sistemaLigado = true;
    public static Scanner ler = new Scanner(System.in);
    public static Aluno aluno = new Aluno();

    public static void main(String[] args) throws IOException {
        int opc = 0;

        do {
            var invalido = true;
            do {
                try {
                    ler = new Scanner(System.in);
                    Menu();
                    opc = ler.nextInt();
                    invalido = false;
                } catch (Exception e) {// não permitir a entrada de um caracter invalido
                    System.out.println("Apenas opções disponiveis no menu são validas");
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("->  Aperte qualquer tecla para continuar!");
                    System.in.read();
                }

            } while (invalido);

            switch (opc) {

                case 1:
                    inserirNotas();
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("->  Aperte qualquer tecla para continuar!");
                    System.in.read();
                    break;
                case 2:
                    aluno.calcularMedia();
                    aluno.situacao();
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("->  Aperte qualquer tecla para continuar!");
                    System.in.read();

                    break;

                default:
                    System.out.println("Apenas opções disponiveis no menu são validas");
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("->  Aperte qualquer tecla para continuar!");
                    System.in.read();
                    break;

                case 0:
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("Deseja mesmo sair (S)im/(N)ão");
                    System.out.println("+--------------------------------------------------+");
                    String s = encerrar();
                    sistemaLigado = s.equalsIgnoreCase("N");
                    if (!sistemaLigado) {
                        System.out.println("+--------------------------------------------------+");
                        System.out.println("          >>> Obrigado pela preferência  >>>        ");

                    }


            }


        } while (sistemaLigado);
    }

    public static void Menu() {

        System.out.println("+--------------------------------------------------+");
        System.out.println("| Atalho|        >>> Menu Principal   <<<          |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("|   1   |    -> Inserir Notas                      |");
        System.out.println("|   2   |    -> Situação do Aluno                   |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("|   0   |    -> Sair do Sistema                    |");
        System.out.println("+--------------------------------------------------+");
        System.out.print(">");
    }

    public static void inserirNotas() {
        System.out.println("> Entre com nome do Aluno: ");
        aluno.setNome(ler.next());

        System.out.println("> Entre com o registro acadêmico do Aluno: ");
        aluno.setRa(ler.nextInt());


        System.out.println("> Entre com a nota da primeira prova: ");
        aluno.setNotaProva1(ler.nextDouble());

        System.out.println("> Entre com a nota da Segunda prova: ");
        aluno.setNotaProva2(ler.nextDouble());

        System.out.println("> Entre com a nota do Trabalho: ");
        aluno.setNotaTrabalho(ler.nextDouble());

        System.out.println("+--------------------------------------------------+");
        System.out.println("Notas Inseridas com Sucesso...");

    }

    public static String encerrar() {// le uma string e verifica se ela é igual a S ou N
        String desejaContinuar;
        boolean desejaContinuarInvalido;

        do {
            desejaContinuar = ler.next();

            desejaContinuarInvalido = !desejaContinuar.equalsIgnoreCase("N") && !desejaContinuar.equalsIgnoreCase("S");

            if (desejaContinuarInvalido) {
                System.out.println("Resposta inválida! Por favor informe uma resposta válida");
            }
        } while (desejaContinuarInvalido);

        return desejaContinuar;
    }


}

