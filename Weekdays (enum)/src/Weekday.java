public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static boolean isWeekDay(Weekday weekday)
    {
        if ( (weekday.equals(SATURDAY) || (weekday.equals(SUNDAY))))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean isHoliday(Weekday weekday)
    {
        if ( !isWeekDay(weekday))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
