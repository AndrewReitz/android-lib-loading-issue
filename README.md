# android-lib-loading-issue
Demonstrating Lib Loading Issue

## Problem Statement

In our build we had two aar libraries that need to be swapped out for debug or release environments.
In our instrumentation tests we were always using the debug build of the app. When updating to api 23 we noticed
certain tests always seemed to fail which lead to this investigation that you can two different aars libraries
that have the same signatures, one in your test apk and one in the actual apk. It would appear that depending on 
how these files are dexed and placed in the final apks that it appears to be a race condition as to which is loaded
and used. Since in api 23 there can be more dex files the issue we had seemed to become more apparent.

## Solution
Gradle android plugin should notify (warning or error) that two libraries have the same signature, similar to 
how adding both of these aars in the application apk would do.
