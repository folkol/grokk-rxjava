public class MousePos {
    interface Observer {
        void onNext(Object o);
    }

    public static void main(String[] args) throws InterruptedException {
//        class Observable {
//            private Timer timer = new Timer(true);
//            private Collection<Observer> observers = new ArrayList<>();
//            private int i;
//
//            public Observable() {
//                TimerTask task = new TimerTask() {
//                    @Override
//                    public void run() {
//                        i++;
//                        for (Observer o : observers) {
//                            o.onNext(i);
//                        }
//                    }
//                };
//                timer.scheduleAtFixedRate(task, 0, 1000);
//            }
//
//            public void subscribe(Observer c) {
//                observers.add(c);
//            }
//        }
//
//        Observable observable = new Observable();
//        observable.subscribe(System.out::println);
//        Thread.sleep(10000);

        Observable.empty()
    }
}
