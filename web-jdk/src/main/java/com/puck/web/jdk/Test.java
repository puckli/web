package com.puck.web.jdk;

import com.google.common.collect.Lists;
import com.puck.web.pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    private static List<Integer> list3 = new ArrayList<>();
    private static Lock lock = new ReentrantLock();
    public static  void main(String args[]){
    List<User> list = new ArrayList<>();
    Map<String, User> map = new HashMap<>();
        list.forEach(user -> map.put(user.getName(), user));




        IntStream.range(0, 10000).forEach(list1::add);
        IntStream.range(0, 10000).parallel().forEach(list2::add);
        IntStream.range(0, 10000).parallel().forEach(i -> {
        lock.lock();
        try {
            list3.add(i);
        }finally {
            lock.unlock();
        }
    });

        System.out.println("串行执行的大小：" + list1.size());
        System.out.println("并行执行的大小：" + list2.size());
        System.out.println("加锁并行执行的大小：" + list3.size());

}


    public static List<String> getStrings(){
        return Lists.newArrayList("java", "hahah", "php", "python", "c", "c++", "java");
    }

}


