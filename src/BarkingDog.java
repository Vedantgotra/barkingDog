public class BarkingDog {
    public static  boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else if(barking){
            return hourOfDay < 8 || hourOfDay > 22;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,1));
        System.out.println(shouldWakeUp(true,-1));

    }
    }