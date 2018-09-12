import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class atmTests {
    @Test
    public void thirtyCountShouldPass() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(30);
        assertEquals(bankNotes.getBanknotesTen(), 1);
        assertEquals(bankNotes.getBanknotesTwenty(), 1);
    }

    @Test
    public void eightyCountShouldPass() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(80);
        assertEquals(bankNotes.getBanknotesTen(), 1);
        assertEquals(bankNotes.getBanknotesTwenty(), 1);
        assertEquals(bankNotes.getBanknotesFifty(), 1);
    }

    @Test
    public void oneHundredAndEightyCountShouldPass() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(180);
        assertEquals(bankNotes.getBanknotesTen(), 1);
        assertEquals(bankNotes.getBanknotesTwenty(), 1);
        assertEquals(bankNotes.getBanknotesFifty(), 1);
        assertEquals(bankNotes.getBanknotesHundred(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputValueShouldFail() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(3);
    }
}
