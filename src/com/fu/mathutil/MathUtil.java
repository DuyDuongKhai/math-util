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
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÌA, ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU GÌ 
public class MathUtil {

    //n! = 1.2.3.4.5.6...n
    //QUY ƯỚC: 0! = 1! = 1
    //Không tính gia thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0 
    //21! lố kiêu long 
    //nếu đưa vào âm, 21 giai thừa, ta không tính, ta đập vào mặt ai xài hàm 
    //một cái ngoại lệ, chửi không tính được 
    public static long getFactoriral(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        //hàm dừng liền éo cần return 

        //xuống đây là n = 0..20 rồi 
        if (n == 0 || n == 1) {
            return 1; //dừng ngay khi n đặc biệt 
        }
        //xuống đến đây, n = 2 .. 20 rồi 
        //chơi for hoặc đệ quy - recursion 
        //kĩ thuật nhồi con heo đất, ốc bu dồn thịt 
        //i = 2, i = 3, i = 4, i = 5, i = n nhồi liên tục i vào tích
        long product = 1; //tính khởi đầu = 1, nhồi 2 3 4 5 6 7 8 .. n 
        for (int i = 2; i <= n; i++) {
            product *= i; //product = product đang có nhân con i, đập ngược trở lại
            //nhồi liên tục product

        }
        return product;

    }

}
