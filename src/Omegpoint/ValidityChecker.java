
public class ValidityChecker {
    public static void main(String[] args) {
        StringBuilder nr = new StringBuilder("");
         ValidityCheck check = new ValidityCheck();
        //list arbitrary sequence of validation checks from checker instance
        String s = "5512103073210694//)";
        /*
        for(int i = 0;i<=s.length()-1;i++){
            if(i==0 || i >= (s.length()-4)){
                System.out.println(s.charAt(i));
                nr.append(Character.toString(s.charAt(i)));
            }else{
                System.out.println("#");
                nr.append("#");
            }
        }*/
        char sdf = 5;
        int is = 10;
        System.out.println(11%100);
        System.out.println(s.matches(" /(?:\\/\\*\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\\\\\\"\\{\\}_\\[\\]\\|\\\\\\\\\\?\\/\\<\\>\\,\\.\\\")/"));
        System.out.println(s.contains(" /(?:\\/\\*\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\\\\\\"\\{\\}_\\[\\]\\|\\\\\\\\\\?\\/\\<\\>\\,\\.\\\")/"));
        System.out.println(nr);

    }
}
