package net.phreebie;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connector {

    public String checkWord(String word, boolean isRepeat) {
        StringBuilder sb = new StringBuilder();
        sb.append("http://www.sanskrit-lexicon.uni-koeln.de/scans/WILScan/2014/web/webtc/getword.php?key=");
        sb.append(word);
        sb.append("&filter=slp1&noLit=off&transLit=slp1");
        String targetURL = sb.toString();
        String urlParameters = "";

        HttpURLConnection connection = null;
        try {
            //Create connection
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/xhr");

            connection.setRequestProperty("Content-Length",
                    Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches(false);
            connection.setDoOutput(true);

            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
            rd.close();
            return sb.toString();
        } catch (Exception e) {
           // e.printStackTrace();
            if(isRepeat){
                return checkWord(word, false);
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return null;
    }
}