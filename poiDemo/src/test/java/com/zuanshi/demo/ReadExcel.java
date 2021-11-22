package com.zuanshi.demo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.StringJoiner;

public class ReadExcel {

    @Test
    public void readFromExcel() throws IOException {
        //获取工作簿
        InputStream is;
        Workbook wk = new XSSFWorkbook("E:\\read.xlsx");
        //获取工作表
        Sheet sheet = wk.getSheetAt(0);
        //获取行,遍历行
        for (Row row : sheet) {
            StringJoiner joiner = new StringJoiner(",");
            //获取单元格
            for (Cell cell : row) {
                int cellType = cell.getCellType(); //单元格的类型
                if (cellType == Cell.CELL_TYPE_NUMERIC) {
                    //数值
                    joiner.add(cell.getNumericCellValue() + "");
                }else{
                    joiner.add(cell.getStringCellValue());
                }
            }
            System.out.println(joiner.toString());
        }
        //关闭
        wk.close();

    }
}
