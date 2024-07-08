package com.josh.cpen_208.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josh.cpen_208.conn_class.db_config;
import com.josh.cpen_208.models.cls_course;

@RestController
@RequestMapping("/courses_service")

public class courses_service {
    cls_course course_l = new cls_course();

    @Autowired
    private db_config cls_db_config;

    @GetMapping("/list_of_courses")
   public String list_of_courses (){
    
    course_l.con= cls_db_config.getCon();
   String result = course_l.select_all_courses();

    return result;
}
    @PostMapping("/add_course")
   public String add_course (@RequestBody String json_request){
    
    course_l.con= cls_db_config.getCon();
  return course_l.add_new_courses(json_request);

}




/*  @PostMapping("/formdata")
    public ResponseEntity<String> showData(@RequestBody formdata data){
     System.out.println(data.gettitle());
     System.out.println(data.getcode());
        return ResponseEntity.ok("Data received");
    } */

}


