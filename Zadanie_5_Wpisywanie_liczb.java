import java.util.Scanner;
//Nowakowski Krzysztof
//94407
//Program wpisuje z konsoli kolejne liczby do wektrora za pomocą scanera wersja łatwa bez sprawdzania poprawności
public class mainz5 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int[] wektor = new int[10];
        System.out.println("Wpisz kolejno liczby do wektrora z indeksem:");
        for(int i = 0;i<wektor.length;i++){ // póki nie wypełni wekktora rób
            System.out.print(i+" - ");
            wektor[i] = s.nextInt();//wczytaj liczbę
            System.out.println(" ");
        }
        for(int j = 0;j<wektor.length;j++){//wyświetla cały wektor
            System.out.print(wektor[j]+", ");
        }
        s.close();
    }
}
