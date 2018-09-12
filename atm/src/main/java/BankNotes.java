import java.util.*;

public class BankNotes {
    public List<Integer> possibleValues;
    public Map<Integer, Integer> countBanknotes;

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    public Map<Integer, Integer> getCountBanknotes() {
        return countBanknotes;
    }

    public int getCountBanknotes(Integer key) {
        return countBanknotes.get(key);
    }

    public void setCountBanknotes(Map<Integer, Integer> countBanknotes) {
        this.countBanknotes = countBanknotes;
    }

    public BankNotes() {
        this.possibleValues = new ArrayList<Integer>(Arrays.asList(100,50,20,10));
    }

    public BankNotes(List<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }

    public void countBankNotes(int totalValue) {
        Map<Integer,Integer> banknotes = new HashMap<>();
        for(int banknote : possibleValues) {
            banknotes.put(banknote, totalValue/banknote);
            totalValue = totalValue%banknote;
        }
        if(totalValue!=0) {
            throw new IllegalArgumentException("Valor inválido para saque");
        }
        setCountBanknotes(banknotes);
    }

    public String printResult() {
        String response = "";
        for(Map.Entry<Integer, Integer> entry : getCountBanknotes().entrySet()) {
            response += "Notas de "+entry.getKey()+": "+entry.getValue()+"\n";
        }
        return response;
    }
}
