package hcmute.spkt.leduytuong19110065.foodygroup09;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    TextView txtAlreadyAccount;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtAlreadyAccount = (TextView) findViewById(R.id.txt_already_account);

        txtAlreadyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent switchActivityIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(switchActivityIntent);
            }
        });

    }
}
