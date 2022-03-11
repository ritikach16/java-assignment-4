import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KycRange {
    LocalDate signUpDate, currentDate;
    String rangeStartDate, rangeEndDate;
    LocalDate startDate, endDate;
    public void returnKycRange(String signupDate, String currDate) throws ParseException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            signUpDate = LocalDate.parse(signupDate, formatter);
            currentDate = LocalDate.parse(currDate, formatter);
            int year = currentDate.getYear();
            int month = signUpDate.getMonthValue();
            int day = signUpDate.getDayOfMonth();
            if (signUpDate.isAfter(currentDate)) {
                System.out.println("No Range!");
            } else {
                LocalDate ld = LocalDate.of(year, month, day);
                startDate = ld.minusDays(30);
                endDate = ld.plusDays(60);
                if (endDate.isAfter(currentDate)) {
                    endDate = currentDate;
                }

                rangeStartDate = formatter.format(startDate);
                rangeEndDate = formatter.format(endDate);
                System.out.println(rangeStartDate + " " + rangeEndDate);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}