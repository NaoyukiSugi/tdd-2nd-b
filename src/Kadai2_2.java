import java.io.*;

public class Kadai2_2 {
    BufferedReader in;

    public void fileInput() throws FileNotFoundException, IOException {
    	
        //File file = new File("radius.list");
        //FileReader fileReader = new FileReader(file);
        //br = new BufferedReader(fileReader);
    	in= new BufferedReader(new InputStreamReader(System.in));
    	String strStdIn = in.readLine();
        while(strStdIn!=null){ //EOFまで処理継続
            System.out.println(strStdIn);
            strStdIn = in.readLine();
        }
    }

    public int calc_area(double val) {
        double ret = val * val * Math.PI;
        return (int) Math.round(ret);
    }

    public void printResult() throws IOException {
        fileInput();
        String line;
        while ((line = in.readLine()) != null) {
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