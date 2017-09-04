import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

public class Kadai2_3 {

	public void checkAddress(InputStream stream_in, OutputStream stream_out) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(stream_in));
    	String strStdIn = in.readLine();
    	PrintStream ps = new PrintStream(stream_out);
    	
    	String local;
    	String domain;
    	
    	while(strStdIn != null){
    		String[] tmp = strStdIn.split("@", 0);
    		local = tmp[0];
    		domain = tmp[1];
    		
    		checkD1(domain);
    		
    		strStdIn = in.readLine();
    	}
	}
	
	public boolean checkD1(String domain){
    	String pattern = "[A-Za-z0-9!#$%&'*+-/=?^_`{|}~.]";
		Pattern p = Pattern.compile(pattern);
		boolean flag = true;
		
		for(int i=0; i<domain.length(); i++){
			if(p.matcher(String.valueOf(domain.charAt(i))).find()){
    			//
    		}else{
    			flag = false;
    			//ps.println("ng");
    			//break;
    		}
			
		}
		//if(flag){
		//	return true;
			//ps.println("ok");
		//}
		return flag;
	}
	
	public static void main(String[] args){
		Kadai2_3 kadai = new Kadai2_3();
        try{
            kadai.checkAddress(System.in, System.out);

        } catch (IOException e) {
        }
	}
}