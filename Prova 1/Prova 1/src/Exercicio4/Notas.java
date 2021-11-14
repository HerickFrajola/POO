package Exercicio4;

public class Notas {
    private String nomeCurso;
    int media;


    public Notas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void mostrarMensagem() {
        System.out.println("");
        System.out.println("Curso de : " + this.nomeCurso);
    }

    public void mediaClasse(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        System.out.println("Abaixo a media da classe");
        media = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
        System.out.println("A média da classe é: " + media);

    }

    public void Conceito() {
        if (media >= 95 && media <= 100) {
            System.out.println("Media da sala: A");
        }
        else 
            if (media >= 80 && media <=94){
            System.out.println("Media da sala: B");
        }
        else 
            if(media <= 79 && media >= 60) {
            System.out.println("Media da sala: C");
        }
        else 
            if (media <= 59 && media >= 40) {
            System.out.println("Media da sala: D");
        }
        else 
            if (media <= 39 && media >= 20) {
            System.out.println("Media da sala: E");
        }
        else 
            if (media <=19 && media >= 0) {
            System.out.println("Media da sala: F");
        }
        
    }
}