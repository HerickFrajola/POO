package Exercicio4.Livro;

import Exercicio4.Notas;

public class Livro{ 
        public static void main(String[] args) throws Exception {
            Notas notas1 = new Notas("Matematica");
            notas1.mostrarMensagem();
            notas1.mediaClasse(95, 55, 24, 88, 74, 65, 11, 39, 71, 68);
            notas1.Conceito();
    
            Notas notas2 = new Notas("Ciecias");
            notas2.mostrarMensagem();
            notas2.mediaClasse(78, 82, 99, 45, 34, 74, 55, 98, 63, 81);
            notas2.Conceito();
    
            Notas notas3 = new Notas("Sociologia");
            notas3.mostrarMensagem();
            notas3.mediaClasse(81, 82, 83, 84, 85, 86, 87, 88, 89, 89);
            notas3.Conceito();;
    
            Notas notas4 = new Notas("Biologia");
            notas4.mostrarMensagem();
            notas4.mediaClasse(99, 94, 95, 92, 97, 96, 97, 98, 91, 99);
            notas4.Conceito();
    
            Notas notas5 = new Notas("Historia");
            notas5.mostrarMensagem();
            notas5.mediaClasse(22, 27, 25, 20, 28, 29, 27, 21, 24, 35);
            notas5.Conceito();
    
            Notas notas6 = new Notas("Artes");
            notas6.mostrarMensagem();
            notas6.mediaClasse(45, 23, 21, 11, 13, 9, 12, 16, 12, 19);
            notas6.Conceito();
    }
}
