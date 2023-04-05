// enum type
package ex1_enum;

public class TestEnum {

    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        Days day = Days.SUNDAY;
        
        System.out.println(day.ordinal());
        System.out.println(day.toString());
        System.out.println(day.equals(day.FRIDAY));
        
    }
}