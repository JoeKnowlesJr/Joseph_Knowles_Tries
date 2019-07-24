public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        trie.printAllKeys();
        System.out.println(trie.isPrefixValid("ca"));
        System.out.println(trie.isPrefixValid("cr"));
        System.out.println(trie.isWordValid("card"));
        System.out.println(trie.isWordValid("carriage"));
    }
}
