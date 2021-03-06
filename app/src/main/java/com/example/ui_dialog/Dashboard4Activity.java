package com.example.ui_dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Dashboard4Activity extends AppCompatActivity {
    com.github.loadingview.LoadingView loading_view;
    TextView checkBalance;
    private static int SPLASH_TIME_OUT = 500;
    GridView gvMenu;
    ArrayList<MenuModel> list= new ArrayList<>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard4); getSupportActionBar().setElevation(0);

        checkBalance=findViewById(R.id.checkBalance);
        loading_view=findViewById(R.id.loading_view);
        gvMenu = (GridView) findViewById(R.id.gvMenu) ;

        menuView();
        checkBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loading_view.start();
                checkBalance.setText("Loading");
                new Handler().postDelayed(new Runnable() {

                    /*
                     * Showing splash screen with a timer. This will be useful when you
                     * want to show case your app logo / company
                     */

                    @Override
                    public void run() {
                        loading_view.stop();
                        loading_view.setVisibility(View.GONE);
                        checkBalance.setText("Your Balance is 10tk");
                        // This method will be executed once the timer is over
                        // Start your app main activity
                        // close this activity
                        //finish();
                    }
                }, SPLASH_TIME_OUT);


            }
        });
    }

    private void menuView() {
        list.clear();
        list.add(new MenuModel("A/C Balance", R.drawable.n_money, "ACBAL"));
        list.add(new MenuModel("A/C Statement", R.drawable.n_accountstatement, "ACBAL"));
        list.add(new MenuModel("Fund Transfer", R.drawable.n_transfer, "ACSTMT"));
        list.add(new MenuModel("Standing Ins", R.drawable.n_email, "ACSTMT"));
        list.add(new MenuModel("Mobile Recharge", R.drawable.n_mobile, "FTHOME"));
        list.add(new MenuModel("Bill Pay", R.drawable.n_bill, "STINS"));
        list.add(new MenuModel("Stop Cheque", R.drawable.n_stop, "STINS"));
        list.add(new MenuModel("Cheque Status", R.drawable.n_search2, "STINS"));
        list.add(new MenuModel("Ecommerce", R.drawable.n_shopping, "STINS"));
        list.add(new MenuModel("bKash", R.drawable.bkash, "STINS"));
        list.add(new MenuModel("Payoneer Payment", R.drawable.payonner, "STINS"));
        list.add(new MenuModel("Credit Card", R.drawable.credit, "STINS"));

        MenuAdapter adapter = new MenuAdapter(this, list);
        gvMenu.setAdapter(adapter);

        gvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pstion, long l) {
                TextView menu_soft_code = (TextView) view.findViewById(R.id.menu_soft_code);
                TextView menu_name = (TextView) view.findViewById(R.id.menu_name);

                if("ACBAL".equals(menu_soft_code.getText().toString())){
                    Intent intent = new Intent(Dashboard4Activity.this, Dashboard4Activity.class);
                    //startActivity(intent);

                }else if("ACSTMT".equals(menu_soft_code.getText().toString())){
                    Intent intent = new Intent(Dashboard4Activity.this, Dashboard4Activity.class);
                    //startActivity(intent);
                }else if("FTHOME".equals(menu_soft_code.getText().toString())){
                    Intent intent = new Intent(Dashboard4Activity.this, Dashboard4Activity.class);
                    //startActivity(intent);
                }else if("STINS".equals(menu_soft_code.getText().toString())){
                    Intent intent = new Intent(Dashboard4Activity.this, Dashboard4Activity.class);
                    //startActivity(intent);
                }


            }
        });
    }
    public class MenuAdapter extends ArrayAdapter<MenuModel> {

        // View lookup cache

        private  class ViewHolder {

            ImageView menu_icon;
            TextView menu_name;
            TextView menu_soft_code ;


        }



        public MenuAdapter(Context context, ArrayList<MenuModel> welcomeMenuModels) {

            super(context, R.layout.row_grideview_menu, welcomeMenuModels);

        }



        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

            // Get the data item for this position

            MenuModel model = getItem(position);

            Dashboard4Activity.MenuAdapter.ViewHolder viewHolder; // view lookup cache stored in tag

            if (convertView == null) {

                viewHolder = new Dashboard4Activity.MenuAdapter.ViewHolder();

                LayoutInflater inflater = LayoutInflater.from(getContext());

                convertView = inflater.inflate(R.layout.row_grideview_menu, parent, false);

                viewHolder.menu_icon = (ImageView) convertView.findViewById(R.id.menu_icon);
                viewHolder.menu_name = (TextView) convertView.findViewById(R.id.menu_name);
                viewHolder.menu_soft_code = (TextView) convertView.findViewById(R.id.menu_soft_code);


                convertView.setTag(viewHolder);

            } else {

                viewHolder = (Dashboard4Activity.MenuAdapter.ViewHolder) convertView.getTag();

            }

            // Populate the data into the template view using the data object

            viewHolder.menu_icon.setImageResource(model.getImageId());


            viewHolder.menu_name.setText(model.getMenuName());


            viewHolder.menu_soft_code.setText(model.getSoftcode());



            return convertView;

        }

    }

}
