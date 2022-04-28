package tower_of_hanoi.api;

public interface ITowerOfHanoi {
    boolean makeMove(int fromRod, int toRod);
    void showCurrentState();
    void showCongratulation();
    int getStepCounter();
    void count();
}
