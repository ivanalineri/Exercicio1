package br.com.digitalhouse.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String nome;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView mNome = findViewById(R.id.edit_text_nome);
        final TextView mEmail = findViewById(R.id.edit_text_email);
        Button mBotao = findViewById(R.id.botao);

        mBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = mNome.getText().toString();
                email = mEmail.getText().toString();

                if(nome.isEmpty()){
                    mNome.setError("O nome não pode ser vazio");
                    return;
                }else{
                    mNome.setError(null);
                }
                if(email.isEmpty()){
                    mEmail.setError("O e-mail não pode ser vazio");
                    return;
                }else {
                    mEmail.setError(null);
                }

                Toast.makeText(MainActivity.this,"Dados ok",Toast.LENGTH_LONG).show();






            }
        });
    }
}
