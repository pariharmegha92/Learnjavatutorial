package com.java.Encapsulationwork;

public class Encapsulation2 {
        private String username;
        private String userbio;
        private String mobile;
        public Encapsulation2(){

        }
        public void putUsername(String name){
            this.username=name;
        }
        public void putbio(String bio){
            this.userbio=bio;
        }
        public void putmobile(String mobile){
            this.mobile=mobile;
        }
        public String getusername(){
            return username;
        }
        public String getUserbio(){
            return userbio;
        }
        public String getMobile(){
            return mobile;
        }
    }




