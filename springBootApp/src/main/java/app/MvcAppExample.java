package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@SpringBootApplication
public class MvcAppExample {

    @Controller
    public static class HomeController {
        static class Student {
            private static final AtomicInteger idCounter = new AtomicInteger(0);
            private String name;
            private double grade;
            private int id;
            public Student(String name, double grade) {
                this.name = name;
                this.grade = grade;
                this.id = idCounter.incrementAndGet();
            }

            public int getId() {
                return this.id;
            }

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getGrade() {
                return this.grade;
            }

            public void setGrade(double grade) {
                this.grade = grade;
            }
        }

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Pesho", 3.5),
                new Student("Mariya", 4.5),
                new Student("Gosho", 5.5)
        ));

        @GetMapping("/home")
        public ModelAndView home(ModelAndView modelAndView) {
            modelAndView.setViewName("home.html");
            modelAndView.addObject("students", students);
            return modelAndView;
        }

        @GetMapping("/student/{id}")
        public ModelAndView student(@PathVariable String id, ModelAndView modelAndView) {
            int studentId = Integer.parseInt(id);
            List<Student> oneStudentList = students.stream()
                    .filter(s -> s.getId() == studentId)
                    .collect(Collectors.toList());
            Student student = oneStudentList.get(0);
            modelAndView.setViewName("student-details.html");
            modelAndView.addObject("student", student);
            return modelAndView;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MvcAppExample.class, args);
    }
}
