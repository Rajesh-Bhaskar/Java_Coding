package Java8_9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findDuplicateInStreamJava8 {
	  // Function to find the
    // duplicates in a Stream
    public static <T> Set<T>
    findDuplicateInStreamADDmETHOD(Stream<T> stream)
    {
  
        // Set to store the duplicate elements
        Set<T> items = new HashSet<T>();
  
        // Return the set of duplicate elements
        return stream
  
            // Set.add() returns false
            // if the element was 
            // already present in the set.
            // Hence filter such elements
            .filter(n -> !items.add(n))
  
            // Collect duplicate elements
            // in the set
            .collect(Collectors.toSet());
    }
  
 // Function to find the
    // duplicates in a Stream
    public static <T> Set<T>
    findDuplicateInStream(List<T> list)
    {
        // Return the set of duplicate elements
        return
  
            // Get the stream from the list
            list.stream()
  
                // Count the frequency of each element
                // and filter the elements
                // with frequency > 1
                .filter(i -> Collections.frequency(list, i) > 1)
  
                // And Collect them in a Set
                .collect(Collectors.toSet());
    }
    // Driver code
    public static void main(String[] args)
    {
  
        // Initial stream
        Stream<Integer> stream
            = Stream.of(5, 13, 4,
                        21, 13, 27,
                        2, 59, 59, 34,34,34,76,84,67,99,67);
  
        // Print the found duplicate elements
        System.out.println(
            findDuplicateInStreamADDmETHOD(stream));
     // Initial stream
        List<Integer> list
            = Arrays.asList(5, 13, 4,
                            21, 13, 27,
                            2, 59, 59, 34);
  
        // Print the found duplicate elements
        System.out.println(
            findDuplicateInStream(list));
    }

}
