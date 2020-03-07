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

		    
	    Result result  = ToAnalysis.parse("让战士们过一个欢乐祥和的新春佳节。");
	    //System.out.println(result.getTerms());

        List<Term> terms = result.getTerms(); //拿到terms
        //System.out.println(terms.size());
        
        for(int i=0; i<terms.size(); i++) {
            String word = terms.get(i).getName(); //拿到词
            String natureStr = terms.get(i).getNatureStr(); //拿到词性
            if(expectedNature.contains(natureStr)) {
                System.out.println(word + ":" + natureStr);
            }

        }

	}
 
}
