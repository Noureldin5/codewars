package com.example.codewars.exception;

public class BlockedException extends RuntimeException{
    public BlockedException(){
        super();
    }
    public BlockedException(String message){
        super(message);
    }
}
