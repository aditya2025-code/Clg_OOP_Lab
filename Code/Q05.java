package Code;
// Q5. Constructor overloading:

class Student{
    String name;
    int age;
    Student(){ // Constructor no.1:
        name = "unknown";
        age = 0;
    }
    Student(String n){ // Constructor no.2:
        name = n;
        age = 0;
    }
    Student(String n, int a){ // Constructor no.3:
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name + " " + age);
    }
}

class Q05 {
    public static void main(String[] args) {
        Student s1  = new Student();
        Student s2  = new Student("Adi");
        Student s3  = new Student("Aditya",100);
        s1.display();
        s2.display();
        s3.display();
    }    
}

// OUTPUT:
/*
unknown 0
Adi 0
Aditya 100
*/