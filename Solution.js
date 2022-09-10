
/**
 * @param {string} attendanceRecord
 * @return {boolean}
 */
var checkRecord = function (attendanceRecord) {
    const ABSENT = 'A';
    const LATE = 'L';
    const PRESENT = 'P';

    let countAbsent = 0;
    let countLate = 0;

    for (let record of attendanceRecord) {
        countAbsent += (record === ABSENT) ? 1 : 0;
        countLate = (record === LATE) ? (countLate + 1) : 0;

        if (countAbsent > 1 || countLate > 2) {
            return false;
        }
    }
    return true;
};
