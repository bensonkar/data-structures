package main;

import java.util.Date;
import java.util.UUID;

/**
 * @author bkariuki
 */
public interface AlertDao {
    public UUID addAlert(Date time);
    public Date getAlert(UUID uuid);
}
