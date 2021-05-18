import java.util.Calendar;

public class Date {
    public void outputRole() {
        String[] corevalues = {"個の力", "仲間との和", "組織の心"};
        Calendar cal = Calendar.getInstance();
        int date = cal.get(Calendar.DATE);
        String role;
        
        switch (date % 3) {
            case 0:
                role = "本日は「" + date + "日」なので、「" + corevalues[date % 3] + "」の部分をフルセンテンスで読んでいきましょう！";
                System.out.println(role);
                break;
            case 1:
                role = "本日は「" + date + "日」なので、「" + corevalues[date % 3] + "」の部分をフルセンテンスで読んでいきましょう！";
                System.out.println(role);
                break;
            case 2:
                role = "本日は「" + date + "日」なので、「" + corevalues[date % 3] + "」の部分をフルセンテンスで読んでいきましょう！";
                System.out.println(role);
                break;
            default:
                role = "例外的なパターンが検出されました";
                System.out.println(role);
                break;
        }
    }
    
}
