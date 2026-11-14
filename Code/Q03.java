package Code;
// Q3. 3 type of Constructor:

// Default Constructor:
class DefaultStudentConstructor{
    String name;
    int age;
    DefaultStudentConstructor(){
        name = "Aditya";
        age = 20;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

// Copy Constructor:
class CopyStudentConstructor{
    String name;
    int age;
    CopyStudentConstructor(String n,int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

// Parameterized Constructor:
class ParameterizedStudentConstructor{
    String name;
    int age;
    ParameterizedStudentConstructor(String n,int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Q03{
    public static void main(String[] args) {
        DefaultStudentConstructor S1 = new DefaultStudentConstructor();
        ParameterizedStudentConstructor S2 = new ParameterizedStudentConstructor("Bijoy",22);
        CopyStudentConstructor S3 = new CopyStudentConstructor("Sayan",19);
        CopyStudentConstructor S4 = S3;
        System.out.println("Default Student Constructor:");
        S1.display();
        System.out.println("Parameterized Student Constructor:");
        S2.display();
        System.out.println("Copy Student Constructor:");
        S4.display();
    }
}

//OUTPUT:
/*
Default Student Constructor:
Aditya
20
Parameterized Student Constructor:
Bijoy
22
Copy Student Constructor:
Sayan
19
*/