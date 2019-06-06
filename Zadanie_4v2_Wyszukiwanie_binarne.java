import java.util.Scanner;

public class mainz4v2 {
//klasa rekurencyjna szukająca binarnie z 4 wartosciami 2 są zew. 2 kolejne do rekurencji
    public static int szukanieBinarneRekurencja(int[] wektor, int szukana, int lewy, int prawy){
        if(lewy > prawy) {// przekręcenie się wartości tak że lewy jest po prawej a prawy po lewej, fałsz liczby nie znaleziono
            return -1;//klasa int więc zwraca -1 zamiast false
        }
        int srodek = (int)((lewy+prawy)/2);//wyliczenie środka
        if(wektor[srodek] == szukana){//jeśli środek jest szukaną liczbą
            return srodek;//zwróć zmienna srodek
        }else if (szukana<wektor[srodek]){//znajduje się po lewej
            return szukanieBinarneRekurencja(wektor,szukana,lewy,srodek-1);
        }else {//po prawej
            return szukanieBinarneRekurencja(wektor,szukana,srodek+1,prawy);
        }
    }
//klasa do wprowadzenia danych dla klasy rekurencyjnej
    public static int szukanieBinarne(int[] wektor, int szukana){
        return szukanieBinarneRekurencja(wektor, szukana,0 ,wektor.length -1);
    }

    public static void main(String args[]){
        int liczbaSzukaIndexu;
        int[] wektorDuzy = new int[100]; //utworzenie tablicy n-elementowej
        wektorDuzy[0] = (int) ((Math.random() * 5) + 1); // wygenerowanie 0 elementu
        for (int i = 1;i<wektorDuzy.length;i++){//pętla generowania do tablicy
            wektorDuzy[i] = (int) ((Math.random() * 5) + 1) + wektorDuzy[i - 1];//dla każdego elementu większego od 1 do max index talicy losuje liczbe 1-5 i dodaje do poprzedniego indexu
        }
        System.out.println("Wektor uporządkowany rosnąco");
        for (int j = 0;j<wektorDuzy.length;j++){ //wypisz tablice
            System.out.print(wektorDuzy[j]+",");
        }System.out.println("");

//Część wprowadzenia liczby do zmiennej programu
        Scanner s = new Scanner(System.in); //utworzenie klasy scanner "s"
        System.out.println("Wprowadź liczbę której indeksu szukasz: ");
        liczbaSzukaIndexu = s.nextInt(); //wprowadzenie liczby z konsoli
        s.close(); // zamknięcie klasy scanner

        int wynik = szukanieBinarne(wektorDuzy, liczbaSzukaIndexu); // przypisanie w celu sprawdzenia wartości

//wyświetlenie
        if(wynik>=0){
            System.out.print("Indeks liczby której szukasz to: "+wynik);
        }else {
            System.out.print("Danej liczby nie ma w wektorze");
        }
    }
}
