public class Zad_2_2_5 {
    //2.2.5 Metodą przeszukiwania z powracaniem rozwiązać problem wyprodukowania lodów wszystkich smaków (patrz podrozdział A.5).
    //Fabryka lodów każdego dnia produkuje na tej samej maszynie lody o sześciu różnych smakach.
    //Zmiana produkcji ze smaku i na smak j wymaga przestrojenia maszyny, czyli przygotowania (w tym umycia) do
    //nowej produkcji, które trwa określony czas. Podana niżej tablica zawiera informację o czasach przestrojenia maszyny.

    //       i \ j	1	2	3	4	5	6
    //         1	0	7	20	21	12	23
    //         2	27	0	13	16	46	5
    //         3	53	15	0	25	27	6
    //         4	16	2	35	0	47	10
    //         5	31	29	5	18	0	4
    //         6	28	24	1	17	5	0
    //Znaleźć kolejność produkcji, przy której całkowity czas przestrojenia maszyny jest minimalny.Przyjąć, że na koniec dnia maszyna ma być przygotowana do produkcji w następnym dniu.

    //Odp: Minimalny całkowity czas przestrojenia maszyny wynosi 63. Oto przykładowa kolejność produkcji lodów, dla której całkowity czas przestrojenia maszyny jest minimalny: 1, 2, 6, 5, 3, 4, 1.

    final static int N = 6; // permutacje n-elementowe
    private static int[] l = new int[N];
    private static final int[][] tabSmakow = { { 0, 7, 20, 21, 12, 23 }, { 27, 0, 13, 16, 46, 5 }, { 53, 15, 0, 25, 27, 6 }, { 16, 2, 35, 0, 47, 10 }, { 31, 29, 5, 18, 0, 4 }, { 28, 24, 1, 17, 5, 0 } };
    private static int[] najlepszaKombinacja = new int[N];
    private static int najnizszyAktualnyCzas = Integer.MAX_VALUE;
    private static int aktualnyCzas;

    public static void main(String[] args) {
        permutacje(0);
        System.out.println("Najniższy czas: " + najnizszyAktualnyCzas);
        for(int i = 0; i<N ; i++){
            System.out.println( najlepszaKombinacja[i] + ", ");
        }
        System.out.println(najlepszaKombinacja[0]);
    }

    static int liczCzas( int[] l ){
        int czas = 0;

        for( int i = 0 ; i<N-1 ; i++ ){
            czas += tabSmakow[ l[i]-1 ][ l[i+1]-1 ];
        }
        czas += tabSmakow[ l[N-1]-1 ][ l[0]-1 ];
        System.out.println("czas:" + czas);
        return czas;
    }

    static void permutacje(int i) {
        if (i == N) {
            for (int j = 0; j < N; j++) {
                aktualnyCzas = liczCzas( l );
                if( aktualnyCzas < najnizszyAktualnyCzas ){
                    najnizszyAktualnyCzas = aktualnyCzas;
                    for( int m = 0 ; m < najlepszaKombinacja.length ; m++ ){
                        najlepszaKombinacja[m] = l[m];
                    }
                }
                System.out.print(l[j] + " ");
            }
            System.out.println();
        } else {
            for (int j = 1; j <= N; j++) {
                int k;
                for (k = 0; k < i; k++) {
                    if (l[k] == j) {
                        break;
                    }
                }
                if (k == i) {
                    l[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }

}
