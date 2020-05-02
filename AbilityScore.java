public class AbilityScore {
    private int str;
    private int con;
    private int dex;
    private int intel;
    private int wis;
    private int cha;

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public AbilityScore(int str, int con, int dex, int intel, int wis, int cha) {
        this.str = str;
        this.con = con;
        this.dex = dex;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }
}
