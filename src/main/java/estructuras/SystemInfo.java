package estructuras;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SystemInfo
{
    @Setter
    @Getter
    private static String internetStatus;
    private TYPE type;
    private String id;
    private String ip;
    private int cores;

    public enum TYPE
    {
        LAPTOP, PC
    }

    public void changeCores(int pcStatus)
    {
        if (pcStatus == Status.STARTED)
        {
            cores = 8;
        }
        else if (pcStatus == 2)
        {
            cores = cores + 1;
        }
        else if (pcStatus == 3)
        {
            cores = 0;
        }
    }
}
