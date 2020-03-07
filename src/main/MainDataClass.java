/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


public class MainDataClass {
    public static void data(String wordKey) throws FileNotFoundException, UnsupportedEncodingException, IOException, Exception {
        PathClass pa = new PathClass();
        InputStreamReader inStream = new InputStreamReader(new FileInputStream(new File(pa.wordOut)), "utf-8");//读取总搜索量文件
        OutputStreamWriter outStream = new OutputStreamWriter(new FileOutputStream(new File(pa.wordRelated)), "utf-8");
        BufferedReader bf = new BufferedReader(inStream);
        BufferedWriter bw = new BufferedWriter(outStream);
        String valueString = null;
        while ((valueString=bf.readLine())!=null){  //与种子关键字相关的搜索信息
            if(valueString.contains(wordKey)) {
                bw.append(valueString);
                bw.newLine();
            } 
        }
        bw.close();
        File f = new File(pa.wordRelated);
        if(f.length() == 0) {
            System.out.println("搜索日志中不含关键词“" + wordKey +"”，请重新设置种子关键词！！！");
            System.exit(0);
        }
        //System.out.println("加载Word分词器...");
        //System.out.println("开始对与种子关键字相关的搜索信息进行分词与词频统计...");
        //new StatisticsDataClass().statistic(pa.wordRelated, pa.wordApart, pa.wordStatistics);//对相关信息进行分词和词频统计
    }
}
