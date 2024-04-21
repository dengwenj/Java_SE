package dengwj.ww;

public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};
        // 前一块中的最大数据，小于后一块中所有的数据块内无序，块间有序）
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blocks = {b1, b2, b3};

        int index = getIndex(arr, blocks, 12);
        System.out.println(index);
    }

    public static int getIndex(int[] arr, Block[] blocks, int num) {
        // 先确定要查找的元素在哪一块，然后在块内挨个查找
        int blockIndex = getBlockIndex(blocks, num);
        Block block = blocks[blockIndex];

        if (blockIndex == -1) {
            return -1;
        }

        for (int i = block.getStartIndex(); i <= block.getEndIndex(); i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static int getBlockIndex(Block[] blocks, int num) {
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].getMax() > num) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
