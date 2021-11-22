package com.zuanshi.demo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    @Test
    public void show() throws IOException {
        //获取工作簿/新建工作簿
        Workbook wk = new XSSFWorkbook();
        //创建工作表
        Sheet sheet = wk.createSheet("写Excel");
        //创建第一行
        Row row = sheet.createRow(0);
        //设置第一行第一个单元格为
        row.createCell(0).setCellValue("姓名");
        //设置第一行第二个单元格为
        row.createCell(1).setCellValue("年龄");
        //设置第一行第三个单元格为
        row.createCell(2).setCellValue("地址");

        //创建第二行
        row = sheet.createRow(1);
        //设置第二行第一个单元格为
        row.createCell(0).setCellValue("施钻");
        //设置第二行第二个单元格为
        row.createCell(1).setCellValue(25);
        //设置第二行第三个单元格为
        row.createCell(2).setCellValue("湖北武汉");

        //创建第三行
        row = sheet.createRow(2);
        //设置第三行第一个单元格为
        row.createCell(0).setCellValue("施建军");
        //设置第三行第二个单元格为
        row.createCell(1).setCellValue(52);
        //设置第三行第三个单元格为
        row.createCell(2).setCellValue("湖北武汉");


        //保存到本地
        wk.write(new FileOutputStream(new File("E:\\writeExcel.xlsx")));
        //关闭
        wk.close();

    }
}
