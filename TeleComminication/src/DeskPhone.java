
    public class DeskPhone implements phone{
        private String myNumber;
        private boolean isRinging;
        public DeskPhone(String myNumber){
            this.myNumber=myNumber;
        }
        @Override
        public void answer() {
            if(isRinging){
                System.out.println("Answering the desk phone");
                isRinging=false;
            }
            else{
                System.out.println("Phone is not Ringing");
            }
            
        }
        @Override
        public boolean callPhone(String phoneNumber) {
            if(phoneNumber==myNumber){
                isRinging=true;
                System.out.println("Phone is Ringing");
            }
            else{
                // System.out.println("");
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
            System.out.println("DeskPhone is always powered");
            
        }
        
    }


