package bisrihanafi.gmail.meteranmudik;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService  extends Service {
    Thread my;
    public MyService() {

    }
    @Override
    public void onCreate() {

        my=new Thread(){
            @Override
            public  void  run(){
                for (int i=0;true;i++){
                    System.out.println("Nilai i "+i+"   ");
                    try {
                        Thread.sleep(400);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

    }
    @Override
    public void onDestroy() {
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(my.isAlive()==false)
            my.start();
        return  START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
