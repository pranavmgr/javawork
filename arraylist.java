import java.util.ArrayList;
public class arraylist { 
    public static void main (String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);
        // Remove the element at index 1
        list.remove(1);
        System.out.println(list);
        // Set the element at index 1 to 10
        list.set(1,10);
        System.out.println(list);
        // Get the size of the list
        int size = list.size();
        System.out.println(size);
        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            
        }
            System.out.print(" ");
    }
}
