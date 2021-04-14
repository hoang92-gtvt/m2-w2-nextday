package NextDay;

public class NextDay {

    public static final int FRIST_DAYOF_MONTH = 1;
    public static final int lastMonthOfYear = 12;
    public static final int firstMonthofYear = 1;
    public static int lastDayofMonth;
    public  String getNextDay(int inputDay, int inputMonth, int inputYear){
        String mathChar = "-";
        int outputDay;
        int outputMonth=inputMonth;
        int outputYear=inputYear;

        lastDayofMonth = getLastDayofMonth(inputMonth,inputYear);

        if(inputDay== lastDayofMonth){

            int fristDayofMonth = FRIST_DAYOF_MONTH;
            outputDay= fristDayofMonth;
            if(inputMonth>= lastMonthOfYear){
                outputMonth= firstMonthofYear;
                outputYear = ++inputYear;
            }else{
                outputMonth=++inputMonth;
                outputYear= inputYear;
            }
        }else outputDay= ++inputDay;

        String result= outputDay + mathChar + outputMonth + mathChar + outputYear;
        return result;
    }

    private int getLastDayofMonth(int _inputMonth, int _inputYear) {
        switch(_inputMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                 lastDayofMonth = 31;
                 break;

            case 4:
            case 6:
            case 9:
            case 11:
                lastDayofMonth = 30;
                break;
            case 2:
                if(isLeapYear(_inputYear)){
                    lastDayofMonth = 29;
                } else {
                    lastDayofMonth = 28;
                }
                break;

        }

        return lastDayofMonth;
    }
    private boolean isLeapYear(int inputYear){
        boolean isDisible4 = inputYear%4==0;
        boolean isDisible100 = inputYear%100==0;
        boolean isDisible400 = inputYear%400==0;
        if(isDisible4){
            if(isDisible100){
                if(isDisible400){
                    return true;
                }
                return false;
            }else{
                return true;
            }


        }else return false;

    }
}
