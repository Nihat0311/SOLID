public class Manager extends Employee{
    String emrMan;

    public Manager(String emrMan) {
        this.emrMan = emrMan;
    }

    public String getEmrMan() {
        return emrMan;
    }

    public void setEmrMan(String emrMan) {
        this.emrMan = emrMan;
    }

    @Override
    void is() {
        System.out.println("Menecer is teyin edir");
    }
    void assignTask(){
        System.out.println(emrMan);
    }
}
