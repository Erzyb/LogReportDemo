package aprivate.zyb.com.logreportdemo.LogReport.save.imp;


import aprivate.zyb.com.logreportdemo.LogReport.LogReport;
import aprivate.zyb.com.logreportdemo.LogReport.save.ISave;
import aprivate.zyb.com.logreportdemo.LogReport.util.LogUtil;

/**
 * 用于写入Log到本地
 */
public class LogWriter {
    private static LogWriter mLogWriter;
    private static ISave mSave;

    private LogWriter() {
    }


    public static LogWriter getInstance() {
        if (mLogWriter == null) {
            synchronized (LogReport.class) {
                if (mLogWriter == null) {
                    mLogWriter = new LogWriter();
                }
            }
        }
        return mLogWriter;
    }


    public LogWriter init(ISave save) {
        mSave = save;
        return this;
    }

    public static void writeLog(String tag, String content) {
        mSave.writeLog(tag, content);
    }
}