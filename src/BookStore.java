public class BookStore{
    int inventar;
    public int alis(String name, int qiymet, int nesriyyat, String muellif){
        inventar=inventar+1;
        return inventar;
    }
    public int satis(String name, int qiymet, int nesriyyat, String muellif){
        inventar=inventar-1;
        return inventar;
    }

    public BookStore(int inventar) {
        this.inventar = inventar;
    }

    public int getInventar() {
        return inventar;
    }

    public void setInventar(int inventar) {
        this.inventar = inventar;
    }
}
