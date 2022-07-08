public class DollarsTest {
    public void getDollarsTest() {
        String scenario = "Currency dollar test";
        try {
            Currency currency = new Dollars();
            String actual = currency.getCurrency(78);
            Assertion.assertEquals("долларов", actual);
            System.out.printf("\"%s\" passed. %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
