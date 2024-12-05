public class Part_5 {

    // Class forName

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        // Pair p = new Pair();

        Class.forName("Pair").newInstance();
    }
}


class Pair{

    static{

        System.out.println("this is static block");

    }
    //Executes while creating a object //instance
    {
        System.out.println("this is instance block");
    }
}