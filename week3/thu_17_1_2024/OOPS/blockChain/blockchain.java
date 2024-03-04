package blockChain;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class blockchain {

    public static class Block {
        public int index;
        public long timestamp;
        public String data;
        public String previousHash;
        public String hash;

        public Block(int index, long timestamp, String data, String previousHash) {
            this.index = index;
            this.timestamp = timestamp;
            this.data = data;
            this.previousHash = previousHash;
            this.hash = calculateHash();
        }

        public String calculateHash() {
            try {
                String input = index + Long.toString(timestamp) + data + previousHash;
                MessageDigest digest = MessageDigest.getInstance("SHA-256");        
                byte[] hash = digest.digest(input.getBytes("UTF-8"));
                StringBuilder hexString = new StringBuilder();

                for (byte b : hash) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }

                return hexString.toString();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class Blockchain {
        private List<Block> chain;

        public Blockchain() {
            this.chain = new ArrayList<>();
           
            chain.add(new Block(0, System.currentTimeMillis(), "Genesis Block", "0"));
        }

        public void addBlock(Block block) {
            Block lastBlock = chain.get(chain.size() - 1);
            block.previousHash = lastBlock.hash;
            block.hash = block.calculateHash();
            chain.add(block);
        }

        public boolean isValid() {
            for (int i = 1; i < chain.size(); i++) {
                Block currentBlock = chain.get(i);
                Block previousBlock = chain.get(i - 1);

                if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                    return false;
                }

                if (!currentBlock.previousHash.equals(previousBlock.hash)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (Block block : chain) {
                builder.append("Block #").append(block.index).append(" [")
                        .append("Previous Hash: ").append(block.previousHash).append(", ")
                        .append("Hash: ").append(block.hash).append(", ")
                        .append("Timestamp: ").append(block.timestamp).append(", ")
                        .append("Data: ").append(block.data).append("]\n");
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        Blockchain myBlockchain = new Blockchain();

        myBlockchain.addBlock(new Block(1, System.currentTimeMillis(), "Block 1", myBlockchain.chain.get(myBlockchain.chain.size() - 1).hash));
        myBlockchain.addBlock(new Block(2, System.currentTimeMillis(), "Block 2", myBlockchain.chain.get(myBlockchain.chain.size() - 1).hash));

        System.out.println("Blockchain valid? " + myBlockchain.isValid());
        System.out.println("Blockchain: ");
        System.out.println(myBlockchain);
    }
}
