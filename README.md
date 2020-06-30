# kotlinCodeLayout [![version](https://jitpack.io/v/BugRui/kotlinCodeLayout.svg)](https://jitpack.io/#BugRui/kotlinCodeLayout/1.0.0-alpha)

androidx kotlin dsl 方式编写代码布局（Kotlin dsl  Write code layout）

#### Step 1. Add the JitPack repository to your build file
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

```
####  Step 2. Add the dependency
```
  implementation 'com.github.BugRui:kotlinCodeLayout:1.0.0-alpha'
```

因为kotlinCodeLayout只在内部使用compileOnly，并且依赖于AppCompat和ConstraintLayout，所以需要将以下依赖项添加到自己的项目中，否则compileOnly将无法通过打包

Because kotlinCodeLayout USES compileOnly internally and relies on AppCompat and ConstraintLayout, you need to add the following dependencies to your own project, otherwise the compileOnly will not pass

```
implementation 'androidx.appcompat:appcompat:1.1.0'
implementation 'androidx.constraintlayout:constraintlayout:2.0.0-beta7'  //constraintlayout 需要2.0以上 (More than 2.0)

```

####  Step 3. Java1.8
```

compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

```

### 使用 （use）

```
_ConstraintLayout(context).apply {
	//设置_ConstraintLayout宽高填满
	setParams(width = layoutMatchParent, height = layoutMatchParent)
	//添加一个TextView
	TextView(context).apply{
	   //这里配置自身的属性
	   text="Hello World!"	
	}.lparams(width = layoutWrapContent, height = layoutWrapContent) {
	  //这里配置与父容器相关的属性
          startToStart = PARENT_ID
          endToEnd = PARENT_ID
          topToTop = PARENT_ID
          bottomToBottom = PARENT_ID
        }.also { addView(it) }
}





对应xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ui.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>



```


