import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class DateRange {
    public static void main(String[] args) throws ParseException {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String[] arr = new String[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextLine();
        }
        returnDateRange(arr);
    }

    static void returnDateRange(String[] arr) throws ParseException {
        for(String str : arr) {
            if (str.length() != 0) {
                int i = 0;
                String[] dateArr = new String[2];
                for (String d : str.split(" ")) {
                    dateArr[i] = d;
                    i++;
                }

                KycRange actualRange = new KycRange();
                if (dateArr[0].length() != 0 && dateArr[1] != null) actualRange.returnKycRange(dateArr[0], dateArr[1]);
            }
        }
    }
}

