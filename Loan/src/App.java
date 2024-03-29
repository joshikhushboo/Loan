public void isEligible(Eduloan ed){

}

public class App {
    public static void main(String[] args) throws Exception {
        Eduloan ed = new Eduloan("khushboo", 20, 400000);
        int agee = ed.getAge();
        System.out.println(agee);
    }
}
