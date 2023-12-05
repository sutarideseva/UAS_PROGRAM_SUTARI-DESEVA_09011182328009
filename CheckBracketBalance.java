import java.util.Stack;

public class CheckBracketBalance {

    // Method untuk memeriksa keseimbangan kurung
    static boolean checkBracketBalance(String expression) {
        Stack<Character> stack = new Stack<>();

        // Iterasi melalui setiap karakter dalam ekspresi
        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            // Jika karakter saat ini adalah kurung buka, tambahkan ke stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            // Jika karakter saat ini adalah kurung tutup
            else if (current == ')' || current == '}' || current == ']') {
                // Jika stack kosong, kurung tutup tidak memiliki pasangan
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop(); // Ambil karakter teratas dari stack

                // Periksa apakah kurung saat ini cocok dengan kurung teratas dari stack
                if ((current == ')' && top != '(') || (current == '}' && top != '{') || (current == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Jika stack masih memiliki elemen, kurung buka tidak memiliki pasangan
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "((2 + 3) * 5)"; // Ekspresi dengan kurung seimbang
        String expression2 = "((2 + 3) * 5"; // Ekspresi tanpa pasangan kurung

        // Memeriksa keseimbangan kurung pada ekspresi 1
        if (checkBracketBalance(expression1)) {
            System.out.println("Keseimbangan kurung pada ekspresi 1: Benar");
        } else {
            System.out.println("Keseimbangan kurung pada ekspresi 1: Salah");
        }

        // Memeriksa keseimbangan kurung pada ekspresi 2
        if (checkBracketBalance(expression2)) {
            System.out.println("Keseimbangan kurung pada ekspresi 2: Benar");
        } else {
            System.out.println("Keseimbangan kurung pada ekspresi 2: Salah");
        }
    }
}
