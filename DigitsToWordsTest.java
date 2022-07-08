public class DigitsToWordsTest {
    public void getBelowTwentyTest() {
        String scenario = "Number below twenty test";
        try {
            DigitsToWords digitsToWords = new DigitsToWords();
            String actual = digitsToWords.getBelowTwenty(12, false);
            Assertion.assertEquals("двеннадцать ", actual);
            System.out.printf("\"%s\" passed. %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void getTensTest() {
        String scenario = "Numbers tens test";
        try {
            DigitsToWords digitsToWords = new DigitsToWords();
            String actual = digitsToWords.getTens(60);
            Assertion.assertEquals("шестьдесят ", actual);
            System.out.printf("\"%s\" passed. %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void getHundredsTest() {
        String scenario = "Numbers hundreds test";
        try {
            DigitsToWords digitsToWords = new DigitsToWords();
            String actual = digitsToWords.getHundreds(800);
            Assertion.assertEquals("восемьсот ", actual);
            System.out.printf("\"%s\" passed. %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void getWordMillionsTest() {
        String scenario = "Word millions test";
        try {
            DigitsToWords digitsToWords = new DigitsToWords();
            String actual = digitsToWords.getWordMillions(323);
            Assertion.assertEquals("миллиона ", actual);
            System.out.printf("\"%s\" passed. %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void getWordThousandsTest() {
        String scenario = "Word thousands test";
        try {
            DigitsToWords digitsToWords = new DigitsToWords();
            String actual = digitsToWords.getWordThousands(58);
            Assertion.assertEquals("тысяч ", actual);
            System.out.printf("\"%s\" passed. %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}