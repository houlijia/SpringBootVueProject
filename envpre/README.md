## linux-envpre

### A、查看系统信息
```
1、查看系统版本
lsb_release -a 
输出:
Ubuntu 22.04.4 LTS

2、查看系统名称
uname -a 
输出：
Linux hcss-ecs-5970 5.15.0-113-generic #123-Ubuntu SMP Mon Jun 10 08:16:17 UTC 2024 x86_64 x86_64 x86_64 GNU/Linux
3、查看系统内核版本
uname -r
输出：
5.15.0-113-generic
4、查看系统架构
uname -m
输出：
x86_64

5、查看系统发行版
cat /etc/issue
输出：
Ubuntu 22.04.4 LTS \n \l
```

### B、系统配置
```
1、安装软件
sudo apt update
sudo apt install 软件名
需要安装的软件：libaio1、libncurses* 、 libperl-dev

2、卸载软件
sudo apt remove 软件名
```

### C、JAVA安装
```
1、解压安装包
tar -zvxf jdk-21_linux-x64_bin.tar.gz

2、编辑环境变量文件
编辑 /etc/profile 文件，在最后添加以下内容：
export JAVA_HOME=/usr/server/jdk1.8.0_131
export PATH=${JAVA_HOME}/bin:$PATH

3、执行source命令，使配置立即生效:
source /etc/profile
```

### D、Nginx安装

```
1、安装
sudo apt-get install nginx

2、启动
sudo systemctl start nginx

3、停止
sudo systemctl stop nginx

4、重启
sudo systemctl restart nginx

5、查看状态
sudo systemctl status nginx
```

### E、MySql安装


