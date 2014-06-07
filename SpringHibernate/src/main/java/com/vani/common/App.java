package com.vani.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vani.stock.bo.StockBo;
import com.vani.stock.model.Stock;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("BeanLocations.xml");
	
    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
    	
    	/** insert **/
    	Stock stock = new Stock();
    	stock.setStockCode("76683");
    	stock.setStockName("HAIO3");
    	stockBo.save(stock);
    	
    	/** select **/
    	Stock stock2 = stockBo.findByStockCode("76683");
    	System.out.println(stock2);
    	
    	/** update **/
    	stock2.setStockName("HAIO-13");
    	stockBo.update(stock2);
    	
    	/** delete **/
    	//stockBo.delete(stock2);
    	
    	System.out.println("Done");
    }
}
