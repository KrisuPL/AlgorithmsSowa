//Nowakowski Krzysztof
// nr indexu 94407
//tworzenie wektora uporządkowanego rosnąco gdzie każdywyraz jest większy w zakresie 1-5 od poprzedniego z przypisaniem 0 elementu przed pętlą w celu usunięcia warunku w pętli
public class mainz3v2 {
    public static void main (String args[]){
        int[] wektorDuzy = new int[100]; //utworzenie tablicy 100elemen
        wektorDuzy[0] = (int) ((Math.random() * 5) + 1); // wygenerowanie 0 elementu
        for (int i = 1;i<wektorDuzy.length;i++){//pętla generowania do tablicy
                wektorDuzy[i] = (int) ((Math.random() * 5) + 1) + wektorDuzy[i - 1];//dla każdego elementu większego od 1 do max index talicy losuje liczbe 1-5 i dodaje do poprzedniego indexu
        }
        System.out.println("Wektor uporządkowany rosnąco");
        for (int j = 0;j<wektorDuzy.length;j++){ //wypisz tablice
            System.out.print(wektorDuzy[j]+",");
        }
    }
}
