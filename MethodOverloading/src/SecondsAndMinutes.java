public class SecondsAndMinutes {

    public static void main(String[] args) {

        System.out.println("Time:" + getDurationString(65, 145));
        System.out.println("Time:" + getDurationString(420));
        System.out.println("Time:" + getDurationString(62400));

    }

    public static String getDurationString(int seconds) {

        if(seconds < 0)
            return "Waste of Time";
        else
            return seconds / (60 * 60) + "h " + (seconds / 60) % 60  + "m " + seconds % 60 + "s";

    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || (seconds < 0 || seconds > 59))
            return getDurationString(-1);
        else
            return getDurationString(minutes * 60 + seconds);
    }
}
