package br.com.recepcaoExterna.util;

public class CreateAttendanceRecord {
    private static int attendanceRecord = 1;

    public CreateAttendanceRecord() {
    }

    public static int buildAttendanceRecord(){
        int lastValue;
        lastValue = attendanceRecord++;
        return lastValue;
    }
}
