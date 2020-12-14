# Lesson_10_2020-21
Fragments, Multiple Activities, Open Weather API


## Fragments

A fragment is a reusable component of the Android user interface. In this project we'll create a little fragment that will retrive information from 
a weather web service and display the current weather conditions in every activity screen of our app. 

Our app will contain 2 activities. The first activity requests a name from the user and passes the name to the second activity through an explicit intent

### More on Intents

Intents are divided in 2 types:

- *Explicit intents*  specify which application will satisfy the intent, by supplying either the target app's package name or a fully-qualified component class name. You'll typically use an explicit intent to start a component in your own app, because you know the class name of the activity or service you want to start. For example, you might start a new activity within your app in response to a user action, or start a service to download a file in the background.
- *Implicit intents* do not name a specific component, but instead declare a general action to perform, which allows a component from another app to handle it. For example, if you want to show the user a location on a map, you can use an implicit intent to request that another capable app show a specified location on a map.

## Open Weather maps API

You must login and create an API key in [openweathermap.org](https://openweathermap.org/)


## Weather JSON parsing

You will find usefull code for parsing the weather data in [this gist](https://gist.github.com/teohaik/efddbf384d762eb78b1a4e9aae23be3f) 


## More on Fragments

https://abhiandroid.com/ui/fragment

https://guides.codepath.com/android/creating-and-using-fragments

https://developer.android.com/training/basics/fragments/creating
