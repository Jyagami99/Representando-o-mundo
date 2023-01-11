public class Main {
    public static void main(String[] args) {
        RespondeAi respondeAi = new RespondeAi();

        for(int i = 0; i < respondeAi.alunos.length; i++) {
            respondeAi.alunos[i] = new Student();
        }

        for(int i = 0; i < respondeAi.materias.length; i++) {
            respondeAi.materias[i] = new Subjects();
        }

        respondeAi.materias[0].criarNovaAula();
        System.out.println(respondeAi.materias[0].quantidadeAulas);

        respondeAi.alunos[0].setNome("John Smith");
        respondeAi.alunos[0].setIdade(18);
        respondeAi.alunos[0].setEmail("johnsmith@gmail.com");
        respondeAi.alunos[0].setCpf("473.889.078-66");

        System.out.println(respondeAi.alunos[0].getNome());
        System.out.println(respondeAi.alunos[0].getIdade());
        System.out.println(respondeAi.alunos[0].getEmail());
        System.out.println(respondeAi.alunos[0].getCpf());
    }
}