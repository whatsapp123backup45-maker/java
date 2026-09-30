interface Sports {

    void play();
}

interface Music {

    void sing();
}

class Student implements Sports, Music {

    public void play() {
        System.out.println("Student is playing football.");
    }

    public void sing() {
        System.out.println("Student is singing a song.");
    }

    void study() {
        System.out.println("Student is studying Java.");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Student s = new Student();

        s.study();
        s.play();
        s.sing();
    }
}
