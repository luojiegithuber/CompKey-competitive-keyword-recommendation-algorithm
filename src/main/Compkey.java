package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Compkey {

	public static void compkey(String wordKey, int n) throws FileNotFoundException, UnsupportedEncodingException, IOException, Exception {
		// TODO �Զ����ɵķ������
        PathClass pa = new PathClass();
        System.out.println("��ʼ��������������ȡ�������ӹؼ�����ص�������Ϣ...");
        new MainDataClass().data(wordKey);  //����ɴ�ԭ��������ȡ�������ӹؼ�����ص�������Ϣ
        System.out.println("���ɹ�������ɴ�ԭ��������ȡ�������ӹؼ�����ص�������Ϣ");
        System.out.println("������·����E:\\����\\������ѧ��\\��������\\���������Ϣ.txt");
        //System.out.println("��ʼ�����н�ؼ���...");
	}

}
