package hcmute.spkt.leduytuong19110065.foodygroup09;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import hcmute.spkt.leduytuong19110065.foodygroup09.R;

public class ShowDetailActivity extends AppCompatActivity {

    AppCompatButton btnAdd, btnMinus;
    TextView textQuantity, textPrice;
    int quantity = 1;
    String str_quantity="1";

    double price = 5.5;
    String str_price = "5.5";

    LinearLayout btnMoveToRestaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        textQuantity = (TextView) findViewById(R.id.txt_quantity);
        textQuantity.setText(str_quantity);

        textPrice = (TextView) findViewById(R.id.txt_price);
        textPrice.setText(str_price);

        btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuantityAndPrice(1);
            }
        });


        btnMinus = findViewById(R.id.btn_minus);
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity==1){
                    Toast.makeText(ShowDetailActivity.this, "Reaching limit", Toast.LENGTH_SHORT).show();
                }
                else {
                    updateQuantityAndPrice(0);
                }
            }
        });

        TextView btnBackHome = findViewById(R.id.btn_back_home);
        btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowDetailActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(ShowDetailActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
        });


        btnMoveToRestaurant = (LinearLayout) findViewById(R.id.btn_move_to_restaurant);
        btnMoveToRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowDetailActivity.this, RestaurantActivity.class);
                startActivity(intent);
            }
        });

    }

    private void updateQuantityAndPrice(int flag){
        if(flag==1)
        {
            quantity++;
            price += 5.5;
        }
        else {
            quantity--;
            price -= 5.5;
        }
        str_quantity = String.valueOf(quantity);
        textQuantity.setText(str_quantity);

        str_price = String.valueOf(price);
        textPrice.setText(str_price);
    }
}
