/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Lucene.Indexer;
import Lucene.LuceneConstants;
import Lucene.MainLucene;
import Lucene.Searcher;
import Utils.HTMLFileFilter;
import Utils.UtilHTML;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

/**
 *
 * @author marcos
 */
public class TelaNegocio extends TelaPrincipal {
    
    final UtilHTML utilHTML = new UtilHTML();
    final MainLucene mainLucene;

    public TelaNegocio() throws IOException {
        this.mainLucene = new MainLucene();
    }
    
    /**
     * Reads URL field and indexes website.
     */
    
    @Override
    void index() {
        boolean e = false;
        try {
            utilHTML.saveToDisk(getCampoURL().getText());
            Indexer indexer = new Indexer(mainLucene.getIndexDir());
            indexer.createIndex(mainLucene.getDataDir(), new HTMLFileFilter());
            getCampoURL().setText("");
            indexer.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            e = true;
        } finally {
            if (!e)
            JOptionPane.showMessageDialog(null, "HTML Indexed Succesfully.\n");
        }
    }
    
   
    @Override
     void search() {
        try {
            Searcher searcher = new Searcher(mainLucene.getIndexDir());
            long startTime = System.currentTimeMillis();
            TopDocs hits = searcher.search(getCampoPesquisa().getText());
            long endTime = System.currentTimeMillis();
            
            getLabelCount().setText("HTML files found: "+ hits.totalHits);

            DefaultTableModel dtm = (DefaultTableModel) getTabela().getModel();
            deleteAllRows(dtm);

             
            for (ScoreDoc scoreDoc : hits.scoreDocs) {
                Vector<Object> data = new Vector<>();
                Document doc = searcher.getDocument(scoreDoc);
                data.add(doc.get(LuceneConstants.FILE_NAME));
                data.add(doc.get(LuceneConstants.FILE_PATH));
                dtm.addRow(data);
            }
            
            getTabela().setModel(dtm);
            System.out.println(hits.totalHits +
               " documents found. Time :" + (endTime - startTime));
            for(ScoreDoc scoreDoc : hits.scoreDocs) {
               Document doc = searcher.getDocument(scoreDoc);
                  System.out.println("File: "
                  + doc.get(LuceneConstants.FILE_PATH));
            }
            searcher.close();

            } catch (IOException | ParseException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    void deleteIndex() {
        String tmp = (String) getTabela().getModel().getValueAt(getTabela().getSelectedRow(),
                1);
        String cat = "rm " + tmp;
        Process p = null;
        try {
            p = Runtime.getRuntime().exec(cat);
        } catch (IOException ex) {
            Logger.getLogger(TelaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            p.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }

       

            
            Indexer indexer = null;
        try {
            indexer = new Indexer(mainLucene.getIndexDir());
        } catch (IOException ex) {
            Logger.getLogger(TelaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            indexer.createIndex(mainLucene.getDataDir(), new HTMLFileFilter());
        } catch (IOException ex) {
            Logger.getLogger(TelaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            indexer.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private static void deleteAllRows(final DefaultTableModel model) {
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
    }
    
}
