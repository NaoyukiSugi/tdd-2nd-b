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
    	String address;
    	
    	while(strStdIn != null){
    		String[] tmp = strStdIn.split("@", 0);
    		address = strStdIn;
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
	
	public boolean checkD2(String domain){
		String pattern = "[.]";
		Pattern p = Pattern.compile(pattern);
		
		if(p.matcher(String.valueOf(domain.charAt(0))).find()){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkD3(String domain){
		String pattern = "[.]";
		Pattern p = Pattern.compile(pattern);
		
		if(p.matcher(String.valueOf(domain.charAt(domain.length()-1))).find()){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean checkD4(String domain){
		String pattern = "[.]";
		Pattern p = Pattern.compile(pattern);
		int count = 0;
		
		for(int i=0; i<domain.length(); i++){
			if(p.matcher(String.valueOf(domain.charAt(i))).find()){
				count++;
			}else{
				
			}
			if(count>=2){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkD5(String domain){
		if(domain.length()>0){
			return true;
		}else{
			return false;
		}
	}

	public boolean checkA1(String address){
		String pattern = "[@]";
		Pattern p = Pattern.compile(pattern);
		int count = 0;

		for(int i=0; i<address.length(); i++){
			if(p.matcher(String.valueOf(address.charAt(i))).find()){
				count++;
			}else{
			}
		}
		if(count == 1){
			return true;
		}else {
			return false;
		}
	}

	public boolean checkLD1(String local){
		String pattern = "[A-Za-z0-9!#$%&'*+-/=?^_`{|}~.]";
		Pattern p = Pattern.compile(pattern);
		boolean flag = true;

		for(int i=0; i<local.length(); i++){
			if(p.matcher(String.valueOf(local.charAt(i))).find()){
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

	public boolean checkLD2(String local){
		String pattern = "[.]";
		Pattern p = Pattern.compile(pattern);

		if(p.matcher(String.valueOf(local.charAt(0))).find()){
			return false;
		}else{
			return true;
		}
	}

	public boolean checkLD3(String local){
		String pattern = "[.]";
		Pattern p = Pattern.compile(pattern);

		if(p.matcher(String.valueOf(local.charAt(local.length()-1))).find()){
			return false;
		}else{
			return true;
		}
	}

	public boolean checkLD4(String local){
		String pattern = "[.]";
		Pattern p = Pattern.compile(pattern);
		int count = 0;

		for(int i=0; i<local.length(); i++){
			if(p.matcher(String.valueOf(local.charAt(i))).find()){
				count++;
			}else{

			}
			if(count>=2){
				return false;
			}
		}
		return true;
	}

	public boolean checkLD5(String local){
		if(local.length()>0){
			return true;
		}else{
			return false;
		}
	}

	
	public static void main(String[] args){
		Kadai2_3 kadai = new Kadai2_3();
        try{
            kadai.checkAddress(System.in, System.out);

        } catch (IOException e) {
        }
	}
}
