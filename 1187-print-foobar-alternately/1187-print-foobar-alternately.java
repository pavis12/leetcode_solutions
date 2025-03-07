class FooBar {
    private int n;
    boolean f=true;

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
            while(!f){
                wait();
            }
        	printFoo.run();
            f=false;
            notify();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
            while(f){
                wait();
            }
        	printBar.run();
            f=true;
            notify();
        }
    }
}