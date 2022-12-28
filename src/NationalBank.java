public class NationalBank {
    private final double fixedBankReward;

    private Calculator calculator;
    public NationalBank(){
        this.calculator = new Calculator();
        this.fixedBankReward = 0.01;
    }
    public NationalBank(double rate){
        this.calculator = new Calculator();
        this.fixedBankReward = rate;
    }
    public  void calculateDeposit(){
        double money = 0;
        int years = 0;
        calculator.calculateDeposit(money,years, this.fixedBankReward);
    }

    public double calculateCredit(){
        int years = 0;
        double money=0;
        return calculator.calculateCredit(years, money );
    }

    public void deposit(double money, int duration) {
    }


}
