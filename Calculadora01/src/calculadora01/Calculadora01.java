/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora01;

/**
 * @author dam
 * Este es el primer comentario en la clase carculadora01
 * otra línea
 */
public class Calculadora01 {
    
        private int num1;
        private int num2;

        public Calculadora01(int a, int b) {
            num1 = a;
            num2 = b;
        }

        public int suma() {
            int result = num1 + num2;
            return result;
            
        }

        public int resta() {
            int result;
            if (resta2()) {
                result = num1 - num2;
            } else {
                result = num2 - num1;
            }
            return result;
        }

        public boolean resta2() {
            if (num1 > num2) {
                return true;
            } else {
                return false;
            }
        }

        public int multiplica() {
            int result = num1 * num2;
            return result;
        }

        public int divide() {
            int result = num1 / num2;
            return result;
        }

        public Integer divide2() {
            if (num2 == 0) {
                return null;
            }
            int result = num1 / num2;
            return result;
        }

        public int divide0() {
            if (num2 == 0) {
                throw new java.lang.ArithmeticException("División por 0");
            } else {
                int result = num1 / num2;
                return result;
            }
}
    public static void main(String[] args) {
        Calculadora01 calcu = new Calculadora01(20, 10);
        System.out.println(calcu.suma());
    }
}
