package numberThree;
public class SmartphoneTest {
    public static void main(String[] args){

        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        IPhone iphone = new IPhone();

        System.out.println("---- BASIC PHONE ----");
		// BASIC PHONE
        basicPhone.makeCall("09551234567");
        basicPhone.sendSMS("09551234567", "Hello how are you?");

        System.out.println();

        System.out.println("---- SAMSUNG ----");
        // SAMSUNG
        samsung.makeCall("09561234568");
        samsung.sendSMS("09561234568", "How is your Samsung?");
        samsung.browseWeb("meet.google.com");
        samsung.takePicture();

        System.out.println();
        System.out.println("---- IPHONE ----");
        // IPHONE
        iphone.makeCall("09001234560");
        iphone.sendSMS("09001234560", "How is your Iphone?");
        iphone.browseWeb("gmail.com");
        iphone.takePicture();
	}
}
