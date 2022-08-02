import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{

    Random randMachine = new Random();
    
    public int[] getTenRolls(){
        int[] rolls = new int[10];
        for (int i = 0; i < rolls.length; i++)
            rolls[i] = randMachine.nextInt(20) + 1;
        return rolls;
    }

    public char getRandomLetter(){
        char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        return letters[randMachine.nextInt(26)];
    }

    public String generatePassword(){
        char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        String newPassword = "";
        for (int i = 0; i < 8; i++){
            char passwordChar = ' ';
            int charType = randMachine.nextInt(3);
            switch(charType){
                case 0:
                    passwordChar = Character.toUpperCase(letters[randMachine.nextInt(26)]);
                    break;
                case 1:
                    passwordChar = letters[randMachine.nextInt(26)];
                    break;
                case 2:
                    passwordChar = numbers[randMachine.nextInt(10)];
                    break;
            }
            newPassword += Character.toString(passwordChar);
        }
        return newPassword;
    }

    public String[] getNewPasswordSet(int numPasswords){
        String[] passwords = new String[numPasswords];
        for (int i = 0; i < numPasswords; i++){
            passwords[i] = generatePassword();
        }
        return passwords;
    }

    public ArrayList<Object> shuffleArray(ArrayList<Object> values){
        for (int i = values.size()-1; i >0; i--){
            int j = randMachine.nextInt(i+1);

            Object temp = values.get(i);
            values.set(i, values.get(j));
            values.set(j, temp);
        }
        return values;
    }

}

