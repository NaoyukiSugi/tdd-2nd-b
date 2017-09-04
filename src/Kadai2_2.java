import java.io.*;

public class Kadai2_2 {
    BufferedReader br;

    public void fileInput() throws FileNotFoundException, IOException {
        File file = new File("radius.list");
        FileReader fileReader = new FileReader(file);
        br = new BufferedReader(fileReader);
    }

    public int calc_area(double val) {
        double ret = val * val * Math.PI;
        return (int) Math.round(ret);
    }

    public void printResult() throws IOException {
        fileInput();
        String line;
        while ((line = br.readLine()) != null) {
            double val = Double.valueOf(line);
            System.out.println(calc_area(val));
        }
    }

    public static void main(String[] args) {
        Kadai2_2 kadai = new Kadai2_2();
        try{
            kadai.printResult();
        } catch (IOException e) {
        }
    }
}