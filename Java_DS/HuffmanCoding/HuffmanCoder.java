package HuffmanCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HuffmanCoder {

    private HashMap<Character, String> encoder;
    private HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {

        // Frequency Map
        HashMap<Character, Integer> fmap = new HashMap<>();

        for (int i = 0; i < feeder.length(); i++) {
            char ch = feeder.charAt(i);

            if (fmap.containsKey(ch)) {
                fmap.put(ch, fmap.get(ch) + 1);
            } else {
                fmap.put(ch, 1);
            }
        }

        // Min Heap
        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.add(node);
        }

        while (minHeap.size() > 1) {

            Node first = minHeap.poll();
            Node second = minHeap.poll();

            Node merged = new Node('\0', first.cost + second.cost);
            merged.left = first;
            merged.right = second;

            minHeap.add(merged);
        }

        Node root = minHeap.poll();

        encoder = new HashMap<>();
        decoder = new HashMap<>();

        initEncoderDecoder(root, "");
    }

    private void initEncoderDecoder(Node node, String code) {

        if (node == null) {
            return;
        }

        // Leaf node
        if (node.left == null && node.right == null) {
            encoder.put(node.data, code);
            decoder.put(code, node.data);
            return;
        }

        initEncoderDecoder(node.left, code + "0");
        initEncoderDecoder(node.right, code + "1");
    }

    public String encode(String str) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            ans.append(encoder.get(str.charAt(i)));
        }

        return ans.toString();
    }

    public String decode(String codedString) {

        StringBuilder ans = new StringBuilder();
        String key = "";

        for (int i = 0; i < codedString.length(); i++) {

            key += codedString.charAt(i);

            if (decoder.containsKey(key)) {
                ans.append(decoder.get(key));
                key = "";
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) throws Exception {

        String str = "abbccda";

        HuffmanCoder hf = new HuffmanCoder(str);

        String encoded = hf.encode(str);
        System.out.println("Encoded : " + encoded);

        String decoded = hf.decode(encoded);
        System.out.println("Decoded : " + decoded);
    }
}