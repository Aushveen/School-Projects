import java.io.*;
import java.util.*;

class Profile {
    public static void main(String[] args) throws Exception {

        Hashtable<String, Integer> m = new Hashtable<String, Integer>();

        Scanner a = new Scanner(new File("/Users/aushv/OneDrive/Desktop/People.txt"));
        //
        while (a.hasNext()) {
            String name = a.next();
            // System.out.println(name);
            if (m.get(name) != null) {
                m.put(name, m.get(name) + 1);
            } else {
                m.put(name, 1);
            }
        }
        ArrayList<Candidate> p = new ArrayList<Candidate>();
        for (Enumeration<String> keys = m.keys(); keys.hasMoreElements(); ) {
            String key = keys.nextElement();
            p.add(new Candidate(key, m.get(key)));
        }
        System.out.println( p );
        Collections.sort( p );
        System.out.println( p );
    }
}

    class Candidate implements Comparable<Candidate> {
        String c;
        int count;
        Candidate(String c, int count) {
            this.c = c;
            this.count = count;
        }
    public int compareTo(Candidate another) {
        if (this.count > another.count) return -1;
        else if (this.count < another.count) return 1;
        else return (c + "").compareTo(another.c + "");
    }
    public String toString() {
        return c + "=" + count;
    }
}