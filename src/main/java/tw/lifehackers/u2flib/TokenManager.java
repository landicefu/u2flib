package tw.lifehackers.u2flib;

import org.hid4java.HidDevice;
import org.hid4java.HidManager;
import org.hid4java.HidServices;

import java.util.ArrayList;
import java.util.List;

public class TokenManager {

    public static List<Token> getTokens() {
        List<Token> tokenList = new ArrayList<>();
        HidServices hidServices = HidManager.getHidServices();
        for (HidDevice hidDevice : hidServices.getAttachedHidDevices()) {
            if (hidDevice.getUsagePage() == U2FHID.HID_FIDO_USAGE_PAGE &&
                    hidDevice.getUsage() == U2FHID.HID_U2F_USAGE) {
                tokenList.add(new Token(hidDevice));
            }
        }
        return tokenList;
    }
}
