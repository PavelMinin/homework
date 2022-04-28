package tower_of_hanoi.core;

import tower_of_hanoi.api.ITowerOfHanoi;

public class HanoiGame implements ITowerOfHanoi {
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

    @Override
    public boolean makeMove(int fromRod, int toRod) {

        if(fromRod > this.field.length - 1 || toRod > this.field.length - 1) {
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
        if(ringFromValue < ringToValue) {
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
    public void showCurrentState() {
        String emptySymbol;
        StringBuilder sb = new StringBuilder();

        emptySymbol = " ";

        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[i].length; j++) {
                if(this.field[i][j] <= 9) {
                    sb.append(emptySymbol).append(this.field[i][j]).append("    ");
                } else {
                    sb.append(this.field[i][j]).append("    ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    @Override
    public void showCongratulation() {
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

        System.out.println(result);
    }

    @Override
    public void count() {
        this.stepCounter++;
    }

    @Override
    public int getStepCounter() {
        return this.stepCounter;
    }
}
