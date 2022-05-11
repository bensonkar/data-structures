package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Toptal {

    public static int solution(int[] A, String[] D) {
        // write your code in Java SE 11
        int total = 0, fee = 5;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                int month = getMonth(D[i]);
                set.add(month);
//                int year = getYear(D[i]);
//                if (D[i] == D[i + 1]) {
//                }
                if (total < 100) {
                    total += A[i];
                    fee += 5;
                } else {
                    total += A[i];
                    fee = (5*(12 - set.size() +1));
                }
            } else {
                total += A[i];
            }
        }
        return total - fee;
    }


    private static int getMonth(String date)  {
        Date d = null;
        try {
            d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int month = cal.get(Calendar.MONTH);
        return month + 1;
    }
    private static int getYear(String date) throws ParseException {
        Date d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int month = cal.get(Calendar.YEAR);
        return month + 1;
    }

    public static void main(String[] args) throws ParseException {
        int[] amount = {100, 100, 100, -10};
        String[] date = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        System.out.println(solution(amount, date));
    }

}
