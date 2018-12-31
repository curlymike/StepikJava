package task003;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    List<Account> accounts = new ArrayList<>();

    List<Account> nonEmptyAccounts = filter(accounts, acc -> acc.getBalance() > 0);
    List<Account> nonEmptyAccounts2 = filter(accounts, acc -> acc.getBalance() > 0);

  }

  static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
    return null;
  }

  static class Account {
    String number;
    Long balance;
    boolean isLocked;

    public Account(String number, Long balance, boolean isLocked) {
      this.number = number;
      this.balance = balance;
      this.isLocked = isLocked;
    }

    public String getNumber() {
      return number;
    }

    public Long getBalance() {
      return balance;
    }

    public boolean isLocked() {
      return isLocked;
    }

    public void setNumber(String number) {
      this.number = number;
    }

    public void setBalance(Long balance) {
      this.balance = balance;
    }

    public void setLocked(boolean locked) {
      isLocked = locked;
    }
  }

}
