//Nowakowski Krzysztof 94407
//Zadanie 8 -  Sortowanie przez proste wybieranie
//
//1. Szukamy najmniejszego elementu
//2. Po znalezieniu zamieniamy go miejscami z pierwszym (chyba że ten pierwszy jest  właśnie najmniejszy)
//3. Operację powtarzamy dla drugiego elementu itd.



public class Zadanie_8_Sortowanie_przez_proste_wybieranie {
    public static void main(String args[]){
        int array[] = {9,4,10,2,17,99,2,12,8,5,18,20,17,22,29,3,27,12,15,88,31};
        int odlicz = 0,wartoscZapisana,pozycja = 0, minimum = 10000;

        for(int s = 0;s<array.length;s++) {
            for (int i = 0+odlicz;i<array.length;i++) {//przesun o koleja iteracje gdzie przestawiona została już najmniejsza liczba
                if (array[i] < minimum) {
                    minimum = array[i];//zapamiętanie chwilowo najmniejszej
                    pozycja = i;
                }
            }
            wartoscZapisana = array[s];//funkcja przepisania
            array[s] = minimum;
            array[pozycja] = wartoscZapisana;
            odlicz++;
            minimum = 10000;
        }

        for (int i:
            array ) {
            System.out.print(i+",");//wypisz
        }


    }
}
