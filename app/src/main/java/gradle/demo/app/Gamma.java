
package gradle.demo.app;

public class Gamma {
    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(
            Account account,
            int inputVal,
            int quantity,
            int yearToDate) {
        this.account = account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute(){
        extracted();
        importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 *importantValue1;
    }

    private void extracted() {
        importantValue1 = (inputVal * quantity) + account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        if((yearToDate - importantValue1) > 100){
            importantValue2 -= 20;
        }
    }


}

