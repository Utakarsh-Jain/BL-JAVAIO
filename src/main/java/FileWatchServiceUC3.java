import java.io.IOException;
import java.nio.file.*;

public class FileWatchServiceUC3 {
    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("MyDirectory");

        if (!Files.exists(directory)) {
            Files.createDirectories(directory);
        }

        // Count existing entries
        try (var paths = Files.walk(directory)) {
            long count = paths.count() - 1;
            System.out.println("Number of Entries: " + count);
        }

        // Create WatchService
        WatchService watchService =
                FileSystems.getDefault().newWatchService();

        directory.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY
        );

        System.out.println("Watching directory: " + directory);
        System.out.println("Press Ctrl+C to stop.");

        while (true) {
            WatchKey key;

            try {
                key = watchService.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println(
                        "Event: " + event.kind()
                                + " | File: " + event.context()
                );
            }

            if (!key.reset()) {
                break;
            }
        }

        watchService.close();
    }
}
