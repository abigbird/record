# record
git如何与github交互

参考网址 

http://blog.sina.com.cn/s/blog_63eb3eec0101cf6x.html 

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


9 Fork别人的项目 

如果仅仅想下载使用别人的代码，那么clone就可以了。 

如果想要参与，可以fork，然后合并的方式。 

*fork别人的项目，得到一个分支。 

fork后得到的地址为，git@github.com:yesblue/wow.git 

*复制代码到本地 

$git clone git@github.com:yesblue/wow.git 

*进行修改，并提请合并 

$git pull person master

