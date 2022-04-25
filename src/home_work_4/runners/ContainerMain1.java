package home_work_4.runners;

import home_work_4.container.DataContainer;

public class ContainerMain1 {
    public static void main(String[] args) {
        String[] str = {
                "0",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9"
        };

        DataContainer<String> strContainer = new DataContainer<String>(str);
    }
}
