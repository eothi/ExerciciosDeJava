package OrietancaoObjetos;

import java.util.Scanner;

public class Aluno {

    Scanner input = new Scanner(System.in);
    String nome;
    int matricula;
    String curso;
    String Matematica;
    String Portugues;
    String biologia;
    int notaMat;
    int notaPor;
    int notaBio;

    boolean MostrarAprovaçãoMat() {
        if (notaMat >= 7) {
            System.out.println("Aprovado na disciplina de Biologia com a nota: " + notaMat);
            return true;
        } else {
            System.out.println("Não está aprovado, pois a nota foi: " + notaPor);
        }
        return false;
    }

    boolean MostrarAprovaçãoPor() {
        if (notaMat >= 7) {
            System.out.println("Aprovado na disciplina de Biologia com a nota: " + notaPor);
            return true;
        } else {
            System.out.println("Não está aprovado, pois a nota foi: " + notaPor);
        }
        return false;
    }

    boolean MostrarAprovaçãoBio() {
        if (notaMat >= 7) {
            System.out.println("Aprovado na disciplina de Biologia com a nota: " + notaBio);
            return true;
        } else {
            System.out.println("Não está aprovado, pois a nota foi: " + notaBio);
        }
        return false;
    }

    void ExbirInformaçoesAluno() {
        System.out.println("Digite o nome do aluno");
        nome = input.nextLine();
        System.out.println("Digite o nome da matricula do " + nome);
        matricula = input.nextInt();
        System.out.println("qual curso está fazendo");
        curso = input.next();
        System.out.println("o curso " + curso + " do(a) " + nome + " Tem as respectivas disciplina e notas");

        MostrarAprovaçãoBio();
        MostrarAprovaçãoMat();
        MostrarAprovaçãoPor();
                
    }
}
