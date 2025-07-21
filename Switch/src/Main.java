public class Main {

    public static void main(String[] args) {

        System.out.println(getQuarter("Jan"));
        System.out.println(getNatoUsage('A'));
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "First";
            case "APRIL", "MAY", "JUNE" -> "Second";
            case "JULY", "AUGUST", "SEPTEMBER" -> "Third";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "Fourth";
            default -> "Bad Month";
        };
    }

    public static String getNatoUsage(char letter) {

        String natoWord;
        switch (letter) {
            case 'A' -> natoWord = "able";
            case 'B' -> natoWord = "baker";
            case 'C' -> natoWord = "charlie";
            case 'D' -> natoWord = "dog";
            case 'E' -> natoWord = "easy";
            default -> natoWord = "Not Found";
        }

        return "Nato Word was " + natoWord;
    }
}
