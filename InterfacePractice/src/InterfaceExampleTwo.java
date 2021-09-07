class Phone {
    public void call(){
        System.out.println("Calling functionality");
    }
    public void sms(){
        System.out.println("Sms functionality");
    }
}

interface ICamera{
    public void click();
    public void record();
}

interface IMusicPlayer{
    public void play();
    public void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer {
    @Override
    public void click() {
        System.out.println("Clicking Functionality");
    }

    @Override
    public void record() {
        System.out.println("Record Functionality");
    }

    @Override
    public void play() {
        System.out.println("Music Playing Functionality");
    }

    @Override
    public void stop() {
        System.out.println("Music Stopping Functionality");
    }
}

public class InterfaceExampleTwo {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        //These 2 are methods of phone class
        s.call();
        s.sms();

        //These 2 are overrided methods of the ICamera interface
        s.click();
        s.record();

        //These 2 are overrided methods of IMusicPlayer interface
        s.play();
        s.stop();
    }
}
