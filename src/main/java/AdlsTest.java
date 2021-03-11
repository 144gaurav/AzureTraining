import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class AdlsTest {
    public static void main(String[] args) throws IOException {
        Configuration config = new Configuration();
        FileSystem fs = FileSystem.get(config);
      Path path = new Path("/new/temp.txt");
      InputStream inputStream = fs.open(path);
        String result = IOUtils.toString(inputStream, Charsets.UTF_8);
        System.out.println(fs.getContentSummary(path).getLength());
        System.out.println(result);
    }


}
