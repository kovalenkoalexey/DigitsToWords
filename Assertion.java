public class Assertion {
    public static void assertEquals(String expected, String actual) {
        if (actual != expected)
            throw new AssertionError("Actual <" + actual + "> doesn't correspond expected <"+ expected + ">.");
    }
}