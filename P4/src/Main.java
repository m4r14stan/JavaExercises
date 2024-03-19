import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int day = 0; day < days.length; day++) {
            System.out.println(days[day]);
        }

        for (String day : days) {
            System.out.println(day);
        }

        for (int day = 0; day < days.length; day++) {
            if (day % 2 == 0) {
                System.out.println(days[day]);
            } else {
                System.out.println(days[day].toUpperCase());
            }
        }

        for (int day = 0; day < days.length; day++) {
            String output = day % 2 == 0 ? days[day] : days[day].toUpperCase();
            System.out.println(output);
        }

        System.out.println(" ");

        for (String day : days) {
            String meal = switch (day) {
                case "Sunday" -> "pot roast";
                case "Monday" -> "spaghetti";
                case "Tuesday" -> "tacos";
                case "Wednesday" -> "chicken";
                case "Thursday" -> "meatloaf";
                case "Friday" -> "hamburgers";
                default -> "pizza";
            };
            System.out.printf("We eat %s on %s%n", meal, day);
        }
        
        System.out.println(" ");

        int totalChars = 0;
        for (String day : days) {
            totalChars+=day.length();
        }
        System.out.println(totalChars);
    }

    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static String capitalizeMultiWord(String meal) {
        String[] words = meal.split(" ");
        StringBuilder sb = new StringBuilder(meal.length() + 1);
        for (String word : words) {
            sb.append(capitalize(word)).append(" ");
        }
        return sb.toString().strip();
    }


}