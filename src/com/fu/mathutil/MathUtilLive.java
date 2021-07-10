/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Win
 */
public class MathUtilLive {
    
    public static void main(String[] args) {
        long result = MathUtil.getFactoriral(5); //hàm tính đi coi là mấy
        
        System.out.println("5! = 120; actual: " +result);
        System.out.println("6! = 720; actual: " +MathUtil.getFactoriral(6));
        System.out.println("0! = 1  ; actual: " +MathUtil.getFactoriral(0));


        
        //MathUtil.getFactoriral(-5); ném ngoại lệ thật rồi, ai biểu đưa cà chớn
        
        
        
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value : 5! =120 
        //mày/hàm ai đó viết khi chạy thức tê là mấy - actual, giả sử 120 
        //if expected == actual, hàm ngon trong tình huống này 
    }
}
