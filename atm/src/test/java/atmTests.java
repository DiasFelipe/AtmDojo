import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class atmTests {
    @Test
    public void thirtyCountShouldPass() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(30);
        assertEquals(bankNotes.getCountBanknotes(10), 1);
        assertEquals(bankNotes.getCountBanknotes(20), 1);
    }

    @Test
    public void eightyCountShouldPass() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(80);
        assertEquals(bankNotes.getCountBanknotes(10), 1);
        assertEquals(bankNotes.getCountBanknotes(20), 1);
        assertEquals(bankNotes.getCountBanknotes(50), 1);
    }

    @Test
    public void oneHundredAndEightyCountShouldPass() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(180);
        assertEquals(bankNotes.getCountBanknotes(10), 1);
        assertEquals(bankNotes.getCountBanknotes(20), 1);
        assertEquals(bankNotes.getCountBanknotes(50), 1);
        assertEquals(bankNotes.getCountBanknotes(100), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputValueShouldFail() {
        BankNotes bankNotes = new BankNotes();
        bankNotes.countBankNotes(3);
    }
}
