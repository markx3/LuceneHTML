package Utils;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcos
 */
public class UtilHTML {

    public UtilHTML() {
    }
    
    
    
    public Document getHtml(String url) throws IOException {
        final Response response = Jsoup.connect(url).execute();
        return response.parse();
        
    }
    
    public void htmlToFile(Document doc, String fileName) throws IOException {
        final File f = new File("db/"+fileName.substring(7)+".html");
        FileUtils.writeStringToFile(f, doc.outerHtml(), "UTF-8");
    }
    
    public void saveToDisk(String url) throws IOException {
        htmlToFile(getHtml(url), url);
    }
}
