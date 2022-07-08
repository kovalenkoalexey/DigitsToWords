public class Rubles implements Currency{
    public String getCurrency(int number) {
        String s = "рублей";
        if (number % 100 != 11 && number % 10 == 1)
            s = "рубль";
        else if ((number % 100 != 12 && number % 10 == 2) ||
                (number % 100 != 13 && number % 10 == 3) ||
                (number % 100 != 14 && number % 10 == 4)) {
            s = "рубля";
        }
        return s;
    }
}