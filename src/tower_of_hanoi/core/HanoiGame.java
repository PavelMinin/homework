package tower_of_hanoi.core;

import tower_of_hanoi.api.ITowerOfHanoi;

import java.io.Serializable;
import java.util.Arrays;

public class HanoiGame implements ITowerOfHanoi, Serializable {
    private final int[][] field;
    private int stepCounter;


    public HanoiGame() {
        this.field = new int[4][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                this.field[i][0] = i + 1;
            }
        }
    }

    public HanoiGame(int ringsQuantity) {
        this.field = new int[ringsQuantity][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                this.field[i][0] = i + 1;
            }
        }
    }

    public HanoiGame(int ringsQuantity, int rodsQuantity) {
        this.field = new int[ringsQuantity][rodsQuantity];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                this.field[i][0] = i + 1;
            }
        }
    }

    public int getFieldRowSize() {
        return this.field.length;
    }

    public int getFieldColumnSize() {
        return this.field[0].length;
    }

    @Override
    public boolean makeMove(int fromRod, int toRod) {

        if(fromRod > this.field[0].length - 1 || toRod > this.field[0].length - 1 || fromRod == toRod) {
            return false;
        }

        int ringFromValue = 0;
        int ringFromRow = 0;
        int ringToValue = 0;
        int ringToRow = 0;
        for (int i = 0; i < field.length; i++) {
            if(field[i][fromRod] > 0) {
                ringFromValue = field[i][fromRod];
                ringFromRow = i;
                break;
            }
        }
        for (int i = 0; i < field.length; i++) {
            if(field[i][toRod] > 0) {
                ringToValue = field[i][toRod];
                ringToRow = i;
                break;
            }
        }
        if(ringFromValue == 0) {
            return false;
        } else if(ringFromValue < ringToValue) {
            this.field[ringFromRow][fromRod] = 0;
            this.field[ringToRow - 1][toRod] = ringFromValue;
            count();
            return true;
        } else if(ringToValue == 0) {
            this.field[ringFromRow][fromRod] = 0;
            this.field[this.field.length - 1][toRod] = ringFromValue;
            count();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkState() {
        boolean onCorrectPlace = false;
        for(int i = 0; i < field.length; i++) {
            if(this.field[i][this.field[i].length - 1] == i + 1) {
                onCorrectPlace = true;
            } else {
                return false;
            }
        }
        return onCorrectPlace;
    }

    @Override
    public String getCurrentState() {
        String emptySymbol;
        StringBuilder sb = new StringBuilder();

        emptySymbol = " ";

        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                if(this.field[i][j] <= 9) {
                    int num = this.field[i][j];
                    sb.append(emptySymbol).append(num == 0 ? "*" : num).append("    ");
                } else {
                    sb.append(this.field[i][j]).append("    ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String getCongratulation() {
        int count = getStepCounter();
        String result = "!!!!!!!!!!!!!!!!!!ПОЗДРАВЛЯЕМ!!!!!!!!!!!!!!!!!!\n" +
                "Вы выиграли за " + count;
        if(count == 1) {
            result += " шаг.";
        } else if(count < 5) {
            result += " шага.";
        } else if(count > 5) {
            result += " шагов.";
        } else {
            System.out.println("Ошибка в подсчете шагов!");
        }

        return result;
    }

    @Override
    public void count() {
        this.stepCounter++;
    }

    @Override
    public int getStepCounter() {
        return this.stepCounter;
    }

    @Override
    public String toString() {
        return "HanoiGame{" +
                "field=" + Arrays.toString(field) +
                ", stepCounter=" + stepCounter +
                '}';
    }
}
