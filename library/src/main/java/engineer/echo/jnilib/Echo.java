package engineer.echo.jnilib;

import android.support.annotation.Keep;

/**
 * Echo.java.java
 * Info: Echo.java
 * Created by Plucky<plucky@echo.engineer> on 2018/7/29 - 13:41
 * More about me: http://www.1991th.com
 */
@Keep
public class Echo {
    static {
        System.loadLibrary("echo");
    }

    public native static int vercode();
}
