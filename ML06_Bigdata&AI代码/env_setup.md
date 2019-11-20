# spark-for-MAC

spark-v: 2.2.3
hadoop-v: 2.7.0

## step 1: install java

## step 2: download spark and install
```
tar -zxvf spark-2.2.3-bin-hadoop2.7.tgz
```

## step 3: setup env path
```
export PATH=$PATH:/path/to/spark/bin
```


# spark-for-WINDOWS

spark-v: 2.2.3
hadoop-v: 2.7.0 or later

## step 1: install java

## step 2: download spark and install
extract the tgz file into a path/to/spark folder

## stpe 3: setup spark env
```
SPARK_HOME=path/to/spark
PATH;path/to/spark/bin
```

## step 3: download hadoop
```
https://www.apache.org/dyn/closer.cgi/hadoop/common/hadoop-2.7.7/hadoop-2.7.7.tar.gz
```
extract the tgz file into a path/to/hadoop folder

## step 4: setup hadoop env
```
HADOOP_HOME=C:\hadoop-2.7.7
```

## step 5: winutil.exe
put winutil.exe to path/to/spark/bin
