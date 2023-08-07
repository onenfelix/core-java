class Computer {
    public void playMusic(){
        System.out.println("Playing Music Now....");
    }

    public String getMeApen(int cost){
        if(cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

public class Method {
    public static void main(String a[]){

        Computer obj = new Computer();
        obj.playMusic();
        String pen = obj.getMeApen(12);
        System.out.println(pen);

    }
}
