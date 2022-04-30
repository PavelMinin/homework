package tower_of_hanoi.api;

public interface ITowerOfHanoi {
    boolean makeMove(int fromRod, int toRod);
    String getCurrentState();
    String getCongratulation();
    int getStepCounter();
    void count();
    boolean checkState();
}
