package cc.before30.codeex.enummeration;

public enum Day {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private int value;
    private Day(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        switch (this) {
            case FRIDAY:
                return "Friday: " + value;
            case MONDAY:
                return "Monday: " + value;
            case TUESDAY:
                return "Tuesday: " + value;
            case SATURDAY:
                return "Saturday: " + value;
            case SUNDAY:
                return "Sunday: " + value;
            case THURSDAY:
                return "Thursday: " + value;
            case WEDNESDAY:
                return "Wednesday: " + value;
            default:
                return null;
        }
    }
}
