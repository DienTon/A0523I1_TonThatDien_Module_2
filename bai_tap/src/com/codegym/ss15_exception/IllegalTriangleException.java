package com.codegym.ss15_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String errorMess){
        super(errorMess);
    }
}
