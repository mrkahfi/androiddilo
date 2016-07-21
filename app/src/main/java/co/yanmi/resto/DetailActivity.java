package co.yanmi.resto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, LoginActivity.class));
        Toast.makeText(this, "ini pesan", Toast.LENGTH_LONG).show();
    }

    public void setName(String name) {
        this.name = name;
        //abcdefghijkl
    }
}
