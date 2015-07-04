package br.java.android.lab06;

import android.view.View;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * @author Wallace Rodrigues
 *
 */
public class AdaptadorImagens extends BaseAdapter {
	
	int itensMinhaGaleria;
	Context contexto;
	
	private Integer[] minhasIdsImagem = {
			R.drawable.moto_01,
			R.drawable.moto_02,
			R.drawable.moto_03
	};
	
	public AdaptadorImagens(Context contextoParam){
		contexto = contextoParam;
		TypedArray atributos = contexto.obtainStyledAttributes(R.styleable.minhaGaleria);
		itensMinhaGaleria = atributos.getResourceId(
				R.styleable.minhaGaleria_android_galleryItemBackground,0);
		atributos.recycle();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return minhasIdsImagem.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView = new ImageView(contexto);
		
		imageView.setImageResource(minhasIdsImagem[position]);
		imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setBackgroundResource(itensMinhaGaleria);
		
		return imageView;
		
	}

}
