package stanislavvyshnevskyy.app.homework.lesson14;

/**
 * Created by Коти on 25.11.2016.
 */
public class WhiteCollar extends Human {
    private String companyName;
    public WhiteCollar(int age,String name, String company){
        super(age, name);
        companyName = company;
    }
    public void setCompany(String string){
        if(WhiteCollar.isCompanyNameValid(string)){
                companyName = string;
                System.out.println("Company name setted -> "+'\"'+companyName+'\"');
        } else {
            System.out.println("Company name is invalid");
        }
    }
    private static boolean isCompanyNameValid(String name) {
        char[] companyNameArr = name.toUpperCase().toCharArray();
        for (char c : companyNameArr) {
            //System.out.println(c);
            if ( ( (c < 65) && ((c!=32)&&(c!=44))&&(c!=45) ) || (c > 90)) return false;
        }
        return true;
    }
}
