# PercentageBarView

![PercentageBarView](https://i.ibb.co/HX73s7x/Screen-Shot-2022-06-02-at-11-19-17.png)

## Setup
### Gradle

Add this to your project level `build.gradle`:
```groovy
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
Add this to your app `build.gradle`:
```groovy
dependencies {
    implementation 'com.github.edtslib:percentagebarview:latest'
}
```
# Usage

The SlidingChipsView is very easy to use. Just add it to your layout like any other view.
##### Via XML

Here's a basic implementation.

```xml
    <id.co.edtslib.percentagebarview.PercentageBarView
        android:id="@+id/percentageBarView"
        app:colorActive="@color/purple_200"
        app:radius="5dp"
        android:layout_marginStart="16dp"
        android:layout_marginEnd="16dp"
        android:layout_width="0dp"
        android:layout_height="16dp"  />
```
```kotlin
        val percentageBarView = findViewById<PercentageBarView>(R.id.percentageBarView)
        percentageBarView.setPercentage(0.4f)
```

### Attributes information

##### _app:colorNoActive_
[reference]: background color, default Color.GRAY

##### _app:colorActive_
[reference]: percentage bar background color, default Color.BLUE

##### _app:radius_
[dimension]: radius of view, default 0

### Method for Set Percentage Value
```kotlin
       fun setPercentage(pct: Float)
```



