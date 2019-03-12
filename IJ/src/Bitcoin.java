import bean.BLock;
import bean.Transaction;
import util.CryptoUtil;

import java.util.ArrayList;
import java.util.List;

public class Bitcoin {
    /**
     * @param args
     */
    public static void main(String[] args){
        List<Transaction> txs = new ArrayList<>();
        mineBlock(null,txs,"myWalletAddress");

    }
    /**
     * 挖矿函数
     */
    public static BLock mineBlock(BLock latestBlock, List<Transaction> txs,
                                 String address){
//        System.out.println(txs.toString());
        // 区块奖励的交易
        Transaction reward = new Transaction("0001","","myWalletAddress",50.0);
        txs.add(reward);
        // 获取前一区块的hash和区块高度
//        String previousHash = latestBlock.getHash();
//        int height = latestBlock.getIndex();
        // 计算随机数
        int nonce = 0;
        String hash;
        System.out.println(""+txs);
        while(true){
            hash = CryptoUtil.SHA256(""+txs+nonce);
            if(hash.startsWith("00000")){
                break;
            }
            nonce++;
        }
        BLock block = new BLock(1,System.currentTimeMillis(),
                txs,nonce,"",hash);
        System.out.println("随机数为"+nonce+",hash:"+hash);
        System.out.println(txs.toString());
        return block;
    }
}
