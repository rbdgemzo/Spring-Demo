package com.example.demo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class StudentController {
    @PostMapping("/students")
    public String create(@RequestBody @Valid Student student) {
        return "執行資料庫的 Create 操作";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable @NotNull Integer studentId) {
        return "執行資料庫的 Read 操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable @NotNull Integer studentId,
                         @RequestBody @Valid Student student) {
        return "執行資料庫的 Update 操作";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable @NotNull Integer studentId) {
        return "執行資料庫的 Delete 操作";
    }
}