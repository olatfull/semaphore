package olatfull;

import java.util.List;
import java.lang.Thread;


/**
 * 
 */
public class LightTraffic2 {

    public void doProcess(List<Light> lights) {

        for(Light light: lights) {
            System.out.println("Горит " +light.getColor()+ " длительность в секундах " + light.getDuration());
            //System.out.println("eee");

        try {
            Thread.sleep(light.getDuration()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        //System.out.println("out");
     }//method
}//class
