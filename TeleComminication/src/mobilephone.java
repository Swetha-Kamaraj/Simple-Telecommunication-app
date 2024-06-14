public class mobilephone implements phone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;
    public mobilephone(String myNumber){
        this.myNumber=myNumber;
    }
    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answering the phone");
            isRinging=false;
        }
        else{
            //System.out.println("Phone is not Ringing");
        }
        
    }
    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber && isPowerOn){
            isRinging=true;
            System.out.println("Phone is Ringing");
        }
        else{
            System.out.println("Wrong Number or Phone is off");
            isRinging=false;
        }
        return isRinging;
        
    }
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Ringing"+phoneNumber+"on Desk");
        
    }
    @Override
    public void isRinging() {
         isRinging();
    }
    @Override
    public void powerOn() {
        isPowerOn=true;
        System.out.println("Mobile Phone Powered on");
        
    }
}
