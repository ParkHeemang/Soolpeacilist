package dao;

import java.util.ArrayList;

public interface VDao {
    public ArrayList<visiondto> listDao();
    public void writeDao(String day,String content);
    public VisionDto viewDao(String strID);
    public void deleteDao(String bId);
}
