import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.io.InputStream;

import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.Configuration;

public class Config
{
    public static void main( String s[] )
    {
        Configuration conf = new Configuration();
        conf.addResource(new Path("/home/hadoop/hadoop_tests/Configuration/conf.xml"));

        System.out.println(conf.getInt("size",0));
        System.out.println(conf.get("weight"));
        System.out.println(conf);
    }
}
