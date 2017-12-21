package me.phit.creeperhostpinger;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        while (true)
        {
            Map send = new HashMap<String, String>();

            send.put("ip", "stonebound.net");
            send.put("name", "Stonebound Community [Whitelist]");
            send.put("projectid", "283861");
            send.put("port", "25565");

            Util.putWebResponse("https://api.creeper.host/serverlist/update", new Gson().toJson(send), true, true);

            try
            {
                Thread.sleep(120000);
            }
            catch (InterruptedException e)
            {
                // meh
            }
        }
    }

}
