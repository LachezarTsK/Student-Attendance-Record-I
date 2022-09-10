
public class Solution {

    private static final char ABSENT = 'A';
    private static final char LATE = 'L';
    private static final char PRESENT = 'P';

    public boolean checkRecord(String attendanceRecord) {
        int countAbsent = 0;
        int countLate = 0;

        for (int i = 0; i < attendanceRecord.length(); ++i) {
            countAbsent += (attendanceRecord.charAt(i) == ABSENT) ? 1 : 0;
            countLate = (attendanceRecord.charAt(i) == LATE) ? (countLate + 1) : 0;

            if (countAbsent > 1 || countLate > 2) {
                return false;
            }
        }
        return true;
    }
}
