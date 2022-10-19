package Zelenina_Java;

public class TestTrainee {
    public static void main(String[] args) {
        printHello();
        printName();
        printArray();

    }

    public static void printHello() {
        int a  = 10;
        if (a >= 7) {
            System.out.println("Привет");
        }
    }

    public static void printName() {
        String name = "Вячеслав";
        if (name == "Вячеслав") {
            System.out.println("Привет,Вячеслав");
        } else if (name != "Вячеслав") {
            System.out.println("Нет такого имени");
        }
    }

    public static void printArray() {

        int array[] = { 1, 5, 8, 9, 11, 12, 15, 16, 24, 35, 37, 48, 54};;
        for (int i = 0; i < array.length; i++)
            if (array[i]%3 == 0){
                System.out.print(" " + array[i] + " ");

            }

    }

// Дана скобочная последовательность: [((())()(())]]
//- Можно ли считать эту последовательность правильной?
//- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

// Нет, эту последовательность нельзя считать правильной
// В ней необходимо заменить предпоследнюю скобку ] на )



}
