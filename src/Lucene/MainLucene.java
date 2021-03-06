/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lucene;

import Utils.HTMLFileFilter;
import java.io.File;
import java.io.IOException;


import org.apache.lucene.document.Document;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;


public final class MainLucene {
	
   private final String indexDir = "index/";
   private final String dataDir = "db/";
   private Indexer indexer;
   private Searcher searcher;

   public MainLucene() throws IOException {
       
       File directory = new File(String.valueOf(dataDir));
        if (! directory.exists()){
            directory.mkdir();
        }
       

        // Vai que o usuário resolve inserir manualmente...
       createIndex();
   }
   
   public void createIndex() throws IOException{
      indexer = new Indexer(indexDir);
      int numIndexed;
      long startTime = System.currentTimeMillis();	
      numIndexed = indexer.createIndex(dataDir, new HTMLFileFilter());
      long endTime = System.currentTimeMillis();
      indexer.close();
      System.out.println(numIndexed+" File indexed, time taken: "
         +(endTime-startTime)+" ms");		
   }

   public void search(String searchQuery) throws IOException, ParseException{
      searcher = new Searcher(indexDir);
      long startTime = System.currentTimeMillis();
      TopDocs hits = searcher.search(searchQuery);
      long endTime = System.currentTimeMillis();
   
      System.out.println(hits.totalHits +
         " documents found. Time :" + (endTime - startTime));
      for(ScoreDoc scoreDoc : hits.scoreDocs) {
         Document doc = searcher.getDocument(scoreDoc);
            System.out.println("File: "
            + doc.get(LuceneConstants.FILE_PATH));
      }
      searcher.close();
   }

    public String getIndexDir() {
        return indexDir;
    }

    public String getDataDir() {
        return dataDir;
    }

    public Indexer getIndexer() {
        return indexer;
    }

    public Searcher getSearcher() {
        return searcher;
    }
   
   
   
}
