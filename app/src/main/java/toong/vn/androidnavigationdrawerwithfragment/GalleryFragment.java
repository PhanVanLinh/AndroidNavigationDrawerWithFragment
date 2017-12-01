package toong.vn.androidnavigationdrawerwithfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by PhanVanLinh on 01/12/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class GalleryFragment extends Fragment{

    public static GalleryFragment newInstance() {
         Bundle args = new Bundle();
         GalleryFragment fragment = new GalleryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_galery, null, false);
        return rootView;
    }
}
