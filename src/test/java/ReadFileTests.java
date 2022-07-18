import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;


public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException {
        //write here second task
        //не читался файл по относительному пути

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource("ReadFileTests.txt")).getFile());

        try (BufferedReader br = Files.newBufferedReader(Path.of(file.getAbsolutePath())))
        {
            for (int i = 0; i<1; i++) {
                br.readLine();
            }

            String exp = br.readLine();
            assertEquals("аллоха", exp);
        }
    }
}
