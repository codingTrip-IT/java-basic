package oop1.ex;
/**
 * 문제2 - 객체 지향 계좌
 * 은행 계좌를 객체로 설계해야 한다.
 * `AccountMain` 클래스를 만들고 `main()` 메서드를 통해 프로그램을 시작해라.
 * 계좌에 10000원을 입금해라.
 * 계좌에서 9000원을 출금해라.
 * 계좌에서 2000원을 출금 시도해라. `잔액 부족` 출력을 확인해라.
 * 잔고를 출력해라. `잔고: 1000`
 * */
public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); //오류 메시지 출력
        System.out.println("잔고: " + account.balance);
       /*
       int balance = 0;
       balance = account.deposit(10000);
        balance = account.withdraw(9000);
        balance = account.withdraw(2000);
        System.out.println("잔고: " + balance);*/
    }
}
