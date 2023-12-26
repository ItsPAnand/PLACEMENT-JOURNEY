package SkillRack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calender {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateInput = "20-12-2023"; // Input date in the format dd-MM-yyyy

        try {
            Date date = dateFormat.parse(dateInput);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int month = calendar.get(Calendar.MONTH) + 1; // Calendar months are zero-based
            String monthName = new SimpleDateFormat("MMMM").format(date);

            System.out.println(monthName);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
