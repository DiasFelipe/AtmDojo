public class BankNotes {
    public int banknotesHundred; //100
    public int banknotesFifty; //50
    public int banknotesTwenty; //20
    public int banknotesTen; //10

    public BankNotes() {
        this.banknotesHundred = 0;
        this.banknotesFifty = 0;
        this.banknotesTwenty = 0;
        this.banknotesTen = 0;
    }

    public BankNotes(int banknotesHundred, int banknotesFifty, int banknotesTwenty, int banknotesTen) {
        this.banknotesHundred = banknotesHundred;
        this.banknotesFifty = banknotesFifty;
        this.banknotesTwenty = banknotesTwenty;
        this.banknotesTen = banknotesTen;
    }

    public int getBanknotesHundred() {
        return banknotesHundred;
    }

    public void setBanknotesHundred(int banknotesHundred) {
        this.banknotesHundred = banknotesHundred;
    }

    public void incrementBanknotesHundred(int increment){
        this.banknotesHundred += increment;
    }

    public int getBanknotesFifty() {
        return banknotesFifty;
    }

    public void setBanknotesFifty(int banknotesFifty) {
        this.banknotesFifty = banknotesFifty;
    }

    public void incrementBanknotesFifty(int increment){
        this.banknotesFifty += increment;
    }

    public int getBanknotesTwenty() {
        return banknotesTwenty;
    }

    public void setBanknotesTwenty(int banknotesTwenty) {
        this.banknotesTwenty = banknotesTwenty;
    }

    public void incrementBanknotesTwenty(int increment){
        this.banknotesTwenty += increment;
    }

    public int getBanknotesTen() {
        return banknotesTen;
    }

    public void setBanknotesTen(int banknotesTen) {
        this.banknotesTen = banknotesTen;
    }

    public void incrementBanknotesTen(int increment){
        this.banknotesTen += increment;
    }

    public void countBankNotes(int totalValue) {
        if(totalValue>=100) {
            incrementBanknotesHundred(1);
            countBankNotes(totalValue-100);
        } else if(totalValue>=50) {
            incrementBanknotesFifty(1);
            countBankNotes(totalValue-50);
        } else if(totalValue>=20) {
            incrementBanknotesTwenty(1);
            countBankNotes(totalValue-20);
        } else if(totalValue>=10) {
            incrementBanknotesTen(1);
            countBankNotes(totalValue-10);
        } else if(totalValue!=0) {
            throw new IllegalArgumentException("Valor inválido para saque");
        }
    }

    public String printResult() {
        return "Notas de 100: "+getBanknotesHundred()+"\n"+
                "Notas de 50: "+getBanknotesFifty()+"\n"+
                "Notas de 20: "+getBanknotesTwenty()+"\n"+
                "Notas de 10: "+getBanknotesTen()+"\n";
    }
}
