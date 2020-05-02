public class TrainedSkills {
    private int diplomacy;
    private int heal;
    private int history;
    private int insight;
    private int religion;

    public TrainedSkills(int diplomacy, int heal, int history, int insight, int religion) {
        super();
        this.diplomacy = diplomacy;
        this.heal = heal;
        this.history = history;
        this.insight = insight;
        this.religion = religion;
    }

    public int getDiplomacy() {
        return diplomacy;
    }

    public void setDiplomacy(int diplomacy) {
        this.diplomacy = diplomacy;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getInsight() {
        return insight;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }
}
