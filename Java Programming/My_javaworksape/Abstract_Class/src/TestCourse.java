abstract class Course
{
	String courseName;
	int code;
	
	public Course() 
	{
		this.courseName = "Not Given";
		this.code= 0;
	}

	Course(String courseName, int code) 
	{
		//super();
		this.courseName = courseName;
		this.code = code;
	}

	String getCourseName() {
		return courseName;
	}

	void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	int getCode() {
		return code;
	}

	void setCode(int code) {
		this.code = code;
	}

	public String toString() {
		return "Course [courseName=" + courseName + ", code=" + code + "]";
	}

	abstract String courseType();
}//class Course ends here

class OnlineCourse extends Course
{
	String platform;
	
	OnlineCourse() 
	{
		super();
		this.platform = "Not Given";
	}

	OnlineCourse(String courseName,int code,String platform) 
	{
		super(courseName,code);
		this.platform = platform;
	}

	String getPlatform() {
		return platform;
	}

	void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public String toString() {
		return super.toString() + "OnlineCourse [platform=" + platform + "]";
	}

	String courseType()
	{
		return "Online Course";
	}
	
}//class OnlineCourse ends here

class OfflineCourse extends Course
{
	String classNo;
	
	OfflineCourse() 
	{
		super();
		this.classNo = "Not Given";
	}

	OfflineCourse(String courseName,int code,String classNo)
	{
		super(courseName,code);
		this.classNo = classNo;
	}

	String getClassNo() {
		return classNo;
	}

	void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String toString() {
		return super.toString() + "OfflineCourse [classNo=" + classNo + "]";
	}

	String courseType()
	{
		return "Offline Course";
	}
	
}//class OfflineCourse ends here

class HybridCourse extends Course
{
	String meetingTool;
	String learningPortal;
	
	HybridCourse() 
	{
		super();
		this.meetingTool = "Not Given";
		this.learningPortal = "Not Given";
	}

	HybridCourse(String courseName,int code,String meetingTool, String learningPortal)
	{
		super(courseName,code);
		this.meetingTool = meetingTool;
		this.learningPortal = learningPortal;
	}

	String getMeetingTool() {
		return meetingTool;
	}

	void setMeetingTool(String meetingTool) {
		this.meetingTool = meetingTool;
	}

	String getLearningPortal() {
		return learningPortal;
	}

	void setLearningPortal(String learningPortal) {
		this.learningPortal = learningPortal;
	}
	
	public String toString() {
		return super.toString() + "HybridCourse [meetingTool=" + meetingTool + ", learningPortal=" + learningPortal + "]";
	}

	String courseType()
	{
		return "Hybrid Course";
	}
}//class HybridCourse ends here

class TestCourse {

	public static void main(String[] args) 
	{
		Course c1; 
		
		//c1 = new Course("Java",101);
		
		OnlineCourse o1 = new OnlineCourse("Java",101,"Zoom Meetings");
		
		OfflineCourse s1 = new OfflineCourse("Python",102,"FC17");
		
		HybridCourse h1 = new HybridCourse("Testing",103,"gMeet","LMS");
		
		System.out.println("Course Details: ");
		System.out.println();
		//System.out.println(c1.toString());
		System.out.println();
		
		System.out.println("Online Course Details: ");
		System.out.println();
		System.out.println(o1.toString());
		System.out.println();
		
		System.out.println("Offline Course Details: ");
		System.out.println();
		System.out.println(s1.toString());
		System.out.println();
		
		System.out.println("Hybrid Course Details: ");
		System.out.println();
		System.out.println(h1.toString());

	}

}

class MyTestCourse
{
	public static void main(String[] args)
	{
		Course c;

//		c = new Course("C Programming", 201);
//		c.courseType();
//		System.out.println("Course Type: " + c.courseType());

		c = new OnlineCourse("Java", 101, "Zoom Meetings");
		c.courseType();
		System.out.println("Course Type: " + c.courseType());

		c = new OfflineCourse("Python", 102, "FC17");
		c.courseType();
		System.out.println("Course Type: " + c.courseType());

		c = new HybridCourse("Testing", 103, "gMeet", "LMS");
		c.courseType();
		System.out.println("Course Type: " + c.courseType());
	}
}

