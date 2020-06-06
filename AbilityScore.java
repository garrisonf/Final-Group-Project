package DungeonsAndDragons;


import java.io.Serializable;
//@author: egilsson

public class AbilityScore implements Serializable {
    private int value;
    private int mod;
    
    AbilityScore(int value) {
        this.value = value;
        this.mod = calculateMod(value);
    }
    
    public int calculateMod(int stat) {
            if(stat >= 1 && stat <=30)
            return stat/2 - 5;
        else if(stat < 1) 
            return -5;
        else 
            return 10;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        if(value < 0) value = 0;
        this.value = value;
        this.mod = calculateMod(value);
    }
    
    public int getMod() {
        return mod;
    }
    
    @Override
    public String toString() {
        String pos = "";
        if(mod >= 0) pos = "+";
        return value + "("+ pos + mod + ")";
    }
}
