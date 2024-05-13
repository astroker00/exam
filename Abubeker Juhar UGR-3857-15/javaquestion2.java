public classs Stack{
    private int maxsize;
    private int[] stackArray;
    private int top;
    public Stack(int size){
        maxsize=size;
        stackArray=new int[maxSize];
        top=-1;
    }
    public void push(int element){
        if(!isFull()){
            numArray[++top]=element;
            size++;

        }
        else{
            System.out.println("Full");
        }
        public int pop(){
            if(!isEmoty()){
                int data = numArray[top--];
                size--;
                return data;
            }
            return -1;
        }
        public booolean isEmpty(){
            return size == 0;
        }
        public boolean isFull(){
            return size== stackArray.length;
        }
        public int peek(){
            if(top>=0){
                return stackArray[top];
            }
            return -1;
        }
        public static void main(String[]args){
            Stack numStack = new Stack(5);
            numStack.push(11);
            numStack.push(22);
            numStack.push(44);
            numStack.push(55);
            numStack.pop();
            numStack.pop();
            for(int i=0;i<numStack.size;i++){
                System.out.println(numStack.stackArray[i]);
            }
        }
    }
}