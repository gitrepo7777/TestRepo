package com.springinaction.springidol;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
  @Pointcut(
        "execution(* com.springinaction.springidol.Performer.perform(..))")
  public void test() { //<co id="co_definePointcut"/>
  }

  @Before("test()")
  public void takeSeats() { //<co id="co_takeSeatsBefore"/>
    System.out.println("takeSeats() : The audience is taking their seats.");
  }

  @Before("test()")
  public void turnOffCellPhones() { //<co id="co_turnOffCellPhonesBefore"/>
    System.out.println("takeSeats() : The audience is turning off their cellphones");
  }

  @AfterReturning("test()")
  public void applaud() { //<co id="co_applaudAfter"/>
    System.out.println("takeSeats() : CLAP CLAP CLAP CLAP CLAP");
  }

  @AfterThrowing("test()")
  public void demandRefund() { //<co id="co_demandRefundAfterException"/>
    System.out.println("takeSeats() : Boo! We want our money back!");
  }
}