package tw.lifehackers.u2flib;

import org.hid4java.HidDevice;

public class U2FToken {

    private final HidDevice hidDevice;

    public U2FToken(HidDevice hidDevice) {
        this.hidDevice = hidDevice;
    }

    @Override
    public String toString() {
        return String.format("manufacturer = \"%s\", product = \"%s\", vid = 0x%04X, pid = 0x%04X",
                hidDevice.getManufacturer(),
                hidDevice.getProduct(),
                hidDevice.getVendorId(),
                hidDevice.getProductId());
    }
}
