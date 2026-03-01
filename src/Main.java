class Main {

    // Generic method: works for any reference type
    public static <T> void printGeneric(T value) {
        System.out.println("Generic value: " + value);
    }

    // Multiple type parameters (precursor to Map<K, V>)
    public static <K, V> void printPair(K key, V value) {
        System.out.println(key + " = " + value);
    }

    // Bounded generic: only subclasses of Number allowed
    public static <T extends Number> void computeVoid(T num1, T num2) {
        double sum = num1.doubleValue() + num2.doubleValue();
        System.out.println("Sum: " + sum);
    }

    // Generic method with return type
    public static <T extends Number> double computeReturn(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        printGeneric("janur");
        printGeneric(50);       // int → Integer (autoboxing)
        printGeneric(67.0);

        printPair("age", 20);
        printPair(1, "one");

        computeVoid(10, 20);
        computeVoid(3.5, 1.2);

        double ans1 = computeReturn(10, 20);
        double ans2 = computeReturn(3.5, 1.2);

        System.out.println("Returned answer: " + ans1 + ", " + ans2);
    }
}