class bankDetail {
    String Name;
    long AccNo;
    int Balance;
    String IFSC;

    bankDetail(String n, long a, int b, String i){
        Name = n;
        this.AccNo = a;
        this.Balance = b;
        this.IFSC = i;
    }

    void show(){
        System.out.println("Name:" + Name);
        System.out.println("Acc NO:" + AccNo);
        System.out.println("Balance:" + Balance);

    }
}

public class BankManagement {

    public static void main(String[] args) {
        bankDetail bank = new bankDetail("Salman", 123456789, 500, "BOBSUNCOI");
        
        bank.show();

    }
}