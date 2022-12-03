import java.util.Scanner;

public class Day3 {
    /*  Mikołaj postanowił w tym roku skorzytać z pomocy nowoczesnych technologii.
     * Zamiast kupować choinkę i ozdoby postanowił użyć takich wygenerowanych w konsoli (terminalu)
     * Pomoż Mikołajowi! Przygotuj kod, który wypisze na ekranie choinkę.
     * Jeżeli potrafisz, nie wpisuj drzewka bezposrednio w printy - pokombinuj z pętlami.
     * Przygotuj funkcję przyjmującą wysokość choinki i wypisującą choinkę na ekranie.
     * Tak, żeby choinka wygenerowała się sama! Choinka może być po prostu trójkątem, albo być żłożona z kilku warstw. :)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę poziomów choinki: ");
        int hight = scanner.nextInt();

        christmasTree(hight);
    }

    static void christmasTree(int hight) {

        for (int i = 0; i < hight; i++) {
            System.out.print(" ".repeat(hight - i - 1));
            System.out.println("*".repeat(i * 2 + 1));
        }
    }
}
