public class Zad_2_1_4 {
    //2.1.4 Metodą „brutalnej siły” rozwiązać problem doboru załogi statku kosmicznego (patrz podrozdział A.4).

    // Organizowana jest załogowa ekspedycja kosmiczna na Marsa. W ramach kompletowania załogi statku kosmicznego główny organizator
    // ekspedycji ma rozwiązać następujący problem. Do jego dyspozycji jest pięciu kosmonautów (k1, k2, k3, k4, k5), którzy przeszli
    // pozytywnie kwaliﬁkację wstępną do udziału w ekspedycji. Na pokładzie specjalnego statku kosmicznego spośród nich będzie potrzebny
    // przynajmniej jeden specjalista w każdej z dziedzin: A, B, C i D. Wiadomym jest, że w dziedzinie A specjalizują się kosmonauci k1 i k4, w
    // dziedzinie B specjalizują się kosmonauci k2, k3 i k4, w dziedzinie C specjalizują się kosmonauci k3 i k5 oraz w dziedzinie D
    // specjalizują się kosmonauci k1, k2 i k5. Ze względu na szczupłość miejsca na pokładzie statku kosmicznego, z powyższej piątki
    // trzeba wybrać jak najmniejszą grupkę kosmonautów, tak aby znajdował się w niej przynajmniej jeden specjalista w każdej z dziedzin A, B, C, D.

    //Odp: Na Marsa mogą polecieć np. kosmonauci k4 i k5.

    public static void main(String[] args) {
        int k1=0,k2=0,k3=0,k4=0,k5=0;
        int najmniejszaLiczbaOsob = 6;
        int aktualnaLiczbaOsob;

        for (k1 = 0; k1 <= 1; k1++)
            for (k2 = 0; k2 <= 1; k2++)
                for (k3 = 0; k3 <= 1; k3++)
                    for (k4 = 0; k4 <= 1; k4++)
                        for(k5 = 0; k5 <= 1; k5++)
                        {
                            int a = k1+k4;
                            int b = k2+k3+k4;
                            int c = k3+k5;
                            int d = k1+k2+k5;
                            if( a>=1 && b>=1 && c>=1 && d>=1 ){
                                aktualnaLiczbaOsob = k1 + k2 + k3 + k4 + k5;
                                if( najmniejszaLiczbaOsob>=aktualnaLiczbaOsob ){
                                    najmniejszaLiczbaOsob = aktualnaLiczbaOsob;
                                    System.out.println("k1:" + k1);
                                    System.out.println("k2:" + k2);
                                    System.out.println("k3:" + k3);
                                    System.out.println("k4:" + k4);
                                    System.out.println("k5:" + k5);
                                    System.out.println();
                                }

                            }
                        }
    }
}
