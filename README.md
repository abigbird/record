# record
git如何与github交互 \n
参考网址 \n
http://blog.sina.com.cn/s/blog_63eb3eec0101cf6x.html \n
http://www.cnblogs.com/NetSos/p/4382448.html

大致步骤：
1.生成ssh证书：ssh-keygen -t rsa -C "ningjinlei@qq.com" 
2.要求输入文件名：id_sra  ,密码：******
3.将公钥id_rsa.pub和私钥id_rsa文件复制到目录：C:\Users\johnny\.ssh\  检查是否在改目录下有known_hosts文件
4.在github setting中新增 ssh  key ， name随意起，key的内容为id_rsa.pub中的内容
5.测试与github联通性: ssh -T git@github.com 
6.配置git用户名和密码:
    git config --global user.name "abigbird"
    git config --global user.email "ningjinlei@qq.com"
7.check out  exist project on github
    1).copy url 4 project
    2).run git clone https://github.com/abigbird/record.git
    3).check the project form local repository;
8.update
 git add .
  
  //提交
   
   git commit -m "这里是我写的提交注释"
    
    //提交到远程
    git push -u origin master
