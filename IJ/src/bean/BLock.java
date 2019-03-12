package bean;

import java.util.List;
/**
 * 区块结构
 * @author huangxl
 */
public class BLock {

    /**
     * 区块索引号
     */
    private int index;
    /**
     * 区块哈希值
     */
    private String hash;
    /**
     * 生成区块的时间戳
     */
    private long timestamp;
    /**
     * 区块交易的集合
     *
     */
    private List<Transaction> transactions;
    /**
     * 随机数，来实现工作量证明
     */
    private int nonce;
    /**
     * 前一个区块的哈希值
     */
    private String previousHash;

    public BLock() {

    }

    public BLock(int index, long timestamp, List<Transaction> transactions, int nonce, String previousHash, String hash) {
        this.index = index;
        this.hash = hash;
        this.timestamp = timestamp;
        this.transactions = transactions;
        this.nonce = nonce;
        this.previousHash = previousHash;
    }

    public int getIndex() {
        return index;
    }

    public String getHash() {
        return hash;
    }
}
