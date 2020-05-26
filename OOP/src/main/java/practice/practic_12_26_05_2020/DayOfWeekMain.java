package practice.practic_12_26_05_2020;

public class DayOfWeekMain {
    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.THURSDAY));
    }
    public static int getWorkingHours(final DayOfWeek currentDay) {
        int index = DayOfWeek.valueOf(DayOfWeek.class, currentDay.name()).ordinal();
        DayOfWeek[] hours = DayOfWeek.values();
        int result = 0;

        for(int i = index; i < hours.length; i++) {
            result += hours[i].currentDay;
            System.out.println(hours[i]);
        }

        return result;
    }
    public enum DayOfWeek {
        MONDAY(8),
        TUESDAY(8),
        WEDNESDAY(8),
        THURSDAY(8),
        FRIDAY(7),
        SATURDAY(0),
        SUNDAY(0);

        int currentDay;

        DayOfWeek(int hours){
            this.currentDay = hours;
        }
    }
}
