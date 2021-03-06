package com.example.demo;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class SpringGradelProjecT2 {
	@GetMapping("/greeting")
    public String sendMessage(Model m) {
        m.addAttribute("myobj", "Tarkeshwar Barua");
        List<Book> books = new ArrayList<>();
        Book b1=new Book();
        b1.setAuthor("Tarkeshwar");
        b1.setId(1);
        b1.setTitle("Mobile Application Development");
        Book b2=new Book();
        b2.setAuthor("Barua");
        b2.setId(2);
        b2.setTitle("Machine Learning using Python");
        books.add(b1);
        books.add(b2);
        m.addAttribute("mybooks", books);    
        return "index1";
    }

}
