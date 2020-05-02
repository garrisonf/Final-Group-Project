public class AbilityMod {
    private int strMod;
    private int conMod;
    private int dexMod;
    private int intelMod;
    private int wisMod;
    private int chaMod;

    public AbilityMod(int str, int con, int dex, int intel, int wis, int cha) {
        this.strMod = calculateMod(str);
        this.conMod = calculateMod(con);
        this.dexMod = calculateMod(dex);
        this.intelMod = calculateMod(intel);
        this.wisMod = calculateMod(wis);
        this.chaMod = calculateMod(cha);
    }

    /**
     *
     * @param stat Player's ability score
     * @return Player's ability modifier
     */

    public int calculateMod(int stat) {
            if(stat >= 1 && stat <=30)
            return stat/2 - 5;
        else if(stat < 1) 
            return -5;
        else 
            return 10;
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
