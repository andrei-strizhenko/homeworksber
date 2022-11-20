package profdz2.task3;

import java.util.HashSet;
import java.util.Set;

public class PowerfulSet {


    public <T> Set<T> intersection(Set<T> set1, Set<T> set2) { //return elements which is ecual from set1 and set2
        Set<T> interSection = new HashSet<>(set1);
        interSection.retainAll(set2);
        return interSection;
    }
    public <T> Set<T> union (Set<T> set1, Set<T> set2) {  //return sum unical elements from set1 and set2
        Set<T> un = new HashSet<>(set1);
        un.addAll(set2);
        return un;
    }
    public <T> Set<T> relativeComplement (Set<T> set1, Set<T> set2) { //return unical elements from set1 without elements from set2
        Set<T> relCompl = new HashSet<>(set1);
        relCompl.removeAll(set2);
        return relCompl;
    }
}