package week4;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Test {
    public static void main(String[] args) {
        ArrayList<Student>st = new ArrayList<Student>();
        
        st.add(new Student(2,2,201923489,"피카츄",23));
        st.add(new Student(2,3,202015486,"파이리",22));
        st.add(new Student(1,1,202215752,"꼬부기",24));
        st.add(new Student(2,1,201815852,"버터플",26));
        st.add(new Student(1,2,202158255,"야도란",25));
        
System.out.println("정렬전 : "+st);
        Collections.sort(st);
        System.out.println("정렬후 : "+st);
    }
}
