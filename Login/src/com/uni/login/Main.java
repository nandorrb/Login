package com.uni.login;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Main extends Activity {

   /* @Override
   /*public void onCreate(Bundle savedInstanceState)
    {
    	final EditText txtUsername;
    	final EditText txtPass;
    	final Button btnLogin;
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        txtUsername = (EditText)this.findViewById(R.id.txtUsername);
        txtPass = (EditText)this.findViewById(R.id.txtPass);
        btnLogin = (Button)this.findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                validar(txtUsername.getText().toString(), txtPass.getText().toString());
            }
        });
    }
    private boolean validar(String username, String pass){
         Comprobamos que no venga alguno en blanco. 
        if (!username.equals("") && !pass.equals("")){
             Creamos el objeto cliente que realiza la petici�n al servidor 
            HttpClient cliente = new DefaultHttpClient();
             Definimos la ruta al servidor. En mi caso, es un servlet. 
            HttpPost post = new HttpPost("http://192.168.0.142:8080/marcoWeb/Login");

            try{
                 Defino los par�metros que enviar�. Primero el nombre del par�metro, seguido por el valor. Es lo mismo que hacer un
                 http://192.168.0.142:8080/marcoWeb/Login?username=mario&pass=maritoPass&convertir=no 
                List<NameValuePair> nvp = new ArrayList<NameValuePair>(2);
                nvp.add(new BasicNameValuePair("username", username));
                 Encripto la contrase�a en MD5. Definici�n m�s abajo 
                nvp.add(new BasicNameValuePair("pass", toMd5(pass)));
                nvp.add(new BasicNameValuePair("convertir", "no"));
                 Agrego los par�metros a la petici�n 
                post.setEntity(new UrlEncodedFormEntity(nvp));
                 Ejecuto la petici�n, y guardo la respuesta 
                HttpResponse respuesta = cliente.execute(post);

                try{
                     Traspaso la respuesta del servidor (que viene como JSON) a la instancia de JSONObject en job.
                     /* Definici�n de inputStreamToString() m�s abajo. 
                    JSONObject job = new JSONObject(this.inputStreamToString(respuesta.getEntity().getContent()).toString());
                     Nuevo objeto, que contiene el valor para mensaje (definido en el JSON que crea el servidor 
                    JSONObject mensaje = job.getJSONObject("mensaje");
                     Muestro la respuesta 
                    Toast.makeText(Login.this, mensaje.getString("Estado"), Toast.LENGTH_LONG).show();
                     Abajo todas los exceptions que pueden ocurrir. Se imprimen en el log 
                    return true;
                }catch(JSONException ex){
                    Log.w("Aviso", ex.toString());
                    return false;
                }
            }catch(ClientProtocolException ex){
                Log.w("ClientProtocolException", ex.toString());
                return false;
            }catch(UnsupportedEncodingException ex){
                Log.w("UnsupportedEncodingException", ex.toString());
                return false;
            }catch(IOException ex){
                Log.w("IOException", ex.toString());
                return false;
            }
            catch(IllegalStateException ex){
                Log.w("IOException", ex.toString());
                return false;
            }
        }else{
            Toast.makeText(Login.this, "Campo vac'io !",
                            Toast.LENGTH_LONG).show();
            return false;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
}
