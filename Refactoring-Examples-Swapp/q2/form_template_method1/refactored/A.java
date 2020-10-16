package q2.form_template_method1.refactored;

public class A {
   public static void main(String[] args) {
      System.out.println("After");
      System.out.println("m1:" + (new A().m1(15, 45)));
      System.out.println("m2:" + (new A().m2(15, 45)));
   }

   int m1(int min, int max) {
      return new M1().common(min, max);
   }

   int m2(int min, int max) {
      return new M2().common(min, max);
   }
}

abstract class Template {
	int sum = 0;
    int common(int min, int max) {
      for (int i = min; i <= max; i++) {
    	  sum = this.apply(i);
       }
      return sum;
   }

   abstract int apply(int i);
}

class M1 extends Template {
   @Override
   int apply(int i) {
      // TODO: Replace the statement below with your answer.
      return i + super.sum;
   }
}

class M2 extends Template {
   @Override
   int apply(int i) {
      return i*i + super.sum;
   }
}
