/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuceneHTML;

import Lucene.Indexer;
import Utils.HTMLFileFilter;
import Utils.UtilHTML;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.jsoup.nodes.Document;

/**
 *
 * @author marcos
 */
public class LuceneHTML {

    private static Indexer indexer;
    private static HTMLFileFilter htmlFileFiler;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException {
        
        UtilHTML utilHtml = new UtilHTML();
        Scanner scanner = new Scanner(System.in);
        utilHtml.saveToDisk(scanner.nextLine());

        
        
        
    }
    
}