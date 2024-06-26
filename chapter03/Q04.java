package HW.chapter01.chapter03;

public class Q04 {
    public static void main(String[] args) {
        int monthNumber = (int) (Math.random() * 10) + 2;

        String monthName = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Unexpected value: " + monthNumber);
        };

        System.out.println(monthName);
    }
}
