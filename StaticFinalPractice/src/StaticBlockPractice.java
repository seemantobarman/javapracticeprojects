//Static blocks are executed when the class is loaded
//Static blocks are not that much used

class StaticBlocks {
    //static block 1
    static {
        System.out.println("Block 1");
    }

    //static block 2
    static {
        System.out.println("Block 2");
    }
}

public class StaticBlockPractice {
    public static void main(String[] args) {
        //StaticBlocks class is loaded here
        StaticBlocks s = new StaticBlocks();
        System.out.println("Main");
    }
}
