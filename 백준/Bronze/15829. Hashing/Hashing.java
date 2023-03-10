import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        int n = System.in.read() & 15;
        System.in.read();
        int sum = 0;
        int powNum = 1;
        for (int i = 0; i < n; i++) {
            int charNum = (int) ((System.in.read() - '`') * powNum);
            powNum = (powNum * 31) % 1234567891;
            sum = (sum + charNum) % 1234567891;
        }
        bw.append(String.valueOf(sum));
        bw.flush();
        bw.close();

    }
}