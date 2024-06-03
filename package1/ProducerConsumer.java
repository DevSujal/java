class Item{
    int i;
    boolean bool = false;

    public synchronized void setItem(int i) throws InterruptedException{
        while(bool){
            wait();
        }
        this.i = i;
        bool = true;
        System.out.println("producer : " + i);
        notify();
    }

    public synchronized void getItem() throws InterruptedException{
        while(!bool){
            wait();
        }
        bool = false;
        System.out.println("consumer : " + i);
        notify();
    }
}

    class Producer extends Thread{
         private Item item;

         public Producer(Item item){
            this.item = item;
            Thread producer = new Thread(this, "producer");
            producer.start();
         }
         public void run(){
            int i = 0;
            while(true){
                try{
                    item.setItem(i++);
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
         }
    }
        class Consumer extends Thread{
         private Item item;

         public Consumer(Item item){
            this.item = item;
            Thread consumer = new Thread(this, "producer");
            consumer.start();
         }
         public void run(){
            while(true){
                try{
                    item.getItem();
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
         }
    }

    class Test{
        public static void main(String[] args) {
            Item item = new Item();
            new Producer(item);
            new Consumer(item);
        }
    }
K