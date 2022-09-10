
#include <string>
using namespace std;

class Solution {
    
    static const char ABSENT = 'A';
    static const char LATE = 'L';
    static const char PRESENT = 'P';

public:
    bool checkRecord(string attendanceRecord) {
        int countAbsent = 0;
        int countLate = 0;

        for (const auto& record : attendanceRecord) {
            countAbsent += (record == ABSENT) ? 1 : 0;
            countLate = (record == LATE) ? (countLate + 1) : 0;
            
            if (countAbsent > 1 || countLate > 2) {
                return false;
            }
        }
        return true;
    }
};
