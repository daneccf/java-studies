package aula43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setCurso("Ciencia da Computaçao");
        double[] notas = {10, 9, 8 , 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "aaaa";
        String s2 = "aaAa";
        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();
        aluno.setCurso("Ciencia da Computaçao");
        double[] notas2 = {10, 9, 8 , 7};
        aluno.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}
