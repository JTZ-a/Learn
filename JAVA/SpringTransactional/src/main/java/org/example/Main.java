package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * &#064;project: Default (Template) Project
 * &#064;ClassName: ${NAME}
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 22:25
 * &#064;Description:${END}
 */// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
@Configuration        // 标记为配置类
@ComponentScan("org.example")	// 设置扫描路径
@EnableTransactionManagement    // 开启事务注解
public class Main {
}