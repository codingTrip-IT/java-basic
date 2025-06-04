package oop1.ex;
/**
 * 문제2 - 객체 지향 계좌
 * 은행 계좌를 객체로 설계해야 한다.
 * `Account` 클래스를 만들어라.
 * `int balance` 잔액
 * `deposit(int amount)` : 입금 메서드
 * 입금시 잔액이 증가한다.
 * `withdraw(int amount)` : 출금 메서드
 * 출금시 잔액이 감소한다.
 * 만약 잔액이 부족하면 **잔액 부족**을 출력해야 한다.
 * */
public class Account {
    int balance; // 잔액

    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

/*    int deposit(int amount) {
        return balance += amount;
    }

    int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return balance;
        } else {
            return balance -= amount;
        }
    }*/
}
