public class PersonalSkills {
    private int initiative;
    private int speed;
    private String vision;
    private String languages;
    private String senses;
/*
    TO DO: redo this entire class
    
    */
    public PersonalSkills(int initiative, int speed, String vision, String languages, String senses) {
        this.initiative = initiative;
        this.speed = speed;
        this.vision = vision;
        this.languages = languages;
        this.senses = senses;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSenses() {
        return senses;
    }

    public void setSenses(String senses) {
        this.senses = senses;
    }
}
