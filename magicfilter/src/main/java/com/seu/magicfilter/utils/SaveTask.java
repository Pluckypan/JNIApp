package com.seu.magicfilter.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveTask extends AsyncTask<Bitmap, Integer, String>{
	
	private onPictureSaveListener mListener;
	private Context mContext;
	private File mFile;
	public SaveTask(Context context, File file, onPictureSaveListener listener){
		this.mContext = context;
		this.mListener = listener;
		this.mFile = file;
	}
	
	@Override
	protected void onPreExecute() {
		super.onPreExecute();
	}

	@Override
	protected void onPostExecute(final String result) {
		if(result != null)
			MediaScannerConnection.scanFile(mContext,
	                new String[] {result}, null,
	                new MediaScannerConnection.OnScanCompletedListener() {
	                    @Override
	                    public void onScanCompleted(final String path, final Uri uri) {
	                        if (mListener != null) 
	                        	mListener.onSaved(result);                      
	                    }
            	});
	}

	@Override
	protected String doInBackground(Bitmap... params) {
		if(mFile == null)
			return null;
		return saveBitmap(params[0]);
	}
	
	private String saveBitmap(Bitmap bitmap) {
		if (mFile.exists()) {
			mFile.delete();
		}
		try {
			FileOutputStream out = new FileOutputStream(mFile);
			bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);
			out.flush();
			out.close();
			bitmap.recycle();
			return mFile.toString();
		} catch (FileNotFoundException e) {
		   e.printStackTrace();
		} catch (IOException e) {
		   e.printStackTrace();
		}
		return null;
	}
	
	public interface onPictureSaveListener{
		void onSaved(String result);
	}
}
