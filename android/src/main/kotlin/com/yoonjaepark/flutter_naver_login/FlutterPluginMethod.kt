package com.yoonjaepark.flutter_naver_login

sealed class FlutterPluginMethod(val methodName: String) {
    class InitSdk private constructor() : FlutterPluginMethod("initSdk") {
        companion object {
            val INSTANCE = InitSdk()
        }
    }
    
    class LogIn private constructor() : FlutterPluginMethod("logIn") {
        companion object {
            val INSTANCE = LogIn()
        }
    }
    
    class LogOut private constructor() : FlutterPluginMethod("logOut") {
        companion object {
            val INSTANCE = LogOut()
        }
    }
    
    class LogOutAndDeleteToken private constructor() : FlutterPluginMethod("logoutAndDeleteToken") {
        companion object {
            val INSTANCE = LogOutAndDeleteToken()
        }
    }
    
    class GetCurrentAccount private constructor() : FlutterPluginMethod("getCurrentAccount") {
        companion object {
            val INSTANCE = GetCurrentAccount()
        }
    }
    
    class GetCurrentAccessToken private constructor() : FlutterPluginMethod("getCurrentAccessToken") {
        companion object {
            val INSTANCE = GetCurrentAccessToken()
        }
    }
    
    class RefreshAccessTokenWithRefreshToken private constructor() : 
        FlutterPluginMethod("refreshAccessTokenWithRefreshToken") {
        companion object {
            val INSTANCE = RefreshAccessTokenWithRefreshToken()
        }
    }

    companion object {
        fun fromMethodName(name: String?): FlutterPluginMethod? {
            return when (name) {
                InitSdk.INSTANCE.methodName -> InitSdk.INSTANCE
                LogIn.INSTANCE.methodName -> LogIn.INSTANCE
                LogOut.INSTANCE.methodName -> LogOut.INSTANCE
                LogOutAndDeleteToken.INSTANCE.methodName -> LogOutAndDeleteToken.INSTANCE
                GetCurrentAccount.INSTANCE.methodName -> GetCurrentAccount.INSTANCE
                GetCurrentAccessToken.INSTANCE.methodName -> GetCurrentAccessToken.INSTANCE
                RefreshAccessTokenWithRefreshToken.INSTANCE.methodName -> RefreshAccessTokenWithRefreshToken.INSTANCE
                else -> null
            }
        }
    }
}