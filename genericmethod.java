Public class genericmethod {
    public static<T> void printArray(T[] arrary) {
        for (T element : arrary) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World", "Java", "Programing"};

        printArray(intArray);
        printArray(strArray);
    }
}