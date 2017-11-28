package devsupport.ai.flowpeach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

public class PeachCallback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peach_callback);
        Intent intent = getIntent();
        String schema = intent.getScheme();
        if (TextUtils.equals(schema, "devsupport")) {
            String checkoutId = intent.getData().getQueryParameter("id");
            String data = intent.getData().toString();
            Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG)
                    .show();
        }
    }

}
