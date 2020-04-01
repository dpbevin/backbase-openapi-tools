package com.backbase.oss.boat;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class AbstractBoatEngineTests {


    protected File getFile(String name) {
        URL resource = getClass().getResource(name);
        assert resource != null;
        return new File(resource.getFile());
    }

    protected void writeOutput(String yaml, String fileName) throws IOException {
        File directory = new File("target");
        directory.mkdirs();
        File file = new File(directory, fileName);
        file.delete();
        file.createNewFile();
        Path path = file.toPath();
        Files.write(path, yaml.getBytes());
    }
}
