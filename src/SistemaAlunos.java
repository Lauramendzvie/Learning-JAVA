import java.util.ArrayList;
import java.util.Scanner;
    /* Essa é uma lista (ArrayList)
    que vai guardar objetos do tipo: <Aluno> */

public class SistemaAlunos {
    private ArrayList<Aluno> Aluno = new ArrayList<>();
                        /* o new é pro java saber que eu QUERO uma lista que exista
                        pq ate entao ele só sabe que eu quero, mas ela nao existe :p */
    private Scanner scanner = new Scanner(System.in);
                        /* aqui eu crio um scanner e nomeio ele! nesse caso
                        o nome do meu Scanner é "mostrar" e ai novamente, igual no Array
                        eu uso o new pra criar de verdade e coloco o System.in pra incluir
                        esse novo Scanner no sistema da maneira correta */
    public void rodar(){ // novamente o uso do void pra dizer que vao acontecer coisas por trás que não irei ver
    int opcao; // aqui eu uso int na minha variavel pq no meu menu o usuario vai fazer a seleção atráves de números ( opção 1, 2, 3 ETC )
        do{
            System.out.println("\n -- Sistema de Alunos da DS18! -- ");
            System.out.println(" 1 --  Adicionar um Aluno novo -- ");
            System.out.println(" 2 -- Listar os Alunos da DS18 -- ");
            System.out.println(" 0 -- Sair -- ");
            System.out.println(" -- Escolha uma dessas opções: -- ");

            opcao = scanner.nextInt(); // chamando o scanner pra ler o numero que o usuario colocou na minha variavel ( no menu )
            scanner.nextLine(); // scanner ""reseta"" e limpa o que o usuário tinha digitado anteriormente

            // switch: Decide o que fazer com base na opção, Tipo um “menu interativo”
            switch (opcao) { // aqui vou mostrar pro java o que ele vai fazer em cada opção que for escolhida !
                case 1: // caso o usuario escolha 1, o java vai chamar o metodo de adicionar um aluno
                    adicionarAluno();
                    break;
                case 2: // caso o user escolha 2, o java vai chamar o metodo que lista os alunos ja inseridos e salvos no array
                    listarAlunos();
                    break;

                case 3: // caso o usuario escolha 3, o java vai exibir uma mensagem de sair e vai dar break no loop e exibir o menu novamente
                    System.out.println("Saindo do sistema...");
                    break;

                default: // caso o usuario digite algo nada a ver que nao se enquadre no que eu escolhi, o java vai informar que aquilo que o usuario quer nao existe
                    System.out.println("Essa opção não existe :( ");

                    // agora vamos criar esses Métodos!!

            }

        } while (opcao != 0 ); // aqui to só dizendo que o loop vai continuar e continuar enquanto a opção nao for zero ( 0 )
    }

    private void adicionarAluno(){ // void novamente: ação oculta
        System.out.println("Nome:"); // le o nome
        String nome = scanner.nextLine();
                                            /* basicamente em todos aqui eu vou mostrar pro usuario cada uma das categorias
                                            o usuario vai preenchendo e o scanner vai lendo e resetando dps
                                            com a resposta do usuario ja "salva"*/
        System.out.println("EDV"); // le o edv
        String EDV = scanner.nextLine();

        System.out.println("Idade");
        int idade = scanner.nextInt(); // le um numero inteiro
        scanner.nextLine(); // como ele leu primeiro int, eu chamo o line dps pra resetar

        System.out.println("Fileira"); // le  a fileira
        String fileira = scanner.nextLine();

        // ai agora a gente vai juntar todas essas informações que o usuário deu e criar um novo aluno com base nisso!]
        // a gente cria e junta as informações:

        Aluno Novo = new Aluno(nome, EDV, idade, fileira); // aqui ele a usando minha classe construtora aluno pra poder criar um novo!
        // a classe construtora se torna o molde de tudo

        // e ai claro pra dar certo, a gente adiciona ele na lista de alunos!

        Aluno.add(Novo); // guardando o aluno novo (Novo) na minha lista de alunos!

        // ve o novo aqui? ele indica o aluno novo criado, e quando adicionamos ele na lista pedimos que o java adicione o "novo" na lista
        // compreenda isso pq eu buguei, mas só ler que voce entende KKKKKKKK

        System.out.println("Novo aluno adicionado com sucesso!!!!");
    }

    private void listarAlunos() { /* vamos criar nosso método para listar os alunos que teremos em nossa array */
        System.out.println("\n -- Lista de Alunos da DS18 -- ");
        if (Aluno.isEmpty()) { // vai percorrer a lista e ver se ela ta vazia e caso ela estiver....
            System.out.println("Não existem alunos cadastrados ainda");
        } else {

                                                 //Pegue a lista de alunos, e para cada aluno que está nela,
                                                //mostre ele na tela (usando o toString)
            for (Aluno a : Aluno) {             // aqui vai percorrer aluno por aluno que aparecer na lista
                System.out.println(a);          // vai fazer tudo isso puxando o ToString q eu criei la em Aluno.java
                                                // o ToString é o estilo que vai aparecer os nomes bonitinhos, eu to chamando ele aqui pra ficar bonito
                                                 // na hora de mostrar a lista :)

                                                  /* Na primeira volta → a é o primeiro aluno da lista, Na segunda volta → a é o segundo aluno E assim por diante até acabar a lista */

                                                  // esse A é um ForEach ( para cada tananaanan )
            }
        }
    }
}