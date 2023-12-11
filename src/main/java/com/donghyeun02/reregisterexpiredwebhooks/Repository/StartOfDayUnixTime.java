package com.donghyeun02.reregisterexpiredwebhooks.Repository;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class StartOfDayUnixTime {
    public static String startOfDay() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startOfDay = now.withHour(0).withMinute(0).withSecond(0).withNano(0);

        ZoneId zoneId = ZoneId.systemDefault();
        long startOfDayUnix = startOfDay.atZone(zoneId).toInstant().toEpochMilli();

        return Long.toString(startOfDayUnix);
    }
}
