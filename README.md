# kotlinCodeLayout [![version](https://jitpack.io/v/BugRui/kotlinCodeLayout.svg)](https://jitpack.io/#BugRui/kotlinCodeLayout/1.0.0-alpha)

kotlin dsl 方式编写代码布局，

### 集成
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

####  Step 3. Java1.8
```

compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

```

### 使用

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
