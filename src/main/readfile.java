package main;
import java.io.*;


public class readfile {

	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader(new FileInputStream(new File(PathClass.wordIn)), "GBK");
		OutputStreamWriter outStream = new OutputStreamWriter(new FileOutputStream(new File(PathClass.wordOut)), "UTF-8");
		
		BufferedReader br = new BufferedReader(inStream);
		BufferedWriter bw = new BufferedWriter(outStream);
		
		String valueString = null;
		
		char c[];
		System.out.println("【数据来源】"+PathClass.wordIn);
		System.out.println("【清洗后数据的位置】"+PathClass.wordOut);
		
		while ((valueString = br.readLine()) != null){
			
		     c = valueString.toCharArray(); 
		     
		     //从39开始：过滤每一行数据的前四个字段，保留搜索关键字字段数组
		     for(int i = 39; i < valueString.length(); i++) {
		          bw.append(c[i]);
		          
		          if(c[i] == '\t') {
		        	  //遇到空格就保留一个搜索，并另起一行
		              bw.newLine();
		          }
		}    
		}        
		bw.close();
	}

}
