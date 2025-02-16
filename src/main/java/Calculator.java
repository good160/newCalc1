import java.io.IOException;
import java.util.Scanner;



public class Calculator {
    public static void main(String[] args) throws Exception {
        //------------------Получаем чиcла и знак операции
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа и операцию (+,-,*,/):");
        String input = scan.nextLine();   //Запишем ввод в строку



        //---------------------------------------------------------------------
        String result = calc(input);
        System.out.println("Input: " + input + '\n' + "Output: " + result);

    }

    public static String calc(String input) throws Exception {
        int num1,num2,sym1,sym2,sym3;

        String result;
        String[] operand = input.split("[+\\-*/]");
        sym1 = input.charAt(0);
        sym3 = input.charAt(1);
        sym2 = input.charAt(2);

        System.out.println(sym3);

        num1 = Integer.parseInt(operand[0]);
        num2 = Integer.parseInt(operand[1]);

        if (num1 > 10 || num1 < 0 || num2 > 10 || num2 < 0){
            try {
                throw new IOException();
            }catch (IOException e) {
                System.out.println("Output: throws Exception");
                System.exit(1);
            }
        }

        if (operand.length != 2) {

                throw new Exception("\"Output: \" + \"throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\");");

               // System.out.println("Output: " + "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                //System.exit(1);

        }
        //======================================Вот это никак не сделаю
        if(sym3 != (int)sym3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Output: throws Exception //т.к. строка не является математической операцией");
                System.exit(1);
            }
        }
        //====================================

        if (input.contains("+")) {
            result = Integer.toString(num1 + num2);
            return result;

        } else if (input.contains("-")) {
            result = Integer.toString(num1 - num2);
            return result;

        } else if (input.contains("*")) {
            result = Integer.toString(num1 * num2);
            return result;
        } else if (input.contains("/")) {
            result = Integer.toString(num1 / num2);
            return result;

        }
        return input;
    }
}