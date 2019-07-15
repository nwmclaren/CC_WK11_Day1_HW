public class Printer {

    private int noPages;
    private int toner;

    public Printer(int noPages, int toner){
        this.noPages = noPages;
        this.toner = toner;
    }

    public int getNoPages(){
        return noPages;
    }

    public int getToner(){
        return toner;
    }

    public void print( int pages, int copies){
        int pagesRequired = pages * copies;
        if (noPages >= pagesRequired){
            noPages -= pagesRequired;
            toner -= pagesRequired;
        }
    }


}
