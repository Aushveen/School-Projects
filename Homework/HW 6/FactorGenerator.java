public class FactorGenerator {
    int number, currentCandidate;
    public FactorGenerator(int input) {
        number = input; // better style: refer to number as this.number
        currentCandidate = 2; // same comment
    }
    public boolean hasMoreFactors() {
        return number > 1; // better style: use this.number instead
    }
    public int nextFactor() {
        if (this.number % this.currentCandidate == 0) {
            this.number /= this.currentCandidate;
            return this.currentCandidate;
        } else {
            this.currentCandidate += 1;
            return this.nextFactor(); // simple generative recursion (almost structural, see C211)
        }
    }
}