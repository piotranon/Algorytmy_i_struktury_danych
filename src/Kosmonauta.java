import java.util.ArrayList;
import java.util.List;

public class Kosmonauta {
    private int id_kosmonauty;
    List<Character> umiejetnosci =new ArrayList<Character>();

    public Kosmonauta(int id_kosmonauty, List<Character> umiejetnosci)
    {
        this.id_kosmonauty=id_kosmonauty;
        this.umiejetnosci=umiejetnosci;
    }

    public int getId_kosmonauty() {
        return id_kosmonauty;
    }

    public void setId_kosmonauty(int id_kosmonauty) {
        this.id_kosmonauty = id_kosmonauty;
    }

    public List<Character> getUmiejetnosci() {
        return umiejetnosci;
    }

    public void setUmiejetnosci(List<Character> umiejetnosci) {
        this.umiejetnosci = umiejetnosci;
    }

    @Override
    public String   toString() {
        return "Kosmonauta{" +
                "id_kosmonauty=" + id_kosmonauty +
                ", umiejetnosci=" + umiejetnosci +
                '}';
    }
}
