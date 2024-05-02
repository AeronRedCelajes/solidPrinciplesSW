package numberThree;
public class IPhone implements SmartphoneCall, SmartphoneSMS, SmartphoneWeb, SmartphonePic
{
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " number...");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending " + number + " the message: " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Browsing Web: " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a picture");
    }
}