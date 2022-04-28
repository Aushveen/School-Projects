import java.util.*;
import java.util.stream.IntStream;

public class PrimeGenerator {
        private ArrayList<Boolean> primes = new ArrayList<Boolean>();
        private int lastPrime = 1;

        public PrimeGenerator() {
            // init
            this.sieve(0, 1000);
        }

        private void sieve(int lowerBound, int upperBound) {
            // start by assuming everything between the lower and upper bound
            // is prime
            for (int i = lowerBound; i <= upperBound; i++) {
                primes.add(i, true);
            }

            // then generate the actual primes
            for (int factor = 2; factor * factor <= upperBound; factor++) {
                // we start at 2, which is prime. if we are prime,
                if (primes.get(factor)) {
                    // mark the multiples as non-prime
                    for (int j = factor; factor * j <= upperBound; j++) {
                        primes.set(factor * j, false);
                    }
                }
            }
        }

        private void reSieve() {
            sieve(primes.size(), primes.size() + 1000);
        }

        public boolean isPrime(int n) {
            if (n >= primes.size() - 1) {
                reSieve();
            }
            return primes.get(n);
        }

        public int nextPrime() {
            int i = lastPrime + 1;
            while (true) {
                if (isPrime(i)) {
                    lastPrime = i;
                    return i;
                }
                i++;
            }
        }

        public IntStream stream() {
            return IntStream.iterate(0, i -> i + 1).filter(this::isPrime);
        }
    }

