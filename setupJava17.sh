sudo apt update

sudo apt install openjdk-17-jdk -y

sudo update-alternatives --config java

JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64"

export PATH=$JAVA_HOME/bin:$PATH
