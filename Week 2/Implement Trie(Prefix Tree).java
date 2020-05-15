class Trie {
    private class Node{
        char data;
        HashMap<Character,Node> children;
        boolean isTerminal;
        Node(char data,boolean isTerminal){
            this.data=data;
            this.isTerminal=isTerminal;
            children=new HashMap<>();
        }
    }
    Node root;
    int numWords;

    /** Initialize your data structure here. */
    public Trie() {
        root=new Node('\0',false);
        numWords=0;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        this.insert(this.root,word);
    }
    private void insert(Node parent,String word){
        if(word.length()==0){
            if(parent.isTerminal){
                //Word already present
            }else{
                parent.isTerminal=true;
                numWords++;
            }
            return;
        }
        char cc=word.charAt(0);
        String ros=word.substring(1);
        Node child=parent.children.get(cc);
        if(child==null){
            child=new Node(cc,false);
            parent.children.put(cc,child);
        }
        this.insert(child,ros);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return this.search(this.root,word);
    }
    private boolean search(Node parent,String word){
        if(word.length()==0){
            if(parent.isTerminal){
                return true;
            }
            return false;
        }
        char cc=word.charAt(0);
        String ros=word.substring(1);
        Node child=parent.children.get(cc);
        if(child==null){
            return false;
        }
        return this.search(child,ros);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return this.startsWith(this.root,prefix);
    }
    private boolean startsWith(Node parent,String prefix){
        if(prefix.length()==0){
            return true;
        }
        char cc=prefix.charAt(0);
        String ros=prefix.substring(1);
        Node child=parent.children.get(cc);
        if(child==null){
            return false;
        }
        return this.startsWith(child,ros);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */