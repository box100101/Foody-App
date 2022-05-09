package hcmute.spkt.leduytuong19110065.foodygroup09;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryDetailActivity extends AppCompatActivity {

    TextView btnBackToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_detail);


        btnBackToHome = (TextView) findViewById(R.id.btn_back_home);
        btnBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryDetailActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(CategoryDetailActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
