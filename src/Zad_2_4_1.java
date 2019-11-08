public class Zad_2_4_1 {
    //2.4.1 Użyj metody programowania dynamicznego do rozwiązania decyzyjnego problemu plecakowego (patrz podrozdział A.1).

    //Dany jest plecak o objętości v = 10 oraz 6 przedmiotów ponumerowanych od 0 do 5.
    //Każdy przedmiot ma określoną wartość Wi i objętość Vi.
    //Należy zapakować plecak spośród przedmiotów ponumerowanych od 0 do 5 w taki sposób,
    //aby wartość przedmiotów w nim zgromadzonych była największa. Wartości i objętości przedmiotów
    //określone są w poniższej tabeli:

    //   i 0 1 2 3 4 5
    //  Vi 6 2 3 2 3 1
    //  Wi 6 4 5 7 10 2

    //Odp: W plecaku o maksymalnej wartości znajdą się przedmioty 1,2,3,4 o wartości 26.



    public static void main(String[] args)
    {
        int N = 6; // liczba przedmiotów
        int MAX_V = 10; // objetość plecaka
        int[] V = {6,2,3,2,3,1}; // objetości przedmiotów
        int[] W = {6,4,5,7,10,2}; // wartości przedmiotów

        int[] wybrane=new int[N];
        int[][] Wyniki = new int[N][MAX_V+1];

        for(int i = 0; i < N; i++)
            for(int j = 0; j <= MAX_V; j++){
                //iterujemy po [j] objetosci plecaka od 0 dlatego objetosc musi byc zwiekszona o 1
                if(i == 0 && j < V[0]){
                    Wyniki[i][j] = 0;
                }
                else if(i == 0 && j >= V[0]){
                    Wyniki[i][j] = W[0];
                }
                else if(i > 0 && j < V[i]){
                    Wyniki[i][j] = Wyniki[i-1][j];
                }
                else if(i > 0 && j >= V[i]){
                    //sprawdzamy co jest optymalniejsze
                    //czy wartosc przedmiotow dla tej samej objetosci z przedmiotem poprzednim jest wieksza
                    //od wartosci aktualnego przedmiotu i wartosci najkorzystniejszej dla objetosci mniejszej o objetosc tego przedmiotu
                    if(Wyniki[i-1][j]>W[i] + Wyniki[i-1][j-V[i]])
                    {
                        Wyniki[i][j] =Wyniki[i-1][j];
                    }

                    if(W[i] + Wyniki[i-1][j-V[i]]>Wyniki[i-1][j])
                    {
                        if(j==MAX_V)
                            wybrane[i]=1;

                        Wyniki[i][j]=W[i] + Wyniki[i-1][j-V[i]];
                    }
                }
            }

        for(int i = 0; i < N; i++){
            for(int j = 1; j <= MAX_V; j++){
                System.out.print(Wyniki[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("max wartosc przedmiotow: "+Wyniki[N-1][MAX_V]);
        System.out.print("Przedmioty:");

        for(int i=0;i<wybrane.length;i++)
        {
            if(wybrane[i]==1)
            {
                System.out.print(i+",");
            }
        }
    }
}
