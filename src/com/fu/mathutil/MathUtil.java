/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ACER
 */
// ta viết class để cung cấp cái tiện ich cho nơi khác xài
// khi ta cung cấp tiện ích cho nơi khác xài, ta k cần nhwos cái gì cho riêng ta
//hàm static làm điều này

public class MathUtil {
        
    public static long  getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must  be betweeen 0..20");
        // hàm dừng liền
        if(n == 0 || n == 1)
            return 1; // dừng ngay khi n đặc biệt
        //n = 2..20
        // for hoặc đệ quy 
        long product = 1; //tính khởi đầu = 1, nhồi 2 3 4....n
        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
