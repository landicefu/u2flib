package tw.lifehackers.u2flib;

public class U2FHID {

    public static int HID_FIDO_USAGE_PAGE = 0xFFFFF1D0;
    public static int HID_U2F_USAGE = 1;

    public static final long BROADCAST_CHANNEL = 0xFFFFFFFF;

    public static class Cmd {

        public static final long PING  = 0x80 | 0x01;
        public static final long MSG   = 0x80 | 0x03;
        public static final long LOCK  = 0x80 | 0x04;
        public static final long INIT  = 0x80 | 0x06;
        public static final long WINK  = 0x80 | 0x08;
        public static final long SYNC  = 0x80 | 0x3c;
        public static final long ERROR = 0x80 | 0x3f;

    }

    public static class Capability {
        public static final long WINK = 1;
    }

    public static int MIN_MESSAGE_LEN = 7;
    public static int MAX_MESSAGE_LEN = 7609;
    public static int MIN_INIT_RESPONSE_LEN = 17;

    public static long RESPONSE_TIMEOUT = 3000; // milliseconds

    /**
     * Use error code as index to map to a error reason
     */
    public static String ERROR_MAP[] = new String[] {
            "invalid command",              // 1
            "invalid parameter",            // 2
            "invalid message length",       // 3
            "invalid message sequencing",   // 4
            "message timed out",            // 5
            "channel busy",                 // 6
            "command requires channel lock",// 7
            "sync command failed",          // 8
    };

}
