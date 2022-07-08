public class Assembling {
    public String assemble(int number) {
        String s = "";
        int millions = number / 1000000;
        int thousands = (number / 1000) % 1000;
        int belowThousands = number % 1000;
        Currency currency = new Rubles();
        DigitsToWords digitsToWords = new DigitsToWords();

        if ((millions == 0) && (thousands == 0) && (belowThousands == 0)) {
            s = "ноль ";
        } else {
            if (millions != 0) {
                s += digitsToWords.getHundreds(millions);
                s += digitsToWords.getTens(millions);
                s += digitsToWords.getBelowTwenty(millions, false);
                s += digitsToWords.getWordMillions(millions);
            }
            if (thousands != 0) {
                s += digitsToWords.getHundreds(thousands);
                s += digitsToWords.getTens(thousands);
                s += digitsToWords.getBelowTwenty(thousands, true);
                s += digitsToWords.getWordThousands(thousands);
            }
            if (belowThousands != 0) {
                s += digitsToWords.getHundreds(belowThousands);
                s += digitsToWords.getTens(belowThousands);
                s += digitsToWords.getBelowTwenty(belowThousands, false);
            }
        }
        s += currency.getCurrency(number);
        return s;
    }
}