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
	TextView(context).apply{
	   text="text"	
	}.lparams(width = layoutWrapContent, height = layoutWrapContent) {
          startToStart = PARENT_ID
          endToEnd = PARENT_ID
          topToTop = PARENT_ID
          bottomToBottom = PARENT_ID
        }.also { addView(it) }
}

```
