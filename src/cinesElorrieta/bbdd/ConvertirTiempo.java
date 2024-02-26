package cinesElorrieta.bbdd;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 
 * 
 */

public class ConvertirTiempo {

    public Timestamp convertirASqlDate(Date date) {

        Timestamp fechaSql = new Timestamp(date.getTime());
        
     
        return fechaSql;
    }

}
