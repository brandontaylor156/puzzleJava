import java.util.Arrays;
import java.util.ArrayList;

public class TestPuzzleJava{

    public static void main(String[] args){

        PuzzleJava puzzles = new PuzzleJava();
        
        int[] puzzle1 = puzzles.getTenRolls();
        System.out.println(Arrays.toString(puzzle1));

        char puzzle2 = puzzles.getRandomLetter();
        System.out.println(puzzle2);

        String puzzle3 = puzzles.generatePassword();
        System.out.println(puzzle3);

        String[] puzzle4 = puzzles.getNewPasswordSet(8);
        System.out.println(Arrays.toString(puzzle4));

        ArrayList<Object> newArr = new ArrayList<Object>();
        newArr.add("Hi");
        newArr.add("Hello");
        newArr.add(55);
        newArr.add(false);
        newArr.add(4.5);

        ArrayList<Object> puzzle5 = puzzles.shuffleArray(newArr);
        System.out.println(puzzle5);
    }
}