import Collection.CollectionTest;

import java.lang.reflect.Field;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        //Instant instant = stringToDateTime(LocalDate.now(), "08:59:00 AM");
        //System.out.println(instant);
        //System.out.println(isTimeValid("000023.59.567"));
        CollectionTest collectionTest = new CollectionTest();
        collectionTest.setB(true);
        Field[] fields = CollectionTest.class.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            try {
                field.setAccessible(true);
                boolean value = field.getBoolean(collectionTest);
                System.out.println("Variable: " + field.getName() + ", Value: " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        });

        Field field = collectionTest.getClass().getDeclaredField("b");
        field.setAccessible(true);
        System.out.println(field.get(collectionTest));



    }
    public static boolean isTimeValid(String time){
        int indexOfDecimal = time.indexOf(".");
        System.out.println(indexOfDecimal);
        int hour = Integer.parseInt(time.substring(0,indexOfDecimal));
        int minute = Integer.parseInt(time.substring(indexOfDecimal+1));

        return hour <= 23 && minute <= 59;
    }
    public static boolean isPalindrome(int num){
        int length = String.valueOf(num).length();
        for (int i = 0; i < length/2; i++) {
            System.out.print(num/(int)Math.pow(10,i)%10);
            System.out.println(num/(int)Math.pow(10,length-i-1)%10);
             if (num/(int)Math.pow(10,i)%10 != num/(int)Math.pow(10,length-i-1)%10){
                 return false;
             }
        }
        return true;
    }

    public static Instant stringToDateTime(LocalDate date, String time) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime localTime = LocalTime.parse(time.trim(), formatter);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, localTime, ZoneId.systemDefault());
        return zonedDateTime.toInstant();
    }
}
