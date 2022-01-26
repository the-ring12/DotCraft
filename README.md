# DotCraft

## 增加部分

### 1. 使用 SharedPreferences 保存当前处于的关卡

1. 在 `initLevel()` 方法中，读取 SharedPreferences 保存的关卡，然后判断初始化哪一个等级

2. 在成功通关后，读取 SharedPreferences 中保存的关卡，将其加 1 

> 因为只设置了两个关卡，在读取取 SharedPreferences 中的数，要将判断，保证其关卡为 1 或 2。


### 2. 添加重置按钮

<img src="./picture/a1.png alt="关卡保存">

