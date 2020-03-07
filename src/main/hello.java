package main;
import java.util.*;

import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

public class hello {
	
	public static void main(String[] args) {
        Set<String> expectedNature = new HashSet<String>() {{
            add("n");add("v");add("vd");add("vn");add("vf");
            add("vx");add("vi");add("vl");add("vg");
            add("nt");add("nz");add("nw");add("nl");
            add("ng");add("userDefine");add("wh");add("a");
        }};

		    
	    Result result  = ToAnalysis.parse("��սʿ�ǹ�һ��������͵��´��ѽڡ�");
	    //System.out.println(result.getTerms());

        List<Term> terms = result.getTerms(); //�õ�terms
        //System.out.println(terms.size());
        
        for(int i=0; i<terms.size(); i++) {
            String word = terms.get(i).getName(); //�õ���
            String natureStr = terms.get(i).getNatureStr(); //�õ�����
            if(expectedNature.contains(natureStr)) {
                System.out.println(word + ":" + natureStr);
            }

        }

	}
 
}
