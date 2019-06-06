//Nowakowski Krzysztof 94407
//Zadanie 8 -  Sortowanie przez proste wybieranie
//
//1. Szukamy najmniejszego elementu
//2. Po znalezieniu zamieniamy go miejscami z pierwszym (chyba że ten pierwszy jest  właśnie najmniejszy)
//3. Operację powtarzamy dla drugiego elementu itd.



public class Zadanie_8v2_Sortowanie_przez_proste_wybieranie {

    public static int[] Sortowanie(int[] array,int odlicz,int minimum,int temp,int pozycja, int i,int s){
        if(s>=array.length){//koniec przepisywania
            return array;
        }

        if(i<array.length&& array[i]<minimum){
            minimum = array[i];//zapamiętanie chwilowo najmniejszej
            pozycja = i;
            return Sortowanie(array,odlicz,minimum,temp,pozycja,i+1,s);
        }else if(i>=array.length){
            temp = array[s];//funkcja przepisania
            array[s] = minimum;
            array[pozycja] = temp;
            odlicz++;
            return Sortowanie(array,odlicz,10000,0,0,0+odlicz,s+1);
        }else{
            return Sortowanie(array,odlicz,minimum,temp,pozycja,i+1,s);
        }
    }

    public static void main(String args[]){
        int array[] = {9,4,10,2,17,99,2,12,8,5,18,20,17,22,29,3,27,12,15,88,31};
        int[] wynik;


        wynik = Sortowanie(array,0,10000,0,0,0,0);
        for (int i:
            wynik ) {
            System.out.print(i+",");//wypisz
        }


    }
}
