import java.util.HashSet;
import java.util.Set;

public class Exercise_11
{
    public Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> symmetricDifference = new HashSet<Integer>(set1);
        symmetricDifference.addAll(set2);
        Set<Integer> tempSet = new HashSet<>(set1);
        tempSet.retainAll(set2);
        symmetricDifference.removeAll(tempSet);

        return symmetricDifference;
    }


    public static void main(String[] args)
    {
        Exercise_11 exercise_11 = new Exercise_11();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(exercise_11.symmetricDifference(set1, set2));

    }
}
