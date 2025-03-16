public class Book {
    String name;
    String muellif;
    int nesriyyat;
    int qiymet;

    public Book(String name, int qiymet, int nesriyyat, String muellif) {
        this.name = name;
        this.qiymet = qiymet;
        this.nesriyyat = nesriyyat;
        this.muellif = muellif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuellif() {
        return muellif;
    }

    public void setMuellif(String muellif) {
        this.muellif = muellif;
    }

    public int getNesriyyat() {
        return nesriyyat;
    }

    public void setNesriyyat(int nesriyyat) {
        this.nesriyyat = nesriyyat;
    }

    public int getQiymet() {
        return qiymet;
    }

    public void setQiymet(int qiymet) {
        this.qiymet = qiymet;
    }
}
