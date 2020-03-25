package estructuras;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.stream.Collectors;

public class Start
{
    public static void start()
    {
        final ArrayList<SystemInfo> systemInfoArrayList = new ArrayList<>();
        // Streameable
        final Collection<SystemInfo> systemInfoCollection = new ArrayList<>();

        SystemInfo.setInternetStatus("CONNECTED");

        SystemInfo laptopTrabajo = new SystemInfo();

        laptopTrabajo.setId("1");
        laptopTrabajo.setIp("1.0.0.1");
        laptopTrabajo.setCores(8);
        laptopTrabajo.setType(SystemInfo.TYPE.LAPTOP);

        SystemInfo laptopCasa = new SystemInfo();

        laptopCasa.setId("3");
        laptopCasa.setIp("100.0.3.10");
        laptopCasa.setCores(16);
        laptopCasa.setType(SystemInfo.TYPE.LAPTOP);


        // USO DE ARRAYLIST
        System.out.println("Array antes de ingresar: " + systemInfoArrayList.size());
        systemInfoArrayList.add(laptopCasa);
        systemInfoArrayList.add(laptopTrabajo);

        for (SystemInfo iterableVar : systemInfoArrayList)
        {
            System.out.println("For-each de IP: " + iterableVar.getIp());
        }

        System.out.println("Array despues de ingresar: " + systemInfoArrayList.size());


        // USO DE COLECCIONES
        System.out.println("------------------------------ USO DE COLECCIONES -------------------------");
        System.out.println("Array antes de ingresar: " + systemInfoCollection.size());
        systemInfoCollection.add(laptopCasa);
        systemInfoCollection.add(laptopTrabajo);

        for (SystemInfo iterableVar : systemInfoCollection)
        {
            if (iterableVar.getIp().endsWith("1"))
            {
                String newIpData = iterableVar.getIp().replace(".", "/.");
                System.out.println("For-each de IP: " + newIpData);
            }
        }

        systemInfoCollection.stream()

                .filter(s -> s.getIp().endsWith("1"))

                .map(s -> s.getIp().replace(".", "/."))

                .forEach(ip -> System.out.println("Lambda de IP: " + ip));

        System.out.println("Array despues de ingresar: " + systemInfoCollection.size());


        //System.out.println("Internet para el trabajo: " + laptopTrabajo.getInternetStatus());
        //System.out.println("Internet para el laptopCasa: " + laptopCasa.getInternetStatus());

        SystemInfo.setInternetStatus("NOT CONNECTED");

        //System.out.println("Internet para el trabajo: " + laptopTrabajo.getInternetStatus());
        //System.out.println("Internet para el laptopCasa: " + laptopCasa.getInternetStatus());
    }
}
