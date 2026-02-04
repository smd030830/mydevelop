package com.mjc813.life;


import com.mjc813.banking.BankAccount;
import com.mjc813.banking.MachineNotWorkingException;
import com.mjc813.student.Student;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestStudentHasBankAccount {
    @Test
    public void TestIncome() {
        StudentHasBankAccount stuBank = new StudentHasBankAccount(
                new Student("홍길동", "hhh1111")
                , new BankAccount("77-777-77-77", "홍길동")
        );
        assertThat(stuBank.getCurrentMoney()).isEqualTo(0);
        stuBank.income(1000);
        stuBank.income(5000);
        stuBank.income(82000);
        assertThat(stuBank.getCurrentMoney()).isEqualTo(88000);
    }

    @Test
    public void TestOutcome() {
        StudentHasBankAccount stuBank = new StudentHasBankAccount(
                new Student("홍길동", "hhh1111")
                , new BankAccount("77-777-77-77", "홍길동")
        );
        assertThat(stuBank.getCurrentMoney()).isEqualTo(0);
        stuBank.income(100000);
        stuBank.outcome(20000);
        stuBank.outcome(3000);
        assertThat(stuBank.getCurrentMoney()).isEqualTo(77000);
    }

    @Test
    public void TestGetCurrentMoney() {
        StudentHasBankAccount stuBank = new StudentHasBankAccount(
                new Student("홍길동", "hhh1111")
                , new BankAccount("77-777-77-77", "홍길동")
        );
        assertThat(stuBank.getCurrentMoney()).isEqualTo(0);
        stuBank.income(100000);
        stuBank.outcome(10000);
        assertThat(stuBank.getCurrentMoney()).isEqualTo(90000);
    }
    @Test
    public void TestSendMoney() throws MachineNotWorkingException {
        StudentHasBankAccount stuBank1 = new StudentHasBankAccount(
                new Student("홍길동", "hhh1111")
                , new BankAccount("77-777-77-77", "홍길동")
        );
        StudentHasBankAccount stuBank2 = new StudentHasBankAccount(
                new Student("이순신", "lss9876")
                , new BankAccount("567-372-2983", "이순신")
        );
        LifeOfStduentWithBank losw = new LifeOfStduentWithBank();
        losw.sendMoney(stuBank1, stuBank2, 50000);
        assertThat(stuBank1.getBankAccount().getMoney()).isEqualTo(-50000);
        assertThat(stuBank2.getBankAccount().getMoney()).isEqualTo(50000);
    }
}