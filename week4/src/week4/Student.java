package week4;
import java.lang.Comparable;



class Student implements Comparable<Student>{
    int id;
	int cnum;
	int num;
	String name;
    int age;
   
    
    
    Student(int id,int cnum,int num, String name,int age){
    	this.id = id; //학년
    	this.cnum = cnum; //반
    	this.num = num; //학번
    	this.name = name; //이름
    	this.age = age; //나이
        
    }
 
    @Override
    public int compareTo(Student o) {
    	Student s2 = (Student)o;
    	if(this.age> s2.age) {
    	return 1;	 //a>b 일 경우 1값 리턴하여 자리교체
    	}
    	else if (this.age==s2.age) {
    		return 0; //a=b 일경우 0값 리턴하여 자리변동 없음
    	}
    	else {
    		return -1; //a<b 일경우 -1값 리턴하여 자리교체
    	}
    }
    
    public String toString() {
        return id+"학년 "+cnum+"반 "+num+" "+name+" "+age;
    }
 
}
 