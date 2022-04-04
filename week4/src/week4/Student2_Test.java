package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

	public class Student2_Test {
	    
	    public static void main(String[] args) {
	        ArrayList<Student2>st = new ArrayList<Student2>();
	        
	        st.add(new Student2(2,2,201923489,"피카츄",23));
	        st.add(new Student2(2,3,202015486,"파이리",22));
	        st.add(new Student2(1,1,202215752,"거북왕",24));
	        st.add(new Student2(2,1,201815852,"버터플",26));
	        st.add(new Student2(1,2,202158255,"야도란",25));
	        
	        // 익명 클래스 생성 방식으로 Comparator를 구현함
	        Comparator<Student2> st1 = new Comparator<Student2>() {
	 
	            @Override
	            public int compare(Student2 o1, Student2 o2) {
	                // TODO Auto-generated method stub
	                return o2.cnum-o1.cnum; //내림차순 정렬
	            }
	        };
	        
	        System.out.println("정렬전 : "+st);
	        Collections.sort(st,st1);
	        System.out.println("정렬후 : "+st);
	    }
	}

	
	

