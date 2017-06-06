import olatfull.Light;
import olatfull.LightTraffic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by javaNoob on 06.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Runner runner = new Runner();
        //runner.start();
        int time=0;
        List<Light> lights = new ArrayList<Light>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LightTraffic2 lightTraffic2 = new LightTraffic2();
        System.out.println("Длительность зелёного ....");

        try {
            time = Integer.parseInt(reader.readLine());
            if(time <=0){
                System.err.println("Длительность должна быть больше нуля ");
                throw new NumberFormatException();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

          lights.add(new Light("зелёный",time))  ;

        //input for yeloww
        System.out.println("Длительность желтого ....");

        try {
            time = Integer.parseInt(reader.readLine());
            if(time <=0){
                System.err.println("Длительность должна быть больше нуля ");
                throw new NumberFormatException();

            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        lights.add(new Light("жёлтый",time))  ;

//input for red
        System.out.println("Длительность красного ....");

        try {
            time = Integer.parseInt(reader.readLine());
            if(time <=0){
                System.err.println("Длительность должна быть больше нуля ");
                throw new NumberFormatException();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        lights.add(new Light("красный",time))  ;

        lightTraffic2.doProcess(lights);


    }//main

}//class
