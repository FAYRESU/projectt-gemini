package tpm;

public abstract class BeverageMaker {

    // This is the template method. It defines the algorithm's skeleton.
    // It is declared as final to prevent subclasses from overriding it.
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Common methods, implemented in the abstract class.
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by subclasses.
    protected abstract void brew();
    protected abstract void addCondiments();
}
