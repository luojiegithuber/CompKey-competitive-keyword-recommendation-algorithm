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
		System.out.println("��������Դ��"+PathClass.wordIn);
		System.out.println("����ϴ�����ݵ�λ�á�"+PathClass.wordOut);
		
		while ((valueString = br.readLine()) != null){
			
		     c = valueString.toCharArray(); 
		     
		     //��39��ʼ������ÿһ�����ݵ�ǰ�ĸ��ֶΣ����������ؼ����ֶ�����
		     for(int i = 39; i < valueString.length(); i++) {
		          bw.append(c[i]);
		          
		          if(c[i] == '\t') {
		        	  //�����ո�ͱ���һ��������������һ��
		              bw.newLine();
		          }
		}    
		}        
		bw.close();
	}

}
