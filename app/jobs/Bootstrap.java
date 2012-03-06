package jobs;

import play.jobs.Job;
import play.jobs.OnApplicationStart;
import utils.DataLoader;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 12-3-5
 * Time: 下午7:53
 * To change this template use File | Settings | File Templates.
 */
@OnApplicationStart
public class Bootstrap extends Job{

    @Override
    public void doJob() throws Exception {
        DataLoader.refreshDB();
    }
}
