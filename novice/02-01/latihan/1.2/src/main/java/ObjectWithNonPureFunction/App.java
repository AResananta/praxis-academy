/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ObjectWithNonPureFunction;

public class App{
    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }

    public static void main (String[] args)
    {
        App a = new App();
        System.out.println(a.add(5));
    }
}