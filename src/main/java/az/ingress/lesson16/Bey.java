package az.ingress.lesson16;

public class Bey {

    public int id;
    public String name;

    public Gelin arvad;

    public Bey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setArvad(Gelin xanim) {
        arvad = xanim;
    }

    @Override
    public String toString() {
        return "Bey{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", arvad=" + arvad +
                '}';
    }

}
