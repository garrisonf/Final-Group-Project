package DungeonsAndDragons;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
    To Use This Class
    1. Make a player instance
    2. Call the loadCharacters() method
    3. Execute your code
    4. Before closing the program call the saveCharacters() method

*/

public class Player {
    private String name;
    private String userName;
    private String password;
    private double phone;
    
    int numOfCharacters;
    private Character[] characters;

    public Player() {
        numOfCharacters = 0;
//        characters = new Character[numOfCharacters];
//        characters[0] = new Character("Jack", 10, 10, 10, 11, 15, 8);
    }

    public Player(String name, String userName, String password, double phone) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        numOfCharacters = 0;
    }
    
    public void loadCharacters() {
        try {
            FileInputStream inFile = new FileInputStream("save.ser");
            ObjectInputStream in = new ObjectInputStream(inFile);
            numOfCharacters = (int)in.readObject();
            characters = new Character[numOfCharacters];
            for(int i = 0; i < numOfCharacters; i++) {
                characters[i] = (Character)in.readObject();
            }
            
            in.close();
            inFile.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("No save data.");
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, "IO", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, "Class", ex);
        }
    }
    
    public void saveCharacters() {
        try {
            FileOutputStream outFile = new FileOutputStream("save.ser");
            ObjectOutputStream out = new ObjectOutputStream(outFile);
            out.writeObject(numOfCharacters);
            for(int i = 0; i  < numOfCharacters; i++) {
                out.writeObject(characters[i]);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Character getCharacter(int index) throws Exception {
        if(index >= numOfCharacters || index < 0) throw new Exception("Bad Index");
        return characters[index];
    }
    
    
    public void addCharacter(Character c) {
        Character temp[] = characters.clone();
        characters = new Character[++numOfCharacters];
        for(int i = 0; i < temp.length; i++) {
            characters[i] = temp[i];
        }
        characters[numOfCharacters - 1] = c;
    }

    public void removeCharacter(int index) throws Exception {
        if(numOfCharacters <= 0) {
            System.out.println("No characters saved");
            return;
        }
        if(index >= numOfCharacters || index < 0) throw new Exception("Bad Index");
        while (index + 1 < numOfCharacters) {
            characters[index] = characters[index + 1];
            index++;
        }
        characters[numOfCharacters - 1] = null;
        numOfCharacters--;
                
    }
    
    public int getNumOfCharacters() {
        return numOfCharacters;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        String out = name + "\n";
        out += numOfCharacters + " character(s):";
        for(int i = 0; i < numOfCharacters; i++) {
            out += "\n";
            out += characters[i];
        }
        return out;
    }
}