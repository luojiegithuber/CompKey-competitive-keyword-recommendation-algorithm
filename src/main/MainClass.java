package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException, Exception {
		// TODO �Զ����ɵķ������
		
		
		//���ӹؼ���
		String []wordKey = { "����" };
		
        int num = 10;   //�趨ѡȡ�����ؼ��ֵĸ���
        for(int i = 0; i < wordKey.length; i++) {
            //System.out.println("compkey�㷨��ʼ�����ӹؼ���Ϊ��" + wordKey[i] + "��...");
        	System.out.println("���ӹؼ��ʡ�" + wordKey[i] + "��");
            new Compkey().compkey(wordKey[i], num);
        }
	}

}
