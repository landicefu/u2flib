package tw.lifehackers.u2flib;

import org.hid4java.HidDevice;

public class Token {

    private final HidDevice hidDevice;

    public Token(HidDevice hidDevice) {
        this.hidDevice = hidDevice;
    }

    public String getInfo() {
        return String.format("manufacturer = \"%s\", product = \"%s\", vid = 0x%04X, pid = 0x%04X",
                hidDevice.getManufacturer(),
                hidDevice.getProduct(),
                hidDevice.getVendorId(),
                hidDevice.getProductId());
    }

}
