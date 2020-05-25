class StockSpanner {
    Stack<Integer> stk;
    Stack<Integer> wght;
    public StockSpanner() {
        stk=new Stack<>();
        wght=new Stack<>();
    }
    public int next(int price) {
        int weight=1;
        while(!stk.isEmpty()&&stk.peek()<=price){
            stk.pop();
            weight+=wght.pop();
        }
        stk.push(price);
        wght.push(weight);
        return wght.peek();
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */