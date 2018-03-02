package gymapp.ihebchiha.com.igym.Extras;

/**
 * Created by IhebChiha on 25/02/2018.
 */

public class MenuList
{
    private String mNameOfMenu;
    private String mNameOfImage;
    private String mPopup;

    public MenuList (String startNameOfMenu, String startNameOfImage, String startPopup ){

        this.mNameOfMenu = startNameOfMenu;
        this.mNameOfImage = startNameOfImage;
        this.mPopup = startPopup;

    }

    public String getmNameOfMenu() {
        return mNameOfMenu;
    }

    public String getmNameOfImage() {
        return mNameOfImage;
    }

    public String getmPopup() {
        return mPopup;
    }
}
