import java.util.Random;
import java.util.Scanner;

public class Zad_2_3_2 {

    //2.3.2 Jak za pomocą metody „dziel i zwyciężaj” rozwiązać problem odgadywania liczby (patrz podrozdział A.6).

    //A.6 Problem odgadywania liczby
    //Jak odgadnąć liczbę pomyślaną przez rozmówcę z zakresu od 0 do 1000, zadając jak najmniejszą liczbę pytań rozmówcy?
    //Przy czym, pytania zadawane rozmówcy muszą być jedynie typu: „Czy to jest liczba 546?”,
    //na które rozmówca może odpowiadać na jeden z następujących sposobów: „TAK”, „ZA MAŁA” lub „ZA DUŻA”.

    public static void main(String[] args){

        System.out.println("Zagrajmy w grę wymyśl liczbę od 0 do 1000.");

        System.out.println("1 - TAK");
        System.out.println("2 - ZA MAlA");
        System.out.println("3 - ZA DUZA");

        Scanner input = new Scanner(System.in);

        int zakresgorny=1000;
        int zakresdolny=0;
        boolean nieznaleziono=true;
        int iloscprob=0;

        do {
            int srodkowa=(zakresgorny+zakresdolny)/2;
            System.out.println("Czy twoja liczba to: "+srodkowa+" ?");
            iloscprob++;
            int odpowiedz=input.nextInt();
            if(odpowiedz==1){
                System.out.println("Twoja liczba to: "+srodkowa);
                nieznaleziono=false;
            }else if(odpowiedz==2){
                System.out.println("za mala");
                zakresdolny=srodkowa;
            }else if(odpowiedz==3){
                System.out.println("za duza");
                zakresgorny=srodkowa;
            }
        }while(nieznaleziono);
        System.out.println("Liczbę znaleziono po "+iloscprob);
    }

}
