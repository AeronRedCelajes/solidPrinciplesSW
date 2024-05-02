package numberThree;

public class BasicPhone implements SmartphoneCall, SmartphoneSMS
{
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " number...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending " + number + " the message: " + message);
    }
}