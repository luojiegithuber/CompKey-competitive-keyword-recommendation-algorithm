package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException, Exception {
		// TODO 自动生成的方法存根
		
		
		//种子关键词
		String []wordKey = { "汽车" };
		
        int num = 10;   //设定选取竞争关键字的个数
        for(int i = 0; i < wordKey.length; i++) {
            //System.out.println("compkey算法开始，种子关键词为“" + wordKey[i] + "”...");
        	System.out.println("种子关键词【" + wordKey[i] + "】");
            new Compkey().compkey(wordKey[i], num);
        }
	}

}
