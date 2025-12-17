package C02MethodClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08AccountMain {
    public static void main(String[] args) {
//        Account ac = new Account("홍길동", "12345", 350000);
//
//        List<Account> myList = new ArrayList<>();
//        myList.add(ac);
//        myList.add(new Account("김김김", "54321", 250000));
//
//        System.out.println("송금전 "+myList);
//
//        int money = 50000;
//
//        for (Account a : myList){
//            if (a.getAccountNumber().equals("12345")){
//                a.setBalance(a.getBalance()-money);
//            } else if (a.getAccountNumber().equals("54321")){
//                a.setBalance(a.getBalance()+money);
//            }
//        }
//        System.out.println("송금후 "+myList);
        //Map을 계좌객체를 담는 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("hong1", "12345", 100000));
        accountMap.put("54321", new Account("hong2", "54321", 50000));

        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");

        a.transfer(b, 50000);
        System.out.println(accountMap);

    }
}
class Account{
    //참조자료형은 초기값이 unll
    private Long id;
    private String name;
    private String accountNumber;
    //원시자료형은 각 자료형에 맞는 초기값
    private long balance;
    private static long staticId;

    public Account(String name, String accountNumber, long balance){
        staticId++;
        this.id=staticId;
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public long getBalance() {
        return balance;
    }
    //setBalance보다는 의도를 명확히 한 메서드명 사용하기를 권장
//    public void setBalance(long balance) {
//        this.balance = balance;
//    }
    public void transfer(Account targetAccount, long money) {
        //(송금할객체)잔고가 있는지 체크
        if (this.balance < money) {
            return;
        }
        if (this.balance >= money) {
            this.balance -= money; //송금할객체 돈 차감
            targetAccount.balance += money; //송금받을객체 돈 가산
        }
    }
    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}