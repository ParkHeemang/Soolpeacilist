package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */






@RequestMapping("/vision")
@ResponseBody
public Map<String, String> androidTestWithRequestAndResponse(HttpServletRequest request){
 
        ArrayList<VisionDto> visionDto = new ArrayList<VisionDto>();
        Map<String, String> result = new HashMap<String, String>();
        String nowTime = getCurrentTime("YYYY,M,d");
        String num = "",day = "",content = "";
       
        VDao dao = sqlSession.getMapper(VDao.class);
        
        dao.writeDao(nowTime,request.getParameter("content"));
         
        visionDto = dao.listDao();
         
        for(int i=0;i<visionDto.size();i++) {
            num += Integer.toString(visionDto.get(i).getNum())+"\t";
            day += visionDto.get(i).getDay()+"\t";
            content += visionDto.get(i).getContent()+"\t";
        }
 
        result.put("num",num);
        result.put("day",day);
        result.put("content",content);
 
        return result;
}
 
private String getCurrentTime(String timeFormat) {
         // TODO Auto-generated method stub
         return new SimpleDateFormat(timeFormat).format(System.currentTimeMillis());
}