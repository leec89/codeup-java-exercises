package util;

public class InputTest {

    public static void main(String[] args) {

//        Input input = new Input()         //Javier showed in walkthru
//        String userInput = input.getString();
//        System.out.println(userInput.getString());

//        Input newString = new Input();
//        System.out.println(newString.getString());
//
//        Input newBoolean = new Input();
//        System.out.println(newBoolean.yesNo());

//        Input newMinMax = new Input();
//        System.out.println(newMinMax.getInt(1,10));

//        Input newInt = new Input();
//        System.out.println(newInt.getInt());

        Input newDoubleMinMax = new Input();
        System.out.println(newDoubleMinMax.getDouble(1.0,100.0));

    }
}
