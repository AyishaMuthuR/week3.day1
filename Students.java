package week3.day1;

public class Students {
     public void getStudentInfo(int id) {
    	 System.out.println(id);
     }
     public void getStudentInfo(int id,String name) {
    	 System.out.println(id+"   "+name);
     }
     public void getStudentInfo(String eml,long phn) {
    	 System.out.println(eml+"   "+phn);
     }
	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.getStudentInfo(4001);
        obj.getStudentInfo(4001,"Ayisha");
        obj.getStudentInfo("ayisha.cse@gmail.com", 8056717420l);
	}

}
