<<<<<<< HEAD
class Grandfather {
    void land() {
        System.out.println("Grandfather owns land.");
    }
}

class Father extends Grandfather {
    void house() {
        System.out.println("Father owns a house.");
    }
}


class Son extends Father {
    void car() {
        System.out.println("Son owns a car.");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Son s = new Son();

        s.land(); 
        s.house();  
        s.car();    
    }
}
=======
class Grandfather {
    void land() {
        System.out.println("Grandfather owns land.");
    }
}

class Father extends Grandfather {
    void house() {
        System.out.println("Father owns a house.");
    }
}


class Son extends Father {
    void car() {
        System.out.println("Son owns a car.");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Son s = new Son();

        s.land(); 
        s.house();  
        s.car();    
    }
}
>>>>>>> 16701b80978a014c9747d5153c4423c97ea410d8
