package kata3;

public class Main {

    public static void main(String[] args) {
         
        /**Histogram<String> histogram = new Histogram<>();

        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");**/
        
        Histogram<Integer> histogram = new Histogram<>();
        
        histogram.increment(12);
        histogram.increment(9);
        histogram.increment(9);
        histogram.increment(9);
        histogram.increment(29);
        histogram.increment(8);
        histogram.increment(8);
        histogram.increment(4);
        histogram.increment(14);
        histogram.increment(14);
        histogram.increment(23);
        histogram.increment(23);
        histogram.increment(32);
        histogram.increment(24);
        
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        //new HistogramDisplay(histogram).execute();
        histogramdisplay.execute();
        
    }
    
}
