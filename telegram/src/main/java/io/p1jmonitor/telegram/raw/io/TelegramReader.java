package io.p1jmonitor.telegram.raw.io;

import java.io.Closeable;
import java.io.IOException;
import java.util.Optional;

public interface TelegramReader extends Closeable {
    Optional<ReadTelegram> readTelegram() throws IOException;
}
