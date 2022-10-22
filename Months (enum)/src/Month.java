public enum Month {
    JANUARY(10, 0),
    FEBRUARY(20, 1),
    MARCH(30, 2),
    APRIL(40, 3),
    MAY(50, 4),
    JUNE(60,5),
    JULY(70,6),
    AUGUST(80,7),
    SEPTEMBER(90,8),
    OCTOBER(100,9),
    NOVEMBER(110,10),
    DECEMBER(120,11);

    private int count = 0;
    private int averageTemperature = 0;

    //private static int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    Month(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    Month(int count, int averageTemperature) {
        //this.count = count;
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public static int getTemprature(Month month) {
        int locTemp = 0;
        locTemp = month.averageTemperature;
//        //locTemp = this.temperature
//        switch (month) {
//            case JANUARY:
//                locTemp = temp[0];
//                break;
//            case FEBRUARY:
//                locTemp = temp[1];
//                break;
//            case MARCH:
//                locTemp = temp[2];
//                break;
//            case APRIL:
//                locTemp = temp[3];
//                break;
//            case MAY:
//                locTemp = temp[4];
//                break;
//            case JUNE:
//                locTemp = temp[5];
//                break;
//            case JULY:
//                locTemp = temp[6];
//                break;
//            case AUGUST:
//                locTemp = temp[7];
//                break;
//            case SEPTEMBER:
//                locTemp = temp[8];
//                break;
//            case OCTOBER:
//                locTemp = temp[9];
//                break;
//            case NOVEMBER:
//                locTemp = temp[10];
//                break;
//            case DECEMBER:
//                locTemp = temp[11];
//                break;
//        }
        return locTemp;
    }
}

