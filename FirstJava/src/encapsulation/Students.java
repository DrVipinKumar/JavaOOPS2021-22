package encapsulation;
//record Students(int rollno, String studentName, String course) {
//		
//}
public class Students {
  private int rollno;
  private String studentName;
  private String course;
  Students(int rollno,String sname, String course){
	  this.rollno=rollno;
	  this.studentName=sname;
	  this.course=course;
	  }
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getRollno() {
	return rollno;
}
@Override
public String toString() {
	return "Students [rollno=" + rollno + ", studentName=" + studentName + ", course=" + course + "]";
}
  
}
