public class CindyPuspaAlfani_25161562030_Stack { 
 
    // === BAGIAN 1: Deklarasi Stack === 
    static String[] stack = new String[10]; 
    static int top = -1; 
 
    // === BAGIAN 2: Operasi Stack === 
 
    //  TODO: Lengkapi method push() Push: menambahkan elemen ke TOP stack
    static void push(String tiket) { 
        if (top < stack.length - 1) { // Cek stack penuh (overflow)
            stack[++top] = tiket;
        } else {
            System.out.println("Stack penuh!");
        }
    } 
 
    //  TODO: Lengkapi method pop()  Pop: hapus dan kembalikan elemen TOP
    static String pop() { 
        if (!isEmpty()) {
            return stack[top--];
        } else {
            return "Stack kosong!"; // Underflow
        }
    } 
 
    //  Lengkapi method peek() Peek: melihat elemen TOP tanpa hapus
    static String peek() { 
        if (!isEmpty()) {
            return stack[top];
        } else {
            return "Stack kosong"; // Stack kosong
        }
    } 
 
    static boolean isEmpty() { 
        return top == -1; 
    } 
 
    static void tampilkanStack() { 
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ==="); 
        for (int i = top; i >= 0; i--) { 
            System.out.println("| " + stack[i] + " |"); 
        } 
        System.out.println("================================="); 
    } 
    
    // BONUS: Hitung total harga tiket
    static void hitungTotal() {
        int total = 0;
        for (int i = 0; i <= top; i++) {
            // Ekstrak angka dari format "Rp50.000"
            String hargaStr = stack[i].substring(stack[i].lastIndexOf("Rp") + 2);
            int harga = Integer.parseInt(hargaStr.replace(".", ""));
            total += harga;
        }
        System.out.printf("Total transaksi: Rp%,d%n", total);
    }
 
    // === BAGIAN 3: Main Program === 
    public static void main(String[] args) { 
        // TODO: push 3 transaksi berikut ke dalam stack: 
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");
        
        // BONUS: Hitung total setelah semua push
        hitungTotal();
    
        tampilkanStack(); 
        
        // TODO: taampilkan tiket paling atas (peek)
        System.out.println("Tiket terakhir masuk: " + peek()); 
        
        //  TODO: batalkan 1 transaksi teratas (pop) dan tampilkan 
        System.out.println("Tiket dibatalkan: " + pop()); 
        
        // Tampilkan isi stack setelah pop
        tampilkanStack(); 

    } 
}

