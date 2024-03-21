package Reto;

import java.util.Scanner;
import java.util.Stack;

public class Reto141 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                String b = scanner.nextLine();
                Stack<Character> pila = new Stack<>();
                boolean correcto = true;
                for (int i = 0; i < b.length(); i++) {
                    char c = b.charAt(i);
                    if (c == '(' || c == '{' || c == '[')
                        pila.push(c);
                    else if (c == ')') {
                        if (pila.isEmpty() || pila.pop() != '(') {
                            correcto = false;
                            break;
                        }
                    } else if (c == '}') {
                        if (pila.isEmpty() || pila.pop() != '{') {
                            correcto = false;
                            break;
                        }
                    } else if (c == ']') {
                        if (pila.isEmpty() || pila.pop() != '[') {
                            correcto = false;
                            break;
                        }
                    }
                }
                if (pila.isEmpty() && correcto)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            scanner.close();
        }
    }


