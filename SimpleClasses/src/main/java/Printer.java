public class Printer {

    private int noPages;

    public Printer(int noPages){
        this.noPages = noPages;
    }

    public int getNoPages(){
        return noPages;
    }

    public void print( int pages, int copies){
        int pagesRequired = pages * copies;
        if (noPages >= pagesRequired){
            noPages -= pagesRequired;
        }
    }


}
