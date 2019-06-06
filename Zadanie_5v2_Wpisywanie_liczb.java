import java.util.Scanner;
//Nowakowski Krzysztof
//94407
//Program wpisuje z konsoli kolejne liczby do wektrora za pomocą scanera wersja ze sprawdzaniem poprawności danych
public class mainz5v2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int[] wektor = new int[10];
        System.out.println("Wpisz kolejno liczby do wektrora z indeksem:");


        for(int i = 0;i<wektor.length;){ //póki nie wypelni wektora bez inkrementacji po każdym razie bo warunek
            System.out.print(i+" - ");
            if(s.hasNextInt()){//czy wpisane dane to liczba całkowita jeśli tak
                wektor[i] = s.nextInt(); // wpisz do wektora
                System.out.println(" ");
                i++; // pchnij index dalej o 1
            }else { // jeśli no innego
                System.out.println("Zły typ danych, wprowadź liczbę całkowitą");
                s.next(); // daj znać skanerowi że ma zczytać nastąpne dane a nie te same ponownie bo nie ma tutaj przeczytania int za pomocą nextINT i przekazania do zczytywania dalej
            }
        }
        s.close();


        for(int j = 0;j<wektor.length;j++){ //wypisanie wektora
            System.out.print(wektor[j]+", ");
        }

    }
}
