#!/bin/bash

# 设置Java 8环境变量
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-1.8.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH

echo "=== Neice Cloud Java SDK 构建脚本 ==="
echo "Java版本: $(java -version 2>&1 | head -1)"
echo "JAVA_HOME: $JAVA_HOME"
echo ""

# 检查Maven是否可用
if ! command -v mvn &> /dev/null; then
    echo "错误: Maven未安装或不在PATH中"
    echo "请先安装Maven: brew install maven"
    exit 1
fi

echo "Maven版本: $(mvn -version | head -1)"
echo ""

# 执行Maven构建
echo "开始构建项目..."
mvn clean compile install

if [ $? -eq 0 ]; then
    echo ""
    echo "✅ 编译成功！"
    echo ""
    echo "可选的其他构建命令:"
    echo "  mvn clean package    # 编译并打包"
    echo "  mvn clean install    # 编译、打包并安装到本地仓库"
    echo "  mvn test            # 运行测试"
    echo "  mvn javadoc:javadoc # 生成JavaDoc文档"
else
    echo ""
    echo "❌ 编译失败！"
    exit 1
fi 