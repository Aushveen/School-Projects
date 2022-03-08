public class FactorPrinter {
    public static void main(String[] args) {
        FactorGenerator f = new FactorGenerator( 150 );
        while (f.hasMoreFactors()) {
            System.out.println( f.nextFactor() );
        }
    }
}