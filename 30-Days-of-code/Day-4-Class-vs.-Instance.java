public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if(initialAge<0){
              age = 0;
          }
          else{
              age = initialAge;
          }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
          String x = "Age is not valid, setting age to 0.";
          String y = "You are young.";
          String z = "You are a teenager.";
          String w = "You are old.";
         if(age==0) {
            System.out.println(x);
            System.out.println(y);
         }
         else if(age>0&&age<13){
              System.out.println(y);
         }
         else if(age>=13&&age<18){
             System.out.println(z);
         }
         else{
             System.out.println(w);
         }
    }

	public void yearPasses() {
  		
        age+=1;
	}
