package week4;
 
class Student2{
    int id;
	int cnum;
	int num;
	String name;
    int age;
   
    
    Student2(int id,int cnum,int num, String name,int age){
    	this.id = id; //학년
    	this.cnum = cnum; //반
    	this.num = num; //학번
    	this.name = name; //이름
    	this.age = age; //나이
    }
 
    public String toString() {
        return id+"학년 "+cnum+"반 "+name+" "+age;
    }
}
