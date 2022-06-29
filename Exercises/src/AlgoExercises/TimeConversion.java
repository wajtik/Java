package AlgoExercises;

public class TimeConversion {

    public static String timeConversion(String s) {
        String[] arr = s.split(":");
        String h = arr[0];
        String m = arr[1];
        String sec = arr[2].substring(0, 2);
        String militaryTime = "";

        if (s.contains("PM")) {
            if (h == "12") {
                h = "12";
                militaryTime += h + ":" + m + ":" + sec;
            } else {
                int hour = Integer.parseInt(h);
                militaryTime += hour + ":" + m + ":" + sec;
            }
        } else {
            if (h == "12") {
                h = "00";
                militaryTime += h + ":" + m + ":" + sec;
            } else {
                militaryTime += h + ":" + m + ":" + sec;
            }
        }

        return militaryTime;

    }
}