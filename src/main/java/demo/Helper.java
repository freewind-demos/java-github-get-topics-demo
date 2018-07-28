package demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Helper {

    public static String readGithubToken() throws IOException {
        return FileUtils.readFileToString(new File("github-token.txt"), Charset.defaultCharset());
    }

}
