package bean;

/**
 * 交易
 * @author huangxl
 */
public class Transaction {
    /**
     * 交易唯一标识
     */
    private String id;
    /**
     * 交易发送方钱包地址
     */
    private String sender;
    /**
     * 交易接收方钱包地址
     */
    private String recipient;
    /**
     * 交易金额
     */
    private double amount;

    public Transaction() {

    }

    public Transaction(String id, String sender, String recipient, double amount) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }
}
