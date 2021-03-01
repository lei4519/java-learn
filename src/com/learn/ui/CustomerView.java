package com.learn.ui;

import com.learn.bean.Customer;
import com.learn.server.CustomerList;
import com.learn.utils.CMUtility;

public class CustomerView {
    CustomerList customerList = new CustomerList();

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        while (true) {
            int i = view.showSelectMenu();
            switch (i) {
                case 1:
                    view.addCustomer();
                    break;
                case 2:
                    view.editCustomer();
                    break;
                case 3:
                    view.delCustomer();
                    break;
                case 4:
                    view.showCustomerList();
                    break;
                case 5:
                    return;
            }
        }
    }

    public int showSelectMenu() {
        System.out.println("----------客户信息管理----------");
        System.out.println("1. 添加客户");
        System.out.println("2. 修改客户");
        System.out.println("3. 删除客户");
        System.out.println("4. 客户列表");
        System.out.println("5. 退出");
        return CMUtility.promptReturnInt("请输入1-5：", true, 1, 5);
    }

    public void showCustomerList() {
        System.out.println("ID" + "\t\t" + "名称" + "\t\t" + "性别" + "\t\t" + "年龄");
        Customer[] list = this.customerList.getList();
        int len = list.length;
        for (int i = 0; i < len; i++) {
            Customer item = list[i];
            if (item == null) break;
            System.out.println(i + "\t\t" + item.getName() + "\t\t" + item.getGender() + "\t\t" + item.getAge());
        }
        System.out.println("\n----------查询列表完成----------\n");
    }

    public void editCustomer() {
        int i = CMUtility.promptReturnInt("请输入要修改的客户ID", true, 0, this.customerList.getLength() - 1);
        String name = CMUtility.promptReturnString("请输入姓名", 10, false);
        char gender = CMUtility.promptReturnChar("请输入性别", false);
        int age = CMUtility.promptReturnInt("请输入年龄", false, 1, 200);
        this.customerList.editItem(i, name, gender, age);
        System.out.println("----------修改成功----------");
    }

    public void addCustomer() {
        String name = CMUtility.promptReturnString("请输入姓名", 10, true);
        char gender = CMUtility.promptReturnChar("请输入性别", true);
        int age = CMUtility.promptReturnInt("请输入年龄", true, 1, 200);
        this.customerList.pushItem(new Customer(name, gender, age));
        System.out.println("----------添加成功----------");
    }


    public void delCustomer1() {
        int i = CMUtility.promptReturnInt("请输入要删除的客户ID", true, 0, this.customerList.getLength() - 1);
        this.customerList.deleteItem(i);
        System.out.println("----------删除成功----------");

    }

    public void delCustomer() {
        int i = CMUtility.promptReturnInt("请输入要删除的客户ID", true, 0, this.customerList.getLength() - 1);
        this.customerList.deleteItem(i);
        System.out.println("----------删除成功----------");

    }
}
