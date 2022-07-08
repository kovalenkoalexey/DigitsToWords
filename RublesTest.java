public class RublesTest {
    public void getRublesTest() {
        String scenario = "Currency ruble test";
        try {
            Currency currency = new Rubles();
            String actual = currency.getCurrency(23);
            Assertion.assertEquals("рубля", actual);
            System.out.printf("\"%s\" passed. %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}