package demo.ss7_3.service;

import demo.ss7_3.annotation.RequiresOTP;
import org.springframework.stereotype.Service;

@Service
public class BankingService {

    @RequiresOTP
    public String withdraw(double amount, String otp) {

        return "Rút tiền thành công";
    }

    @RequiresOTP
    public String transfer(String toUser, double amount, String otp) {
        return "Chuyển khoản thành công";
    }

    public String getBalance() {
        return "Số dư hiện tại: 50,000,000 VNĐ";
    }
}