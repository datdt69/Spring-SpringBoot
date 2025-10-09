package com.datdt.fap;

import com.datdt.fap.entity.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        //database
        Subject swt = new Subject("SWT031", "SOFTWARE TESTING",3,45);
        Subject hsf = new Subject("HSF031", "SPRING BOOT",3,45);
        System.out.println("Show subject info:" + swt);
        System.out.println("Show subject info:" + hsf);
        //loombok
        Student a = new Student("se1", "nguyen van a", 2004, 8.7);
        Student b = new Student("se2", "nguyen van b", 2004, 8.7);
        System.out.println("Show student info:" + a);
        System.out.println("Show student info:" + b);
        //json từ object chuyển thành json và ngược lại
        //cần tạo object quản lý json từ thư viện jackson
        //cái này là từ be đẩy lên fe, ví dụ đơn giản là tạo ra các object ở trên kia
        // mà mình cần dùng json để cho dữ liệu lên fe
        ObjectMapper mapper = new ObjectMapper();
        String an = mapper.writeValueAsString(a);
        System.out.println("Lần đầu chơi với em gái json" + an);
        //từ json thành object, fe cho xuống be, bố có form nhập

        //sau đó con vợ user ấn submit, tao gửi mày json việc của mày là lo biến thành object đi
        //dưới đây là cách làm cua mấy thằng gà
        //String formFrontEnd ="{\"id\":\"se1\",\"name\":\"nguyen van vo\",\"yob\":2004,\"gpa\":8.7}";

        //pro player phải chơi kiểu như này

        String formFrontEnd = """
                {"id":"se1","name":"nguyen van a","yob":2004,"gpa":8.7}""";
        //cái này gọi là rawstring có từ jdk 15 (có sao lưu vậy) nói chung là có cái đéo gì giữ nguyên
        Student jsonHeHe = mapper.readValue(formFrontEnd, Student.class);
        //đưa chuỗi convert thành object của class nào
        System.out.println("Con vợ từ json " + jsonHeHe);


    }
}