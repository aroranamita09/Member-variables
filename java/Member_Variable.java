package com.stackroute;



     class Member_Variable {
         class Member {
             String name;
             int age;
             Double salary;
         }

         Member mb = new Member();

         Member_Variable(String name, int age, Double salary) {
             mb.name = name;
             mb.age = age;
             mb.salary = salary;
         }

         public String printMemberVariable()

         {

             Member_Variable mb_var = new Member_Variable("Harry Potter", 30, 2500.3);


             System.out.println("Member name : " + mb_var.mb.name + "Member age : " + mb_var.mb.age + "Member salary : " + mb_var.mb.salary);
             return "Member name : " + mb_var.mb.name + "Member age : " + mb_var.mb.age + "Member salary : " + mb_var.mb.salary;

         }
     }

