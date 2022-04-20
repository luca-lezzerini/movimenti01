package Esercitazione;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TempiCollezioni {

    public static void main(String[] args) {
        int limite = 100_000;
        List<Integer> la = new ArrayList<>();
        List<Integer> lac = new ArrayList<>(limite);
        List<Integer> ll = new LinkedList<>();
        Set<Integer> st = new TreeSet<>();
        Set<Integer> sh = new HashSet<>();
        
        Instant i1 = Instant.now();
        for (int i = 0; i < limite; i++) {
            la.add(i);
        }
        Instant f1 = Instant.now();
        Duration d1 = Duration.between(i1, f1);
        System.out.println("Arraylist caricamento ms " + d1.toMillis());
        Instant i1a = Instant.now();
        for (int i = 0; i < limite; i++) {
            lac.add(i);
        }
        Instant f1a = Instant.now();
        Duration d1a = Duration.between(i1a, f1a);
        System.out.println("Arraylist caricamento con capacity ms " + d1a.toMillis());
        Instant i1b = Instant.now();
        for (int i = 0; i < limite; i++) {
            st.add(i);
        }
        Instant f1b = Instant.now();
        Duration d1b = Duration.between(i1b, f1b);
        System.out.println("Treeset caricamento ms " + d1b.toMillis());
        Instant i1c = Instant.now();
        for (int i = 0; i < limite; i++) {
            sh.add(i);
        }
        Instant f1c = Instant.now();
        Duration d1c = Duration.between(i1c, f1c);
        System.out.println("Hashset caricamento ms " + d1c.toMillis());
        Instant i2 = Instant.now();
        for (int i = 0; i < limite; i++) {
            ll.add(i);
        }
        Instant f2 = Instant.now();
        Duration d2 = Duration.between(i2, f2);
        System.out.println("Linkedlist caricamento ms " + d2.toMillis());
//        Instant i3 = Instant.now();
//        for (int i = 0; i < limite; i++) {
//            ll.get(i);
//        }
//        Instant f3 = Instant.now();
//        Duration d3 = Duration.between(i3, f3);
//        System.out.println("Linkedlist lettura ms " + d3.toMillis());
        Instant i4 = Instant.now();
        for (int i = 0; i < limite; i++) {
            la.get(i);
        }
        Instant f4 = Instant.now();
        Duration d4 = Duration.between(i4, f4);
        System.out.println("Arraylist lettura ms " + d4.toMillis());
        Instant i4b = Instant.now();
        for (int i = 0; i < limite; i++) {
            la.contains(i);
        }
        Instant f4b = Instant.now();
        Duration d4b = Duration.between(i4b, f4b);
        System.out.println("Arraylist lettura senza indice ms " + d4b.toMillis());
        Instant i4a = Instant.now();
        for (int i = 0; i < limite; i++) {
            st.contains(i);
        }
        Instant f4a = Instant.now();
        Duration d4a = Duration.between(i4a, f4a);
        System.out.println("Treeset lettura ms " + d4a.toMillis());
        Instant i4c = Instant.now();
        for (int i = 0; i < limite; i++) {
            sh.contains(i);
        }
        Instant f4c = Instant.now();
        Duration d4c = Duration.between(i4c, f4c);
        System.out.println("Hashset lettura ms " + d4c.toMillis());
        Instant i5 = Instant.now();
        for (int i = 0; i < limite; i++) {
            la.remove(0);
        }
        Instant f5 = Instant.now();
        Duration d5 = Duration.between(i5, f5);
        System.out.println("Arraylist cancellazione ms " + d5.toMillis());
        Instant i6 = Instant.now();
        for (int i = 0; i < limite; i++) {
            ll.remove(0);
        }
        Instant f6 = Instant.now();
        Duration d6 = Duration.between(i6, f6);
        System.out.println("Linkedlist cancellazione ms " + d6.toMillis());
        Instant i6a = Instant.now();
        for (int i = 0; i < limite; i++) {
            st.remove(i);
        }
        Instant f6a = Instant.now();
        Duration d6a = Duration.between(i6a, f6a);
        System.out.println("Treeset cancellazione ms " + d6a.toMillis());
        Instant i6b = Instant.now();
        for (int i = 0; i < limite; i++) {
            sh.remove(i);
        }
        Instant f6b = Instant.now();
        Duration d6b = Duration.between(i6b, f6b);
        System.out.println("Hashset cancellazione ms " + d6b.toMillis());
    }

}
