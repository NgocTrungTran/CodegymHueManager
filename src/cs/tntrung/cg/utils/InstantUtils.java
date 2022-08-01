package cs.tntrung.cg.utils;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstantUtils {
    private static final String DAYTIME_FORMAT = "HH:mm dd-MM-yyyy";
    public static String instantToStringDayTime(Instant instant) {
        return instantToStringDayTime ( instant, null );
    }
    public static String instantToStringDayTime(Instant instant, String patternFormat) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(patternFormat != null ? patternFormat : DAYTIME_FORMAT).withZone( ZoneId.systemDefault());
        return formatter.format(instant);
    }
}
