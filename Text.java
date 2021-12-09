
import java.util.*;

public class Text {
    private String text;
    private int countRow;
    private int countLetter;

    public Text(String newText, int newCountLetter, int newCountRow) {
        text = newText;
        countLetter = newCountLetter;
        countRow = newCountRow;
    }




    public void printText() {


        while (!text.equals("stop") && !text.equals("Stop")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Skriv in sträng: ");
            text = scan.nextLine();

            countLetter = text.length() + countLetter;
            countRow = countRow + 1;

        }


        System.out.println("Du skrev stop, därför svslutas programmet!\nDu skrev " + countRow + " rad(er)" +
                " och totalt " + countLetter + " tecken.");
    }
}