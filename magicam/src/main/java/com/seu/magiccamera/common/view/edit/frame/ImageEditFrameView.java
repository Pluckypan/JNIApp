package com.seu.magiccamera.common.view.edit.frame;

import android.content.Context;
import android.content.DialogInterface;

import com.seu.magiccamera.common.view.edit.ImageEditFragment;
import com.seu.magicfilter.display.MagicImageDisplay;

public class ImageEditFrameView extends ImageEditFragment{

	public ImageEditFrameView(Context context, MagicImageDisplay magicDisplay) {
		super(context, magicDisplay);

	}

	@Override
	protected boolean isChanged() {
		return false;
	}

	@Override
	protected void onDialogButtonClick(DialogInterface dialog) {
		
	}
}
