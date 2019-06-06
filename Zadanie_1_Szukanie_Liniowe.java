//szukanie liniowe
public class mainz1 {
    public static void main(String[] args){
        int[] wektor = {7,9,12,13,14,14,14,15,45,57,89,95,100};
        boolean szukaj = true;
        for (int i = 0;i<wektor.length-2;i++) {
            if (wektor[i] == wektor[wektor.length-1]) {
                if(szukaj){
                    System.out.print("Szukana liczba na pozycji "+i);
                    szukaj = false;
                }else{
                    System.out.print(", "+i);
                }
            }
        }
        if (szukaj) {
            System.out.println("Nie znaleziono szukanej liczby");
        }
    }
}