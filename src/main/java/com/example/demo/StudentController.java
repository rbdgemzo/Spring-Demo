package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @PostMapping("/students")
    public String create(@RequestBody Student student) {
        return "執行資料庫的 Create 操作";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable Integer studentId) {
        return "執行資料庫的 Read 操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        return "執行資料庫的 Update 操作";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId) {
        return "執行資料庫的 Delete 操作";
    }
}