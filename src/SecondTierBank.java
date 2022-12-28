public class SecondTierBank extends NationalBank {
    public class secondTierBank extends NationalBank {


        private final double FIXED_INTEREST_RATE = 0.03;
        private Calculator calculator;
        public secondTierBank(){
            super(0.02);
            this.calculator = new Calculator();

        }

        @Override
        public double calculateCredit() {
            double credit = super.calculateCredit() ;
            return credit + credit*FIXED_INTEREST_RATE;
        }
    }
}
