package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Compkey {

	public static void compkey(String wordKey, int n) throws FileNotFoundException, UnsupportedEncodingException, IOException, Exception {
		// TODO 自动生成的方法存根
        PathClass pa = new PathClass();
        System.out.println("开始从总搜索量中提取出与种子关键字相关的搜索信息...");
        new MainDataClass().data(wordKey);  //已完成从原数据中提取出与种子关键字相关的搜索信息
        System.out.println("【成功】已完成从原数据中提取出与种子关键字相关的搜索信息");
        System.out.println("【保存路径】E:\\大三\\大三下学期\\电子商务\\保存相关信息.txt");
        //System.out.println("开始查找中介关键词...");
	}

}
