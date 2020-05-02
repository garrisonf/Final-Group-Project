public class Defense {
    private int ac;
    private int fort;
    private int ref;
    private int will;

    public Defense(int ac, int fort, int ref, int will) {
        super();
        this.ac = ac;
        this.fort = fort;
        this.ref = ref;
        this.will = will;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getFort() {
        return fort;
    }

    public void setFort(int fort) {
        this.fort = fort;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }
}
