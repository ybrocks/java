//package C02MethodClass;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class C09BankService {
//    public static void main(String[] args) {
//        Map<String, BankAccount> map = new HashMap<>();
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true){
//            System.out.println("사용하실 서비스 번호를 입력해주세요.(1.계좌개설 2.계좌조회 3.입금 4.출금 5.송금)");
//            int number = Integer.parseInt(sc.nextLine());
//
//            if (number==1){ //1.계좌개설
//                System.out.println("이름/계좌번호/초기금액");
//                String name = sc.nextLine();
//                String accountNumber = sc.nextLine();
//                long balance = Long.parseLong(sc.nextLine());
//
//                if (name.isEmpty() || accountNumber.isEmpty()){
//                    System.out.println("이름/계좌번호를 입력 하지 않았습니다.");
//                    continue;
//                }
//                if (balance<0){
//                    System.out.println("초기금액을 0이상 입력해주세요.");
//                    continue;
//                }
//                if (map.containsKey(accountNumber)){
//                    System.out.println("이미 존재하는 계좌번호입니다.");
//                    continue;
//                }
//                BankAccount bank = new BankAccount(name, accountNumber, balance);
//                map.put(accountNumber, bank);
//                System.out.println("계좌개설완료");
//
//            } else if (number==2) { //2.계좌조회
//                System.out.println("계좌번호를 입력해주세요,");
//                String accountNumber = sc.nextLine();
//                BankAccount account = map.get(accountNumber);
//
//                if (account==null){
//                    System.out.println("존재하지 않는 계좌입니다.");
//                    continue;
//                }
//                System.out.println("이름:"+account.getName()+" 계좌"+account.getAccountNumber()+" 잔고"+account.getBalance());
//
//            } else if (number==3) { //3.입금
//                System.out.println("입금계좌를 입력하세요.");
//                String accountNumber = sc.nextLine();
//                BankAccount account = map.get(accountNumber);
//
//                if (account==null){
//                    System.out.println("존재하지 않는 계좌입니다.");
//                    continue;
//                }
//                System.out.println("입금하실 금액을 입력해주세요.");
//                long money = Long.parseLong(sc.nextLine());
//                if (money<0){
//                    System.out.println("입금액은 0원 이상이어야합니다.");
//                    continue;
//                }
//                long before = account.getBalance();
//                account.setBalance(before+money);
//                long after = account.getBalance();
//                System.out.println("입금전"+before);
//                System.out.println("입금후"+after);
//
//            } else if (number==4) { //4.출금
//                System.out.println("출금계좌를 입력하세요.");
//                String accountNumber = sc.nextLine();
//                BankAccount account = map.get(accountNumber);
//
//                if (account==null){
//                    System.out.println("존재하지 않는 계좌입니다.");
//                    continue;
//                }
//                System.out.println("출금금액을 입력하세요");
//                long money = Long.parseLong(sc.nextLine());
//
//                if (money<0){
//                    System.out.println("금액은 0원 이상이어야합니다.");
//                    continue;
//                }
//                long before = account.getBalance();
//                if (before<money){
//                    System.out.println("잔액이 부족합니다.");
//                    continue;
//                }
//                account.setBalance(before-money);
//                long after = account.getBalance();
//                System.out.println("출금후 잔액"+after);
//
//            } else if (number==5) { //5.송금
//                System.out.println("송금계좌 입력하시오.");
//                String
//
//            }
//        }
//    }
//}
//class BankAccount{
//    private Long id;
//    private String name;
//    private String accountNumber;
//    private long balance;
//    private static long staticId;
//
//    public BankAccount(String name, String accountNumber, long balance){
//        staticId++;
//        this.id=staticId;
//        this.name=name;
//        this.accountNumber=accountNumber;
//        this.balance=balance;
//    }
//    public Long getId() {
//        return id;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//    public long getBalance() {
//        return balance;
//    }
//    public void setBalance(long balance) {
//        this.balance = balance;
//    }
//    @Override
//    public String toString() {
//        return "{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//    // 5.송금
//    public void transfer(BankAccount targetBankAccount, long money){
//        if (this.balance<money){
//            return;
//        }
//        if (this.balance>=money){
//            this.balance-=money;
//            targetBankAccount.balance+=money;
//        }
//    }
//}