/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.BaseNumberManager;
import model.Validate;

public class Main {
    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = BaseNumberManager.menu();
            switch (choice) {
                case 1:
                    String binary = Validate.checkInputBinary();
                    BaseNumberManager.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Validate.checkInputDecimal();
                    BaseNumberManager.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = Validate.checkInputHexaDecimal();
                    BaseNumberManager.convertFromHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
}
