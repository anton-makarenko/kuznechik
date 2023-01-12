import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Date;
public class Main {
//    private static final File encryptFile = new File("encrypt me.txt");
//    private static final File decryptFile = new File("decrypt me.txt");
//    private static final File resultTimeFile = new File("result.txt");
//    private static final File textFile = new File("text.txt");
//    private static final int TESTS = 30;
//    private static final byte[] key = {0x77, 0x66, 0x55, 0x44, 0x33, 0x22, 0x11,
//            0x00, (byte) 0xFF, (byte) 0xEE,
//            (byte) 0xDD, (byte) 0xCC, (byte) 0xBB, (byte) 0xAA, (byte) 0x99,
//            (byte) 0x88,
//            (byte) 0xEF, (byte) 0xCD, (byte) 0xAB, (byte) 0x89, 0x67, 0x45, 0x23,
//            0x01,
//            0x10, 0x32, 0x54, 0x76, (byte) 0x98, (byte) 0xBA, (byte) 0xDC, (byte)
//            0xFE};
//    private static final byte[] iVector = {(byte) 0xEF, (byte) 0xCD, (byte) 0xAD,
//            (byte) 0xCC, 0x67, 0x45, 0x23, 0x01,
//            0x10, 0x32, 0x54, 0x76, (byte) 0x98, (byte) 0xBF, (byte) 0xDC, (byte)
//            0xFE};
//    private static final Kuznechik kuznechik = Kuznechik.getInstance(key,
//            iVector);
//    private static long timeEncryptionExperiment(Mode mode) throws IOException {
//        byte[] inputBlocks = Files.readAllBytes(textFile.toPath());
//        long start = new Date().getTime();
//        byte[] outputBlocks = kuznechik.encrypt(inputBlocks, mode);
//        long end = new Date().getTime();
//        Files.write(decryptFile.toPath(), outputBlocks);
//        return end - start;
//    }
//    private static long timeDecryptionExperiment(Mode mode) throws IOException {
//        byte[] inputBlocks = Files.readAllBytes(decryptFile.toPath());
//        long start = new Date().getTime();
//        byte[] outputBlocks = kuznechik.decrypt(inputBlocks, mode);
//        long end = new Date().getTime();
//        Files.write(encryptFile.toPath(), outputBlocks);
//        return end - start;
//    }
    public static void main(String[] args) throws IOException {
//        Mode[] allModes = { Mode.ECB, Mode.CBC, Mode.CFB, Mode.OFB, Mode.CTR };
//        FileWriter resultFileWriter = new FileWriter(resultTimeFile);
//        BufferedWriter bufferedResultFileWriter = new
//                BufferedWriter(resultFileWriter);
//        PrintWriter writer = new PrintWriter(bufferedResultFileWriter);
//        for (int i = 0; i < allModes.length; i++) {
//            long sum = 0;
//            writer.println("Encryption in " + allModes[i]);
//            for (int j = 0; j < TESTS; j++) {
//                long time = timeEncryptionExperiment(allModes[i]);
//                sum += time;
//                writer.println(time);
//            }
//            writer.println("Average");
//            writer.println((double) sum / TESTS + "\n");
//            writer.println("Decryption in " + allModes[i]);
//            sum = 0;
//            for (int j = 0; j < TESTS; j++) {
//                long time = timeDecryptionExperiment(allModes[i]);
//                sum += time;
//                writer.println(time);
//            }
//            writer.println("Average");
//            writer.println((double) sum / TESTS);
//            writer.println("----------------------------");
//        }
//        writer.close();
        byte[] key = new byte[32];
        byte data[] = new byte[16];
        Kuznechik kuznechik = Kuznechik.getInstance(key, new byte[16]);
        byte[] encrypted = kuznechik.encrypt(data);
        System.out.println(Arrays.toString(encrypted));
        byte[] decrypted = kuznechik.decrypt(encrypted);
        System.out.println(Arrays.toString(decrypted));
    }
}