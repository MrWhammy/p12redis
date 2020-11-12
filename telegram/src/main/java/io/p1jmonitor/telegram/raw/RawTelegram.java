package io.p1jmonitor.telegram.raw;

import io.p1jmonitor.telegram.COSEMTelegram;

import java.util.zip.Checksum;

public class RawTelegram {
    private final COSEMTelegram telegram;
    private final Checksum calculatedChecksum;

    public RawTelegram(COSEMTelegram telegram, Checksum calculatedChecksum) {
        this.telegram = telegram;
        this.calculatedChecksum = calculatedChecksum;
    }

    public COSEMTelegram getTelegram() {
        return telegram;
    }

    public Checksum getCalculatedChecksum() {
        return calculatedChecksum;
    }

    public boolean isChecksumValid() {
        return telegram.getFooter().getChecksum() == calculatedChecksum.getValue();
    }

    @Override
    public String toString() {
        return telegram.toString();
    }
}
