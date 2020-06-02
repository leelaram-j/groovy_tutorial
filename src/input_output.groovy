class input_output {
    static void main(String[] args) {
        def randomString ="Random";

        println("A $randomString string");
        printf("A %s string \n",randomString);
        printf("%-10s %d %.2f %10s \n", ['stuff',10,1.234,'Random']);


        print("what your name ");
        def fName = System.console().readLine();
        println("Hello " + fName);

        print("Enter a number ");
        def num1 = System.console().readLine().toDouble();
        print("Enter another ");
        def num2 = System.console().readLine().toDouble();
        printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
    }
}
