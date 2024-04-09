//import java.util.*; 

 

 

class Student 

{ 

    int rollno; 

    int marks; 

    String name; 

 

} 

 

class mdarray { 

    public static void main(String[] args) { 

        Student s1= new Student(); 

        s1.rollno=1; 

        s1.marks=90; 

        s1.name ="Suriya"; 

         

        Student s2= new Student(); 

        s2.rollno=2; 

        s2.marks=80; 

        s2.name ="Rajesh"; 

         

        Student s3= new Student(); 

        s3.rollno=3; 

        s3.marks=86; 

        s3.name ="Ram"; 

         

        Student students[] = new Student[3]; //students is the refernce array of s1,s2,s3 

         

        students[0] =s1; 

        students[1]=s2; 

        students[2]= s3; 

         

        for(int i=0;i<students.length;i++) 

        { 

           System.out.println("ROll number is :" + students[i].rollno + " "+ students[i].name +   ": " +students[i].marks); 

            

        } 

        //System.out.println(); 

         for(Student stud:students)
         {
            System.out.println(stud.name + " :" + stud.marks);
         }

         

         

}} 