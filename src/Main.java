public class Main {
    public static void main(String[] args) 
    {
        System.out.println("==============================================================");
        MyArrayList myList = new MyArrayList();
        MyArrayList myList2 = new MyArrayList(2);
        MyArrayList myList3 = new MyArrayList();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        myList2.add(4);
        myList2.add(5);
        myList2.add(6);

        myList3.add(1);
        myList3.add(2);
        myList3.add(3); 
        myList3.add(4);

        for (int i = 0; i < myList.size(); i++) 
        {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("\nList size: "+ myList.size());

        for (int i = 0; i < myList2.size(); i++) 
        {
            System.out.print(myList2.get(i) + " ");
        }
        System.out.println("\nList size: " + myList.size());

        System.out.println("==============================================================");
        
        System.out.println(myList.compare(myList2));

        System.out.println("==============================================================");
    }
}
