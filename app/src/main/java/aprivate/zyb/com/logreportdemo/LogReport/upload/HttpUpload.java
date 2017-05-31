package aprivate.zyb.com.logreportdemo.LogReport.upload;

import android.content.Context;

import java.io.File;

/**
 * Created by zhouyibo on 2017/5/31.
 */

public class HttpUpload extends BaseUpload {
    public HttpUpload(Context context) {
        super(context);
    }

    @Override
    protected void sendReport(String title, String body, File file, OnUploadFinishedListener onUploadFinishedListener) {
        //自定义上传方式
    }
}
