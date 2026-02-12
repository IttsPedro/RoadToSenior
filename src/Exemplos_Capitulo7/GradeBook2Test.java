package Exemplos_Capitulo7;
// Figura 7.19: GradeBook2Test.java
// GradeBook2Test cria o objeto GradeBook utilizando um array bidimensional
// das notas e, então, invoca o método processGrades para análisa-las

public class GradeBook2Test {

    // método main inicia a execução do programa
    public static void main(String[] args) {

        // array main inicia execução de notas de aluno
        int[][] gardesArray = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85},
                {78, 87, 65}, {85, 75, 83}, {91,94, 100}, {76, 72, 84}, {87, 93, 73}};

        GradeBook2 myGradeBook = new GradeBook2("CS101 Introduction to java Programming", gardesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
} // fim da classe GradeBook2Test
