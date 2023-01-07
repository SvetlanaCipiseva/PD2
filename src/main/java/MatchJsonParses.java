import org.json.JSONObject;

import java.io.*;
import java.util.Scanner;

public class MatchJsonParses {
    public static MatchObjectCollection parseFile(File file) throws NumberFormatException, FileNotFoundException, UnsupportedEncodingException {
        MatchObjectCollection result = new MatchObjectCollection();

        InputStream is = new FileInputStream(file);
        var isreader = new InputStreamReader(is, "UTF-8");
        Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        String jsonString = s.hasNext() ? s.next() : "";
        JSONObject json = new JSONObject(jsonString);
        var matchJsonObject = json.getJSONObject("Spele");
        //assert jsonFile.getJSONObject("Spele") != null

        return result;
    }

}
