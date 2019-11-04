import java.util.Random;

public class Zad_2_3_2_3 {

    //2.3.2 Jak za pomocą metody „dziel i zwyciężaj” rozwiązać problem odgadywania liczby (patrz podrozdział A.6).

    //A.6 Problem odgadywania liczby
    //Jak odgadnąć liczbę pomyślaną przez rozmówcę z zakresu od 0 do 1000, zadając jak najmniejszą liczbę pytań rozmówcy?
    //Przy czym, pytania zadawane rozmówcy muszą być jedynie typu: „Czy to jest liczba 546?”,
    //na które rozmówca może odpowiadać na jeden z następujących sposobów: „TAK”, „ZA MAŁA” lub „ZA DUŻA”.

    public static void main(String[] args){
        Random rand = new Random();
        int szukana=rand.nextInt(1001);
        int zakresgorny=1000;
        int zakresdolny=0;

        int ilosc_prob=szukaj(0,1000,szukana,0);
        System.out.println("ilosc prob: "+ilosc_prob);
    }

    public static int szukaj(int zakresdolny,int zakresgorny, int szukana,int prob)
    {
        prob++;
        int srodek=(zakresgorny+zakresdolny)/2;
        System.out.println("czy szukana liczba to: "+srodek);
        if(srodek==szukana)
        {
            System.out.println("znaleziono "+szukana);
            return prob;
        }else if(srodek>szukana)
        {
            System.out.println("za duza");
            return szukaj(zakresdolny,srodek,szukana,prob);
        }else if(srodek<szukana)
        {
            System.out.println("za mala");
            return szukaj(srodek,zakresgorny,szukana,prob);
        }
        return 0;
    }

}
