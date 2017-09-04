import java.io.*;

public class Kadai2_2 {


    public void fileInput(InputStream stream_in, OutputStream stream_out) throws FileNotFoundException, IOException {
    	
        //File file = new File("radius.list");
        //FileReader fileReader = new FileReader(file);
        //br = new BufferedReader(fileReader);
        BufferedReader in = new BufferedReader(new InputStreamReader(stream_in));
    	String strStdIn = in.readLine();

//    	PrintWriter p = new PrintWriter(stream_out);
        PrintStream ps = new PrintStream(stream_out);

        while(strStdIn!=null){ //EOFまで処理継続
            double val = Double.valueOf(strStdIn);
//            p.println(calc_area(val));
            ps.println(calc_area(val));

//            stream_out.write(calc_area(val));
//            stream_out.write("\n".getBytes());
//            System.out.println(calc_area(val));
            strStdIn = in.readLine();
        }
    }

    public int calc_area(double val) {
        double ret = val * val * Math.PI;
        return (int) Math.round(ret);
    }

//    public void printResult() throws IOException {
//        fileInput();
//        String line;
//        while ((line = in.readLine()) != null) {
//            double val = Double.valueOf(line);
//            System.out.println(calc_area(val));
//        }
//    }

    public static void main(String[] args) {
        Kadai2_2 kadai = new Kadai2_2();
        try{
            kadai.fileInput(System.in, System.out);

        } catch (IOException e) {
        }
    }
}