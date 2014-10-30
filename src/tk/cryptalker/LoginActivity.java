package tk.cryptalker;

import android.os.Bundle;

public class LoginActivity extends AbstractActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        context = getApplicationContext();

        makeLayout(R.layout.activity_login, R.string.login_header_title);

        attachPageChange(R.id.go_register, CreateAccountActivity.class);
    }
}
