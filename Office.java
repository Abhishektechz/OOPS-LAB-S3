class Office1 {
   String name;
   int age;
   String address;

   Office1(String name, int age, String address) {
       this.name = name;
       this.age = age;
       this.address = address;
   }
}

class Manager extends Office1 {
   String Dept;

   Manager(String name, int age, String address, String dept) {
       super(name, age, address);
       Dept = dept;
   }
}

class Officer extends Office1 {
   String spec;

   Officer(String name, int age, String address, String Spec) {
       super(name, age, address);
       spec = Spec;
   }
}

class Office {
   public static void main(String[] args) {
       Manager m1 = new Manager("Afsd", 34, "fgdf", "sdfghf");
       Officer o1 = new Officer("Asd", 44, "fytgdf", "sduyfghf");
       System.out.println(m1.Dept);
       System.out.println(o1.name);
   }
}
