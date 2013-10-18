package kata_3;

public class Kata_3 {
    
    public static void main(String[] args) {
        String filename = args[0];
        HistogramBuilder<String> builder = new HistogramBuilder();
        builder.calculate(MailReader.readDomains(filename));
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}
