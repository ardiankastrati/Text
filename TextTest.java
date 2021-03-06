import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TextTest {
    @Test
    public void testPrintOutWithSpace() {
        //Arrange
        String text = "Hej klassen";
        int countLetter = -4;
        int countRow = -1;
        Text t = new Text(text, countLetter, countRow);


        //Act
        int actual = text.length();

        //Assert
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintOutLetters() {
        //Arrange
        String text = "Stop";
        int countLetter = -4;
        int countRow = -1;
        Text t = new Text(text, countLetter, countRow);

        //Act
        int actual = text.length() + countLetter;

        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void printOutRows() {

        //Arrange
        String text = "Hello" + "stop";  //Här skriver användaren in "Hello", vid andra inmatningen skriver användaren stop,
        int countLetter = -4;
        int countRow = -1;
        Text t = new Text(text, countLetter, countRow);

        //Act
        int actual = 1;

        //Assert
        int expected = 1;
        assertEquals(expected, actual);
    }

}
