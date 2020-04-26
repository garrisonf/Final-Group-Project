public class AbilityMod extends AbilityScore {
    private int strMod;
    private int conMod;
    private int dexMod;
    private int intelMod;
    private int wisMod;
    private int chaMod;

    public AbilityMod(int str, int con, int dex, int intel, int wis, int cha, int strMod, int conMod, int dexMod, int intelMod, int wisMod, int chaMod) {
        super(str, con, dex, intel, wis, cha);
        this.strMod = strMod;
        this.conMod = conMod;
        this.dexMod = dexMod;
        this.intelMod = intelMod;
        this.wisMod = wisMod;
        this.chaMod = chaMod;
    }

    public int getStrMod() {
        return strMod;
    }

    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    public int getConMod() {
        return conMod;
    }

    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    public int getIntelMod() {
        return intelMod;
    }

    public void setIntelMod(int intelMod) {
        this.intelMod = intelMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }

    public int getChaMod() {
        return chaMod;
    }

    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }


}
