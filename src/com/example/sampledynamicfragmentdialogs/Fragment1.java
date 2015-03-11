package com.example.sampledynamicfragmentdialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment{
	private Button bt1,bt2,bt3,bt4,bt5;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment1, null);
		return view;
	}
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		bt1 = (Button) getView().findViewById(R.id.b1);
		bt2 = (Button) getView().findViewById(R.id.b2);
		bt3 = (Button) getView().findViewById(R.id.b3);
		bt4 = (Button) getView().findViewById(R.id.b4);
		bt5 = (Button) getView().findViewById(R.id.b5);

		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				alertDialog();
			}
		});

		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				progressDialogSpinner();
			}
		});

		bt3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				progressDialogHorizontal();
			}
		});

		bt4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				customDialog();
			}
		});
		bt5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Fragment2 fragment = new Fragment2();
				FragmentManager fm = getFragmentManager();
				fragment.show(fm, "");
			}
		});
	}



	public void alertDialog(){
		//AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle("XYZ");
		builder.setMessage("Do you want to close this dialog?");
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				//write positive snippet

			}
		});

		builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				// negitive snippet

				dialog.dismiss();
			}
		});

		builder.show();

	}
	public void progressDialogSpinner(){  

		//ProgressDialog dialog = new ProgressDialog(getActivity());
		ProgressDialog dialog = new ProgressDialog(getActivity());
		dialog.setTitle("XYZ");
		dialog.setMessage("Loading.....");
		dialog.show();

	}
	public void progressDialogHorizontal(){
		ProgressDialog dialog = new ProgressDialog(getActivity());
		dialog.setTitle("XYZ");
		dialog.setMessage("Loading.....");
		dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		dialog.show();
	}
	public void customDialog(){


		Dialog dialog = new Dialog(getActivity());
		dialog.setContentView(R.layout.custom_dialog);
		dialog.setTitle("MyAplication");
		dialog.show();

		Button btPositive = (Button) dialog.findViewById(R.id.positive);
		btPositive.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// write positive snippet
			}
		});

		Button btNegative = (Button) dialog.findViewById(R.id.negative);
		btNegative.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// negative snippet
			}
		});


	}

}


	