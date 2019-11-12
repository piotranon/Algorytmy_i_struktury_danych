import java.util.ArrayList;

public class Zad_3_2_3 {
    //3.2.3 Skonstruuj algorytm zachłanny rozwiązujący problem doboru załogi statku kosmicznego (patrz podrozdział A.4).

    // Organizowana jest załogowa ekspedycja kosmiczna na Marsa. W ramach kompletowania załogi statku kosmicznego główny
    // organizator ekspedycji ma rozwiązać następujący problem. Do jego dyspozycji jest pięciu kosmonautów (k1, k2, k3, k4, k5),
    // którzy przeszli pozytywnie kwaliﬁkację wstępną do udziału w ekspedycji. Na pokładzie specjalnego statku kosmicznego
    // spośród nich będzie potrzebny przynajmniej jeden specjalista w każdej z dziedzin: A, B, C i D. Wiadomym jest, że w
    // dziedzinie A specjalizują się kosmonauci k1 i k4, w dziedzinie B specjalizują się kosmonauci k2, k3 i k4, w
    // dziedzinie C specjalizują się kosmonauci k3 i k5 oraz w dziedzinie D specjalizują się kosmonauci k1, k2 i k5.
    // Ze względu na szczupłość miejsca na pokładzie statku kosmicznego, z powyższej piątki trzeba wybrać jak
    // najmniejszą grupkę kosmonautów, tak aby znajdował się w niej przynajmniej jeden specjalista w każdej z dziedzin A, B, C, D.

    // k1 - A,D
    // k2 - B,D
    // k3 - B,C
    // k4 - A,B
    // k5 - C,D

    public static void main(String[] args)
    {
        ArrayList<Kosmonauta> kosmonauci = new ArrayList<Kosmonauta>();

        kosmonauci.add(new Kosmonauta(1,new ArrayList<Character>() {
            {
                add('A');
                add('D');
            }
        } ));
        kosmonauci.add(new Kosmonauta(2,new ArrayList<Character>() {
            {
                add('B');
                add('D');
            }
        } ));
        kosmonauci.add(new Kosmonauta(3,new ArrayList<Character>() {
            {
                add('B');
                add('C');
            }
        } ));
        kosmonauci.add(new Kosmonauta(4,new ArrayList<Character>() {
            {
                add('A');
                add('B');
            }
        } ));
        kosmonauci.add(new Kosmonauta(5,new ArrayList<Character>() {
            {
                add('C');
                add('D');
            }
        } ));

        ArrayList<Character> wymaganeSpecjalizacje= new ArrayList<>(){
            {
                add('A');
                add('B');
                add('C');
                add('D');
            }
        };

        ArrayList<Integer> kosmonauciLecacy=new ArrayList<>();

        System.out.println(kosmonauci.toString());
        int id_z_najwieksza_iloscia_umiejetnosci = -1;
        int ilosc_umiejetnosci=-1;
        for(int i=0;i<kosmonauci.size();i++)
        {
            int temp=0;
            for(int j=0;j<wymaganeSpecjalizacje.size();j++)
            {
                if(kosmonauci.get(i).getUmiejetnosci().contains(wymaganeSpecjalizacje.get(j)))
                {
                    temp++;
                }
            }
            if(temp>ilosc_umiejetnosci)
            {
                ilosc_umiejetnosci=temp;
                id_z_najwieksza_iloscia_umiejetnosci=i;
            }
        }

        kosmonauciLecacy.add(kosmonauci.get(id_z_najwieksza_iloscia_umiejetnosci).getId_kosmonauty());
        for(int i=0;i<kosmonauci.get(id_z_najwieksza_iloscia_umiejetnosci).getUmiejetnosci().size();i++)
        {
            wymaganeSpecjalizacje.remove(kosmonauci.get(id_z_najwieksza_iloscia_umiejetnosci).getUmiejetnosci().get(i));
        }

        while(wymaganeSpecjalizacje.size()>0)
        {
            int umiejetnosciMax=0;
            for(int i=0;i<kosmonauci.size();i++)
            {
                int umiej=0;
                for(int j=0;j<kosmonauci.get(i).getUmiejetnosci().size();j++)
                {
                    if(wymaganeSpecjalizacje.contains(kosmonauci.get(i).getUmiejetnosci().get(j)))
                    {
                        umiej++;
                    }
                }
                if(umiej>umiejetnosciMax)
                {
                    umiejetnosciMax=umiej;
                    kosmonauciLecacy.add(kosmonauci.get(i).getId_kosmonauty());
                    for(int j=0;j<kosmonauci.get(i).getUmiejetnosci().size();j++)
                    {
                        wymaganeSpecjalizacje.remove(kosmonauci.get(i).getUmiejetnosci().get(j));
                    }
                }
            }
        }


        System.out.println(wymaganeSpecjalizacje.toString());

        System.out.println(kosmonauciLecacy.toString());
    }
}
