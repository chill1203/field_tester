package com.example.fieldtester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainScreenActivity extends Activity{
	
	ImageButton btnViewProducts;
	ImageButton btnNewProduct;
	Button btnViewArticles;
	ImageButton btnMyList;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);
		
		// Buttons
		btnViewProducts = (ImageButton) findViewById(R.id.btnViewProducts);
		btnNewProduct = (ImageButton) findViewById(R.id.btnCreateProduct);
		btnViewArticles = (Button) findViewById(R.id.btnViewArticles);
		btnMyList = (ImageButton) findViewById(R.id.mylistIcon);
		
		// view products click event
		btnViewArticles.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching All products Activity
				Intent i = new Intent(getApplicationContext(), AllArticlesActivity.class);
				startActivity(i);
				
			}
		});

		btnViewProducts.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching All products Activity
				Intent i = new Intent(getApplicationContext(), AllProductsActivity.class);
				startActivity(i);

			}
		});
		
		// view products click event
		btnNewProduct.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching create new product activity
				Intent i = new Intent(getApplicationContext(), NewProductActivity.class);
				startActivity(i);
				
			}
		});

		/*
		btnMyList.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching create new product activity
				Intent i = new Intent(getApplicationContext(), MyList.class);
				startActivity(i);

			}
		});*/
	}
}
