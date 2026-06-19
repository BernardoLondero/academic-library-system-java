package Principal;

import java.util.ArrayList;

public class Article extends Publication {
    private Journal journal;
    private long issn;
    private byte issue;
    private short startPage;
    private short endPage;
    private ArrayList <String> keyWords;

    public Article(Journal journal, long issn, byte issue, short startPage, short endPage, ArrayList<String> keyWords, String title, short year, byte volume, ArrayList<Author> authors) {
        super(title, year, volume, authors);
        this.journal = journal;
        this.issn = issn;
        this.issue = issue;
        this.startPage = startPage;
        this.endPage = endPage;
        this.keyWords = keyWords;
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public byte getIssue() {
        return issue;
    }

    public void setIssue(byte issue) {
        this.issue = issue;
    }

    public short getStartPage() {
        return startPage;
    }

    public void setStartPage(short startPage) {
        this.startPage = startPage;
    }
    
    public short getEndPage() {
        return endPage;
    }

    public void setEndPage(short endPage) {
        this.endPage = endPage;
    }

    public ArrayList <String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(ArrayList <String> keyWords) {
        this.keyWords = keyWords;
    }
}
