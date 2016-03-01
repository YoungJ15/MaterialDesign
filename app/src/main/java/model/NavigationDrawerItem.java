package model;

import com.peralta.apps.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josermando on 2/27/2016.
 */
public class NavigationDrawerItem {
    private int imageID;
    private String title;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public static List<NavigationDrawerItem> getData(){
        List<NavigationDrawerItem> dataList = new ArrayList<>();
        int [] images = getImages();
        String[] titles = getTitles();

        for(int i=0;i<images.length;i++){
            NavigationDrawerItem navigationDrawerItem = new NavigationDrawerItem();
            navigationDrawerItem.setImageID(images[i]);
            navigationDrawerItem.setTitle(titles[i]);

            dataList.add(navigationDrawerItem);
        }
        return dataList;
    }

    private static String[] getTitles() {
        String[] titles = {
          "Birds","Animals","Forests","Oceans","Planets","Landscape"
        };
        return titles;
    }

    public static int[] getImages(){
        int[] images = {
                R.drawable.ic_birds, R.drawable.ic_animal, R.drawable.ic_forest,
                R.drawable.ic_ocean, R.drawable.ic_planet, R.drawable.ic_landscape
        };
        return images;
    }
}
