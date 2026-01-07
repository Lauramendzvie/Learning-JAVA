public class Alunos {
    private String nome;
    private String EDV;
    private int idade;
    private String fileira;

    // Toda vez que eu for criar um aluno ele ja vai preencher
    // estou usando o construtor para construir a classe

    public Alunos(String nome, String EDV, int idade, String fileira) {
        this.nome = nome; // seleciono tudo que atribui a classe e vou informando o java que:
        // nome vai ser igual a nome, edv igual ao edv e etc
        this.EDV = EDV;
        this.idade = idade;
        this.fileira = fileira;
    }

    /*
    a minha classe é privada pra manter a segurança dela e garantir que
    ninguem tenha acesso facil aos meus dados e tenha a oportunidade de mexer neles
    ou deletar eles!

    e como eles são privados, eu preciso de uma permissão para ter acesso a eles
    e essa "permissão" vai ser feita com o get, que vai gentilmente PEDIR pro java
    a informação que eu quero, seja o nome ou etc

    eu estou formalmente pedindo: could you > get < me the name
    tipo isso :)
     */

    public String getNome(){ // na string publica "nome" ele vai puxar o "nome"
        return nome;        // quando eu pedir o "nome" o java me retorna o "nome".
    }

    public String getEDV(){
        return EDV;
    }

    public int getIdade(){
        return idade;
    }

    public String getFileira(){
        return fileira;
    }

    /*

     o void é quando eu tenho uma ação que nao vai me devolver um valor
    nesse caso aqui, eu vou usar o set para alterar um dos valores da minha classe

    se eu peço pro java pra mudar o nome de Leonardo para Dinossauro
    ele vai mudar e pronto, ai deeepois eu uso o get pra ver se foi!
    mas o set trabalha as escondidas entao ele usa o void

    o void ta aqui pra dizer que vai ter uma ação, eu nao necessariamente vou ver

    */

    public void setEDV(String EDV) {
        this.EDV = EDV;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /*

    aqui eu vou usar o override pq to subscrevendo um comando que o java ja iria fazer
    nesse caso estou convertendo pra que a resposta que ele for dar no terminal
    quando eu pedir, venha formatada bonitinha e de um jeito mais organizado!
    estou dizendo pro java que tenho uma formatação melhor que a dele
    e ai eu uso a minha propria!

    no to string eu peço que a resposta dele venha nesse formato de string q eu criei

    */

    @Override
    public String toString(){
        return "/ Aluno" + nome +  "/ Idade" + idade + "/ EDV" + EDV + "/ Fileira" + fileira;
    }
        // o "/" é só pra decorar na hora que aparecer, nao é nada especifico ;)
}


