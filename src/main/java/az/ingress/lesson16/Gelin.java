package az.ingress.lesson16;

public class Gelin {

    public int id;
    public String name;

    public Bey er;

    public Gelin(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Gelin(int id, String name, Bey er) {
        this.id = id;
        this.name = name;
        this.er = er;
        er.setArvad(this);
    }

    public void setEr(Bey kishi) {
        er = kishi;
    }

    @Override
    public String toString() {
        return "Gelin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
