package DTO;

public class VisionDTO {
    int num;
    String day;
    String content;
 
    public VisionDTO() {
        // TODO Auto-generated constructor stub
    }
     
    public VisionDTO(int num, String day, String content) {
        this.num = num;
        this.day = day;
        this.content = content;
    }
 
    public int getNum() {
        return num;
    }
 
    public void setNum(int num) {
        this.num = num;
    }
 
    public String getDay() {
        return day;
    }
 
    public void setDay(String day) {
        this.day = day;
    }
 
    public String getContent() {
        return content;
    }
 
    public void setContent(String content) {
        this.content = content;
    }
}