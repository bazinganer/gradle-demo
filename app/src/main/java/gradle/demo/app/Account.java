package gradle.demo.app;

public class Account {
    int gamma(int inputVal, int quantity, int yearToDate){
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if((yearToDate - importantValue1) > 100){
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 *importantValue1;
    }

    int delta() {
        return 0;
    }

    int gamma2(int inputVal, int quantity, int yearToDate){
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

}
